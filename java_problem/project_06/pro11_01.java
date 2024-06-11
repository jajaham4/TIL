/*
  문제번호 - 9086번
 -문제
  문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 -입력
  입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 
  문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
 -출력
  각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
 */


package project_06;

import java.io.*;
import java.util.*;

public class pro11_01 {
	 public static void main(String[] args) throws IOException {
	        // BufferedReader를 사용하여 입력을 읽어옵니다.
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // BufferedWriter를 사용하여 출력을 씁니다.
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        // 첫 번째 줄: 테스트 케이스의 개수 T
	        int T = Integer.parseInt(br.readLine());
	        
	        // 각 테스트 케이스에 대해서
	        for (int i = 0; i < T; i++) {
	            // 문자열을 읽어옵니다.
	            String str = br.readLine();
	            // 문자열의 첫 글자와 마지막 글자를 연결하여 출력합니다.
	            char firstChar = str.charAt(0);
	            char lastChar = str.charAt(str.length() - 1);
	            bw.write(firstChar + "" + lastChar);
	            bw.newLine(); // 다음 줄로 이동
	        }
	        
	        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
	        bw.flush();
	        bw.close();
	        br.close();
	    }
	}