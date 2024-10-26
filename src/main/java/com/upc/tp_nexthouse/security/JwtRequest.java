package com.upc.tp_nexthouse.security;

import lombok.Data;

@Data

public class JwtRequest {
    private String username;
    private String password;
}
