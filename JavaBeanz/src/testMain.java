import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.mysql.jdbc.PreparedStatement;

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
public class testMain extends JFrame {
	static String selectTest = "SELECT empno,ename,job FROM emp";

	/**
	 * 
	 */
	public testMain() {
		// TODO Auto-generated constructor stub
		
		
	}

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer newCustTest = new Customer();
		newCustTest.setCustomerName("Mary");
		System.out.println("Name Test : " + newCustTest.getCustomerName());
		
		try {
			test_DB.getConnection();
			getStuff();
			
			
		} //end try
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end catch
				
	}//end main
	
	public static ArrayList getStuff() throws Exception{
		java.sql.PreparedStatement statement = test_DB.getConnection().prepareStatement(selectTest);
				ResultSet result = statement.executeQuery();
		ArrayList<String> array = new ArrayList<String>();
		while(result.next()) {
			System.out.println(result.getString("empno"));
			System.out.println("\n");
			System.out.println(result.getString("ename"));
			System.out.println("\n");
			System.out.println(result.getString("job"));
			
			array.add(result.getString("ename"));
			
		}//end while
		
		return array;
		
		}//end arraylist
*/
}//end class
