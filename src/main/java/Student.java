import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Cpf cpf;
    private Email email;
    private List<Telephone> telephones = new ArrayList<>();

    public void addTelephones(String ddd, String number) {
        telephones.add(new Telephone(ddd, number));
    }
}
