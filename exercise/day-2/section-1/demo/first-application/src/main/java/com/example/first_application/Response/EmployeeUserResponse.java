package com.example.first_application.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class EmployeeUserResponse {

    @JsonProperty("id")
    private Long id;

    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty(value = "age", required = true)
    private int age;

    @JsonProperty(value = "address", defaultValue = "")
    private String address;

    @JsonProperty(value = "phone", required = true)
    private String phone;

}
