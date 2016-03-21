/**
 * 
 */

/**
 * <pre>
 * 		@author 	James O'Neill<br>
 *      Project 	JavaBeansJava
 * 		@version 	1.0<br>
 * 		Date 		11 Mar 2016<br>
 *		UpDated 	11 Mar 2016<br>
 * </pre>
 */
public class Products {
private int productID;
private String productName;
private String productDescription;
private int quantity;
private Boolean inStock;

	/**
	 * 
	 */
	public Products() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the inStock
	 */
	public Boolean getInStock() {
		return inStock;
	}

	/**
	 * @param inStock the inStock to set
	 */
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}

}
