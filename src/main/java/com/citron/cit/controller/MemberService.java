package com.citron.cit.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {
    @GetMapping("/members")
    @Operation(summary = "회원조회")
    public void get() {

    }

    @PostMapping("/members")
    @Operation(summary = "회원e등록")
    public void register() {

    }

    @DeleteMapping("/members")
    @Operation(summary = "회원삭제")
    public void delete(){

    }
}
