package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductModel;

@WebServlet(urlPatterns = {"/confirmOrderController.do"})
public class ConfirmOrderController extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		//ȷ��֧��������
		//��ȡ�û���Ϣ
		//����ProductInfoService��saveHistory(List<ProductModel> list)����������Ʒ������ʷ��¼��
		//�������͵�confirmOrder.jsp��ʾ
	}
}