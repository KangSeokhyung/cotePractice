package com.example.cotepractice.service;

import org.springframework.stereotype.Service;

@Service
public class CoteService {

    // 문제1. 문자열 입력값 추출하기
    public String problem1(String inputStr) {
        if (!inputStr.isEmpty() && inputStr.length() <= 1000000) {
            System.out.print(inputStr);
        }
        return inputStr;
    }

    // 문제2. a와 b 출력하기
    public String problem2(String inputStr1, String inputStr2) {
        if (!inputStr1.isEmpty() && inputStr1.length() <= 1000000) {
            System.out.print(inputStr1);
        }
        if (!inputStr2.isEmpty() && inputStr2.length() <= 1000000) {
            System.out.print(inputStr2);
        }

        String s = "a = " + inputStr1 + "\n" + "b = " + inputStr2;
        return s;
    }
}
