/*
  문제번호 - 10809번
 -문제
  알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
  포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 -입력
  첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 -출력
  각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
  만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
*/


package project_06;

import java.io.*;

public class pro14_01 {
	  public static void main(String[] args) throws IOException {
	        // BufferedReader를 사용하여 입력을 읽어옵니다.
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // BufferedWriter를 사용하여 출력을 씁니다.
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        // 첫 번째 줄에서 단어 S를 읽어옵니다.
	        String S = br.readLine();
	        
	        // 알파벳의 처음 등장하는 위치를 저장할 배열을 초기화합니다.
	        int[] alphabet = new int[26];
	        for (int i = 0; i < 26; i++) {
	            alphabet[i] = -1;
	        }
	        
	        // 단어 S를 순회하면서 각 알파벳의 처음 등장 위치를 저장합니다.
	        for (int i = 0; i < S.length(); i++) {
	            char currentChar = S.charAt(i);
	            int index = currentChar - 'a';
	            if (alphabet[index] == -1) {
	                alphabet[index] = i;
	            }
	        }
	        
	        // 각 알파벳의 처음 등장 위치를 출력합니다.
	        for (int i = 0; i < 26; i++) {
	            bw.write(alphabet[i] + " ");
	        }
	        
	        // BufferedWriter를 닫아 출력이 완료되도록 합니다.
	        bw.flush();
	        bw.close();
	        br.close();
	    }
	}