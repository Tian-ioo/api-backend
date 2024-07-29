package com.tian.tianapiclientsdk;

import com.tian.tianapiclientsdk.client.TianApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("tianapi.client")
@Data
@ComponentScan
public class TianApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public TianApiClient tianApiClient(){
        return new TianApiClient(accessKey,secretKey);
    }
}
