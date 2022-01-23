package com.asymmetric.encrypt.service.impl;

import com.asymmetric.encrypt.service.RSAEncryption;
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
    
    @Value("${security.rsa.private_key}")
    private String privateKey;
    
    @Value("${security.rsa.public_key}")
    private String publicKey;
    
    @Override
    public String encrypt(String message) throws Exception {
        if(message != null) {
            try {
                final Cipher encryptCipher = Cipher.getInstance(ALGORITHM);
                encryptCipher.init(Cipher.ENCRYPT_MODE, getPublicKey());
                byte[] encryptedMessageBytes = encryptCipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
                return Base64.getEncoder().encodeToString(encryptedMessageBytes);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        }
        return null;
    }
    
    @Override
    public String decrypt(String encodedMessage) throws Exception {
        if(encodedMessage != null) {
            try {
                final Cipher decryptCipher = Cipher.getInstance(ALGORITHM);
                decryptCipher.init(Cipher.DECRYPT_MODE, getPrivateKey());
                byte[] decryptedMessageBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encodedMessage));
                return new String(decryptedMessageBytes, StandardCharsets.UTF_8);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        }
        return null;
    }
    
    private PublicKey getPublicKey() throws NoSuchAlgorithmException, InvalidKeySpecException {
        try{
            KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
            X509EncodedKeySpec keySpecX509 = new X509EncodedKeySpec(Base64.getDecoder().decode(publicKey));
            return keyFactory.generatePublic(keySpecX509);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    private PrivateKey getPrivateKey() throws InvalidKeySpecException, NoSuchAlgorithmException {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
            PKCS8EncodedKeySpec keySpecPKCS8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey));
            return keyFactory.generatePrivate(keySpecPKCS8);
        } catch (InvalidKeySpecException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
