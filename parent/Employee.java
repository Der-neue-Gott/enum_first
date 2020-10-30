package parent;

public abstract class Employee {
	
	private String nameEmployee;
	private int ageEmployee;
	private int salaryEmloyee;
	private Rank ranks;
	
		//геттеросеттеры
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	
	public int getAgeEmployee() {
		return ageEmployee;
	}
	public void setAgeEmployee(int ageEmployee) {
		this.ageEmployee = ageEmployee;
	}
	
	public int getSalaryEmployee() {
		return salaryEmloyee;
	}
	public void setSalaryEmployee(int salaryEmloyee) {
		this.salaryEmloyee = salaryEmloyee;
	}
	
	public Rank getRanks() {
		return ranks;
	}
	public void setRanks(Rank ranks) {
		this.ranks = ranks;
	}
	
	
		//методы
	public void print(String nameEmployee, int ageEmployee, int salaryEmloyee) {
		System.out.println("Name: " + nameEmployee + ", " + ageEmployee + " years old | Salary: " + salaryEmloyee + " dollars");
	}
	public void goToVacation() {}
	
	public abstract void goToDayOff();
	
}