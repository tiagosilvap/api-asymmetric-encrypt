package com.asymmetric.encrypt.controller;

import com.asymmetric.encrypt.service.ConfigService;
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
    
    @GetMapping("/{configId}")
    public ResponseEntity<ConfigVO> getConfigById(@PathVariable Long configId) throws Exception {
        return ResponseEntity.ok(configService.findById(configId));
    }
    
    @PostMapping()
    public ResponseEntity<Void> saveConfig(@RequestBody @NotNull ConfigVO request) throws Exception {
        configService.save(request);
        return ResponseEntity.ok().build();
    }

}
