package subject2;
/*
국립안동대학교 컴퓨터공학과 박준영
20181113 박준영
 */

class Account{
    int balance;
    // Account 메소드 정의
    Account(){
        System.out.println("새로운 계좌가 만들어졌습니다.");
    }
//    남은 계좌가 출금하려는 계좌보다 작을 경우
    int withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액이 부족합니다.");
            return -1;
        }
//        같거나 클 경우
        else {
            balance -= amount;
            return balance;
        }
    }
    
//    입금 메서드
    int deposit(int amount){
        System.out.println(amount + "원 저축");
        balance += amount;
        return balance;
    }

}
public class AccountTest {
    public static void main(String[] args) {
//        계좌 1 생성
        Account account1 = new Account();
        account1.deposit(50000);
//        계좌 2 생성
        Account account2 = new Account();
        account2.deposit(100000);

//        출력
        System.out.println("고객 #1 계좌 잔고=" + account1.balance);
        System.out.println("고객 #2 계좌 잔고=" + account2.balance);
    }
}
