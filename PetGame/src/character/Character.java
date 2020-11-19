package character;

public interface Character {
	public int exp=0;
	public int energy=0;
	public int level=0;
	public int levelExp=0;
	public int fullLevel=0;
	public void eat();
	public void sleep();
	public void play();
	public void train();
	public void levelup();
	public boolean isGameEnd();
	public void printInfo();
}
