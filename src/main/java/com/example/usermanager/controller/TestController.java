package com.example.usermanager.controller;

import com.example.usermanager.model.DataSample;
import com.example.usermanager.service.TestServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController {
    private TestServiceImpl testService;

    @GetMapping("/test")
    public DataSample getDataSample() {
        return testService.testService();
    }
}
