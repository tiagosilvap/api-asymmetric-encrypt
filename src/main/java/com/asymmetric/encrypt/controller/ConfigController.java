package com.asymmetric.encrypt.controller;

import com.asymmetric.encrypt.model.Config;
import com.asymmetric.encrypt.service.ConfigService;
import com.asymmetric.encrypt.vo.ConfigVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rest/v1/config")
public class ConfigController {

    private final ConfigService configService;

    @GetMapping
    public ResponseEntity<List<ConfigVO>> getConfigs() {
        return ResponseEntity.ok(configService.findAll());
    }

}
