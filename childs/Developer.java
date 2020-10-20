package childs;
import parent.*;

public class Developer extends Employee {
	
	private Rank ranks;
	
		//геттеросеттеры
	public Rank getRanks() {
		return ranks;
	}
	public void setRanks(Rank ranks) {
		this.ranks = ranks;
	}
	
		//конструкторы
	public Developer(Rank ranks) {
		this.ranks = ranks;
	}
	public Developer() {}
	
		//методы
	public void writeCode() {
		System.out.println(" ' I would like to answer you, but I can't understand where I missed one symbol.. ' ");
	}
		@Override
	public void goToVacation() {
		System.out.println("DEV: I would like to travel. Don't expect me in the next month!");
	}
		@Override
	public void goToDayOff() {
		System.out.println("I take a day off, because I have my Birthday party on evening.");
	}
	
}