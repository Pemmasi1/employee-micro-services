package com.dailycodebuffer.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;

@Configuration
public class JwtConfig {

    @Bean
    public ReactiveJwtDecoder reactiveJwtDecoder() {
        // generally this is the jwt issuer url such as Okta
        String jwkSetUri = "https://your-issuer/.well-known/jwks.json";

        return NimbusReactiveJwtDecoder.withJwkSetUri(jwkSetUri).build();
    }
}
