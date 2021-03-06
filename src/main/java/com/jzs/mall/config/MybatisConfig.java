package com.jzs.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.jzs.mall.mbg.mapper", "com.jzs.mall.dao"})
public class MybatisConfig {

}
