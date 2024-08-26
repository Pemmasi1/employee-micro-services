package com.dailycodebuffer.apigateway.controller;

import com.dailycodebuffer.apigateway.model.AuthenticationRequest;
import com.dailycodebuffer.apigateway.model.AuthenticationResponse;
import com.dailycodebuffer.apigateway.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authRequest) {

        if ("user".equals(authRequest.getUsername()) && "password".equals(authRequest.getPassword())) {
            final String token = jwtUtil.generateToken(authRequest.getUsername());
            return ResponseEntity.ok(new AuthenticationResponse(token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}

