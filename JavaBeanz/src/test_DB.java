import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 */

/**
 * <pre>
 * 		&#64;author 	James O'Neill<br>
 *      Project 	JavaBeansJava * 		@version 	1.0<br>
 * 		Date 		25 Feb 2016<br>
 *		UpDated 	25 Feb 2016<br>
 * </pre>
 */
public class test_DB {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
	}// end main

	public static Connection getConnection() throws Exception {

		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/itb";
			String dbUserName = "JavaBeanz";
			String dbPassWord = "BGBXxFR7dv65SNyv";
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url, dbUserName, dbPassWord);
			System.out.println("connected to db sucessful");
			return conn;
		} // end try
		catch (Exception e) {
			System.out.println(e);
		}

		return null;

	}

}// end class
