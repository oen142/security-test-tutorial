package com.wani.security;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.Authentication;

@Data
@Builder
public class SecurityMessage {

    private String message;
    private Authentication authentication;

}
