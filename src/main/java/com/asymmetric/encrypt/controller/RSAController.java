package com.asymmetric.encrypt.controller;

import com.asymmetric.encrypt.service.RSAEncryption;
import com.asymmetric.encrypt.vo.ConfigVO;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rest/v1/rsa")
public class RSAController {

    private final RSAEncryption rsaEncryption;

    @GetMapping("/encrypt/{message}")
    public ResponseEntity<String> encrypt(@PathVariable String message) throws Exception {
        return ResponseEntity.ok(rsaEncryption.encrypt(message));
    }
    
    @GetMapping("/decrypt/{hash}")
    public ResponseEntity<String> decrypt(@PathVariable String hash) throws Exception {
        return ResponseEntity.ok(rsaEncryption.decrypt(hash));
    }
}
