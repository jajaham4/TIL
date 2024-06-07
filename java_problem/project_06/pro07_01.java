/*
  문제번호 - 27866번
 -문제
  단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
 -입력
  첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1000이다.
  둘째 줄에 정수 i가 주어진다.
 -출력
  S의 i번째 글자를 출력한다.
 */


package project_06;

import java.io.*;
import java.util.*;

public class pro07_01 {
	public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 읽어옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter를 사용하여 출력을 씁니다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 번째 줄: 단어 S
        String S = br.readLine();
        // 두 번째 줄: 정수 i
        int i = Integer.parseInt(br.readLine());
        
        // S의 i번째 글자를 출력합니다. (i는 1부터 시작한다고 가정)
        char result = S.charAt(i - 1);
        bw.write(result);
        
        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
        bw.flush();
        bw.close();
        br.close();
    }
}