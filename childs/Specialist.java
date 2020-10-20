package childs;
import parent.*;

public class Specialist extends Employee {
	
	private int levels = 1;
	
		//геттеросеттеры
	public int getLevels() {
		return levels;
	}
	public void setLevels (int levels) {
		this.levels = levels;
	}
	
		//конструкторы
	public Specialist(int levels) {
		this.levels = levels;
	}
	public Specialist() {}
	
		//методы
	public void workWithClients() {
		System.out.println(" ' I am so busy of too many clients I have! ' ");
	}
		@Override
	public void goToVacation() {
		System.out.println("SPEC: I don't have enough money for my vacation, so I'll take time off.");
	}
		@Override
	public void goToDayOff() {
		System.out.println("Sir, I would like to take day off.");
	}

}