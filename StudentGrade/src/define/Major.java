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

	
	//전공 입력받을때 메뉴 만들기(1:컴공 2:국문)
	public String majorString() {
		StringBuilder returnString=new StringBuilder("");
		for(Major m:Major.values()) {
			returnString.append(Integer.toString(m.getValue()));
			returnString.append(":");
			returnString.append(m.toString());
			returnString.append(" ");
		}
		return returnString.toString();
	}



}


	

