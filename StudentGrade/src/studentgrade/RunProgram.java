package studentgrade;

public class RunProgram {

	public static void main(String[] args) {
		School school = School.getInstance();
		school.addStudents();
		System.out.println(school.getStudents());
		

	}

}
