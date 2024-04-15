package subject2;
/*
국립안동대학교 컴퓨터공학과 박준영
20181113 박준영
 */

class Dog{
    String breed;
    int age;
    String color;

//    Dog 생성자 정의
    public Dog(String breed, int age, String color){
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
//    Dog 메서드 정의
    void barking(){}
    void hungry(){}
    void sleeping(){}

    @Override
    public String toString(){
        return "(" + breed + "," + age + "," + color + ")";
    }
}
public class DogTest {
    public static void main(String[] args) {
//        필드 값 입력
        Dog dog1 = new Dog("york", 1, "orange");
        System.out.println(dog1);
    }
}
