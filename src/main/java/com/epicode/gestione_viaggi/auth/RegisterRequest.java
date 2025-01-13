package com.epicode.gestione_viaggi.auth;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
}
