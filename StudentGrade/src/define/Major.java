package define;

public enum Major{//전공
	COMPUTER(1){
		public String toString() {
			return "컴퓨터공학과";
		}
	},KRLANGUAGE(2){
		public String toString() {
			return "국어국문학과";
		}
	};
	
	private final int value;
	private Major(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}

	public String majorString() {
		String returnString="";
		for(Major m:Major.values()) {
			returnString.concat(Integer.toString(m.getValue()));
			returnString.concat(" ");
			returnString.concat(m.toString());
			returnString.concat(" ");
		}
		return returnString;
	}



}


	

