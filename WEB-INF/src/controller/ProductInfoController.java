package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/productInfoController.do"})
public class ProductInfoController extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		//��Ʒ��Ϣ������������Productid����ProductInfoService���getProduct(int Productid)������ȡ��Ʒ��Ϣ
		//���ProductModel���󣬴��ݲ�������ת��productInfo.jsp��ʾ��Ʒ��Ϣ
	}
}