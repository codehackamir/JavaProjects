import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String adjective;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter Adjective1 : ");
        adjective = scan.nextLine();
        System.out.println("Enter noun1 : ");
        noun1 = scan.nextLine();
        System.out.println("Enter Adjective2 : ");
        adjective2 = scan.nextLine();
        System.out.println("Enter verb1 : ");
        verb1 = scan.nextLine();
        System.out.println("Enter Adjective3 : ");
        adjective3 = scan.nextLine();

        System.out.println("\nToday i went to a "+adjective+"zoo");
        System.out.println("In an inexhibit,I saw a "+noun1+".");
        System.out.println(noun1+"was"+adjective2+"and "+verb1+"!");
        System.out.println("I was"+adjective3+"!");

    }
    
}
