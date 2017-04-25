package model;

public class ProductModel {
	private int id;
	private String name;
	private String origin;
	private String date;
	private String life;
	private String introduction;
	private float price;
	private int sid;
	private int stocknum;
	private int storedid;
	private String image;
	
	public void setid(int n){
		id=n;
	}
	public void setname(String s){
		name=s;
	}
	public void setorgin(String s){
		origin=s;
	}
	public void setdate(String s){
		date=s;
	}
	public void setlife(String s){
		life=s;
	}
	public void setintroduction(String s){
		introduction=s;
	}
	public void setimage(String s){
		image=s;
	}
	public void setprice(float n){
		price=n;
	}
	public void setsid(int n){
		sid=n;
	}
	public void setstocknum(int n){
		stocknum=n;
	}
	public void setstoredid(int n){
		storedid=n;
	}
	
	public int getid(){
		return id;
	}
	public String getname(){
		return name;
	}
	public String getorigin(){
		return origin;
	}
	public String getdate(){
		return date;
	}
	public String getlife(){
		return life;
	}
	public String getintroduction(){
		return introduction;
	}
	public String getimage(){
		return image;
	}
	public float getprice(){
		return price;
	}
	public int getsid(){
		return sid;
	}
	public int getstocknum(){
		return stocknum;
	}
	public int getstoredid(){
		return storedid;
	}

}
