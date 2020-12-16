package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import dto.AccountDTO;
import util.DBcon;
import util.DBinput;

public class BankMenu {
	private long tempID=1;
	String loginName;
	long loginID;
	int loginBal;
	boolean isLogin=false;
	boolean isExit=false;
	AccountDAO acc=new AccountDAO();
	
	public void login() {
		System.out.print("이름 :");
		String inputName=DBinput.inputString();
		System.out.print("비밀번호 :");
		String inputPW=DBinput.inputString();
		ResultSet rs;
		DBcon.getInstance();
		String sql="select * from account where name='"+inputName+"' and pw='"+inputPW+"'";
		rs=DBcon.statementQuery(sql);
		try {
			if (rs.next()) {
				loginName=rs.getString(2);
				loginID=rs.getLong(1);
				loginBal=rs.getInt(4);
				System.out.println(loginName+" 로그인");
				isLogin=true;
			}else {
				System.out.println("잘못된 이름/비밀번호");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBcon.dbClose();
	}
	public void addAcc() {
		System.out.print("사용할 이름 :");
		String inputName=DBinput.inputString();
		System.out.print("사용할 비밀번호 :");
		String inputPW=DBinput.inputString();
		acc.insertAcc(new AccountDTO(tempID,inputName,inputPW,0));
		tempID++;
		
	}
	public void addBal() {
		System.out.print("입금할 금액 입력 :");
		int inputInt=DBinput.inputInt();
		acc.updateBal(loginID, loginBal+inputInt);
		loginBal+=inputInt;
		System.out.println(inputInt+" 입금");
	}
	public void delBal() {
		System.out.print("출금할 금액 입력 :");
		int inputInt=DBinput.inputInt();
		if(loginBal-inputInt<0) {
			System.out.println("잔액이 부족합니다");
		}else {
			acc.updateBal(loginID, loginBal-inputInt);
			loginBal-=inputInt;
			System.out.println(inputInt+" 출금");
		}
	}
	public void displayBal() {
		System.out.println(loginName+"의 현재 잔액 : "+loginBal);
	}
	public void logout() {
		isLogin=false;
		loginBal=0;
		loginID=0;
		loginName=null;
	}
	public void startMenu() {
		System.out.printf("로그인:1, 회원가입:2, 종료:3%n입력 : ");
		int loginInput = DBinput.inputInt();
		switch (loginInput) {
		case 1:
			login();
			break;
		case 2:
			addAcc();
			break;
		case 3:
			isExit=true;
			return;
		default:
			System.out.println("잘못된 입력");
			break;
		}
	}
	public void mainMenu() {
		System.out.println("1.입금 2.출금 3.조회 4.로그아웃");
		System.out.print("원하는 메뉴 입력 : ");
		int menuInput = DBinput.inputInt();
		switch (menuInput) {
		case 1:
			System.out.println("입금");
			addBal();
			break;
		case 2:
			System.out.println("출금");
			delBal();
			break;
		case 3:
			displayBal();
			break;
		case 4:
			logout();
			return;
		default:
			System.out.println("잘못된 입력");
			break;
		}
	}
	public void init() {
		acc.resetAccTable();
		
	}
	public void run() {
		init();
		while(isExit==false) {
			while(isLogin==false && isExit==false) {
				startMenu();
			}
			while (isLogin==true) {
				mainMenu();
			}
			
		}
	}
	
}
