package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/addSCartController.do"})
public class AddSCartController extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		//����ProductModel�����flag
		//�ж��Ƿ��¼������¼�ˣ����ProductModel����productInfo.jspҳ��
		//������ת��login.jsp�����ϲ���flag��Productid
		//
	}
}