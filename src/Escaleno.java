
public class Escaleno extends Triangulo {
	protected double hipotenusa, cateto;
	
	public Escaleno(double base, double cateto, double hipotenusa) {
		super(base, hipotenusa*cateto/base);
		this.hipotenusa = hipotenusa;
		this.cateto = cateto;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		return hipotenusa + cateto + base;
	}
	
}
