public class Arrays {
    public static void main(String[] args) {

        // array = used to store multiple values within a single variable
		// Step 1
        //String car = "Opel";
        // Step 2
        //String[] cars = {"Opel", "BMW", "Telsa"}; // Each one has an element 0, 1, 2
        //cars[0] = "Mustang"; // modify the element in the position 0
        //System.out.println((cars[3]));

		String[] cars = new String[4];
		
		cars[0] = "Mustang";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
        cars[3] = "BMW";
			
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
    }
}
