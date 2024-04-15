package subject2;


/*
국립안동대학교 컴퓨터공학과 박준영
20181113 박준영
 */

class Student{
    String name;
    int StudentID;
    int age;
    public Student(String name, int StudentID, int age){
        this.name = name;
        this.StudentID = StudentID;
        this.age = age;
    }

//    학생 출력
    public void printout(){
        System.out.println("학생의 이름: " + name);
        System.out.println("학생의 학번: " + StudentID);
        System.out.println("학생의 나이: " + age);
    }
}

public class StudentTest {
    public static void main(String[] args) {
//        학생 값 입력
        Student student1 = new Student("Kim", 20180001, 20);
        student1.printout();
    }
}
