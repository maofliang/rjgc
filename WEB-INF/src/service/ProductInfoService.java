package service;

import java.util.ArrayList;
import java.util.List;

import model.HistoryModel;
import model.ProductModel;

public class ProductInfoService {
	public ProductModel getProduct(int Productid){
		ProductModel product = new ProductModel();
		//��Productidд��product�У�������getProductByProductid(ProductModel product)������ȡ������Ʒ��Ϣ
		return product;
	}
	
	public boolean AddProductToSCart(ProductModel product){
		boolean i=false;
		//��product�������session���ɹ�����i=true������i=false
		return i;
	}
	
	public List<ProductModel> getProductList(){
		List<ProductModel> list = new ArrayList<ProductModel>();
		//�÷�����ʱ�ò���������д
		return list;
	}
	
	public boolean saveHistory(List<ProductModel> list){
		boolean i=false;
		//��ȡ�û���Ϣ
		//����list�����ɹ������ʷ��¼��������HistoryModel������
		//����HistoryDao���saveToPurchaseHistory(HistoryModel history)��������������ʷд�����ݿ�
		return i;
	}
	
	public boolean saveProduct(ProductModel product){
		boolean i=false;
		//����֤�û��������Ƿ�Ϸ������Ϸ�����i=false��������i��
		//����û�����Ϸ�����product����������ݿ⣬ProductDao��addProductToProduct(ProductModel product)����
		return i;
	}
}
