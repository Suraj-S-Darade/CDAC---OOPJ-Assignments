public class Rectangle {

	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
		
	}

	void printArea() {
		
		System.out.println("Area : " + (length * breadth));
		
	}

	void printPerimeter() {
		
		System.out.println("Perimeter : " + (2 * (length + breadth)));
		
	}

}
