/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase4.ejercicio1.practica;

import java.security.Key;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author user
 */
public class TestEncriptador2 {

    public static void main(String[] args) {
        // Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        try {
            byte[] input = "input".getBytes();
            byte[] ivBytes = "1234567812345678".getBytes();

            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            KeyGenerator generator = KeyGenerator.getInstance("AES");
            generator.init(128);
            Key encryptionKey = generator.generateKey();
            System.out.println("key : " + new String(encryptionKey.getEncoded()));

            cipher.init(Cipher.ENCRYPT_MODE, encryptionKey, new IvParameterSpec(ivBytes));
            byte[] cipherText = new byte[cipher.getOutputSize(input.length)];
            int ctLength = cipher.update(input, 0, input.length, cipherText, 0);
            ctLength += cipher.doFinal(cipherText, ctLength);
            Key decryptionKey = new SecretKeySpec(encryptionKey.getEncoded(), encryptionKey.getAlgorithm());

            cipher.init(Cipher.DECRYPT_MODE, decryptionKey, new IvParameterSpec(ivBytes));
            byte[] plainText = new byte[cipher.getOutputSize(ctLength)];
            int ptLength = cipher.update(cipherText, 0, ctLength, plainText, 0);
            ptLength += cipher.doFinal(plainText, ptLength);
            System.out.println("plain : " + new String(plainText));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
