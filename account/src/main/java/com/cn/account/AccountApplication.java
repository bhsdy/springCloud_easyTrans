package com.cn.account;

import com.yiqiniu.easytrans.EnableEasyTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableEurekaClient
@SpringBootApplication
@EnableEasyTransaction
@EnableTransactionManagement
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
