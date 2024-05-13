class Pizza{
    int radius;
    Pizza(int r){
        radius = r;
    }
    Pizza whosLargest(Pizza p1, Pizza p2){
        if(p1.radius > p2.radius)
            return p1;
        else return p2;
    }
}

public class PizzaTest{
    public static void main(String[] args) {
        Pizza p1 = new Pizza(12);
        Pizza p2 = new Pizza(14);

        Pizza largest = p2.whosLargest(p1, p2);
        System.out.println(largest.radius + "피자가 더 큼");
    }
}