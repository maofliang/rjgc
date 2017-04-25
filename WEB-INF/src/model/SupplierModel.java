package model;

public class SupplierModel {
	private int id=-1;
	private String name=null;
	private String telephone=null;
	private String address=null;
	private String introduction=null;
	private String password=null;
	
	public void setid(int n){
		id=n;
	}
	public void setname(String s){
		name=s;
	}
	public void settelephone(String s){
		telephone=s;
	}
	public void setaddress(String s){
		address=s;
	}
	public void setintroduction(String s){
		introduction=s;
	}
	public void setpassword(String s){
		password=s;
	}
	
	public int getid(){
		return id;
	}
	public String getname(){
		return name;
	}
	public String gettelephone(){
		return telephone;
	}
	public String getaddress(){
		return address;
	}
	public String getintroduction(){
		return introduction;
	}
	public String getpassword(){
		return password;
	}
	

}
