import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String name;
        int age ;
        System.out.print("Enter your Name : ");
        name = scan.nextLine();
        if(name.isEmpty()){
            System.out.println("You didn't enter your name !!!!");
            
        }
        System.out.print("Enter your age : ");
        age = scan.nextInt();
        if(age >=65){
            System.err.println("You are an senior ");
        }
        else if(age >=18){
            System.err.println("You are an adult ");
        }
        
        else if(age <0){
            System.out.println("You are not born ");
        }
        else if(age ==0){
            System.out.println("You are a just born");
        }
        else{
            System.out.println("You are a child ");
        }



    }
}
