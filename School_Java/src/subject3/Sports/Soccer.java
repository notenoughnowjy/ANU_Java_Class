package subject3.Sports;
// 국립안동대학교 20181113 박준영
// Soccer 클래스
class Soccer extends Sports{

//    이름 반환 메서드
    @Override
    String getName() {
        return "축구";
    }

//    경기자수 반환 메서드
    @Override
    int getPlayers() {
        return 11;
    }
}
