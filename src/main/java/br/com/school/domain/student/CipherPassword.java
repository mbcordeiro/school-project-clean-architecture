package br.com.school.domain.student;

public interface CipherPassword {
    String cipherPassword(String password);

    boolean validateCipherPassword(String cipherPassword, String openPassword);
}
