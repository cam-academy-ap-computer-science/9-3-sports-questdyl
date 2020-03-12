
public class Player {
	private String name;
	public String sport;
	private double weight;
	private int wins;
	private int losses;
	
	public Player(String n, String s, double kg, int w, int l) {
		name = n;
		sport = s;
		weight = kg;
		wins = w;
		losses = l;
	}
	
	public String toString() {
		return ("Name: " + name + 
				"\nSport: " + sport +
				"\nWeight: " + weight + 
				"\nWin/Lose Ratio: " + wins + "/" + losses);
	}
}
