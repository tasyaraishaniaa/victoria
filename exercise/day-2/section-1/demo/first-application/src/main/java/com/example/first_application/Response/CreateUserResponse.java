package com.example.first_application.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CreateUserResponse {

    @JsonProperty("npk")
    private Long npk;

    @JsonProperty("full_name")
    private String fullName;

}
