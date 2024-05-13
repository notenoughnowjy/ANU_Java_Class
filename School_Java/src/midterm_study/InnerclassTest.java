package midterm_study;

public class InnerclassTest {

    class Test{
        private static String test1 = "테스트";

        private static void testmethod(){
            System.out.println(test1);
        }
        private void testmethod2(){
            System.out.println("테스트2 테스트");
        }
    }

    public static void main(String[] args) {
        Test.test1 = "변경 테스트";
        System.out.println(Test.test1);
        Test.testmethod();

//        Test testobj = new Test();
//        testobj.testmethod2();
//        Test.testmethod2();
    }
}

class Test2{
    private String test2 = "테스트";
}
