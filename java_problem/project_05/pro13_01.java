/*
 문제번호 - 10818번
 -문제
  N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 -입력
  첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
  모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 -출력
  첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
package project_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro13_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정수의 개수 N 입력
        int N = Integer.parseInt(br.readLine());

        // N개의 정수를 공백으로 구분하여 배열에 저장
        String[] integers = br.readLine().split(" ");

        // 최솟값과 최댓값 초기화
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 배열에서 최솟값과 최댓값 찾기
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(integers[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // 결과 출력
        bw.write(min + " " + max);

        br.close();
        bw.close();
    }
}