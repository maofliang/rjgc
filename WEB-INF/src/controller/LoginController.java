package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserModel;
import dao.UserDao;

@WebServlet(urlPatterns = {"/loginController.do"})
public class LoginController extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		response.setContentType("text/html;charset=utf-8");
		String Buyername=request.getParameter("Buyername");
		String BuyerPassword=request.getParameter("BuyerPassword");
		//����������ı�ǣ�flag�����˵�¼����ת�Ľ���������
		String flag=request.getParameter("flag");
		//Productid����ת��Ʒ��Ϣ����ʱ����
		String Productid=request.getParameter("Productid");
		UserModel user = new UserModel();
		user.setName(Buyername);
		user.setPassword(BuyerPassword);
		UserDao userdao = new UserDao();
		boolean islogin = false;
		//����LoginCheck��������û�������
		try {
			islogin = userdao.LoginCheck(user);
			if (islogin) {
				user = userdao.getUserByUsername(user);
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				//��¼�ɹ�������flag��ת����Ӧ��ҳ���Servlet����ģ�黹��Ҫ�д��벹��
				response.sendRedirect("index.jsp");
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("eFlag", "error");
				//��¼ʧ�ܣ����ص�¼����
				response.sendRedirect("login.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}