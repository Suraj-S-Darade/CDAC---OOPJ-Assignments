	class Shape {
	
		void printShape() {
			System.out.println("This is shape");
		}
	}
	
	class rRectangle extends Shape {
	
		void printRectangle() {
			System.out.println("This is rectangular shape");
		}
	}
	
	class Circle extends Shape {
	
		void printCircle() {
			System.out.println("This is circular shape");
		}
	}
	
	class sSquare extends rRectangle {
	
		void printSquare() {
			System.out.println("Square is a rectangle");
		}
	}
	
	
