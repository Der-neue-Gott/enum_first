package childs;
import parent.*;

public class Manager extends Employee {
	
	private boolean hasStocks = true;
	
		//геттеросеттеры
	public boolean isHasStocks() {
		return hasStocks;
	}
	public void setHasStocks(boolean hasStocks) {
		this.hasStocks = hasStocks;
	}
	
		//конструкторы
	public Manager(boolean hasStocks) {
		this.hasStocks = hasStocks;
	}
	public Manager() {}
	
		//методы
	public void writeProcedures() {
		System.out.println(" ' Did I say I was free? Don't disturb me! ' ");
	}
		@Override
	public void goToVacation() {
		System.out.println("MANAGER: I don't want to have much fun, so I'll go out of town.");
	}
		@Override
	public void goToDayOff() {
		System.out.println("Hi, man! I won't come to work today, cover me on the work!");
	}
	
}