package prepareExam.prepare.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ShaEncryptionUtils {
    public static void main(String[] args) throws Exception {
        System.err.println(new String(sha256Encrypt("123456"), StandardCharsets.UTF_8));
        System.err.println(new String(sha256Encrypt("123456"), StandardCharsets.UTF_8));
        System.err.println(new String(sha256Encrypt("1234567"), StandardCharsets.UTF_8));


    }
    static public byte[] sha256Encrypt(String input){
        byte[] hashBytes;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return hashBytes;
    }

}
