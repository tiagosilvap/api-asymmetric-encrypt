package com.asymmetric.encrypt.service.encrypt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

@Service
public class RSAEncryptionImpl implements RSAEncryption {
    
    @Value("${app.key.private}")
    private String privateKey;
    
    @Value("${app.key.public}")
    private String publicKey;
    
    @Override
    public String encrypt(String message) {
        try {
            final Cipher encryptCipher = Cipher.getInstance(ALGORITHM);
            encryptCipher.init(Cipher.ENCRYPT_MODE, getPublicKey());
            byte[] encryptedMessageBytes = encryptCipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedMessageBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public String decrypt(String encodedMessage) {
        try {
            final Cipher decryptCipher = Cipher.getInstance(ALGORITHM);
            decryptCipher.init(Cipher.DECRYPT_MODE, getPrivateKey());
            byte[] decryptedMessageBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encodedMessage));
            return new String(decryptedMessageBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private PublicKey getPublicKey(){
        try{
            KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
            X509EncodedKeySpec keySpecX509 = new X509EncodedKeySpec(Base64.getDecoder().decode(publicKey));
            return keyFactory.generatePublic(keySpecX509);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private PrivateKey getPrivateKey(){
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
            PKCS8EncodedKeySpec keySpecPKCS8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey));
            return keyFactory.generatePrivate(keySpecPKCS8);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
