import java.util.Scanner;

public class School {
    
    int result (int a , int b , int c){
        System.out.println(a+b+c);
        int result = a+b+c;
        return result;

    }

    int result(int a , int b){
        System.out.println(a+b);
       int  result = a+b;
        return result;
    }
}

class amirtheesh{

    public static void main(String[] args) {
        School obj1 = new School();
        int res = obj1.result(4, 2, 1);
        System.out.println(res);
    }
}