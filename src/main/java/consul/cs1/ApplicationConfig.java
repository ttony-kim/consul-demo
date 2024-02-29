package consul.cs1;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ApplicationConfig {

    @Value("${spring.consul.testKey}")
    private String testKey;

    @PostConstruct
    void test() {
        System.out.println("testKey = " + testKey);
    }

}
