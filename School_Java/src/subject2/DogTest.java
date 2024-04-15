package subject2;
/*
국립안동대학교 컴퓨터공학과 박준영
20181113 박준영
 */

class Dog{
    String breed;
    int age;
    String color;

    public Dog(String breed, int age, String color){
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    void barking(){}
    void hungry(){}
    void sleeping(){}
}
public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("york", 1, "orange");
        System.out.println(dog1);
    }
}
