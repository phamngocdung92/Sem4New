package prepareExam.prepare.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AesUtils {
    public static void main(String[] args) throws Exception {
        //AES
        SecretKey key = generateKey(128);
        //input
        String input = "t2208e";
        System.out.println("Input Data: " + input);

        // Encrypt
        String encryptedData = encrypt(input, key);
        System.out.println("Encrypted Data: " + encryptedData);

        // Decrypt
        String decryptedData = decrypt(encryptedData, key);
        System.out.println("Decrypted Data: " + decryptedData);
    }
    public static SecretKey generateKey(int n) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(n);
        SecretKey key = keyGenerator.generateKey();
        return key;
    }
    public static String encrypt(String input, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedData = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData);
    }
    public static String decrypt(String encryptedData, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedData = Base64.getDecoder().decode(encryptedData);
        byte[] decryptedData = cipher.doFinal(decodedData);
        return new String(decryptedData);
    }
}
