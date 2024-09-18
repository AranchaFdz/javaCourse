import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

    //double x = 3.14;
    //double y = -10;

    //double z = Math.max(x, y);
    //double z = Math.sqrt(y);  // change -10 to 10
    //double z = Math.round(x);
    //double z = Math.ceil(x); // round up to 4.0
    //double z = Math.floor(x); // round down to 3.0

    //System.out.println(z);
    // find the hypotenuse of a triangle
    double x;
    double y;
    double z;
    Scanner scanner = new Scanner(System.in);
        
    System.out.println("Enter side x: ");
    x = scanner.nextDouble();
    System.out.println("Enter side y: ");
    y = scanner.nextDouble();
    
    z = Math.sqrt((x*x)+(y*y));
    
    System.out.println("The hypotenuse is: "+z);
    
    scanner.close();   
    }
}
