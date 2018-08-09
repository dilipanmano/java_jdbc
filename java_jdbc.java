package sample;
import java.sql.*; 
public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/dilip","root","");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from kumar");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" ");  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
		}  
	