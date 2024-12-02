package com.example.cotepractice.controller;

import com.example.cotepractice.service.CoteService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cote")
public class CotePracticeController {

    private final CoteService coteService;

    @GetMapping("/problem1")
    public String problem1(
            @Parameter(description = "입력받을 문자열") @RequestParam String inStr) {

        return coteService.problem1(inStr);
    }

    @GetMapping("/problem2")
    public String problem2(
            @Parameter(description = "입력받을 문자열1") @RequestParam String inStr,
            @Parameter(description = "입력받을 문자열2") @RequestParam String inStr2){
        return coteService.problem2(inStr, inStr2);
    }
}