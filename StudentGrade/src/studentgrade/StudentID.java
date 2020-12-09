package studentgrade;

import java.util.Scanner;
import define.Major;

public class StudentID {
	Scanner scanner = new Scanner(System.in);
	private String Year;//입학년도
	private String majorID;//전공코드
	private String StudentID;//학번
//------------------------------------------	
	public StudentID() {}
	public StudentID(String year, String major) {
		super();
		this.Year = year;
		this.majorID = major;
		makeStudentID();
	}
//------------------------------------------------
	public String getYear() {
		return this.Year;
	}
	public void setYear(String year) {
		this.Year = year;
	}
	public String getMajorID() {
		return majorID;
	}
	public void setMajorID(String majorID) {
		this.majorID = majorID;
	}
	
	public String getStudentID() {
		return StudentID;
	}
//----------------------------------------------------------
	public void inputStudentID() {//학번(입학년도+전공코드+등록순서)
		System.out.print("입학년도 : ");
		String inputYear=scanner.nextLine();
		Major m=Major.COMPUTER;
		String maj=m.majorString();
		System.out.printf("추가할 학생 전공(%s) : ",maj);
		int inputMajor=Integer.parseInt(scanner.nextLine());
		if(isExistMajor(inputMajor)) {
			setYear(inputYear);
			setMajorID(String.valueOf(inputMajor));
		}else {
			System.out.println("존재하지 않는 전공");
		}
		
	}
	
	public boolean isExistMajor(int maj) {
		for(Major m:Major.values()) {
			if(m.getValue()==maj) {
				return true;
			}
		}
		return false;
	}
	
	public void makeStudentID() {
		School s = School.getInstance();
		String tempStudentID=Year.concat(majorID);
		tempStudentID=tempStudentID.concat(Integer.toString(s.getNumStudent()));
		this.StudentID=tempStudentID;
	}
	

//-----------------------------------------------	
	
	@Override
	public String toString() {
		return "StudentID [StudentID=" + StudentID + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((StudentID == null) ? 0 : StudentID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentID other = (StudentID) obj;
		if (StudentID == null) {
			if (other.StudentID != null)
				return false;
		} else if (!StudentID.equals(other.StudentID))
			return false;
		return true;
	}
	
	
	
}



