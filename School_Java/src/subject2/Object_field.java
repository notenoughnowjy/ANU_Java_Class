package subject2;


/*
국립안동대학교 컴퓨터공학과 박준영
20181113 박준영
 */


public class Object_field {
    public static void main(String[] args) {
        
        // IntnumberBox 객체 생성
        NumberBox IntnumberBox = new NumberBox();
        
//        FloatnumberBox 객체 생성
        NumberBox FloatnumberBox = new NumberBox();

//        IntnumberBox의 int 값을 10
        IntnumberBox.ivalue = 10;
//        FloatnumberBox의 fvalue 값을 1.2345로 설정
        FloatnumberBox.fvalue = 1.2345f;

//        출력
        System.out.println(IntnumberBox);
        System.out.println(FloatnumberBox);
    }
}
