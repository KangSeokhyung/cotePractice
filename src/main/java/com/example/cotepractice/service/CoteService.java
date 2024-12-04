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

    // 문제6. 덧셈식 출려
    public String problem6(int a, int b) {
        int sum = 0;
        String rtn_string = "";

        sum = a + b;

        rtn_string = a + " + " + b + " = " + sum;

        return rtn_string;
    }

    // 문제7. 문자열 붙여서 출력
    public String problem7(String a, String b) {
        String rtn_string = "";
        String c = a + b;
        rtn_string = c.replace(" ", "");
        return rtn_string;
    }

    // 문제8. 문자열 돌리기
    public String problem8(String a) {
        String rtn_string = "";
        for(int i = 0 ; i < a.length(); i++ ){
            rtn_string += (a.charAt(i) + "\n");
        }
        return rtn_string;
    }

    // 문제9. 홀짝 구분하기
    public String problem9(int n) {
        String rtn_string = "";
        if(n%2 == 1){
            rtn_string = n + " is odd";
        }else{
            rtn_string = n + " is even";
        }
        return rtn_string;
    }

    // 문제10. 문자열 겹쳐쓰기
    public String problem10(String a, String b, int s) {
        String rtn_string = "";

        rtn_string = a.substring(0, s) + b;

        if(a.length() > rtn_string.length()){
            rtn_string += a.substring(rtn_string.length(), a.length());
        }

        return rtn_string;
    }
}
