import java.util.Scanner;

import static java.lang.Math.*;

public class Circulo extends Figura {
	protected double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
        return Math.pow(radio,2)*Math.PI;
    }
	
	@Override
	public double perimetro() {
		return 2*Math.PI*radio;
	}
}
