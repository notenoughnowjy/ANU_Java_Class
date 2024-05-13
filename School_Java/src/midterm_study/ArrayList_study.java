package midterm_study;

import java.util.ArrayList;

public class ArrayList_study {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("철수");
        list.add("영희");
        System.out.println(list);
        System.out.println(list.get(1));

        for(String obj : list)
            System.out.print(obj + " ");
    }
}
