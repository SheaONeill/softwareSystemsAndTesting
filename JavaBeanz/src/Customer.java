/**
 * 
 */

/**
 * <pre>
 * 		&#64;author 	James O'Neill<br>
 *      Project 	JavaBeansJava
 * 		&#64;version 	1.0<br>
 * 		Date 		11 Mar 2016<br>
 *		UpDated 	11 Mar 2016<br>
 * </pre>
 */
public class Customer extends User {

	private String customerName;
	private String address;
	private String email;
	private String creditcard;
	private String shippingAddress;

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the creditcard
	 */
	public String getCreditcard() {
		return creditcard;
	}

	/**
	 * @param creditcard
	 *            the creditcard to set
	 */
	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}

	/**
	 * @return the shippingAddress
	 */
	public String getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param shippingAddress
	 *            the shippingAddress to set
	 */
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public void register() {
	}// end register method

	public void login() {
	}// end login method

	public void update() {
	}// end update method
}// end class
