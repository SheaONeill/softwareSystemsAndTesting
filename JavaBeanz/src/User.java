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
public abstract class User {

	private String userID;
	private String password;
	private String loginStatus;
	
		/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the loginStatus
	 */
	public String getLoginStatus() {
		return loginStatus;
	}
	/**
	 * @param loginStatus the loginStatus to set
	 */
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public void verify() {
		
		
	}//end method verify
	
}// end class
