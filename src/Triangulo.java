import java.util.Scanner;

public abstract class Triangulo extends Figura {
	protected double base, altura;
	
    public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
    public double area() {
        return (base*altura)/2;
    }
	
	@Override
	public abstract double perimetro();
}
