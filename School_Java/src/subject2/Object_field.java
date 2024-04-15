package subject2;


/*
국립안동대학교 컴퓨터공학과 박준영
20181113 박준영
 */


public class Object_field {
    public static void main(String[] args) {
        NumberBox IntnumberBox = new NumberBox();
        NumberBox FloatnumberBox = new NumberBox();

        IntnumberBox.ivalue = 10;
        FloatnumberBox.fvalue = 1.2345f;

        System.out.println(IntnumberBox);
        System.out.println(FloatnumberBox);
    }
}
