package subject3;

class Bird extends Animal{
    @Override
    void walk() {
        super.walk();
    }

    void fly(){
        System.out.println("날 수 있음");
    }

    void sing(){
        System.out.println("소리 낼 수 있음");
    }
}
