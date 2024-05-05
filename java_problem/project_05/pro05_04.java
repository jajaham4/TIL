/*
 문제번호 - 11022번
 -문제
  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 -입력
  첫째 줄에 테스트 케이스의 개수 T가 주어진다.
  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 -출력
  각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
*/
package project_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro05_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int sum[] = new int[T];
		for(int i=0; i<T; i++) {
			String s[] = br.readLine().split(" ");
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[1]);
			sum[i] = A+B;
		}
		for(int i=0; i<T; i++) {
			bw.write("Case #"+ (i+1) + ": " + sum[i]+"\n");
		}
		br.close();
		bw.close();
	}

}
