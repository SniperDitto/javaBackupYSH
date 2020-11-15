import java.util.Arrays;

public class Practice1 {
	
	
	
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int length=1;int index=0;int loginSuccess=0;boolean isLogin=false;
		BankAccount information[]= new BankAccount[length];
		bank:for(;;) {
			BankAccount temp[]=information.clone();
			int menu=123;
			System.out.printf("로그인:1, 회원가입:2%n입력 : ");//id=사용자명
			int login = Integer.parseInt(scanner.nextLine());
			switch (login) {
			case 1:
				System.out.printf("<로그인>%n사용자명 : ");
				String name1=scanner.nextLine();
				if(name1.equals("exit")) {
					break bank;
				}
				for (BankAccount i:information) {
					if(i.name.equals(name1)){
						System.out.print("비밀번호 입력 : ");
						String passw1=scanner.nextLine();
						if(i.pw.equals(passw1)) {
							System.out.printf("%s님으로 로그인%n",i.name);
							isLogin=true;
							break;
						}else {
							System.out.println("잘못된 비밀번호입니다");

						}
					}else {
						
						//login=0;
					}
				}
				if (isLogin==false) {
					System.out.println("사용자명을 찾을 수 없습니다");
				}
				break;
			case 2:
				System.out.println("<회원가입>");
				System.out.print("사용할 사용자명 : ");
				String name=scanner.nextLine();
				System.out.print("사용할 비밀번호 : ");
				String passw=scanner.nextLine();
				information=makeArray(information,temp,length,name,passw,index);
				length++;index++;
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
			System.out.println(Arrays.toString(information));
		}

	}



	private static BankAccount[] makeArray(BankAccount[] info,BankAccount[] temp, int length, String name, String passw, int index) {
		BankAccount newinfo[]= new BankAccount[length];
		for (int i=0;i<info.length;i++) {
			newinfo[i]=temp[i];
		}
		newinfo[index]= new BankAccount(name,passw,index,0);
		
		return newinfo;
	}


	



}
