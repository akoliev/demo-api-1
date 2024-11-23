package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/")
public class DemoController {
    @GetMapping("/test")
    public Map<String, Object> getTestJson() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "This is a test JSON response");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}
