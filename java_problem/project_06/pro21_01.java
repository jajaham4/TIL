/*
  문제번호 - 11718번
 -문제
  입력 받은 대로 출력하는 프로그램을 작성하시오.
 -입력
 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 
 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 -출력
  입력받은 그대로 출력한다.
*/


package project_06;

import java.io.*;

public class pro21_01 {
	  public static void main(String[] args) throws IOException {
	        // BufferedReader를 사용하여 입력을 읽어옵니다.
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // BufferedWriter를 사용하여 출력을 씁니다.
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        String line;
	        // EOF를 만날 때까지 각 줄을 읽어옵니다.
	        while ((line = br.readLine()) != null) {
	            // 입력받은 각 줄을 그대로 출력합니다.
	            bw.write(line);
	            bw.newLine(); // 줄바꿈을 추가합니다.
	        }

	        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
	        bw.flush();
	        bw.close();
	        br.close();
	  }
}