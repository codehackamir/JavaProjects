import java.util.Scanner;

public class FInd {

    void evenorodd(int num)
    {
        if(num%2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd Number ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        FInd obj1 = new FInd();
        obj1.evenorodd(number);

    }
}



