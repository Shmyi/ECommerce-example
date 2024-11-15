package Lab5;
/*
File name: [Product.java ]
Author: [ Yi Chen, 041138529]
Course: CST8284 – OOP
Assignment: [LabEx05]
Due Date: [11/06/2024]
Professor: [George Kriger]
Lab Section:332
Purpose: [ LabEx05 ]
*/

/**
 * The abstract class Product represents a general product with a name, price, and category.
 * It provides constructors, getter and setter methods, and abstract methods for specific product behavior.
 */

public abstract class Product {
	
	/** The name, price and category of the product */
	protected String name;
	protected double price;
	protected String category;
	
	// Constructor
	/**
     * Constructs a Product with the specified name, price, and category.
     *
     * @param name     the name of the product
     * @param price    the price of the product
     * @param category the category of the product
     */
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	// Getters and setters
	/**
    * Gets the name of the product.
    * 
    * @return the name of the product
    */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name of the product
	 * 
	 * @param name the name of the product
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Gets the price of the product
	 * 
	 * @return the price of the product
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Sets the price of the product
	 * 
	 * @param price the price of the product
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * Gets the category of the product
	 * 
	 * @return the category of the product
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * Sets the category of the product
	 * 
	 * @param category the category of the product
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	//Abstract method
	/**
	 * Abstract method for purchase product
	 * 
	 * @return a string message related to purchasing the product
	 */
	public abstract String purchaseProduct();
	
	//toString method
	/**
	 * Abstract method return string
	 * 
	 * @return a string containing the detail of the produc 
	 */
	@Override
	public abstract String toString();
	
}
