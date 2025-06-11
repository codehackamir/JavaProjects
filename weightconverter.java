import java.util.Scanner;

public class weightconverter {

    public static void main(String[] args) {
        
        // WEIGHT CONVERSION PROGRAM 
        // DECLARE VARIABLES 
        // WELCOME MESSAGE
        // PROMPT FOR USER CHOICE
        // OPTION 1 CONVERT LBS TO KGS
        // OPTION 2 CONVERT KGS TO LBS 
        Scanner scan = new Scanner(System.in);

        double weight;
        double newweight;
        int choice;

        System.out.println("Weight conversion Program !!");
        System.out.println("1. Convert LBS to KGS");
        System.out.println("2. Convert KGS to LBS");

        System.out.print("Choose an option: ");
        choice = scan.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs : ");
            weight = scan.nextDouble();
            newweight= weight * 0.453592;
            System.out.println("The new weight in kgs is : " +newweight);

        }

        else if(choice ==2){
            System.out.println("Enter the weight in kgs : ");
            weight = scan.nextDouble();
            newweight = weight * 2.20462;
            System.out.println("The new weight in lbs : "+ newweight);
        }

        else{
            System.out.println("That was not a valid choice ");
        }
        scan.close();
    }
    
}
