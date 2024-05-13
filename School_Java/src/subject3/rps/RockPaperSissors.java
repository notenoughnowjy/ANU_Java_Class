package subject3.rps;
// 국립안동대학교 20181113 박준영
// 가위바위보 클래스
import java.util.Scanner;

public class RockPaperSissors {
    static void userWin(){
        System.out.println("인간이 이겼습니다.");
    }
    static void computerWin(){
        System.out.println("사용자가 이겼습니다.");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("하나를 산택하시요: 가위(0), 바위(1), 보(2): ");
        int user_value = scanner.nextInt();
        int computer_value = (int) (Math.random() * 3);
        if(computer_value == 0)
            System.out.println("컴퓨터는 가위를 냈습니다.");
        if(computer_value == 1)
            System.out.println("컴퓨터는 바위를 냈습니다.");
        if(computer_value == 2)
            System.out.println("컴퓨터는 보를 냈습니다.");

//        무승부
        if(user_value == computer_value)
            System.out.println("비겼습니다.");

//        가위
        if(user_value == 0 && computer_value == 1)
            computerWin();
        if(user_value == 0 && computer_value == 2)
            userWin();

//        바위
        if(user_value == 1 && computer_value == 0)
            userWin();
        if(user_value == 1 && computer_value == 2)
            computerWin();

//        보
        if(user_value == 2 && computer_value == 0)
            computerWin();
        if(user_value == 2 && computer_value == 1)
            userWin();
    }
}
