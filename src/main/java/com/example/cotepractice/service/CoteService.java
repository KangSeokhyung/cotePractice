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

    // 문제3. 문자열 반복
    public String problem3(String inputStr1, int cnt) {
        String rtn_string = "";
        if (!inputStr1.isEmpty() && inputStr1.length() <= 10) {
            System.out.print(inputStr1);
        }
        for(int i = 0; i < cnt; i++) {
            rtn_string += inputStr1;
        }
        return rtn_string;
    }

    // 문제4. 문자열 대/소문자 변환
    public String problem4(String inputStr1) {
        String rtn_string = "";
        String temp_String = "";
        if (!inputStr1.isEmpty() && inputStr1.length() <= 20) {
            System.out.print(inputStr1);
        }

       for(char c : inputStr1.toCharArray()) {
           if (Character.isUpperCase(c)) {
               temp_String = String.valueOf(c);
               rtn_string += temp_String.toLowerCase();
           }else if(Character.isLowerCase(c)){
               temp_String = String.valueOf(c);
               rtn_string += temp_String.toUpperCase();
           }
       }

        return rtn_string;
    }

    // 문제5. 특수문자 출력
    public String problem5() {
        String rtn_string = "!@#$%^&*(\\'\"<>?:;";

        return rtn_string;
    }
}
