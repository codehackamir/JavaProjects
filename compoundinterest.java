import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double principal;
        double rate;
        int timescompound;
        int years;
        double amounts;


        System.out.println("Enter Principal amount : ");
        principal = scan.nextDouble();
        System.out.println("Interest rate (in % ) : ");
        rate = scan.nextDouble()/100;
        System.out.println("Enter the # of times compounded per year : ");
        timescompound = scan.nextInt();
        System.out.println("Enter the # of years : ");
        years = scan.nextInt();

        amounts = principal*Math.pow(1+rate/timescompound, timescompound*years);

        //System.out.println("The amount after"+years+"years is $ : "+amounts);
        System.out.printf("The amount after %d years is $%.2f",years,amounts);

        scan.close();



    }
}
