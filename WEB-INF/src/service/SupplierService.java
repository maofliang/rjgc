package service;

import java.sql.SQLException;

import model.SupplierModel;

public class SupplierService {
	public boolean SLoginInfoCheck(String Suppliername,String SupplierPassword) throws SQLException {
		boolean i = false;
		SupplierModel supplier=new SupplierModel();
		//����SupplierDao�е�SLoginCheck��������֤supplier�����Ƿ���������̼�
		return i;
	}
	
	public SupplierModel getSupplierByName(String Suppliername) throws SQLException {
		SupplierModel supplier=new SupplierModel();
		//��Suppliername����supplier������
		//����SupplierDao��getSupplier(SupplierModel supplier)������ȡ�����̼Ҷ���
		return supplier;
	}
}
