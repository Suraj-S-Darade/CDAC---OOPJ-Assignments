
public class Complex {

	int real;
	int imaginary;

	public Complex(int r1, int i1) {

		real = r1;
		imaginary = i1;

	}

	public void sum(Complex c1, Complex c2) {

		int realSum = c1.real + c2.real;
		int imgSum = c1.imaginary + c2.imaginary;
		
        System.out.println("Sum = " + realSum + " + " + imgSum + "i");

	}

	public void diffrence(Complex c1, Complex c2) {

		int realDiffer = c1.real - c2.real;
		int imgDiffer = c1.imaginary - c2.imaginary;
		
        System.out.println("Difference = " + realDiffer + " + " + imgDiffer + "i");

	}

	public void product(Complex c1, Complex c2) {

		int realProduct = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
		int imgProduct = (c1.real * c2.real) + (c1.imaginary * c2.imaginary);
		
        System.out.println("Product = " + realProduct + " + " + imgProduct + "i");		
	}

}
