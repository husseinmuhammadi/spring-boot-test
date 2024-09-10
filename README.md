# Spring Boot Testing

status is 302 and header contains Location

```kotlin
mockMvc.get(ENDPOINT_SWAGGER_UI).andExpect {
    status {
        isFound()
    }
    header {
        string("Location", "/swagger-ui/index.html")
    }
}
```

content maches with given java regex
```kotlin
mockMvc.get(ENDPOINT_SWAGGER_UI_INDEX).andExpect {
    status {
        isOk()
    }
    content {
        contentType("text/html")
        content {
            string(StringRegularExpression.matchesRegex("<html>"))
        }
    }
}
```
