package childs;
import parent.*;

public class CEO extends Manager {
	
	private boolean hasCompanyCar = true;
	
		//геттеросеттеры
	public boolean isHasCompanyCar() {
		return hasCompanyCar;
	}
	public void setHasCompanyCar(boolean hasCompanyCar) {
		this.hasCompanyCar = hasCompanyCar;
	}
	
		//конструкторы
	public CEO(boolean hasCompanyCar) {
		this.hasCompanyCar = hasCompanyCar;
	}
	public CEO() {}
	
		//методы
	public void goPublic() {
		System.out.println(" ' Did I allow to enter? Close the door on the other side! ' ");
	}
		@Override
	public void goToVacation() {
		System.out.println("CEO: I will go home, but home in the Miami! :)");
	}
		@Override
	public void goToDayOff() {
		System.out.println("Why should I tell someone the reason of my rest?! It's MY company and I take a day off! ");
	}
}