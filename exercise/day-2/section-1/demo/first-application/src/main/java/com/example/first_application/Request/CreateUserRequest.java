package com.example.first_application.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CreateUserRequest {

    @JsonProperty("npk")
    private Long npk;

    @JsonProperty("full_name")
    private String fullName;

}
