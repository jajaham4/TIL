/*
  문제번호 - 11720번
 -문제
  N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시
 -입력
  첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 -출력
  입력으로 주어진 숫자 N개의 합을 출력한다.
 */


package project_06;

import java.io.*;

public class pro13_01 {
	public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 읽어옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter를 사용하여 출력을 씁니다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 번째 줄에서 숫자의 개수 N을 읽어옵니다.
        int N = Integer.parseInt(br.readLine());
        
        // 두 번째 줄에서 공백 없이 주어진 숫자들을 읽어옵니다.
        String numbers = br.readLine();
        
        // 숫자들의 합을 계산합니다.
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0'; // 각 문자를 숫자로 변환하여 합산
        }
        
        // 숫자들의 합을 출력합니다.
        bw.write(String.valueOf(sum));
        
        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
        bw.flush();
        bw.close();
        br.close();
    }
}