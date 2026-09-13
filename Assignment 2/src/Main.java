
public class Main {

	public static void main(String[] args) {

//		Student obj = new Student();
//		
//		obj.name = ("JOHN");
//		obj.roll_no = 2;
//		
//		System.out.println("NAME : " + obj.name);
//		System.out.println("ROLL NO : " + obj.roll_no);

//		Triangle obj = new Triangle();
//		
//		int area = obj.Trinagle(3, 4, 5);
//		
//		int parameter = obj.Trinagle(3, 4, 5)/2;
//		
//		System.out.println(area);
//		System.out.println(parameter);

//		Rectangle obj1 = new Rectangle(4,5);
//		Rectangle obj2 = new Rectangle(5,8);
//
//		System.out.println("Area of first rectangle : " + obj1.area());
//		System.out.println("Area of second rectangle : " + obj2.area());

//		System.out.println("Enter real part of first complex number:");
//        int r1 = Console.getInt();
//
//        System.out.println("Enter imaginary part of first complex number:");
//        int i1 = Console.getInt();
//
//        System.out.println("Enter real part of second complex number:");
//        int r2 = Console.getInt();
//
//        System.out.println("Enter imaginary part of second complex number:");
//        int i2 = Console.getInt();
//        
//        
//        Complex c1 = new Complex(r1,i1);
//        Complex c2 = new Complex(r2,i2);
//        
//        Complex obj = new Complex(0,0);
//        
//        obj.sum(c1, c2);
//        obj.diffrence(c1, c2);
//        obj.product(c1, c2);

//		Employee[] empObj = new Employee[3];
//		
//		for(int temp = 0; temp < 3; temp++) {
//			
//			System.out.println("Enter name : ");
//			String name = Console.getInput();
//			
//			System.out.println("Enter address : ");
//			String address = Console.getInput();
//			
//			System.out.println("Enter salary : ");
//			double salary = Console.getInt();
//			
//			empObj[temp] = new Employee();
//					
//	     	empObj[temp].getData(name, address, salary);                  
//			
//	}
//		 System.out.println();
//	     System.out.println("Name\tAddress\t\tSalary");
//	     System.out.println("--------------------------------------");
//
//         for (int i = 0; i < empObj.length; i++) {
//        	 
//        	  empObj[i].displayData();
//        	  
//	     }

		Employeee emp = new Employeee();
		
		emp.getInfo(450, 8);
		emp.addSal();
		emp.addWork();
		emp.displaySalary();

	}

}
