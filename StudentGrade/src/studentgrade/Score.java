package studentgrade;

import define.GradeMethod;
import grade.ABgrade;
import grade.PFgrade;
import grade.SABgrade;

public class Score  {
	private int gradeInt;//채점방식
	private int score;//점수
	private String grade;//성적(A,B 등)
//---------------------------------
	public Score() {}
	public Score(int gradeInt, int score) {
		super();
		this.gradeInt = gradeInt;
		this.score = score;
		setGrade();
	}
//---------------------------------
	public int getGradeInt() {
		return gradeInt;
	}

	public int getScore() {
		return score;
	}

	public String getGrade() {
		return grade;
	}
//---------------------------------
	public void setGrade() {
		GradeMethod sab = GradeMethod.SAB;
		GradeMethod ab = GradeMethod.AB;
		GradeMethod pf = GradeMethod.PF;
		if(gradeInt==sab.getValue()) {
			SABgrade sabGrade = SABgrade.getInstance();
			this.grade=sabGrade.getGrade(score);
			return;
		}else if(gradeInt==ab.getValue()) {
			ABgrade abGrade = ABgrade.getInstance();
			this.grade=abGrade.getGrade(score);
			return;
		}else if(gradeInt==pf.getValue()) {
			PFgrade pfGrade = PFgrade.getInstance();
			this.grade=pfGrade.getGrade(score);
			return;
		}else {
			System.out.println("잘못된 채점 방식");
			this.grade="";
		}
	}
//---------------------------------------	
	@Override
	public String toString() {
		return "Score [gradeInt=" + gradeInt + ", score=" + score + ", grade=" + grade + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + gradeInt;
		result = prime * result + score;
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
		Score other = (Score) obj;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (gradeInt != other.gradeInt)
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	
	
}
