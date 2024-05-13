/*
간단한 영한 사전을 객체 배열을 이용하여 만들어보자. 클래스 World는 영어 단어를 나타내는 eng, 한국어 단어를 나타내는 kor을 필드로 가진다.
클래스 World의 객체 배열을 만들어서 여기에 몇 개의 단어쌍을 저장한다. 이 객체 배열을 이용하여 사용자가 입력하는 영어 단어가 배열 안에 있으면 대응되는
한국어 단어를 출력한다.

검색할 영어 단어를 입력하시오(종료는 quit): house
house -> 집
검색할 영어 단어를 입력하시오(종료는 quit): learning
사전에 없는 단어입니다.
검색할 영어 단어를 입력하시오(종료는 quit): quit
*/

import java.util.Scanner;

class World{
    String eng;
    String kor;
    World(String eng, String kor){
        this.eng = eng;
        this.kor = kor;
    }

    void print1() {
        System.out.println(eng + " -> " + kor);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        World[] worlds = new World[3];
        worlds[0] = new World("house", "집");
        worlds[1] = new World("test", "테스트 하다");
        worlds[2] = new World("class", "클래스");
        while(true){
            boolean equals = false;
            System.out.print("검색할 영어 단어를 입력하시오(종료는 quit):");
            s = scanner.nextLine();

            if(s.equals("quit"))
                break;

            for(World world : worlds){
                if(world.eng.equals(s)){
                    equals = true;
                    world.print1();
                }
            }
            if(!equals)
                System.out.println("사전에 없는 영어단어입니다.");
        }
    }
}
