package com.human.ex;

import java.util.Arrays;

public class JavaStart1028 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("1----------------------------");
		System.out.print("숫자 입력 : ");
		int input1=Integer.parseInt(scanner.nextLine());
		if(input1>10) {
			System.out.println("10보다 크다");
		}else {
			System.out.println("10보다 크지 않다");
		}
		
		System.out.println("2----------------------------");
		System.out.print("true입력 : ");
		String input2=scanner.nextLine();
		if(input2.equals("true")) {
			System.out.println("true가 입력되었습니다");
		}else {
			System.out.println("true가 입력되지 않았습니다");
		}
		
		System.out.println("3----------------------------");
		System.out.println("암호 입력 : ");
		int input3=Integer.parseInt(scanner.nextLine());
		if(input3==1004) {
			System.out.println("암호o");
		}else {
			System.out.println("암호x");
		}
		
		System.out.println("4----------------------------");
		System.out.println("안녕/잘자/잘가 입력 : ");
		String input4=scanner.nextLine();
		if (input4.equals("안녕")) {
			System.out.println("너도 안녕");
		}else if (input4.equals("잘자")) {
			System.out.println("너도 잘자");
		}else if (input4.equals("잘가")) {
			System.out.println("너도 잘가");
		}else {
			System.out.println("잘못된 입력");
		}
		
		System.out.println("배열 1----------------------------");
		int array1[] = {1,2,3};
		for(int i=0;i<array1.length;i++) {
			array1[i]=array1[i]+2;
		}
		System.out.println(Arrays.toString(array1));
		
		System.out.println("2----------------------------");
		int[] array2 = new int[10];
		int index2=3;
		for(int i=0;i<array2.length;i++){
			array2[i]=index2;
			index2=index2+3;
		}
		System.out.println(Arrays.toString(array2));
		
		System.out.println("3----------------------------");
		int[] array3 = new int[100];
		for(int i=0;i<array3.length;i++){
			array3[i]=i+1;
			if(i%2==0){
				System.out.print(array3[i]+" ");
			}
		}
		System.out.println();
		
		System.out.println("4----------------------------");
		int[] array4 = {12,1,5,3,6,8,5,3};
		int sum4 = 0;
		for(int i=0;i<array4.length;i++){
			sum4=sum4+array4[i];
		}
		System.out.println("sum="+sum4);
		
		System.out.println("5----------------------------");
		int sum5=0;
		for(int i=0;i<array4.length;i++){
			if(array4[i]%2==0){
				sum5=sum5+array4[i];
			}
		}
		System.out.println("sum="+sum5);
		
		System.out.println("6----------------------------");
		int array6[] = {12,1,51,3,6,8,5};
		int most6=array6[0];
		int least6=array6[0];
		for(int i=0;i<array6.length;i++){
			if(array6[i]>most6){
				most6=array6[i];
			}
			if(array6[i]<least6){
				least6=array6[i];
			}
			
		}
		System.out.println("sum="+(most6+least6));
		
		System.out.println("배열입력 1----------------------------");
		int array11[]=new int[5];
		for(int i=0;i<array11.length;i++) {
			System.out.printf("%d번째 원소 입력(%d/%d)(숫자) : ",i+1,i+1,array11.length);
			array11[i]=Integer.parseInt(scanner.nextLine());
		}
		System.out.println(Arrays.toString(array11));
		System.out.print("숫자 입력 : ");
		int input11=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<array11.length;i++) {
			if(input11==array11[i]) {
				System.out.printf("%d는 배열의 %d번째 원소%n",input11,i+1);
			}
		}
		
		System.out.println("2----------------------------");
		String array22[]=new String[5];
		for(int i=0;i<array22.length;i++) {
			System.out.printf("%d번째 원소 입력(%d/%d)(문자) : ",i+1,i+1,array22.length);
			array22[i]=scanner.nextLine();
		}
		System.out.println(Arrays.toString(array22));
		System.out.print("문자 입력 : ");
		String input22=scanner.nextLine();
		for(int i=0;i<array22.length;i++) {
			if(input22.equals(array22[i])) {
				System.out.printf("%s는 배열의 %d번째 원소%n",input22,i+1);
			}
		}
		
		System.out.println("3----------------------------");
		System.out.print("배열 크기 입력 : ");
		int arrayLength3=Integer.parseInt(scanner.nextLine());
		int array33[]=new int[arrayLength3];
		for(int i=0;i<arrayLength3;i++) {
			if((i+1)%3==0) {
				array33[i]=3;
			}else {
				array33[i]=(i+1)%3;
			}		
		}
		System.out.println(Arrays.toString(array33));
		
		System.out.println("4----------------------------");
		System.out.print("배열 크기 입력 : ");
		int arrayLength4=Integer.parseInt(scanner.nextLine());
		int array41[]=new int[arrayLength4];
		for(int i=0;i<array41.length;i++) {
			System.out.printf("%d번째 원소 입력(%d/%d)(숫자) : ",i+1,i+1,array41.length);
			array41[i]=Integer.parseInt(scanner.nextLine());
		}
		System.out.println("입력된 배열 : "+Arrays.toString(array41));
		int newarray4[]=new int[arrayLength4*2];//정순 배열
		int ind4=array41.length-1;
		for (int j = 0; j < array41.length; j++) {// 정순 정렬
			newarray4[j] = array41[j];
		}
		for (int j = arrayLength4; j <= (arrayLength4*2-1); j++) {
			newarray4[j] = array41[ind4];
			ind4--;
		}
		System.out.println("정순 : "+Arrays.toString(newarray4));
		int newarray44[]=new int[arrayLength4*2];//역순 배열
		int ind44=array41.length-1;
		for (int j = 0; j < array41.length; j++) {// 역순 정렬
			newarray44[j]=array41[ind44];
			ind44--;
		}
		for (int j = arrayLength4; j <= (arrayLength4*2-1); j++) {
			newarray44[j] = array41[j-arrayLength4];
		}
		System.out.println("역순 : "+Arrays.toString(newarray44));	
			
		System.out.println("5----------------------------");
		System.out.print("이동방향입력(오른쪽/왼쪽) : ");
		String dir=scanner.nextLine();
		int direction=0;
		if(dir.equals("오른쪽")) {
			direction=1;
		}else if(dir.equals("왼쪽")) {
			direction=-1;
		}
		System.out.print("이동거리입력 : ");
		int distance=Integer.parseInt(scanner.nextLine());
		System.out.print("채울숫자입력 : ");
		int number=Integer.parseInt(scanner.nextLine());
		int array5[]= {1,2,3,4,5,6,7,8,9};
		int array55[]= {1,2,3,4,5,6,7,8,9};
		int index5=0;
		if(direction<0) {//왼쪽
			for(int i=(-distance+array5.length);i<array5.length;i++) {//숫자채우기
				array5[i]=number;
			}
			for(int i=0;i<(-distance+array5.length);i++) {//남은자리에 순서대로 채우기
				array5[i]=array55[distance+i];
			}
		}else if(direction>0) {//오른쪽
			for(int i=0;i<distance;i++) {//숫자채우기
				array5[i]=number;
			}
			for(int i=distance;i<array5.length;i++) {//남은자리에 순서대로 채우기
				array5[i]=array55[index5];
				index5++;
			}
		}
		System.out.println(Arrays.toString(array5));
		
		System.out.println("6----------------------------");
		System.out.print("회전방향입력(오른쪽/왼쪽) : ");
		String dir1=scanner.nextLine();
		int direction1=0;
		if(dir1.equals("오른쪽")) {
			direction1=1;
		}else if(dir1.equals("왼쪽")) {
			direction1=-1;
		}
		System.out.print("이동거리입력 : ");
		int distance1=Integer.parseInt(scanner.nextLine());
		int array61[]= {1,2,3,4,5,6,7,8,9};
		int array66[]= {1,2,3,4,5,6,7,8,9};
		int index6=0;
		int index66=0;
		if(direction1<0) {//왼쪽
			for(int i=(-distance1+array61.length);i<array61.length;i++) {//숫자채우기
				array61[i]=array66[index6];
				index6++;
			}
			for(int i=0;i<(-distance1+array61.length);i++) {//남은자리에 순서대로 채우기
				array61[i]=array66[distance1+i];
			}
		}else if(direction1>0) {//오른쪽
			for(int i=0;i<distance1;i++) {//숫자채우기
				array61[i]=array66[array66.length-distance1+i];
				
			}
			for(int i=distance1;i<array61.length;i++) {//남은자리에 순서대로 채우기
				array61[i]=array66[index66];
				index66++;
			}
		}
		System.out.println(Arrays.toString(array61));
		
		System.out.println("7----------------------------");
		int array7[]=new int[100];
		for(int i=0;i<100;i++) {
			array7[i]=i;
		}
		for(int i=0;i<100;i++) {
			for(int j=2;j<=50;j++) {
				if(i!=j) {
					if(i%j==0) {
						array7[i]=0;
					}
				}
			}
			if(array7[i]!=0) {
				System.out.printf("%d ",array7[i]);
			}
		}
		System.out.println();
		System.out.println("자신을 제외한 자신의 배수를 모두 지웠기 때문에\n1과 자신을 제외한 어떤 수로도 나누어지지 않는 소수만 출력된다");
		
		System.out.println("8----------------------------");
		System.out.print("주사위 굴릴 횟수 입력 : ");
		int diceRoll=Integer.parseInt(scanner.nextLine());
		int diceNum[]= {0,0,0,0,0,0};
		int diceEye;
		for(int i=0;i<diceRoll;i++) {
			diceEye=(int)(Math.random()*6+1);
			switch (diceEye) {
			case 1:
				diceNum[0]++;
				break;
			case 2:
				diceNum[1]++;
				break;
			case 3:
				diceNum[2]++;
				break;
			case 4:
				diceNum[3]++;
				break;
			case 5:
				diceNum[4]++;
				break;
			case 6:
				diceNum[5]++;
				break;
			default:
				break;
			}
		}
		for(int i=0;i<6;i++) {
			System.out.printf("%d : %d번%n",i+1,diceNum[i]);
		}
		System.out.println();
		
		System.out.println("9----------------------------");
		int array9[]=new int[50];
		for(int i=0;i<array9.length;i++) {
			array9[i]=0;
		}
		int studentNO=0;int menu=0;
		attendance: for(;;) {
			System.out.printf("1.전체 출석사항 2.결석자 추가 3.출석자 추가%n4.조퇴자 추가 5.지각자 추가 6.프로그램 종료%n원하는 메뉴 입력 : ");
			menu=Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				int att=0;int abs=0;int leave=0;int late=0;int noValue=0;
				for(int i=0;i<array9.length;i++) {//목록에서 미입력,출석,결석,조퇴,지각수 세기
					switch (array9[i]) {
					case 0:
						noValue++;
						break;
					case 1:
						att++;
						break;
					case 2:
						abs++;
						break;
					case 3:
						leave++;
						break;
					case 4:
						late++;
						break;
					default:
						break;
					}
				}
				System.out.printf("미입력 : %d%n출석 : %d%n결석 : %d%n조퇴 : %d%n지각 : %d%n",noValue,att,abs,leave,late);
				break;
			case 2:	//결석추가
				System.out.print("처리할 학생 번호 입력(1~50) : ");
				studentNO=Integer.parseInt(scanner.nextLine());
				array9[studentNO-1]=2;
				break;
			case 3://출석추가
				System.out.print("처리할 학생 번호 입력(1~50) : ");
				studentNO=Integer.parseInt(scanner.nextLine());
				array9[studentNO-1]=1;
				break;
			case 4:	//조퇴추가
				System.out.print("처리할 학생 번호 입력(1~50) : ");
				studentNO=Integer.parseInt(scanner.nextLine());
				array9[studentNO-1]=3;
				break;
			case 5://지각추가
				System.out.print("처리할 학생 번호 입력(1~50) : ");
				studentNO=Integer.parseInt(scanner.nextLine());
				array9[studentNO-1]=4;
				break;
			case 6:
				break attendance;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		System.out.println("종료");
		
		
	}

}
