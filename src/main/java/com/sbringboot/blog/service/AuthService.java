package com.sbringboot.blog.service;

import com.sbringboot.blog.payload.LoginDTO;
import com.sbringboot.blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDTO loginDTO);

    String register(RegisterDto registerDto);
}
