package br.com.school.academic.infra.student;

import br.com.school.academic.domain.student.CipherPassword;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CipherPasswordMD5 implements CipherPassword {
    @Override
    public String cipherPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            final var stringBuilder = new StringBuilder();
            for (byte aByte : bytes) {
                stringBuilder.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hashset da senha!");
        }
    }

    @Override
    public boolean validateCipherPassword(String cipherPassword, String openPassword) {
        return cipherPassword.equals(cipherPassword(openPassword));
    }
}
