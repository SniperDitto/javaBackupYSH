package com.human.ex;

import java.util.Scanner;

public class JavaStart1030 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id[]=new String[100];
		String pw[]=new String[100];
		double account[]=new double[100];
		String inputID=null;
		String inputPW=null;
		int indexCount=0;int listCount=0;
//			String loginID=null; 
//			System.out.println(loginID.toString());//null이라 참조할게 없어서 nullpointexeption에러발생
//			//문자열에는 문자열 뒤에 문자열을 끝낸다는 표시(/0)와 함께 저장됨 ->char와 str의 차이
//			//보이는 글자수와 메모리에 저장되는 글자수가 다름
//			//A에 null이 있는지 확인하는 법 : ==null		
		while (true) {
			System.out.println("아이디와 비밀번호 입력");
			System.out.print("아이디 : ");
			inputID = scanner.nextLine();
			System.out.print("비밀번호 : ");
			inputPW = scanner.nextLine();
			if (inputID == null) {//null 체크
				System.out.println("값이 존재하지 않음");
			} else if (inputID.equals("exit")) {//종료
				break;
			}else if(inputID.equals("admin") && inputPW.equals("admin")) {//관리자(id:admin/pw:admin)
				boolean isAdminLogin=true;
				while (isAdminLogin) {
					System.out.println("관리자 계정으로 로그인");
					System.out.println("1.계정추가 2.계정삭제 3.모든정보보기 4.id로 검색 5.종료");
					System.out.print("메뉴 입력 : ");
					int selectNUM = Integer.parseInt(scanner.nextLine());
					switch (selectNUM) {
					case 1:
						System.out.println("계정 추가");
						System.out.println("사용할 아이디 : ");
						id[listCount] = scanner.nextLine();
						System.out.println("사용할 비밀번호 : ");
						pw[listCount] = scanner.nextLine();
						account[listCount] = 0;
						listCount++;
						System.out.println("사용자 추가됨");
						break;
					case 2:
						System.out.println("계정 삭제");
						System.out.print("삭제할 사용자명 입력 : ");
						String deleteID = scanner.nextLine();
						int findIndex = -1;
						for (int i = 0; i < listCount; i++) {
							if (id[i].equals(deleteID)) {
								findIndex = i;
								break;
							}
						}
						if (findIndex < 0) {
							System.out.println("계정을 찾을 수 없음");
						} else {
							for (int i = findIndex; i < id.length - 1; i++) {
								id[i] = id[i + 1];
								pw[i] = pw[i + 1];
								account[i] = account[i + 1];
							}
							listCount--;
							System.out.println("계정 삭제됨");
						}
						break;
					case 3:
						System.out.println("모든 사용자 정보");
						for(int i=0;i<listCount;i++) {
							System.out.println("아이디 : "+id[i]);
							System.out.println("비밀번호 : "+pw[i]);
							System.out.println("잔액 : "+account[i]);
							System.out.println("---------------------");
						}
						if(listCount==0) {
							System.out.println("출력할 데이터 없음");
						}
						break;
					case 4:
						System.out.println("id로 검색");
						System.out.print("찾을 id 입력 : ");
						String findId=scanner.nextLine();
						boolean isFound=false;
						for(int i=0;i<listCount;i++) {
							if(id[i].equals(findId)) {
							System.out.println("아이디 : "+id[i]);
							System.out.println("비밀번호 : "+pw[i]);
							System.out.println("잔액 : "+account[i]);
							System.out.println("---------------------");
							isFound=true;
							}
						}
						if(isFound==false) {
							System.out.println("존재하지 않는 id");
						}
						break;
					case 5:
						isAdminLogin=false;inputID=null;
						System.out.println("관리자 로그아웃");
						break;
					default:
						System.out.println("올바른 값을 입력(1~5)");
						break;
					}
				}

				
			}else {//일반적인 경우
				//사용자명 존재 확인
				boolean isLogin=false;
				for(int i=0;i<100;i++) {
					if(id[i]!=null && id[i].equals(inputID) && pw[i].equals(inputPW)) {//존재하는 사용자명
						isLogin=true;
						indexCount=i;
						break;
					}
					
				}
				System.out.println(indexCount+":"+id[indexCount]+inputID);
				if(isLogin) {//로그인O
					//존재한다면 indexCount는 무엇인가
					while (isLogin) {
						System.out.println(inputID + "님이 로그인 하셨습니다.");
						System.out.print("1.입금 2.출금 3.조회 4.종료 : ");
						int selectNUM = Integer.parseInt(scanner.nextLine());
						switch (selectNUM) {
						case 1:
							System.out.println("입금할 금액 입력 : ");
							account[indexCount]+=Double.parseDouble((scanner.nextLine()));
							System.out.println(inputID+"의 현재 잔액 : "+account[indexCount]);
							break;
						case 2:
							System.out.println("출금할 금액 입력 : ");
							account[indexCount]-=Double.parseDouble((scanner.nextLine()));
							System.out.println(inputID+"의 현재 잔액 : "+account[indexCount]);
							break;
						case 3:
							System.out.println(inputID+"의 현재 잔액 : "+account[indexCount]);
							break;
						case 4:
							System.out.println("로그아웃");
							isLogin=false;inputID=null;
							break;
						default:
							System.out.println("올바른 값을 입력하세요");
							break;
						}
					}
				}else {//로그인X
					inputID=null;
				}
				
			}//일반로그인
		}//while
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
