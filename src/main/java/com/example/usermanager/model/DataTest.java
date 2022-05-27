package com.example.usermanager.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DataTest {
    private String id;
    private String name;
    private String address;
    private Integer roleId;
}
