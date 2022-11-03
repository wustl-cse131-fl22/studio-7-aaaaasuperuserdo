package studio7;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {


	public static double Area(double width, double length) {

		return width*length;

	}

	public static double perimeter(double width, double length)
	{
		return 2*(length+width);
	}

	public static void draw(double xcor, double ycor, double width, double length) {

		double halfwidth = 0.5*width;
		double halflength = 0.5*length;

		StdDraw.rectangle(xcor, ycor, halfwidth, halflength);


	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is the width of your rectangle?");
		double width = in.nextDouble();
		System.out.println("Length of your rectangle?");
		double length = in.nextDouble();
		System.out.println("X coords?");
		double xcor = in.nextDouble();
		System.out.println("Y coords?");
		double ycor = in.nextDouble();

		double area=	Area(width, length);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter(width,length));
		draw(xcor, ycor, width, length);
	}


}
