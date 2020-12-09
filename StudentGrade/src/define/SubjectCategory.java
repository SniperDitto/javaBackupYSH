package define;

public enum SubjectCategory{//과목분류
	KOREAN(1){
		public String toString() {
			return "국어";
		}
	},MATH(2){
		public String toString() {
			return "수학";
		}
	};
	
	private final int value;
	private SubjectCategory(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
	//(1:국어 2:수학)
	public String categoryString() {
		String returnString="";
		for(SubjectCategory m:SubjectCategory.values()) {
			returnString.concat(Integer.toString(m.getValue()));
			returnString.concat(":");
			returnString.concat(m.toString());
			returnString.concat(" ");
		}
		return returnString;
	}
	
	
}
