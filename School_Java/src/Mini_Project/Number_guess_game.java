package Mini_Project;

import java.util.Scanner;

public class Number_guess_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        랜덤 숫자 생성
        double double_random_number = Math.random() * 100;
//        랜덤 숫자를 int형으로 변환
        int Int_random_number = (int) double_random_number;

        int try_count = 0;
        while(true){
            System.out.print("정답을 추축해보시오: ");
//            추측 값 입력받기
            int answer = scanner.nextInt();

//            추측값이 정답보다 크다면 HIGH
            if(Int_random_number < answer){
                System.out.println("HIGH");
                try_count++;
            }

//            추측값이 정답보다 작다면 LOW
            if(Int_random_number > answer){
                System.out.println("LOW");
                try_count++;
            }

//            추측값과 정답이 동일하다면 축하 메시지와 함께 시도횟수 출력후 종료
            if(answer == Int_random_number){
                System.out.println("축하합니다. " + "시도횟수=" + ++try_count);
                break;
            }
        }

    }
}
