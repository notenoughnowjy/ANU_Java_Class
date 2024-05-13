import java.util.Scanner;

class ArrayList1{
    String title;
    String director;
    static int count = 0;
    ArrayList1(String title, String director){
        this.title = title;
        this.director = director;
        count++;
    }
}

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList1[] arrayList1 = new ArrayList1[3];
        for(int i=0; i< arrayList1.length; i++) {
            System.out.print("영화 제목 입력: ");
            String title = scanner.nextLine();
            System.out.print("영화 감독 입력: ");
            String director = scanner.nextLine();
            arrayList1[i] = new ArrayList1(title, director);
        }
        for (int i = 0; i < ArrayList1.count; i++) {
            System.out.println("영화 제목: " + arrayList1[i].title + " 영화 감독: " + arrayList1[i].director);
        }
    }
}
