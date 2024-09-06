package com.example.first_application.Request;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Setter
@Getter
public class UpdateUserRequest {
    @JsonProperty("npk")
    private Long npk;

    @JsonProperty("full_name")
    private String fullName;
}
