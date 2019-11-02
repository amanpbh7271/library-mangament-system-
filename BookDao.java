import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDao {
public static int save(String callno,String name,String author,String publisher,int quantity){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,publisher,quantity) values(?,?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setString(4,publisher);
		ps.setInt(5,quantity);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}



public static int checkBook(int id){
	int st=0;
	boolean status=false;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from books where id=?");
		ps.setInt(1, id);
	    ResultSet rs=ps.executeQuery();
		status=rs.next();
		if(status==true)
			st=1;
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	return st;
}


public static int delete(int id){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from books where id=?");
		ps.setInt(1,id);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int update(int id,String callno,String name,String author ,String publisher,String quantity ){
	int status=0;
	try{
		Connection con=DB.getConnection();
		
		PreparedStatement ps=con.prepareStatement("update books set callno=?, name=?,author=?,publisher=?,quantity=? where id=?");
		ps.setString(1,callno);
		ps.setString(2, name);
		ps.setString(3, author);
		ps.setString(4, publisher);
		int quant=Integer.parseInt(quantity);
		ps.setInt(5, quant);
		ps.setInt(6,id);
		
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}




}


