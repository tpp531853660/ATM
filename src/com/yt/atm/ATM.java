package com.yt.atm ;

import java.util.Scanner;

public class ATM { //����ȡ���¼���˳����޸�����
	private String userPass="123456";
	private String name="����";
	private String userName="joan";
	private double totalMoney=1234.34;
	Scanner scan=new Scanner(System.in); 
	 
	//��¼����
	public void initLoginWindow(){
		System.out.print("===========");
		System.out.println();
		System.out.print("��ӭ�����½����");
		System.out.println();
		System.out.print("===============");
		System.out.println();
	}//��½
	public void initLogin(){
		initLoginWindow();
		System.out.println("�������û�����");
		String scanf=scan.nextLine();
		if(scanf.equals(userName)){
			System.out.println("����������");
			if(scan.next().equals(userPass)){
				System.out.println("�û�"+this.name+"��½�ɹ���");
			}else{
				System.out.println("�����������");
				 System.exit(0);
			}
		}else{
			System.out.println("�û��������������������");
			initLogin();
		}
		initAction();
	}//��ѯ���
	public void queryMoney(){
		System.out.println("��ǰ����ǣ�"+this.totalMoney);
	}
	//ȡ��
	public  void devideMoney( ){
		System.out.println("��ǰ�����"+this.totalMoney+"������Ҫȡ����");
		  int money=scan.nextInt();
		this.totalMoney =this.totalMoney-money;
		System.out .print("���ɹ�����ǰ�����"+this.totalMoney); 
	}
	//���
	public void addMoney(){
		System.out.println("��ǰ�����"+this.totalMoney+"������Ҫ�����");
		int money=scan.nextInt();
		this.totalMoney=this.totalMoney+money;
		System.out.println("���ɹ�����ǰ�����"+this.totalMoney);
	}//�޸�����
	public void changePass(){
		System.out.println("�����������");
		if(scan.next().equals(userPass)){
			System.out.println("������ȷ��������������:");
			String newUserPass1=scan.nextLine();
			while(true){
				if(scan.nextLine()==" "){
					System.out.println();
					newUserPass1=scan.nextLine();	
				}else{
					 break;
				}
			} 
			System.out.println("���ٴ�����������:");
			String newUserPass2=scan.nextLine(); 
			while(true){
				if(scan.nextLine()==" "){
					   newUserPass2=scan.nextLine();	
				}else{
					 break;
				}
			} 
			System.out.println(newUserPass1+"====");//Ϊʲô�ǿ� 
			if(newUserPass1.equals(newUserPass2)){ 
				System.out.print("�����޸ĳɹ���");
				this.userPass=newUserPass1;
			}else{
				System.out.println("�������벻һ�£��޸�ʧ��");
			}
		}else{
			System.out.println("��������ʧ�ܣ�");
		}
		initAction();
	}
	//�������
	public void initActionWindow(){ 
		System.out.print("============");
		System.out.println();
		System.out.print("��ӭ������������");
		System.out.println();
		System.out.print("==============");
		System.out.println();
	}
	//������
	public void initAction(){
		initActionWindow();
		System.out.println("1����ѯ���     2��ȡ��     3�����     4���޸�����     5���˳�");
		System.out.println("��ѡ������");
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
			System.out.println("���������");
			System.exit(0);
		}else{
			System.out.println("û�д˹���!������ѡ��");  
		}
		initAction();
	}
	public static void main(String[] args) {
		ATM atm=new ATM();
		
		atm.initLogin();
	}
}
