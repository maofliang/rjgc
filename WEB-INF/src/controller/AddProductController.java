package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductModel;

@WebServlet(urlPatterns = {"/addProductController.do"})
public class AddProductController extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		//�������еģ��û�����ģ���Ʒ��Ϣ�����浽ProductModel product������
		//����ProductInfoService��saveProduct(ProductModel product)���������Ʒ
		//�����Ӵ��󣬼�����ֵΪfalse������ת��supplierAddProduct.jsp���棬��ʾ�û������޸�
		//
	}
}