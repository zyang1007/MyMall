package com.mymall2023.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.mymall2023.mbg.mapper", "com.mymall2023.dao"})
public class MyBatisConfig {
    // Additional MyBatis configurations can be added here if needed
}
