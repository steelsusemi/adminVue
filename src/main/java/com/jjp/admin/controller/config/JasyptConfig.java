package com.jjp.admin.controller.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Java Simplified Encryption 
 * @author FIC07049
 *
 */
@Configuration
public class JasyptConfig {
	
	@Value("${jasypt.encryptor.password}")
    private String encryptKey;
	
	@Value("${jasypt.encryptor.algorithm}")
    private String algorithm;
	
	@Value("${jasypt.encryptor.provider-name}")
    private String providerName;
	
	@Value("${jasypt.encryptor.string-output-type}")
    private String stringOutputType;

    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(encryptKey);
        config.setAlgorithm(algorithm);
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName(providerName);
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setIvGeneratorClassName("org.jasypt.iv.RandomIvGenerator");
        config.setStringOutputType(stringOutputType);
        encryptor.setConfig(config);
        return encryptor;
    }
    
}
