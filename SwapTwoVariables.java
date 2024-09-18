public class SwapTwoVariables {
    public static void main(String[] args) {
    // swap two variables
        String x = "agua";
        String y = "coca-cola";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
