package br.com.school.academic.domain.student;

public interface CipherPassword {
    String cipherPassword(String password);

    boolean validateCipherPassword(String cipherPassword, String openPassword);
}
