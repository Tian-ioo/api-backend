package com.tian.tianapiinterface;

import com.tian.tianapiclientsdk.client.TianApiClient;
import com.tian.tianapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;


@SpringBootTest
@ComponentScan
class TianapiInterfaceApplicationTests {
    @Resource
    private TianApiClient tianApiClient;

    @Test
    void contextLoads() {
        String result = tianApiClient.getNameByGet("tian");
        User user = new User();
        user.setUsername("tian");
        String userNameByPost = tianApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(userNameByPost);
    }


}
