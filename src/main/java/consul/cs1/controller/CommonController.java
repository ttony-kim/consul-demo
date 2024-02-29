package consul.cs1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
public class CommonController {

    @Value("${spring.consul.testKey}")
    private String testKey;

//    @Value("${message.hello}")
//    private String message;

//    @GetMapping
//    public String testmethod() {
//        log.info("testMethod call");
//
//        return message;
//    }

    @GetMapping("/health")
    public String healthmethod() {
        log.info("healthCheck call");
        System.out.println("testKey = " + testKey);

        return "health";
    }
}
