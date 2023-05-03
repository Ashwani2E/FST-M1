package examples;

public class Hello {
    public static void main(String[] args) {
        String str = "Hello,World";
        System.out.println(str);

        int x = 33;
        if(x < 20) {
            System.out.println("failed");
        }else if(x <= 33){
            System.out.println("Almost failed");
        }else {
            System.out.println("passed");
        }
    }
}
