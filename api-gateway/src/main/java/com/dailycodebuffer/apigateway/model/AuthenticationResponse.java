package com.dailycodebuffer.apigateway.model;

public class AuthenticationResponse {
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    private String token;
}
