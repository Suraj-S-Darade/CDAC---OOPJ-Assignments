public class GetINdex {

	public static void main(String args[]) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) != ' ') {
				
				System.out.println(str.charAt(i) + " " + i);

			}
		}
		
	}
	
}
