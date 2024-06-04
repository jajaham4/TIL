/*
  문제번호 - 1546번
 -문제
  세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
  예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
  세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 -입력
  첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다.
  이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 -출력
  첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
 */


package project_06;

import java.io.*;
import java.util.*;

public class pro03_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 시험 본 과목의 개수
        double[] scores = new double[N]; // 점수 배열
        double max = 0; // 최댓값

        // 점수 입력 처리 (문자열 분리)
        String[] scoreStrs = br.readLine().split(" "); // 공백을 기준으로 문자열 분리
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(scoreStrs[i]); // 각 문자열을 실수형태로 변환
            max = Math.max(max, scores[i]);
        }
        
        // 새로운 평균 계산
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scores[i] / max * 100;
        }
        double average = sum / N;

        // 출력
        bw.write(String.format("%.2f", average));
        bw.flush();
        bw.close();
    }
}