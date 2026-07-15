`ResponseEntity` is a built-in Spring class that represents the **entire HTTP response**.

When you return a plain object (like a `UserResponseDto`) from a controller, Spring Boot automatically wraps it in a standard HTTP `200 OK` response. But if you want control over the **HTTP Status Code** (like `201 Created` or `400 Bad Request`), custom **HTTP Headers**, or dynamic error bodies, you use `ResponseEntity`.

Think of it as a wrapper that lets you control exactly what leaves your server over the network.

---

## 3 Ways to Create a `ResponseEntity`

Spring provides two main styles to build a `ResponseEntity`: a **Functional Fluent API** (highly recommended) and a **Traditional Constructor**.

### 1. The Fluent API (Cleanest & Most Common)

Spring provides helper methods named after HTTP statuses. You chain them together.

```java
// Returns a 200 OK with a body
return ResponseEntity.ok(userDto);

// Returns a 201 Created with a body
return ResponseEntity.status(HttpStatus.CREATED).body(userDto);

// Returns a 204 No Content (great for deletes)
return ResponseEntity.noContent().build();

// Returns a 400 Bad Request with an error message
return ResponseEntity.badRequest().body("Invalid input data");

```

### 2. The Traditional Constructor

If you prefer a direct approach, you can pass the body and status straight into the constructor.

```java
// Body + Status Code
return new ResponseEntity<>(userDto, HttpStatus.OK);

// Body + Headers + Status Code
HttpHeaders headers = new HttpHeaders();
headers.add("Custom-Header", "Value");
return new ResponseEntity<>(userDto, headers, HttpStatus.CREATED);

```

---

## Putting It Together: AuthController Example

Here is how your `AuthController` looks when utilizing `ResponseEntity` to properly manage your Signup and Login statuses.

```java
package com.dj.eccom_backend.controller;

import com.dj.eccom_backend.dto.UserLoginDto;
import com.dj.eccom_backend.dto.UserSignupDto;
import com.dj.eccom_backend.dto.UserResponseDto;
import com.dj.eccom_backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserResponseDto> signup(@RequestBody UserSignupDto signupDto) {
        UserResponseDto response = userService.register(signupDto);
        
        // Returns HTTP 201 Created instead of a generic 200 OK
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponseDto> login(@RequestBody UserLoginDto loginDto) {
        UserResponseDto response = userService.login(loginDto);
        
        // Returns HTTP 200 OK with the user data
        return ResponseEntity.ok(response);
    }
}

```

## Quick Reference: When to use which Status?

| Scenario | HTTP Status to Return | `ResponseEntity` Syntax |
| --- | --- | --- |
| **Data fetched successfully** | `200 OK` | `ResponseEntity.ok(body)` |
| **New resource created (Signup)** | `201 Created` | `ResponseEntity.status(HttpStatus.CREATED).body(body)` |
| **Action completed, nothing to return (Delete)** | `204 No Content` | `ResponseEntity.noContent().build()` |
| **Client sent bad data (Validation failed)** | `400 Bad Request` | `ResponseEntity.badRequest().body(errors)` |
| **Wrong credentials / Missing Token** | `401 Unauthorized` | `ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()` |