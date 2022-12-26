package com.dhayalanit.openapi_and_swagger_in_spring_boot_3.data.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {

    @JsonProperty("post")
    private String post;
}