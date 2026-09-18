
public class CheckStr {

	public static void main(String[] args) {

		String str1 = "Python Exercises";
		String str2 = "Python Exercise";
		
		String last1 = str1.substring(str1.length() - 2);
		String last2 = str2.substring(str2.length() - 2);
		
		
		if(last1.equals(last2)) {
			System.out.println(str1 + " ends with " + last1 + " " + str1.endsWith(last2));
		}else {
			System.out.println(str2 + " ends with " + last2 + " " + str1.endsWith(last2));
		}
				
	}

}
