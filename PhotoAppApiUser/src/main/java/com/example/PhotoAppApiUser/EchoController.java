package com.example.PhotoAppApiUser;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class EchoController {

    @Value("${name:Unable to connect to config server}")
    private String name = "nowhere";

    @RequestMapping("/client")
    public String home() {
        return "This is a dynamic property loaded from " + name;
    }
}
