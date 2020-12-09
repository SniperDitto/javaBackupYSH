package define;

//학점산출방식
public enum GradeMethod{
	SAB(1){
		public String toString() {
			return "SAB";
		}
	},
	AB(2){
		public String toString() {
			return "AB";
		}
	},
	PF(3){
		public String toString() {
			return "PF";
		}
	};
	
	private final int value;
	private GradeMethod(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
	//(1:SAB 2:AB 3:PF)
	public String gradeString() {
		String returnString="";
		for(GradeMethod m:GradeMethod.values()) {
			returnString.concat(Integer.toString(m.getValue()));
			returnString.concat(":");
			returnString.concat(m.toString());
			returnString.concat(" ");
		}
		return returnString;
	}
	
	
}

