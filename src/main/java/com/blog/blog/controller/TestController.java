package com.blog.blog.controller;

import com.blog.blog.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return testService.callService();
    }
}
