/*
국립 안동대학교 컴퓨터공학과 20181113 박준영
 */
import java.util.Scanner;

public class Rest_money_and_tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("받은 돈: ");
        int get_money = scanner.nextInt();
        System.out.print("\n상품 가격: ");
        int price = scanner.nextInt();

//        부가세는 상품 가격의 10%
        int tax = price/10;
//        받은 돈
        int rest_money = get_money - price;

//        출력
        System.out.println("부가세: " + tax);
        System.out.println("잔돈: " + rest_money);
    }
}

