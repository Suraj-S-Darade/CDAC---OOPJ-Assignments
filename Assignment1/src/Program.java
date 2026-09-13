public class Program {
	
	public static void main(String[] args) {
		
		Date objDate = new Date();
		System.out.println("Enter the day");
		
		int day = ConsoleInput.getInt();
		System.out.println("Enter the month");
		
		int month = ConsoleInput.getInt();
		System.out.println("Enter the year");
		
		int year = ConsoleInput.getInt();
		objDate.setDate(day, month, year);
		
		int choice = 0;
		while (choice != 5) {
			
			System.out.println();
			System.out.println("1. Add Days");
			System.out.println("2. Add Months");
			System.out.println("3. Add Years");
			System.out.println("4. Display Date");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
	
			choice = ConsoleInput.getInt();
			
			if (choice == 1) {
				
				System.out.println("Enter days");
				int days = ConsoleInput.getInt();
				
				objDate.addDays(days);
				
			} else if (choice == 2) {
				System.out.println("Enter months");
				int months = ConsoleInput.getInt();
				
				objDate.addMonths(months);
				
			} else if (choice == 3) {
				
				System.out.println("Enter years");
				int years = ConsoleInput.getInt();
				
				objDate.addYears(years);
				
			} else if (choice == 4) {
				
				System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
				
			} else if (choice == 5) {
				
				System.out.println("Program ended");
				
			} else {
				System.out.println("Invalid choice");
			}
		}
	}
}