package com.asymmetric.encrypt.service;

public interface Encryption {
    String encrypt(String message) throws Exception;
    String decrypt(String encodedMessage) throws Exception;
}
