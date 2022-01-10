package com.asymmetric.encrypt.repository;

import com.asymmetric.encrypt.model.Config;
import com.asymmetric.encrypt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Long> {

}
