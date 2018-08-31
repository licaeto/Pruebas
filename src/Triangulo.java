import java.util.Scanner;

public class Triangulo extends Figura {
    @Override
    double area() {
        double base = 0;
        double altura = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce la base: ");
            base = sc.nextDouble();
            System.out.println("Introduce la altura: ");
            altura = sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("Asegurate de introducir un número.");
        }
        return (base*altura)/2;
    }
}
