package subject3.StringTokenizer;
// 국립안동대학교 20181113 박준영
// StringTokenizer 클래스
import java.io.*;
import java.util.StringTokenizer;

public class StringTest{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // bufferedReader 객체 색성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // bufferedWriter 객체 생성
        String s = bf.readLine(); // 문자열 읽기
        StringTokenizer st = new StringTokenizer(s); // StringTokenizer 객체를 생성하고 문자열을 넣기
        String[] strarray = s.split(" "); // 배열에 공백을 기준으로 나눠서 넣기
        for(int i=0; i< strarray.length; i++){ // 문자열 배열 출력
            bw.write(strarray[i] + ",");
        }

        bw.write("\n모두 " + strarray.length + "개의 단어가 있습니다. ");
        bw.flush();
        bw.close();

    }
}
