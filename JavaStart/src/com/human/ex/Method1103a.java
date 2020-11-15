package com.human.ex;

class Student{
	public static int count=0;//호출된횟수
	
	private String name="홍길동";//캡슐화, 은닉화 private
	private int kor=50;//필드, 인스턴스 필드, 정적변수, 클래스변수
	private int math=50;
	private int eng=50;
	
	public Student() {//호출
		this("홍길동", 11, 22, 33);//호출내용
		
	}
	public int total() {
		return kor+math+eng;
	}
	public double avg() {
		return total()/3;
	}
	@Override
	public String toString() {
		return "이름 : "+name+"\n"+" 국어 : "+kor+" 수학 : "+math+" 영어 : "+eng+" 총점 : "+total()+" 평균 : "+avg();
	}
	public Student(String name,int kor,int math,int eng) {
		this.name=name;
		this.kor=kor;
		this.math=math;
		this.eng=eng;
		Student.count++;//호출내용이 호출시 카운트증가
	}
	@Override
	public int hashCode() {//이름으로 판별
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {//이름으로 두 객체 비교
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor<0) {
			this.kor=0;
		}
		else if(kor>100) {
			this.kor=100;
		}
		else{
			this.kor = kor;
		}
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math<0) {
			this.math=0;
		}
		else if(math>100) {
			this.math=100;
		}
		else{
			this.math = math;
		}
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng<0) {
			this.eng=0;
		}
		else if(eng>100) {
			this.eng=100;
		}
		else{
			this.eng = eng;
		}
	}
	
	
}




public class Method1103a {

	
	public static void main(String[] args) {
		Student st1=new Student("홍",55,66,77);
		System.out.println(st1);
		
		Student st2=new Student("ㅁ",77,66,55);
		st2.setKor(123);
		st2.setName("홍길남");
		System.out.println(st2);
		
		System.out.println(Student.count);
		
	}
	
	
	
}
