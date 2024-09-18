import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
    
    // while loop = executes a block of code as long as a it's condition remains true

    /* while(1==1) { 
        System.out.println("Help, I'm stuck in a while loop");
    } */

    Scanner scanner = new Scanner(System.in);
    String name = "";
    
    while(name.isBlank()) {
    System.out.print("Enter your name: ");
    name = scanner.nextLine();
    }
    
    System.out.println("Hello " + name);
    
    scanner.close();
    }
}
