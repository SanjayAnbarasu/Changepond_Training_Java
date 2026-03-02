package Required;

public class Player {
	private String playername;
	private String playerCountry;
	
	public Player() {
		System.out.println("Default");
		playerCountry = "India";
	}
	
	public Player (String playername) {
		this(); //constructor chaining
		System.out.println("Parameterized");
		this.playername = playername;
	}
	
	public String toString() {
		return "Player [playername = "+playername+","+"playerCountry = " +playerCountry+"]";
	}
	
	public static void main(String[] args) {
		Player p = new Player ("virat");
		System.out.println(p);
	}
}
