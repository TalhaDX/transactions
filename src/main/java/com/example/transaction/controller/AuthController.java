package com.example.transaction.controller;

import com.example.transaction.model.AuthRequest;
import com.example.transaction.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/get-token")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authRequest.getEmail(), authRequest.getPassword()));
        } catch (Exception ex){
            throw new Exception("Invalid Username password");
        }

        return jwtUtils.generateToken(authRequest.getEmail());
    }

    @GetMapping("/secure")
    public String secure() {
        return "This is a secure endpoint";
    }
}
