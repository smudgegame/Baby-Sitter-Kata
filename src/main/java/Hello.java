import java.util.Scanner;

public class Hello {

    public static void main(String[] args){ //method
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
// hello world
    //public String = new String("Hello"); //property
}
