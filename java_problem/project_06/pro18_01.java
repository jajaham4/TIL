/*
  문제번호 - 2908번
 -문제
  상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
  상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
  두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 -입력
  첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 -출력
  첫째 줄에 상수의 대답을 출력한다.
*/


package project_06;

import java.io.*;

public class pro18_01 {
	public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 읽어옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter를 사용하여 출력을 씁니다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 번째 줄에서 두 수 A와 B를 읽어옵니다.
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        
        // 숫자를 거꾸로 뒤집는 함수를 호출하여 정수를 얻습니다.
        int reversedA = reverseNumber(A);
        int reversedB = reverseNumber(B);
        
        // 두 수 중 큰 수를 찾습니다.
        int result = Math.max(reversedA, reversedB);
        
        // 결과를 출력합니다.
        bw.write(String.valueOf(result));
        bw.newLine();
        
        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
        bw.flush();
        bw.close();
        br.close();
    }
    
    // 숫자를 거꾸로 뒤집는 함수
    private static int reverseNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        return Integer.parseInt(sb.reverse().toString());
    }
}