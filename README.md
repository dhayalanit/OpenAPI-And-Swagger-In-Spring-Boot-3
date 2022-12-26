# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)



### Test

http://localhost:9098/swagger-ui/index.html?urls.primaryName=Post

http://localhost:9098/v3/api-docs/Post



````// 20221226220526
// http://localhost:9098/v3/api-docs/Post

{
  "openapi": "3.0.1",
  "info": {
    "title": "Spring Doc",
    "description": "Spring doc",
    "version": "1.0.0"
  },
  "servers": [
    {
      "url": "http://localhost:9098",
      "description": "Generated server url"
    }
  ],
  "paths": {
    "/post": {
      "post": {
        "tags": [
          "Post"
        ],
        "description": "Create Post service",
        "operationId": "createPost",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/PostRequest"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "Successfully created post!",
            "content": {
              "application/json": {
                "example": {
                  "code": 200,
                  "Status": "Ok!",
                  "Message": "Successfully created post!"
                }
              }
            }
          },
          "400": {
            "$ref": "#/components/responses/badRequestAPI"
          },
          "500": {
            "$ref": "#/components/responses/internalServerErrorAPI"
          }
        }
      }
    },
    "/post/{id}": {
      "patch": {
        "tags": [
          "Post"
        ],
        "description": "Create Post service",
        "operationId": "updatePost",
        "parameters": [
          {
            "name": "id",
            "in": "path",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int32"
            }
          }
        ],
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/PostRequest"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "Successfully updated post!",
            "content": {
              "application/json": {
                "example": {
                  "code": 200,
                  "Status": "Ok!",
                  "Message": "Successfully updated post!"
                }
              }
            }
          },
          "400": {
            "$ref": "#/components/responses/badRequestAPI"
          },
          "500": {
            "$ref": "#/components/responses/internalServerErrorAPI"
          }
        }
      }
    }
  },
  "components": {
    "schemas": {
      "PostRequest": {
        "type": "object",
        "properties": {
          "post": {
            "type": "string"
          }
        }
      }
    },
    "responses": {
      "badRequestAPI": {
        "description": "Bad Request!",
        "content": {
          "application/json": {
            "examples": {
              "default": {
                "value": "{\"code\":400,\"message\":\"Bad Request!\",\"status\":\"Bad Request!\"}"
              }
            }
          }
        }
      },
      "internalServerErrorAPI": {
        "description": "Internal Server error!",
        "content": {
          "application/json": {
            "examples": {
              "default": {
                "value": "{\"code\":500,\"message\":\"Internal Server Error!\",\"status\":\"Internal Server Error!\"}"
              }
            }
          }
        }
      }
    }
  }
}
