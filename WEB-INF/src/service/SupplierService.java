package service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.*;
import dao.*;
public class SupplierService {
	public int SupplierRegister(SupplierModel sModel){
		java.sql.Connection conn =null;
		String sName=sModel.getname();
		String password=sModel.getpassword();
		ProductDao pDao=new ProductDao();
		conn=pDao.getConnect();
		String sql="select Supplierid from supplier where Suppliername=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,sName);
			ResultSet rst=ps.executeQuery();
			//判断各种情况
			if(rst.next()){
				return -1;
			}else{
				sql="insert into supplier(Suppliername,Supplierpassword)values(?,?)";
				ps=conn.prepareStatement(sql);
				ps.setString(1, sName);
				ps.setString(2, password);
				ps.executeUpdate();
				sql="select Supplierid from supplier where Suppliername=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, sName);
				rst=ps.executeQuery();
				if(rst.next()){
					int sid=rst.getInt("Supplierid");
					return sid;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -2;
	}
	
	
}
