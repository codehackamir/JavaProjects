public class nestedif {
    public static void main(String[] args) {
        

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;


        if(isStudent){
            if(isSenior){
                System.out.println("You get a student discount of 10% !!!!");
                System.out.println("You get a Senior discount of 20% !!!!");

                price *= 0.7;
                System.out.printf("You get a discount and the price is : ",price);

            }
            else{

                System.out.println("You get a student discount of 10% !!!!");
                price *= 0.9;
                System.out.printf("You get a discount and the price is : ",price);
            }

        }
        else{
            System.out.printf("You didn't get a discount and the price is : ",price);
        }
    }
}
