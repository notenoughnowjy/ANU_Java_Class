import java.util.ArrayList;

class ObjArrayList{
    String name;
    int age;
    ObjArrayList(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "{" + name + ", " + age + "}";
    }
}

public class ObjArrayListTest {
    public static void main(String[] args) {
        ArrayList<ObjArrayList> objArrayListArrayList = new ArrayList<>();
        objArrayListArrayList.add(new ObjArrayList("김윤호", 60));
        objArrayListArrayList.add(new ObjArrayList("박준영", 26));

        for(ObjArrayList obj : objArrayListArrayList){
            System.out.println(obj);
        }
    }
}
