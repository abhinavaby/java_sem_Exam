package module_1;



public class ladder {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin123";
        if((username == "admin") &&  (password == "admin123"))
        {
            System.out.println("You are logged in");
        }
        else if ((username == "admin") &&  (password != "admin123")){
            System.out.println("wrong password");
        }
        else if ((username != "admin") &&  (password == "admin123")){
            System.out.println("wrond username");

        }
        else{
            System.out.println("cannot login");
        }



    }
}
