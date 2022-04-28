package org.example;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Encoder;


public class TestBase64 {
    public static void main (String[] args) throws UnsupportedEncodingException {
        // String Encoding + Decoding
        strEncodingandDecoding();
        System.out.println("-----strCommonsCodecCoding()-----");
        // Apache String Encoding + Decoding
        strCommonsCodecCoding();
        System.out.println("-----strURLCoding()-----");
        // URL Encoding + Decoding
        strURLCoding();
        System.out.println("-----strMIMECoding()-----");
        // MIME Encoding + Decoding
        strMIMECoding();
    }

    private static void strMIMECoding() throws UnsupportedEncodingException {
        String msg = "This \nis \nPassword";
        System.out.println("Before Encoding: " + msg);
        byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
        Encoder encoder = Base64.getMimeEncoder();
        String encoded = encoder.encodeToString(bytes);
        System.out.println("After Encoding: " + encoded);
        String decoding = new String(Base64.getMimeDecoder().decode(encoded));
        System.out.println("After Decoding: " + decoding);
    }

    private static void strURLCoding() throws UnsupportedEncodingException {
        String url = "www.google.com";
        System.out.println("Before Encoding: " + url);
        byte[] bytes = url.getBytes(StandardCharsets.UTF_8);
        Encoder encoder = Base64.getUrlEncoder();
        String encoded = encoder.encodeToString(bytes);
        System.out.println("After Encoding: " + encoded);
        String decoding = new String(Base64.getUrlDecoder().decode(encoded));
        System.out.println("After Decoding: " + decoding);

    }

    private static void strCommonsCodecCoding() throws UnsupportedEncodingException {
        org.apache.commons.codec.binary.Base64 base64 = new org.apache.commons.codec.binary.Base64();

        String msg = "This is Password";
        System.out.println("Before Encoding: " + msg);
        byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
        String encoder = new String(base64.encodeBase64(bytes));
        System.out.println("After Encoding: " + encoder);
        String decoded = new String(base64.decodeBase64(encoder));
        System.out.println("Decoded Msg: " + decoded);
    }

    private static void strEncodingandDecoding() throws UnsupportedEncodingException {
        String msg = "This is Password";
        System.out.println("Before Encoding: " + msg);
        byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
        Encoder encoder = java.util.Base64.getEncoder();
        String encoded = encoder.encodeToString(bytes);
        System.out.println("After Encoding: " + encoded);
        byte[] decoded = Base64.getDecoder().decode(encoded);
        String decodeMsg = new String(decoded);
        System.out.println("Decoded Msg: " + decodeMsg);
    }

}

