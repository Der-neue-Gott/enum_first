import parent.*;
import childs.*;

public class Main {
	
		public static void printDeveloperGrade(Employee employee) {
			
			employee.getRanks().printPhrase();
			
		}
	
	public static void main(String[] args) {
		
		/* System.out.println("\t Today is Birthday of the Company!");
		Employee[] employees = { new CEO(), 
						   new Manager(), new Manager(), new Developer(), 
						   new Developer(), new Developer(), new Developer(), 
						   new Specialist(), new Specialist(), new Specialist() };
		
		
		for (Employee employee: employees) {
			employee.goToVacation();
			employee.goToDayOff();
			System.out.println();
		} */
		
		Employee[] developers = { new Developer(Rank.JUNIOR), new Developer(Rank.MIDDLE), 
								new Developer(Rank.SENIOR), new Developer(Rank.TEAMLEAD) };
		
		for (Employee employee: developers) {
			printDeveloperGrade(employee);
		}
	
	}
}