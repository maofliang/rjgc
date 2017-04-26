package service;
import model.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dao.*;

public class ProductInfoService {
	public int addProductToProduct(ProductModel pModel){
		java.sql.Connection conn =null;
		ProductDao pDao=new ProductDao();
		conn=pDao.getConnect();
		String productName=pModel.getname();
		String origin=pModel.getorigin();
		String pdate=pModel.getdate();
		String life=pModel.getlife();
		float price=pModel.getprice();
		String introduction=pModel.getintroduction();
		int storedid=pModel.getstoredid();
		int stockNum=pModel.getstocknum();
		int sid=pModel.getsid();
		String image=pModel.getimage();
		String sql="insert into product(Productname,Productorigin,Productdate,Productlife,Productintrodution,Productprice,Supplierid,Stocknum,Storedid,imagepath)"
				+ "values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,productName);
			ps.setString(2, origin);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date=sdf.parse(pdate);
			java.util.Date lifedate=sdf.parse(life);
			Timestamp tdate=new Timestamp(date.getTime());
			Timestamp tlife=new Timestamp(lifedate.getTime());
			ps.setTimestamp(3, tdate);
			ps.setTimestamp(4, tlife);
			ps.setString(5, introduction);
			ps.setFloat(6, price);
			ps.setInt(7, sid);
			ps.setInt(8, stockNum);
			ps.setString(9,storedid+"");
			ps.setString(10, image);
			ps.execute();
			return 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}
