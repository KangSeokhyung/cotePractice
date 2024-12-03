package com.example.cotepractice.controller;

import com.example.cotepractice.service.CoteService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "프로그래머스 문자열 출력하기", description = "문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.")
    public String problem1(
            @Parameter(description = "입력받을 문자열") @RequestParam String inStr) {

        return coteService.problem1(inStr);
    }

    @GetMapping("/problem2")
    @Operation
    public String problem2(
            @Parameter(description = "입력받을 문자열1") @RequestParam String inStr,
            @Parameter(description = "입력받을 문자열2") @RequestParam String inStr2){
        return coteService.problem2(inStr, inStr2);
    }

    @GetMapping("/problem3")
    public String problem3(
            @Parameter(description = "입력받을 문자열1") @RequestParam String inStr,
            @Parameter(description = "입력받을 문자열2") @RequestParam int cnt){
        return coteService.problem3(inStr, cnt);
    }

    @GetMapping("/problem4")
    public String problem4(
            @Parameter(description = "입력받을 문자열1") @RequestParam String inStr){
        return coteService.problem4(inStr);
    }

    @GetMapping("/problem5")
    public String problem5(){
        return coteService.problem5();
    }
}