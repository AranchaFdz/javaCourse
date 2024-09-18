public class IfStatment{
    public static void main(String[] args) {
        
        // if statment = performs a block of code if it's condition evaluates to be true

        int age = 18;

        if(age>=75) {// The condition that we are testing goes inside the brackets
            System.out.println("Ok Boomer!");
        }
        else if(age>=18) {
            System.out.println("You are an adult");
        }
        else if(age>=13) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are not an adult!");
        }
    }
}