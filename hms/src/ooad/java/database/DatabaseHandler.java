package ooad.java.database;
import static ooad.java.database.DatabaseParameter.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class DatabaseHandler {
	
	public static void main(String args[]) {
		try {
			Class.forName(ClassForname);
			try {
				Connection c = DriverManager.getConnection(DBConnString,DBConnUser,DBConnPassword);
				
				//System.out.println(AuthenticateUser("20180283","1122334455",c));
				
				c.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*public static boolean AddStudent(Connection c) {
		Connection c = DriverManager.getConnection(DBConnString,DBConnUser,DBConnPassword);
		return false;
	}*/
	
	public static boolean AuthenticateUser(String Username, String Password) throws ClassNotFoundException {
		Class.forName(ClassForname);
		String statement = "select student_name from student where student_id=? and student_password=?";
		try {
			Connection c = DriverManager.getConnection(DBConnString,DBConnUser,DBConnPassword);
			PreparedStatement ps = c.prepareStatement(statement);
			ps.setString(1, Username);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				c.close();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
