/*
  문제번호 - 2675번
 -문제
  문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
  QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 -입력
  첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
 -출력
  각 테스트 케이스에 대해 P를 출력한다.
*/


package project_06;

import java.io.*;

public class pro15_01 {
	 public static void main(String[] args) throws IOException {
	        // BufferedReader를 사용하여 입력을 읽어옵니다.
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // BufferedWriter를 사용하여 출력을 씁니다.
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        // 첫 번째 줄에서 테스트 케이스의 개수 T를 읽어옵니다.
	        int T = Integer.parseInt(br.readLine());
	        
	        // 각 테스트 케이스에 대해서
	        for (int i = 0; i < T; i++) {
	            // 한 줄을 읽어와서 공백으로 분리합니다.
	            String[] input = br.readLine().split(" ");
	            int R = Integer.parseInt(input[0]);
	            String S = input[1];
	            
	            // 새 문자열 P를 만들기 위한 StringBuilder를 초기화합니다.
	            StringBuilder P = new StringBuilder();
	            
	            // 문자열 S의 각 문자를 R번 반복하여 P에 추가합니다.
	            for (int j = 0; j < S.length(); j++) {
	                char ch = S.charAt(j);
	                for (int k = 0; k < R; k++) {
	                    P.append(ch);
	                }
	            }
	            
	            // 결과 문자열 P를 출력합니다.
	            bw.write(P.toString());
	            bw.newLine(); // 다음 줄로 이동
	        }
	        
	        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
	        bw.flush();
	        bw.close();
	        br.close();
	    }
	}