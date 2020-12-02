package studentgrade;

import java.util.Scanner;

public class SubjectID {//과목코드 만들기 위한 클ㄽ
	Scanner scanner = new Scanner(System.in);
	private String subjectCode;//과목분류(국어,수학 등)
	private String year;//수업개설연도
	private String division;//분반
	private String subjectID="";//수업코드(수업개설연도+과목고유코드+분반)
//------------------------------------------
	
	public void inputSubjectID() {
		System.out.print("개설할 수업 진행 연도 : ");
		String inputYear = scanner.nextLine();
		System.out.print("개설할 수업 과목 분류 코드 : ");
		String inputSID = scanner.nextLine();
		System.out.print("개설할 분반 : ");
		String inputClassNum = scanner.nextLine();
		setYear(inputYear);
		setDivision(inputClassNum);
		setSubjectCode(inputSID);
	}
	
	public void makeSubjectID() {
		String tempID="";
		StringBuilder subjectStringBuilder = new StringBuilder(tempID);
		//수업코드(수업개설연도+과목분류+분반)
		subjectStringBuilder.append(year);
		subjectStringBuilder.append(subjectID);
		subjectStringBuilder.append(division);
		tempID=subjectStringBuilder.toString();
		this.subjectID = tempID;
	}
//----------------------------------------------------
	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getSubjectID() {
		return subjectID;
	}

//--------------------------------------------	
	
	@Override
	public String toString() {
		return "SubjectID [subjectID=" + subjectID + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subjectID == null) ? 0 : subjectID.hashCode());
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
		SubjectID other = (SubjectID) obj;
		if (subjectID == null) {
			if (other.subjectID != null)
				return false;
		} else if (!subjectID.equals(other.subjectID))
			return false;
		return true;
	}

	
	
	
	
	
	
}
