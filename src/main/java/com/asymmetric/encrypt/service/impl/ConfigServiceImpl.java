package com.asymmetric.encrypt.service.impl;

import com.asymmetric.encrypt.entity.Config;
import com.asymmetric.encrypt.repository.ConfigRepository;
import com.asymmetric.encrypt.service.ConfigService;
import com.asymmetric.encrypt.service.RSAEncryption;
import com.asymmetric.encrypt.vo.ConfigVO;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ConfigServiceImpl implements ConfigService {
    
    private final ConfigRepository configRepository;
    
    private final RSAEncryption rsaEncryption;
    
    @Override
    public void save(ConfigVO configVO) throws Exception {
        String encodedMessage = rsaEncryption.encrypt(configVO.getMessage());
        configRepository.save(new Config(encodedMessage));
    }
    
    @Override
    public ConfigVO findById(Long id) throws Exception {
        Config config = configRepository.findById(id).orElseThrow();
        String decryptedMessage = rsaEncryption.decrypt(config.getHash());
        return ConfigVO.builder()
                .message(decryptedMessage)
                .build();
    }
    
    @Override
    public List<ConfigVO> findAll() {
        List<ConfigVO> configVOS = new ArrayList<>();
        List<Config> configs = configRepository.findAll();
        if(CollectionUtils.isNotEmpty(configs)) {
            configs.stream().forEach(config -> {
                try {
                    String decryptedMessage = rsaEncryption.decrypt(config.getHash());
                    ConfigVO configVO = ConfigVO.builder()
                            .message(decryptedMessage)
                            .build();
                    configVOS.add(configVO);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        return configVOS;
    }
}
