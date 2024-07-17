package prepareExam.prepare.utils;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class OtherAesEncryptionUtils {
    private static final String AES_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static void main(String[] args) throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
//        SecretKey key = generatorKey(128);
//        System.out.println(key);
        String txt = "t2208e";
        SecretKey key = generatorKey(256);
        IvParameterSpec spec = genSpec();
        System.err.println(encrypt(AES_ALGORITHM, txt, key, spec));
    }
    public static SecretKey generatorKey (int num){
        try{
            KeyGenerator generator = KeyGenerator.getInstance("AES");
//            KeyGenerator generator1 = new KeyGenerator("AES"); // moi mot lan goi lai phai khoi tao gay ra performance kem
            generator.init(num);
            return generator.generateKey();
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String encrypt(String algorithm, String input, SecretKey key, IvParameterSpec spec)
            throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException,
            InvalidKeyException, IllegalBlockSizeException, BadPaddingException
    {
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key, spec);
        byte[] bytes = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String decrypt(String algorithm, String input, SecretKey key, IvParameterSpec spec) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key, spec);
        byte[] decodedData = Base64.getDecoder().decode(input);
        byte[] decryptedData = cipher.doFinal(decodedData);
        return Base64.getEncoder().encodeToString(decryptedData);
    }

    public static IvParameterSpec genSpec(){
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }
}
