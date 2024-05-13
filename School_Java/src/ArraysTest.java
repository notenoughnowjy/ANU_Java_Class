import java.util.ArrayList;

class Arrays1{
    int number;
    Arrays1(int number){
        this.number = number;
    }
    @Override
    public String toString(){
        return ""+number;
    }
}

public class ArraysTest {
    public static void main(String[] args) {
        ArrayList<Arrays1> arrays1ArrayList = new ArrayList<>();
        arrays1ArrayList.add(new Arrays1(1));
        arrays1ArrayList.add(new Arrays1(2));
        System.out.println(arrays1ArrayList);
    }
}
