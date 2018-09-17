
public class Equilatero extends Triangulo{
	
	public Equilatero(double base) {
		super(base,Math.sqrt(Math.pow(base, 2)-Math.pow(base/2, 2)));
	}

	@Override 
	public double perimetro() {
		return 3*base;
	}
}
