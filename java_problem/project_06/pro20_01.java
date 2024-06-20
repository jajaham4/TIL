/*
  문제번호 - 5622번
 -문제
  상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
  전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
  숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
  상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
  할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
 -입력
  첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 -출력
  첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
*/


package project_06;

import java.io.*;

public class pro20_01 {
	 public static void main(String[] args) throws IOException {
	        // BufferedReader를 사용하여 입력을 읽어옵니다.
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // 단어를 읽어옵니다.
	        String word = br.readLine();

	        // 각 알파벳에 대응하는 다이얼 숫자를 저장하는 배열입니다.
	        int[] dialTimes = new int[26];
	        dialTimes['A' - 'A'] = dialTimes['B' - 'A'] = dialTimes['C' - 'A'] = 3; // ABC -> 2 -> 3초
	        dialTimes['D' - 'A'] = dialTimes['E' - 'A'] = dialTimes['F' - 'A'] = 4; // DEF -> 3 -> 4초
	        dialTimes['G' - 'A'] = dialTimes['H' - 'A'] = dialTimes['I' - 'A'] = 5; // GHI -> 4 -> 5초
	        dialTimes['J' - 'A'] = dialTimes['K' - 'A'] = dialTimes['L' - 'A'] = 6; // JKL -> 5 -> 6초
	        dialTimes['M' - 'A'] = dialTimes['N' - 'A'] = dialTimes['O' - 'A'] = 7; // MNO -> 6 -> 7초
	        dialTimes['P' - 'A'] = dialTimes['Q' - 'A'] = dialTimes['R' - 'A'] = dialTimes['S' - 'A'] = 8; // PQRS -> 7 -> 8초
	        dialTimes['T' - 'A'] = dialTimes['U' - 'A'] = dialTimes['V' - 'A'] = 9; // TUV -> 8 -> 9초
	        dialTimes['W' - 'A'] = dialTimes['X' - 'A'] = dialTimes['Y' - 'A'] = dialTimes['Z' - 'A'] = 10; // WXYZ -> 9 -> 10초

	        // 전체 시간을 저장할 변수입니다.
	        int totalTime = 0;

	        // 단어의 각 문자를 순회하면서 시간을 합산합니다.
	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);
	            totalTime += dialTimes[ch - 'A'];
	        }

	        // 결과를 출력합니다.
	        System.out.println(totalTime);

	        // BufferedReader를 닫아 자원을 해제합니다.
	        br.close();
	    }
	}