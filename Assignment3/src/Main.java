
public class Main {

	public static void main(String[] args) {

//		Parent objParent = new Parent();
//		objParent.parent();
//		
//		Child objChild = new Child();
//		objChild.child();
//		
//		Parent objP = new Child();
//		objP.parent();

//		PrimeMembers objPrime = new PrimeMembers();
//		
//		System.out.println("Enter Name : ");
//		String name = Console.getString();
//
//		System.out.println("Enter Age : ");
//		int age = Console.getInt();
//
//		System.out.println("Enter Phone Number : ");
//		int phoneNumber = Console.getInt();
//
//		System.out.println("Enter Address : ");
//		String address = Console.getString();
//
//		System.out.println("Enter Salary : ");
//		int salary = Console.getInt();
//
//		System.out.println("Enter Joining Year : ");
//		int joiningYear = Console.getInt();
//
//		System.out.println("Enter Joining Fees : ");
//		int joiningFees = Console.getInt();
//
//		System.out.println("Enter Active Status (true/false) : ");
//		boolean isActive = Console.getBoolean();
//
//
//		objPrime.setName(name);
//		objPrime.setAge(age);
//		objPrime.setPhoneNumber(phoneNumber);
//		objPrime.setAddress(address);
//		objPrime.setSalary(salary);
//		objPrime.setJoiningYear(joiningYear);
//		objPrime.setJoiningFees(joiningFees);
//		objPrime.setActive(isActive);
//		
//		objPrime.display();

//		Rectangle objRect = new Rectangle(3,4);
//		
//		System.out.println("RECTANGLE : ");
//		objRect.printArea();
//		objRect.printPerimeter();
//				
//		System.out.println("==================================");
//		Square objSquare = new Square(5);
//		
//		System.out.println("SQUARE : ");
//		objSquare.printArea();
//		objSquare.printPerimeter();

//		 sSquare objSquare = new sSquare();
//
//	        objSquare.printShape();
//
//	        objSquare.printRectangle();
//
//	        objSquare.printSquare();

		EmpLoyee employeeObj[] = new EmpLoyee[10];

		int count = 0;
		int currentIndex = -1;

		int choice;

		do {

			System.out.println("\n1. Add an Employee");
			System.out.println("2. Display");
			System.out.println("3. Exit");

			choice = Console.getInt();

			switch (choice) {

			case 1:

				int employeeChoice;

				System.out.println("\n1. Manager");
				System.out.println("2. Engineer");
				System.out.println("3. Sales Person");
				System.out.println("4. Exit to Main Menu");

				employeeChoice = Console.getInt();

				if (employeeChoice == 1) {

					int id = Console.getInt();
					String name = Console.getString();
					double salary = Console.getDouble();
					double bonus = Console.getDouble();

					employeeObj[count] = new Manager(id, name, salary, bonus);

					count++;
				}

				else if (employeeChoice == 2) {

					int id = Console.getInt();
					String name = Console.getString();
					double salary = Console.getDouble();
					String technology = Console.getString();

					employeeObj[count] = new Engineer(id, name, salary, technology);

					count++;
				}

				else if (employeeChoice == 3) {

					int id = Console.getInt();
					String name = Console.getString();
					double salary = Console.getDouble();
					double sales = Console.getDouble();

					employeeObj[count] = new SalesPerson(id, name, salary, sales);

					count++;
				}

				break;

			case 2:

				int displayChoice;

				System.out.println("\n1. All Employees");
				System.out.println("2. First Employee");
				System.out.println("3. Next Employee");
				System.out.println("4. Previous Employee");
				System.out.println("5. Last Employee");
				System.out.println("6. Exit to Main Menu");

				displayChoice = Console.getInt();

				if (displayChoice == 1) {

					for (int iTemp = 0; iTemp < count; iTemp++) {

						employeeObj[iTemp].display();

						System.out.println();
					}

					currentIndex = 0;
				}

				else if (displayChoice == 2) {

					if (count > 0) {

						currentIndex = 0;

						employeeObj[currentIndex].display();
					}
				}

				else if (displayChoice == 3) {

					if (currentIndex < count - 1) {

						currentIndex++;

						employeeObj[currentIndex].display();
					}
				}

				else if (displayChoice == 4) {

					if (currentIndex > 0) {

						currentIndex--;

						employeeObj[currentIndex].display();
					}
				}

				else if (displayChoice == 5) {

					if (count > 0) {

						currentIndex = count - 1;

						employeeObj[currentIndex].display();
					}
				}

				break;

			case 3:

				System.out.println("Program exited");

				break;

			default:

				System.out.println("Invalid choice");
			}

		} while (choice != 3);

	}

}
