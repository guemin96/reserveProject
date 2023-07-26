package com.example.securitytest.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class DemoController {
    @GetMapping("/")
    public String helloworld(){
        return "hello world";
    }
    //로그인 아이디랑 sessionID 가져오게 하는 부분
    @GetMapping("/session")
    public ResponseCookieDTO hello(@AuthenticationPrincipal User user, HttpSession HttpSession){
        String username = "empty";
        String session_id = "empty";

        if (user == null){
            System.out.println("user is null");
        }
        else {
            session_id = HttpSession.getId();
            username = user.getUsername();
        }
        return new ResponseCookieDTO(username,session_id);
    }
}
