import java.util.Random;;
public class random {
    public static void main(String[] args){

        Random rand = new Random();

       /*  int num;
        int num1;
        num = rand.nextInt(1,7);
        num1 = rand.nextInt(1,101);

        System.out.println(num);
        System.out.println(num1);*/

        boolean isheads;

        isheads = rand.nextBoolean();

        if(isheads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
        

    }
}
