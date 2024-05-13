package subject3.Animal;
// 국립안동대학교 20181113 박준영
// Bird 클래스
class Bird extends Animal{ // Animal 상속
//    Animal 클래스의 walk 상속
    @Override
    void walk() {
        super.walk();
    }

//    날 수 있다
    void fly(){
        System.out.println("날 수 있음");
    }

//    소리낼 수 있다.
    void sing(){
        System.out.println("소리 낼 수 있음");
    }
}
