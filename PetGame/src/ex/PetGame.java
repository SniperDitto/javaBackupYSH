package ex;

public class PetGame {

	public static void main(String[] args) {
		PlayGame game1 = new PlayGame();
		AddCharacter character = new AddCharacter();
		
		game1.playG(character.select());

	}

}
