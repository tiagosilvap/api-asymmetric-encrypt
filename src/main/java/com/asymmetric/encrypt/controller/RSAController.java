package com.asymmetric.encrypt.controller;

import com.asymmetric.encrypt.service.RSAEncryption;
import com.asymmetric.encrypt.vo.ConfigVO;
import com.asymmetric.encrypt.vo.RSAVO;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rest/v1/rsa")
public class RSAController {

    private final RSAEncryption rsaEncryption;

    @PostMapping("/encrypt")
    public ResponseEntity<String> encrypt(@RequestBody @NotNull RSAVO request) throws Exception {
        return ResponseEntity.ok(rsaEncryption.encrypt(request.getMessage()));
    }
    
    @PostMapping("/decrypt")
    public ResponseEntity<String> decrypt(@RequestBody @NotNull RSAVO request) throws Exception {
        return ResponseEntity.ok(rsaEncryption.decrypt(request.getMessage()));
    }
}
