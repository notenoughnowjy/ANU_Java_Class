/*
국립 안동대학교 컴퓨터공학과 20181113 박준영
 */

package subject1;

import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>0 && n<999){
            String result = Integer.toBinaryString(n);
            System.out.println(result);
        }
        else{
            System.out.println("정수를 잘못 입력하셨습니다.");
        }
    }
}
