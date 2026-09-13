public class PrimeMembers extends Member {

	int JoiningYear;
	int JoiningFees;
	boolean isActive;

	public int getJoiningYear() {
		return JoiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		JoiningYear = joiningYear;
	}

	public int getJoiningFees() {
		return JoiningFees;
	}

	public void setJoiningFees(int joiningFees) {
		JoiningFees = joiningFees;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	public void display() {
		
		System.out.println("NAME : " + getName());
		System.out.println("AGE : " + getAge());
		System.out.println("PHONE NUMBER : " + getPhoneNumber());
		System.out.println("ADDRESS : " + getAddress());
		System.out.println("SALARY : " + getSalary());
		System.out.println("JOINING YEAR : "  + getJoiningYear());
		System.out.println("JOINING FEES : " + getJoiningFees());
		System.out.println("Active" + isActive());
		
		
		
	}

}
