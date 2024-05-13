package subject3.Sports;
// 국립안동대학교 20181113 박준영
// SoccerTest 클래스
public class SoccerTest {
    public static void main(String[] args) {
        Soccer soccer = new Soccer(); // Soccer 객체 생성
        System.out.println("경기이름: " + soccer.getName());
        System.out.println("경기자수: " + soccer.getPlayers());
    }
}
