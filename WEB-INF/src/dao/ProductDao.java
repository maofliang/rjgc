package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ProductModel;

public class ProductDao {
	/*��ȡ������Ʒ����*/
	public ProductModel getProductByProductid(ProductModel product) throws SQLException {
		//����product�е�Productid��ѯ���ݿ⣬��ȡ�����Ĳ�Ʒ����д�ص�product��
		return product;
	}
	
	public List<ProductModel> getProductBySupplierid(int Supplierid){
		List<ProductModel> productList =new ArrayList<ProductModel>();
		//����getProductByProductid(ProductModel product)������ȡ������Ʒ��Ϣ
		return productList;
	}
	
	public boolean addProductToProduct(ProductModel product){
		boolean i=false;
		//��product�е����ݼ���Product����
		return i;
	}
}
