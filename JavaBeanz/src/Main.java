import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
public class Main extends JFrame {
	
	public Main() {
		// TODO Auto-generated constructor stub
		super("Test");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		setSize(500,500);
		setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Main main = new Main();
				
	}//end main
	
	

}//end class
