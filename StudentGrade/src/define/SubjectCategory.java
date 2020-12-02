package define;

public enum SubjectCategory{//과목분류
	KOREAN(1),MATH(2);
	
	private final int value;
	private SubjectCategory(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
}
