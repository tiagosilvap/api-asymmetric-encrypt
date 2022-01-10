package com.asymmetric.encrypt.service.encrypt;

public interface Encryption<T> {
    T encrypt(T message);
    T decrypt(T encodedMessage);
}
