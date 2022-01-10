package com.asymmetric.encrypt.service;

import com.asymmetric.encrypt.vo.ConfigVO;

import java.util.List;

public interface ConfigService {
    
    void save(ConfigVO configVO) throws Exception;
    
    ConfigVO findById(Long id) throws Exception;
    
    List<ConfigVO> findAll();
    
}
