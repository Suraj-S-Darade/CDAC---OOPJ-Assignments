public class Employee {

    String empName;
    String empAddress;
    double empSalary;

    public void getData(String name, String address, double salary) {

        this.empName = name;
        this.empAddress = address;
        this.empSalary = salary;
    }

    public void displayData() {

        System.out.println(empName + "\t" + empAddress + "\t" + empSalary);
        
    }
}