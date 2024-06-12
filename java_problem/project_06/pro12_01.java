/*
  문제번호 - 11654번
 -문제
  알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 -입력
  알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 -출력
  입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */


package project_06;

import java.io.*;
import java.util.*;

public class pro12_01 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 읽어옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter를 사용하여 출력을 씁니다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 번째 줄에서 단일 문자를 읽어옵니다.
        char character = br.readLine().charAt(0);
        
        // 문자의 아스키 코드 값을 계산합니다.
        int asciiValue = (int) character;
        
        // 아스키 코드 값을 출력합니다.
        bw.write(String.valueOf(asciiValue));
        
        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
        bw.flush();
        bw.close();
        br.close();
    }
}