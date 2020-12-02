package define;

//학점산출방식
public enum GradeMethod{
	SAB(1),AB(2),PF(3);
	
	private final int value;
	private GradeMethod(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
}

