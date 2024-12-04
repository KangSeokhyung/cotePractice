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

    @GetMapping("/problem6")
    @Operation(summary = "프로그래머스 덧셈식 출력하기", description = "정수 a,b를 입력받아 4 + 5 = 9 를 만드세요")
    public String problem6(
            @Parameter(description = "입력받을 문자열") @RequestParam int a, int b) {
        return coteService.problem6(a, b);
    }

    @GetMapping("/problem7")
    @Operation(summary = "문자열 붙여서 출력하기", description = "")
    public String problem7(
            @Parameter(description = "입력받을 문자열") @RequestParam String a, String b) {
        return coteService.problem7(a, b);
    }

    @GetMapping("/problem8")
    @Operation(summary = "문자열 돌리기", description = "")
    public String problem8(
            @Parameter(description = "입력받을 문자열") @RequestParam String a) {
        return coteService.problem8(a);
    }

    @GetMapping("/problem9")
    @Operation(summary = "홀짝 구분하기", description = "")
    public String problem9(
            @Parameter(description = "입력받을 문자열") @RequestParam int a) {
        return coteService.problem9(a);
    }

    @GetMapping("/problem10")
    @Operation(summary = "문자열 겹쳐쓰기", description = "")
    public String problem10(
            @Parameter(description = "입력받을 문자열") @RequestParam String a, String b, int s) {
        return coteService.problem10(a,b,s);
    }
}