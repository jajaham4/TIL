/*
 문제번호 - 2562번
 -문제
  9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
  예를 들어, 서로 다른 9개의 자연수
  3, 29, 38, 12, 57, 74, 40, 85, 61
  이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 -입력
  첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 -출력
  첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
package project_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class pro20_01 {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter를 사용하여 입력과 출력을 처리합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 9개의 자연수를 담을 배열을 선언합니다.
        int[] numbers = new int[9];

        // 각 자연수를 입력받아 배열에 저장합니다.
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 최댓값과 최댓값의 인덱스를 찾기 위한 변수를 초기화합니다.
        int max = numbers[0];
        int maxIndex = 0;

        // 배열을 순회하며 최댓값과 그 인덱스를 찾습니다.
        for (int i = 1; i < 9; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        // 최댓값과 최댓값의 인덱스를 출력합니다.
        bw.write(max + "\n");
        bw.write((maxIndex + 1) + "\n"); // 인덱스는 0부터 시작하므로 1을 더해줍니다.

        // BufferedReader와 BufferedWriter를 닫습니다.
        br.close();
        bw.flush();
        bw.close();
    }
}