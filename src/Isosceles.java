
public class Isosceles extends Triangulo {
	protected double lado;
	
	public Isosceles(double base, double lado) {
		super(base, Math.sqrt(Math.pow(lado, 2)-Math.pow(base/2, 2)));
		this.lado = lado;
	}

	@Override
	public double perimetro() {		
		return 2*lado + base;
	}

}
