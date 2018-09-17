import java.util.Scanner;

public class Cuadrado extends Figura{
	protected double lado;
	
    public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
    public double area() {
        return lado*lado;
    }
	
	@Override
	public double perimetro() {
		return 4*lado;
	}
}
