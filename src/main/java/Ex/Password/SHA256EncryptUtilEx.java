package Ex.Password;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class SHA256EncryptUtilEx {
    public static void main(String[] args){
        String originalPassword = "password1234";
        String sha256 = "";

        try{
            MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");

            mdSHA256.update(originalPassword.getBytes("UTF-8"));

            byte[] sha256Hash = mdSHA256.digest();

            StringBuffer hexSHA256hash = new StringBuffer();

            for(byte b : sha256Hash) {
                String hexString = String.format("%02x", b);
                hexSHA256hash.append(hexString);
            }
            sha256 = hexSHA256hash.toString();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        System.out.println(sha256);
    }
}
