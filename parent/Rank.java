package parent;

public enum Rank {
	
	JUNIOR ("I am a Junior of the Company!"),
	MIDDLE ("I am a Mid-Tier developer!"),
	SENIOR ("I am looking after Juniors and Mid-Tiers!"),
	TEAMLEAD ("I lead the entire development team!");
	
	String phrase;
	
	Rank (String phrase) {
		this.phrase = phrase;
	}
	
	public void printPhrase() {
		System.out.println(this.phrase);
	}
	
}