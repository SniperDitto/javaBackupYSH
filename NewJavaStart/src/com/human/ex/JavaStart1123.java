package com.human.ex;

public class JavaStart1123 {

	public static void main(String[] args) {
		System.out.println("주민번호를 입력하세요(xxxxxx-xxxxxxx) : 001212-1212121");
		String jumin = "001212-1212121";
		int bYear=Integer.parseInt(jumin.substring(0,2))+2000;
		int bMonth=Integer.parseInt(jumin.substring(2,4));
		int bdate=Integer.parseInt(jumin.substring(4,6));
		String gender=((Integer.parseInt(jumin.substring(7,8))%2==0) ? "female":"male");
		System.out.printf("%d년 %d월 %d일 출생, 성별:%s%n",bYear,bMonth,bdate,gender);
		
		System.out.println();
		System.out.println("<equals>");
		String eqString = "equal";
		if(eqString.equals("equal"))System.out.println(eqString);
		
		System.out.println();
		System.out.println("<concat>");
		String concString1="asd";
		String concString2="qwe";
		System.out.println(concString1.concat(concString2));
		
		System.out.println();
		System.out.println("<charAt>");
		String atString="asdfgh";
		System.out.println("4번째 글자 : "+atString.charAt(3));
		
		System.out.println();
		System.out.println("<length>");
		String lengthString = "123456";
		System.out.println("문자열 길이 : "+lengthString.length());
		
		System.out.println();
		System.out.println("<indexOf>");
		String indexString = "abcdef";
		if(indexString.indexOf("de")==-1) {
			System.out.println("문자열이 존재하지 않음");
		}else {
			System.out.println("abcdef 중 de 는 "+(indexString.indexOf("de")+1)+"번째에 존재");
		}
		
		System.out.println();
		System.out.println("<lastIndexOf>");
		String indexString1 = "abcdef";
		if(indexString.indexOf("de")==-1) {
			System.out.println("문자열이 존재하지 않음");
		}else {
			System.out.println("abcdef 중 de 는 뒤에서 "+(indexString1.lastIndexOf("de")+1)+"번째에 존재");
		}
		System.out.println();
		
		System.out.println("<subString>");
		String sString="substring";
		System.out.println("substring 첫번째부터 두번째까지 : "+sString.substring(0,2));
		System.out.println();
		
		System.out.println("<split>");
		jumin = "001212-1212121";
		String J[]=jumin.split("-");
		System.out.println("주민번호 앞자리 : "+J[0]+"\n뒷자리 : "+J[1]);
		System.out.println();
		
		System.out.println("<toLowerCase>");
		String strA="AAA";
		System.out.println(strA+"->"+strA.toLowerCase());
		System.out.println();
		
		System.out.println("<toUpperCase>");
		String strB="bbb";
		System.out.println(strB+"->"+strB.toUpperCase());
		System.out.println();
		
		System.out.println("<trim>");
		String trimString = "  asd  ";
		System.out.println(trimString+"->"+trimString.trim());
		
		System.out.println("<StringBuilder>");
		String buildString = new String("Java");
		System.out.println("buildString("+buildString+") 문자열 주소 : "+System.identityHashCode(buildString));
		StringBuilder sBuilder = new StringBuilder(buildString);
		System.out.println("sBuilder 연산 전 메모리 주소 : "+System.identityHashCode(sBuilder));
		sBuilder.append(" and");
		sBuilder.append(" android");
		sBuilder.append(" programming is fun.");
		System.out.println("sBuilder 연산 후 메모리 주소 : "+System.identityHashCode(sBuilder));
		buildString=sBuilder.toString();
		System.out.println(buildString);
		System.out.println("연결된 buildString 메모리 주소 : "+System.identityHashCode(sBuilder));
		
		StringBuilder sb = new StringBuilder();
		sb.append("java ");
		sb.append("program study");
		System.out.println(sb.toString());
		sb.insert(4, "2");//4번째 문자 뒤에 2 삽입
		sb.setCharAt(4, 'a');//4번째 문자 뒤의 글자를 a로 변경
		sb.replace(6, 13, "Book");//6~13번째까지를 Book으로 대체
		sb.delete(3, 5);//3~5번째 삭제
		int sbLength=sb.length();
		System.out.println(sb.toString()+sbLength);
		
		/* 정규식(regex)
		 * .:문자 하나
		 * ^regex:^다음 regex로 시작하는가
		 * regex$:$앞의 regex가 마지막인가
		 * [abc]:abc 중 하나
		 * [^abc]:abc 제외한 문자 하나
		 * [abc][de]:abc중 하나+de중 하나
		 * [a-d1-7]:a~d,1~7사이 문자 하나
		 * a|b:a또는b
		 * \d = [0-9]:0~9사이숫자
		 * \D = [^0-9]:문자(0~9 숫자 제외한것=문자)
		 * \s = [\t\n\x0b\r\f]:스페이스바 공간 하나
		 * \S:공백 제외한 문자
		 * \w = [a-zA-Z0-9]:알파벳,숫자 등의 문자를 의미
		 * \W:위의 문자를 제외한 나머지문자(스페이스바 등)
		 * \b:단어의 경계(공백)찾기
		 * 등등
		 */
		/* 반복 횟수
		 * *:0회이상 반복
		 * +:1회이상 반복
		 * ?:0or1회만
		 * {x}:x회이상 반복
		 * {x,y}:x~y만큼 반복
		 * *?:가장 적게 일치하는 패턴
		 */
		
		
	}

}
