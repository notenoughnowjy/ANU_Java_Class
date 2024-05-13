/*
날짜를 나타내는 클래스 Date를 만들어보자. Date는 연도, 월, 일 등의 속성을 가지며, 날짜를 "2017.7.12"과 같이 출력하는 메소드 print1(),
날짜를 "July 12, 2012"와 같이 출력하는 print2() 등의 메소드를 가진다. Date 클래스를 작성하고 객체를 생성하여서 테스트하라.

출력: 2022.9.5
 */


class Date{
    int year;
    int int_month;
    String str_month;
    int day;
    Date(int year, int int_month, int day){
        this.year = year;
        this.int_month = int_month;
        this.day = day;
    }

    void print1(){
        System.out.println(year + "." + int_month + "." + day);
    }
    Date(String str_month, int day, int year) {
        this.str_month = str_month;
        this.day = day;
        this.year = year;
    }
    void print2(){
        System.out.println(str_month + "." + day + "." + year);
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Date date = new Date(2022, 9, 5);
        date.print1();
        Date date2 = new Date("July", 12, 2012);
        date2.print2();
    }
}