class EmpLoyee {

	private int id;
	private String name;
	private double salary;

	EmpLoyee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

class Manager extends EmpLoyee {

	private double bonus;

	Manager(int id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public void display() {
		super.display();
		System.out.println("Bonus: " + bonus);
	}
}

class Engineer extends EmpLoyee {

	private String technology;

	Engineer(int id, String name, double salary, String technology) {
		super(id, name, salary);
		this.technology = technology;
	}

	public void display() {
		super.display();
		System.out.println("Technology: " + technology);
	}
}

class SalesPerson extends EmpLoyee {

	private double sales;

	SalesPerson(int id, String name, double salary, double sales) {
		super(id, name, salary);
		this.sales = sales;
	}

	public void display() {
		super.display();
		System.out.println("Sales: " + sales);
	}
}

