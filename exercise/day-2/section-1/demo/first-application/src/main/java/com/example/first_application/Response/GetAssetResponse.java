package com.example.first_application;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter

public class GetAssetResponse {

    @JsonProperty("npk")
    private Long npk;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("age")
    private int age;

    @JsonProperty("status")
    private String status;

}
