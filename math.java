import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        //double result;
       // result = Math.pow(2,5);
        //result = Math.abs(-5);
        //result = Math.sqrt(9);
        //result = Math.round(3.14);
        //result = Math.ceil(3.14);
        //result = Math.floor(3.99);
        //result = Math.max(10,20);
        //result = Math.min(10, 20);

        //System.out.println(result);


        Scanner scan = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A : ");
        a = scan.nextDouble();
        System.out.println("Enter the length of side B : ");
        b = scan.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) );

        System.out.println("The lenght of side C is "+c+"cm.");
        scan.close();

    }
    
}
