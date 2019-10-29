import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDao {


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

	}


