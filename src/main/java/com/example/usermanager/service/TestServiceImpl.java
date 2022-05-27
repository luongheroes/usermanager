package com.example.usermanager.service;

import com.example.usermanager.model.DataSample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl {
    public DataSample testService() {
        return DataSample.builder().data("Why not me").build();
    }
}
