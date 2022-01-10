package com.asymmetric.encrypt.service;

public interface Encryption<T> {
    T encrypt(T message) throws Exception;
    T decrypt(T encodedMessage) throws Exception;
}
