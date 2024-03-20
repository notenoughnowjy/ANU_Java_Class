/*
국립 안동대학교 컴퓨터공학과 20181113 박준영
 */

package subject1;

import java.util.Scanner;

public class Orange_box {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("오렌지의 개수를 입력하시오: ");
        int orange_number = scanner.nextInt();

//        필요한 박스 수
        int share = orange_number/10;
//        남는 오렌지 수
        int rest = orange_number%10;

//        출력
        System.out.println(share + "박스가 필요하고 " + rest + "개가 남습니다.");
    }
}
