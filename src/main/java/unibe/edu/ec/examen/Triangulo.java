package unibe.edu.ec.examen;

public class Triangulo {
	public double side;
	public  double height;
	
	public Triangulo(double side, double height) {
		super();
		this.side = side;
		this.height = height;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double perimeter ()  {
		return this.side + this.side +this.side;
	
	}
	public double area (double height) {
		return (this.side*height)/2;
	}
	public double volume (double side, double height) {
		return 1*(side*side*height)/3;
		
	}

}
