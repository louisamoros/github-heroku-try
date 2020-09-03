package com.example.githubherokutry;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hi")
    public String sayHi() {
        return "hi " + UUID.randomUUID();
    }

}
