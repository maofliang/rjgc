package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/sLoginController.do"})
public class SLoginController extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		String Suppliername=request.getParameter("Suppliername");
		String SupplierPassword=request.getParameter("SupplierPassword");
		//�ȵ���SLoginInfoCheck(String Suppliername,String SupplierPassword)��֤�û�������
		//��֤�����򷵻�supplierLogin.jsp
		//��֤ͨ����������/sIndexController.do
	}
}