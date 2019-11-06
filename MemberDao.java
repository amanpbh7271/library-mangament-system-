import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
private	int id;
private	String name;
private String contact_no;
private String address;
private  String type;
	
		public static int save(String name,String contact_no,String address,String type){
			int status=0;
			try{
				Connection con=DB.getConnection();
				PreparedStatement ps=con.prepareStatement("insert into member(name,contact,address,type) values(?,?,?,?)");
				ps.setString(1,name);
				ps.setString(2,contact_no);
				ps.setString(3,address);
				ps.setString(4,type);
				
				status=ps.executeUpdate();
				con.close();
			}catch(Exception e){System.out.println(e);}
			return status;
		}
		
		public static boolean checkMember(int id){
			boolean status=false;
			try{
				Connection con=DB.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from member where id=?");
				ps.setInt(1, id);
			    ResultSet rs=ps.executeQuery();
				status=rs.next();
				con.close();
			}catch(Exception e){System.out.println(e);}
			return status;
		}

		
		public static int delete(int id){
			int status=0;
			try{
				Connection con=DB.getConnection();
				PreparedStatement ps=con.prepareStatement("delete from member where id=?");
				ps.setInt(1,id);
				status=ps.executeUpdate();
				con.close();
			}catch(Exception e){System.out.println(e);}
			return status;
		}
		public static int update(int id,String name,String contact,String address ,String type){
			int status=0;
			try{
				Connection con=DB.getConnection();
				
				PreparedStatement ps=con.prepareStatement("update member set name=?,contact=?,address=?,type=? where id=?");
				
				ps.setString(1, name);
				ps.setString(2, contact);
				ps.setString(3, address);
				ps.setString(4, type);
				ps.setInt(5,id);
				
				status=ps.executeUpdate();
				con.close();
			}catch(Exception e){System.out.println(e);}
			return status;
		}


}
class student extends MemberDao{
	public static int save(String name,String contact_no,String address,String type){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into member(name,contact,address,type) values(?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,contact_no);
			ps.setString(3,address);
			ps.setString(4,type);
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}	
	public static boolean checkMember(int id){
		boolean status=false;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from member where id=?");
			ps.setInt(1, id);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	
	public static int delete(int id){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from member where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(int id,String name,String contact,String address ,String type){
		int status=0;
		try{
			Connection con=DB.getConnection();
			
			PreparedStatement ps=con.prepareStatement("update member set name=?,contact=?,address=?,type=? where id=?");
			
			ps.setString(1, name);
			ps.setString(2, contact);
			ps.setString(3, address);
			ps.setString(4, type);
			ps.setInt(5,id);
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}




}
class teacher extends  MemberDao{
	
}

