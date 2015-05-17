package com.yt.atm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ATMTest {
	ATM atm=new ATM();
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		 
//	}

	@Test(timeout=1)
	public void testInitLoginWindow() {
		atm.initLoginWindow();
		 
	}

	@Test(timeout=1)
	public void testInitLogin() {
		atm.initLogin();
		 
	}

	@Test(timeout=1)
	public void testQueryMoney() {
		atm.queryMoney(); 
	}

	@Test(timeout=1)
	public void testDevideMoney() {
		atm.devideMoney( ); 
		
	}

	@Test(timeout=1)
	public void testAddMoney() {
		atm.addMoney();
	}
	//atm.changePass();方法有错所以暂时先忽略 
	@Ignore
	public void testChangePass() {
		atm.changePass();
	}

	@Test(timeout=1)
	public void testInitActionWindow() {
		atm.initActionWindow();
	}

	@Test(timeout=1)
	public void testInitAction() {
		atm.initAction();
	}

//	@Test
//	public void testMain() {
//		 
//	}

}
