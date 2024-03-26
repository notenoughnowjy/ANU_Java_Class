package Mini_Project;

import java.util.Scanner;

public class Number_guess_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        int try_count = 0;

        // 임의의 정수 생성 (예: 1에서 100 사이의 임의의 정수)
        int Int_random_number = (int) (Math.random() * 100) + 1;

        do {
            System.out.print("정답을 추축해보시오: ");
            // 추측 값 입력받기
            answer = scanner.nextInt();

            // 추측값이 정답보다 크다면 HIGH
            if (Int_random_number < answer) {
                System.out.println("HIGH");
                try_count++;
            }
            // 추측값이 정답보다 작다면 LOW
            else if (Int_random_number > answer) {
                System.out.println("LOW");
                try_count++;
            }
        } while (Int_random_number != answer);
        System.out.println("축하합니다. " + "시도횟수=" + ++try_count);
    }
}

