package module3;

public class exception2 {
    public static void main(String[] args) {
        //nested try catch

        try{
            System.out.println("hello");
            try{
                System.out.println("hello guys");
                int a[]={1,2,3};
//                System.out.println(a[100]);
                System.out.println("try2 excecuted");
                try{
                    System.out.println("hello guys whatsupp");
                    int c = 10/0;
                    System.out.println("exception endeed");
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
