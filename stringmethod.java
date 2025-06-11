public class stringmethod {
    public static void main(String[] args) {
        String Name = "Amirtheesh";
        int length = Name.length();
        char letter = Name.charAt(0);
        int index = Name.indexOf("m");
        int lastindex = Name.lastIndexOf("e");
        //Name = Name.toUpperCase();
        Name = Name.toLowerCase();
        //Name = Name.replace("i","o");

        System.out.println(Name.isEmpty());

    }
    
}
