/*
  문제번호 - 2743번
 -문제
  알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 -입력
  첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 -출력
  첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 */


package project_06;

import java.io.*;
import java.util.*;

public class pro10_01 {
	public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 읽어옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter를 사용하여 출력을 씁니다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 번째 줄: 단어 S를 입력받습니다.
        String S = br.readLine();
        
        // 단어 S의 길이를 계산합니다.
        int length = S.length();
        
        // 단어의 길이를 출력합니다.
        bw.write(String.valueOf(length));
        
        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
        bw.flush();
        bw.close();
        br.close();
    }
}