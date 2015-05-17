package com.yt.atm ;

import java.util.Scanner;

public class ATM { //余额、存款、取款、登录、退出、修改密码
	private String userPass="123456";
	private String name="张三";
	private String userName="joan";
	private double totalMoney=1234.34;
	Scanner scan=new Scanner(System.in); 
	 
	//登录窗口
	public void initLoginWindow(){
		System.out.print("===========");
		System.out.println();
		System.out.print("欢迎进入登陆窗口");
		System.out.println();
		System.out.print("===============");
		System.out.println();
	}//登陆
	public void initLogin(){
		initLoginWindow();
		System.out.println("请输入用户名：");
		String scanf=scan.nextLine();
		if(scanf.equals(userName)){
			System.out.println("请输入密码");
			if(scan.next().equals(userPass)){
				System.out.println("用户"+this.name+"登陆成功！");
			}else{
				System.out.println("密码输入错误！");
				 System.exit(0);
			}
		}else{
			System.out.println("用户名输入错误！请重新输入");
			initLogin();
		}
		initAction();
	}//查询余额
	public void queryMoney(){
		System.out.println("当前余额是："+this.totalMoney);
	}
	//取款
	public  void devideMoney( ){
		System.out.println("当前余额是"+this.totalMoney+"请输入要取款数");
		  int money=scan.nextInt();
		this.totalMoney =this.totalMoney-money;
		System.out .print("存款成功！当前余额是"+this.totalMoney); 
	}
	//存款
	public void addMoney(){
		System.out.println("当前余额是"+this.totalMoney+"请输入要存款数");
		int money=scan.nextInt();
		this.totalMoney=this.totalMoney+money;
		System.out.println("存款成功！当前余额是"+this.totalMoney);
	}//修改密码
	public void changePass(){
		System.out.println("请输入旧密码");
		if(scan.next().equals(userPass)){
			System.out.println("密码正确！请输入新密码:");
			String newUserPass1=scan.nextLine();
			while(true){
				if(scan.nextLine()==" "){
					System.out.println();
					newUserPass1=scan.nextLine();	
				}else{
					 break;
				}
			} 
			System.out.println("请再次输入新密码:");
			String newUserPass2=scan.nextLine(); 
			while(true){
				if(scan.nextLine()==" "){
					   newUserPass2=scan.nextLine();	
				}else{
					 break;
				}
			} 
			System.out.println(newUserPass1+"====");//为什么是空 
			if(newUserPass1.equals(newUserPass2)){ 
				System.out.print("密码修改成功！");
				this.userPass=newUserPass1;
			}else{
				System.out.println("两次密码不一致，修改失败");
			}
		}else{
			System.out.println("密码输入失败！");
		}
		initAction();
	}
	//操作项窗口
	public void initActionWindow(){ 
		System.out.print("============");
		System.out.println();
		System.out.print("欢迎进入操作项界面");
		System.out.println();
		System.out.print("==============");
		System.out.println();
	}
	//操作项
	public void initAction(){
		initActionWindow();
		System.out.println("1、查询余额     2、取款     3、存款     4、修改密码     5、退出");
		System.out.println("请选择操作项：");
		String scanf=scan.next();
		if("1".equals(scanf)){
			queryMoney();
		}else if("2".equals(scanf)){
			devideMoney();
		}else if("3".equals(scanf)){
			addMoney();
		}else if("4".equals(scanf)){
			changePass();
		}else if("5".equals(scanf)){
			System.out.println("程序结束！");
			System.exit(0);
		}else{
			System.out.println("没有此功能!请重新选择");  
		}
		initAction();
	}
	public static void main(String[] args) {
		ATM atm=new ATM();
		
		atm.initLogin();
	}
}
