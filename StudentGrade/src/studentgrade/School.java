package studentgrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class School {
	Scanner scanner = new Scanner(System.in);
	private static String name="SCHOOL";
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	private static School instance=new School();
	private int numStudent;
//---------------------------------------------	
	private School() {}
	public static School getInstance() {
		return instance;
	}
//--------------------------------------------	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		School.name = name;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public int getNumStudent() {
		int size = students.size();
		return size;
	}
//--------------------------------------------	
	public void addStudents() {
		System.out.print("추가할 학생 이름 : ");
		String inputName=scanner.nextLine();
		StudentID sId = new StudentID();
		sId.inputStudentID();
		sId.makeStudentID();
		Student tempStudent = new Student(sId.getStudentID(),inputName,sId.getMajor());
		students.add(tempStudent);
		
	}
	public void removeStudents(Student s) {
		students.remove(s);
	}
	public void addSubjects(Subject s) {
		subjects.add(s);
	}
	public void removeSubjects(Subject s) {
		subjects.remove(s);
	}
	
	
	
	
	
	
}
