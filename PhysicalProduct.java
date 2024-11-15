package Lab5;
/*
File name: [PysicalProduct.java ]
Author: [ Yi Chen, 041138529]
Course: CST8284 – OOP
Assignment: [LabEx05]
Due Date: [11/06/2024]
Professor: [George Kriger]
Lab Section:332
Purpose: [ LabEx05 ]
*/

/**
 * The PhysicalProduct class represents a physical product with additional properties such as weight and shipping cost.
 * It extends the abstract Product class and provides implementation for the purchase and display of physical products.
 */
public class PhysicalProduct extends Product {
	
	/** The weight(KG) and shipping cost of the physical product */
	protected double weight;
	protected double shippingCost;
	
	// Constructor
    /**
     * Constructs a PhysicalProduct with the specified name, price, category, weight, and shipping cost.
     *
     * @param name         the name of the product
     * @param price        the price of the product
     * @param category     the category of the product
     * @param weight       the weight of the product
     * @param shippingCost the shipping cost of the product
     */
	public PhysicalProduct(String name, double price, String category, double weight, double shippingCost) {
		super(name, price, category);
		this.weight = weight;
		this.shippingCost = shippingCost;
	}
	
	// Getters and setters
	 /**
     * Gets the weight of the physical product.
     *
     * @return the weight of the product
     */
	public double getWeight() {
		return weight;
	}
	/**
     * Sets the weight of the physical product.
     *
     * @param weight the new weight of the product
     */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	 /**
     * Gets the shipping cost of the physical product.
     *
     * @return the shipping cost of the product
     */
	public double getshippingCost() {
		return shippingCost;
	}
	/**
     * Sets the shipping cost of the physical product.
     *
     * @param shippingCost the new shipping cost of the product
     */
	public void setshippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	
	// Override toString method
	 /**
     * Returns a string representation of the physical product details, including name, price, category, weight, and shipping cost.
     *
     * @return a string containing the details of the physical product
     */
	@Override
	public String toString() {
		return "Physical Product Details:\n" +
	               "Product Name: " + getName() + "\n" +
	               "Price: $" + getPrice() + "\n" +
	               "Category: " + getCategory() + "\n" +
	               "Weight: " + weight + " kg\n" +
	               "Shipping Cost: $" + shippingCost;
	}
	
	// Override purchase product method
	@Override
	 /**
     * Returns a message indicating that the physical product is being prepared for shipping.
     *
     * @return a string message related to the shipping status of the product
     */
	public String purchaseProduct() {
		return "Your Physical Product is going to be shipped soon."+"\n" ;
		
	}
	
}
