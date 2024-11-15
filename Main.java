package Lab5;
/*
File name: [Main.java ]
Author: [ Yi Chen, 041138529]
Course: CST8284 – OOP
Assignment: [LabEx05]
Due Date: [11/06/2024]
Professor: [George Kriger]
Lab Section:332
Purpose: [ LabEx05 ]
*/

/**
 * The Main class demonstrates polymorphism by creating instances of PhysicalProduct and DigitalProduct.
 * It calls the overridden toString and purchaseProduct methods on each object to display product details and purchase information.
 */
public class Main {
	/**
     * The main method is the entry point of the program. It creates instances of PhysicalProduct and DigitalProduct,
     * and demonstrates the use of polymorphism by calling their respective methods.
     *
     * @param args command-line arguments (not used)
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiate objects
		PhysicalProduct lt = new PhysicalProduct("Laptop", 1399.99, "Electronics", 2.0, 10.0);
		DigitalProduct eb = new DigitalProduct("E-book", 5.99, "Books", 2.5, "www.bestEbook.com");
		
		//call toString and purchase product methods to send output
		System.out.println(lt.toString());
		System.out.println(lt.purchaseProduct());
		System.out.println(eb.toString());
		System.out.println(eb.purchaseProduct());
	}

}
