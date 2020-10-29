package com.human.ex;

import java.util.Arrays;


import com.human.dto.BankAccount;

public class Bank {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		BankAccount adminAccount = new BankAccount("admin","1111",0,0);
		boolean isAdmin = false;
		boolean isLogin = false;
		int idLoggedin = 0;
		BankAccount information[] = new BankAccount[1];
		login: for (;;) {
			System.out.printf("로그인:1, 회원가입:2%n입력 : ");// id=사용자명, 동명이인 고려x
			int login = Integer.parseInt(scanner.nextLine());
			switch (login) {
			case 1:
				boolean idChecked = false;
				System.out.printf("<로그인>%n사용자명 : ");
				String inputName = scanner.nextLine();
				if (inputName.equals("exit")) {
					break login;
				} else if (inputName.equals(adminAccount.name)) {
					System.out.print("비밀번호 입력 : ");
					String inputPw = scanner.nextLine();
					if (inputPw.equals(adminAccount.pw)) {
						System.out.printf("관리자 로그인%n");
						isLogin = true;
						isAdmin = true;
						break;
					} else {
						System.out.println("잘못된 비밀번호입니다");
						break;
					}
				}
				for (BankAccount i : information) {
					if (i.name.equals(inputName)) {
						idChecked = true;
						System.out.print("비밀번호 입력 : ");
						String passw1 = scanner.nextLine();
						if (i.pw.equals(passw1)) {
							System.out.printf("%s님으로 로그인%n", i.name);
							isLogin = true;
							isAdmin = false;
							idLoggedin = i.id;
							break;
						} else {

							System.out.println("잘못된 비밀번호입니다");
							break;
						}
					}
				}

				if (idChecked == false) {
					System.out.println("사용자명을 찾을 수 없습니다");
				}
				break;
			case 2:

				System.out.println("<회원가입>");
				BankAccount account = createAccount(information);
				information = makeArray(information, account);
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}

			if (isAdmin == false && isLogin == true) {
				bank: for (;;) {
					int menu = 123;
					System.out.println("1.입금 2.출금 3.조회 4.종료");
					System.out.print("원하는 메뉴 입력 : ");
					menu = Integer.parseInt(scanner.nextLine());
					switch (menu) {
					case 1:
						for (BankAccount i : information) {
							if (i.id == idLoggedin) {
								System.out.print("입금할 금액 입력 : ");
								i.balance += Integer.parseInt(scanner.nextLine());
							}
						}
						break;
					case 2:
						for (BankAccount i : information) {
							if (i.id == idLoggedin) {
								System.out.print("출금할 금액 입력 : ");
								int withdraw = Integer.parseInt(scanner.nextLine());
								if (i.balance - withdraw < 0) {
									System.out.println("잔액이 부족합니다");
									break;
								} else {
									i.balance -= withdraw;
								}
							}
						}
						break;
					case 3:
						for (BankAccount i : information) {
							if (i.id == idLoggedin) {
								System.out.printf("%s님의 잔액 : %d%n", i.name, i.balance);
							}
						}
						break;
					case 4:
						break bank;
					default:
						break;
					}
				}
			} else if (isAdmin == true && isLogin == true) {
				admin: for (;;) {
					int menu = 123;
					System.out.println("1.계정추가 2.계정삭제 3.모든사용자정보 4.id로 정보 검색 5.종료");
					System.out.print("원하는 메뉴 입력 : ");
					menu = Integer.parseInt(scanner.nextLine());
					switch (menu) {
					case 1:
						System.out.println("<계정추가>");
						BankAccount account = createAccount(information);
						information = makeArray(information, account);
						break;
					case 2:
						boolean nameIsFound = false;
						System.out.println("<계정삭제>");
						System.out.printf("삭제할 사용자명 : ");
						String name1 = scanner.nextLine();
						for (BankAccount i : information) {
							if (i.name.equals(name1)) {
								information[i.id] = new BankAccount("삭제됨", "", i.id, 0);
								nameIsFound = true;
								break;
							}
						}
						if (nameIsFound==false) {
							System.out.println("계정을 찾을 수 없음");
						}
						break;
					case 3:
						System.out.println("<전체 정보>");
						System.out.println(Arrays.toString(information));
						break;
					case 4:
						boolean idIsFound = false;
						System.out.println("<이름으로 정보 검색>");
						System.out.print("이름 입력 : ");
						String inputId = scanner.nextLine();
						for (BankAccount i : information) {
							if (i.name.equals(inputId)) {
								System.out.println(information[i.id]);
								idIsFound = true;
								break;
							}
						}
						if (idIsFound == false) {
							System.out.println("계정을 찾을 수 없음");
						}
						break;
					case 5:
						break admin;
					default:
						System.out.println("잘못된 입력");
						break;
					}
				}
			}
		}
		System.out.println("종료");

	}

	private static BankAccount createAccount(BankAccount[] info) {
			java.util.Scanner scanner = new java.util.Scanner(System.in);
			System.out.print("사용할 사용자명 : ");//사용자명 중복은 체크안함
			String name = scanner.nextLine();
			System.out.print("사용할 비밀번호 : ");
			String passw = scanner.nextLine();
			
			BankAccount newAccount = new BankAccount(name,passw,info.length-1,0);
		return newAccount;
		}

	private static BankAccount[] makeArray(BankAccount[] info, BankAccount account) {
		BankAccount newinfo[] = new BankAccount[info.length+1];
		for (int i = 0; i < info.length; i++) {
			newinfo[i] = info[i];
		}
		newinfo[account.id] = account;
		return newinfo;
	}
}
