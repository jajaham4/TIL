/*
  문제번호 - 5597번
 -문제
  두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
  수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오. 
 -입력
  첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 -출력
  첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 */


package project_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class pro30_01 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        Set<Integer> remainders = new HashSet<>();

	        // 10개의 숫자를 입력받음
	        for (int i = 0; i < 10; i++) {
	            int number = Integer.parseInt(br.readLine());
	            int remainder = number % 42;
	            remainders.add(remainder);
	        }

	        // 서로 다른 나머지의 개수 출력
	        bw.write(remainders.size() + "\n");

	        bw.flush();
	        bw.close();
	        br.close();
	    }
}