// 레그드 배열 테스트

package midterm_study;

import java.util.Scanner;

public class Legged_array {
    private static final int max_arr = 10;
    private static int[][] arr = new int[max_arr][max_arr];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = new int[i+1];
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i].length);
        }
    }
}
