package subject2;
/*
국립안동대학교 컴퓨터공학과 박준영
20181113 박준영
 */

import org.w3c.dom.ls.LSOutput;

class Calculation{
    int value1, value2, value3;
// 첫번째 sum 메소드
    public int sum(int value1, int value2){
        return value1 + value2;
    }

//    두번째 sum 메소드
    public int sum(int value1, int value2, int value3){
        return value1 + value2 + value3;
    }
}
public class CalculationOutput {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
//        메소드 오버라이딩 출력
        System.out.println("obj1: " + obj.sum(10, 20));
        System.out.println("obj2: " + obj.sum(10, 20, 30));
    }

}
