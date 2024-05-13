class Objarray{
    int number;
    Objarray(int number){
        this.number = number;
    }
    double returnObj(){
        return (double) number * number;
    }
}

public class ObjarrayTest{
    public static void main(String[] args) {
        Objarray[] objarrays = new Objarray[5];

        for(int i=0; i< objarrays.length; i++) {
            objarrays[i] = new Objarray(i);
        }

        for(int i=0; i< objarrays.length; i++){
            System.out.println(objarrays[i].returnObj());
        }
    }
}