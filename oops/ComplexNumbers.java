package oops;

public class ComplexNumbers {
	
	int real;
	int imaginary;
	
	
	public ComplexNumbers(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void plus(ComplexNumbers c) {
		
		int real = this.real+c.real;
		int imaginary = this.imaginary + c.imaginary;
		this.real = real;
		this.imaginary = imaginary;
		
	}
	
	public void multiply(ComplexNumbers c) {
		
		int real = (this.real*c.real) - (this.imaginary*c.imaginary);
		int imaginary = (this.imaginary*c.real) + (this.real*c.imaginary);
		
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void print() {
		System.out.println(this.real + " + i"+this.imaginary);
	}
}
