package dao;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.UserModel;

public class UserDao {
	String sql = "";
	
	/*�û���¼�û��������ж�*/
	public boolean LoginCheck(UserModel loginuser) throws SQLException {
		boolean i = false;
		try {
			sql = "select * from buyer where Buyername='"+loginuser.getName()+"' and BuyerPassword='"+loginuser.getPassword()+"'";
			Context ctx=new InitialContext();//�������ݿ�ķ��������ݿ����ӳأ������ļ���tomcat\conf\Catalina\localhost\rjgc��xml
			DataSource ds=(DataSource)ctx.lookup("java:/comp/env/jdbc/rjgc");
			Connection conn=ds.getConnection();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			if (rs.next()) {
				i = true;
			} else {
				i = false;
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	/*��ȡ�����û�����*/
	public UserModel getUserByUsername(UserModel loginuser) throws SQLException {
		try {
			sql = "select * from buyer where Buyername='"+loginuser.getName()+"'";
			Context ctx=new InitialContext();//�������ݿ�ķ��������ݿ����ӳأ������ļ���tomcat\conf\Catalina\localhost\rjgc��xml
			DataSource ds=(DataSource)ctx.lookup("java:/comp/env/jdbc/rjgc");
			Connection conn=ds.getConnection();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			if (rs.next()) {
				UserModel user = new UserModel();
				user.setId(rs.getInt("Buyerid"));
				user.setName(rs.getString("Buyername"));
				user.setTel(rs.getString("Buyertel"));
				user.setAddress(rs.getString("Buyeraddress"));
				user.setRealName(rs.getString("Realname"));
				user.setRegion(rs.getString("Buyerregion"));
				rs.close();
				stmt.close();
				conn.close();
				return user;
			} else {
				rs.close();
				stmt.close();
				conn.close();
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}