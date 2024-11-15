package Lab5;
/*
File name: [DigitalProduct.java ]
Author: [ Yi Chen, 041138529]
Course: CST8284 – OOP
Assignment: [LabEx05]
Due Date: [11/06/2024]
Professor: [George Kriger]
Lab Section:332
Purpose: [ DigitalProduct ]
*/

/**
 * The DigitalProduct class represents a digital product with additional properties such as file size and download link.
 * It extends the abstract Product class and provides implementation for the purchase and display of digital products.
 */
public class DigitalProduct extends Product {

    /** The file size(MB) and download link of the digital product */
	protected double fileSize;
	protected String downloadLink;
	
	//constructor
	
	/**
     * Constructs a DigitalProduct with the specified name, price, category, file size, and download link.
     *
     * @param name         the name of the product
     * @param price        the price of the product
     * @param category     the category of the product
     * @param fileSize     the file size of the product in MB
     * @param downloadLink the download link for the product
     */
	public DigitalProduct(String name, double price, String category, double fileSize, String downloadLink) {
		super(name, price, category);
		this.fileSize = fileSize;
		this.downloadLink = downloadLink;
	}
	
	// Getters and setters
	/**
     * Gets the file size of the digital product.
     *
     * @return the file size of the product in MB
     */
	public double getFileSize() {
		return fileSize;
	}
	/**
     * Sets the file size of the digital product.
     *
     * @param fileSize the new file size of the product in MB
     */
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	/**
     * Gets the download link for the digital product.
     *
     * @return the download link of the product
     */
	public String getDownloadLink() {
		return downloadLink;
	}
	/**
     * Sets the download link for the digital product.
     *
     * @param downloadLink the new download link of the product
     */
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	
	//Override toSting method
	@Override
	/**
     * Returns a string representation of the digital product details, including name, price, category, file size, and download link.
     *
     * @return a string containing the details of the digital product
     */
	public String toString() {
		return "Physical Product Details:\n" +
	               "Product Name: " + getName() + "\n" +
	               "Price: $" + getPrice() + "\n" +
	               "Category: " + getCategory() + "\n" +
	               "File Size: " + fileSize + " M.B\n" +
	               "Download Link: " + downloadLink;
	}
	/**
     * Returns a message indicating that the digital product is ready for download.
     *
     * @return a string message related to the download status of the product
     */
	//Override Purchase product method
	@Override 
	public String purchaseProduct() {
		return "Your Digital Product is ready for download." ;
	}
	
	
}
