package org.boilerplate.ticketboxuserservice.controller.auth;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.boilerplate.ticketboxuserservice.database.model.User;
import org.boilerplate.ticketboxuserservice.service.auth.AuthService;
import org.boilerplate.ticketboxuserservice.shared.base.BaseResponse;
import org.boilerplate.ticketboxuserservice.shared.dto.auth.LoginUserDto;
import org.boilerplate.ticketboxuserservice.shared.dto.auth.RegisterUserDto;

@RestController
@RequestMapping("/auth")
@Tag(name = "Auth", description = "Auth API")
public class AuthController {
    @Autowired
    public AuthService authService;

    @PostMapping("/register")
    public BaseResponse<User> register(@RequestBody RegisterUserDto dto) {
        return new BaseResponse<User>(authService.register(dto));
    }

    @PostMapping("/login")
    public BaseResponse<String> login(@RequestBody LoginUserDto dto) {
        return new BaseResponse<String>(authService.login(dto));
    }
}
