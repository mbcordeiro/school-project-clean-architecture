package br.com.school.academic.infra.student;

import br.com.school.academic.domain.student.*;
import br.com.school.domain.student.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryJDBC implements StudentRepository {
    private final Connection connection;

    public StudentRepositoryJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void register(Student student) {
        try {
            var sql = "INSERT INTO STUDENT VALUES (?, ?, ?)";
            var prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, student.getName());
            prepareStatement.setString(2, student.getCpf().getNumber());
            prepareStatement.setString(3, student.getEmail().getAddress());
            prepareStatement.execute();

            sql = "INSERT INTO TELEPHONE VALUES (?, ?)";
            prepareStatement = connection.prepareStatement(sql);
            for (Telephone telephone : student.getTelephones()) {
                prepareStatement.setString(1, telephone.getDdd());
                prepareStatement.setString(2, telephone.getNumber());
                prepareStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student findByCpf(Cpf cpf) {
        try {
            var sql = "SELECT id, nome, email FROM Aluno WHERE = ?";
            var  preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cpf.getNumber());

            var resultSet = preparedStatement.executeQuery();
            if (!resultSet.next()) {
                throw new StudentNotFoundException(cpf);
            }
            final var name = resultSet.getString("name");
            final var email = new Email(resultSet.getString("email"));
            final var student = new Student(name, cpf, email);

            final var id = resultSet.getLong("id");
            sql = "SELECT ddd, number FROM Telephone WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                final var number = resultSet.getString("number");
                final var ddd = resultSet.getString("ddd");
                student.addTelephones(ddd, number);
            }
            return student;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> findAll() {
        return null;
    }
}
