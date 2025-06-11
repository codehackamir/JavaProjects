public class substring {
    public static void main(String[] args) {
        String email = "Amirtheesh0@gmail.com";
        String username = email.substring(0,email.indexOf("@") - 1);
        String domain = email.substring(email.indexOf("@"));
        System.out.println(username);

    }
}