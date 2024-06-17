/*
  문제번호 - 1152번
 -문제
  영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
  단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 -입력
  첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 -출력
  첫째 줄에 단어의 개수를 출력한다.
*/


package project_06;

import java.io.*;

public class pro17_01 {
	public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 읽어옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 문자열을 읽어옵니다.
        String input = br.readLine().trim();
        
        // 입력 문자열이 비어있는 경우 단어 수는 0입니다.
        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            // 공백을 기준으로 문자열을 분리하여 단어 배열을 만듭니다.
            String[] words = input.split("\\s+");
            
            // 단어의 개수를 출력합니다.
            System.out.println(words.length);
        }
        
        // BufferedReader를 닫아 자원을 해제합니다.
        br.close();
    }
}