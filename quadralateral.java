import java.util.*;

abstract class Quadralateal {
	int Height,side,length, breadth,base,base1,base2,diagonal1,diagonal2;
	Scanner input = new Scanner(System.in);

	abstract void printArea();

}

class Rectangle extends Quadralateal {
	void printArea() {
		System.out.println("*** Finding the Area of Rectangle ***");
		System.out.print("Enter length and breadth: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}
}

class square extends Quadralateal {
	void printArea() {
		System.out.println("\n*** Finding the Area of square ***");
		System.out.print("Enter side: ");
		side = input.nextInt();
		System.out.println("The area of square is: " + side * side);
	}
}

class parallelogram extends Quadralateal {
	void printArea() {
		System.out.println("\n*** Finding the Area of parallelogram ***");
		System.out.print("Enter base and Height: ");
		base = input.nextInt();
		Height = input.nextInt();
		System.out.println("The area of parallelogram is: " + base * Height);
	}
}
class trapezium extends Quadralateal {
	void printArea() {
		System.out.println("\n*** Finding the Area of trapezium ***");
		System.out.print("Enter base1: ");
		System.out.print("Enter base2: ");
		System.out.print("Enter Height: "); 
		base1 = input.nextInt();
		base2 = input.nextInt();
		Height = input.nextInt();
		System.out.println("The area of trapezium is: " + (base1 + base2 * Height) / 2);
	}
}
class Rhombus extends Quadralateal {
	void printArea() {
		System.out.println("\n*** Finding the Area of Rhombus ***");
		System.out.print("Enter diagonal1: ");
		System.out.print("Enter diagonal2: ");
		diagonal1 = input.nextInt();
		diagonal2 = input.nextInt();
        System.out.println("The area of Rhombus is: " + (diagonal1 + diagonal2) / 2);
	}
}
public class Main {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea();

	    square squa	 = new square();
		squa.printArea();
		
		parallelogram parallel = new parallelogram();
		parallel.printArea();
		
		trapezium trap = new trapezium();
		trap.printArea();
		
		Rhombus rhom = new Rhombus();
		rhom.printArea();
	
	}
}

