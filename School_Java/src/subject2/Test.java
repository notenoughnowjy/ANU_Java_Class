package subject2;


/*
국립안동대학교 컴퓨터공학과 박준영
20181113 박준영
 */

class Rectangle{
    int width, height;
    int area(){
        return width*height;
    }
}
public class Test {
    public static void main(String[] args) {
        Rectangle myRect;
        myRect = new Rectangle(); // 객체를 new를 통해서 생성해준다.
        myRect.width = 10;
        myRect.height = 20;
        System.out.println("면적은 " + myRect.area());
    }
}
