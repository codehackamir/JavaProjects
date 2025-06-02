import java.util.Scanner;

public class userinput {
 
    public static void main(String[] args) {
        
      /*   System.out.print("Enter your name : ");
        String name = scan.nextLine(); 
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        System.out.print("Enter your marks : ");
        double mark = scan.nextDouble();
        System.out.print("Are you a School Student (true/false): ");
        boolean a = scan.nextBoolean();
        System.out.println("Name : " + name);
        System.out.println("Age : "+age);
        System.out.println("Marks : " + mark);
        System.out.println("School Student : "+a);
        if(a){
            System.out.println("You are in a good school life");
        }
        else{
            System.out.println("You Enters into reality right now ");
        }
        scan.close();*/


        // AREA OF A RECTANGLE
        double width = 0;
        double height = 0;
        double area = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your width : ");
        width = scan.nextDouble(); 
        System.out.print("Enter your height : ");
        height = scan.nextDouble();
        area = width*height;
        System.out.println("The area of the rectangle is "+area +"cm");
        
        scan.close();
    }
 }