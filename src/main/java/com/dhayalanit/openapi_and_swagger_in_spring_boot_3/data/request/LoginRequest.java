package com.dhayalanit.openapi_and_swagger_in_spring_boot_3.data.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"username","password"})
public class LoginRequest {

    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
}