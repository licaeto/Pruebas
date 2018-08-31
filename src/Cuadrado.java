import java.util.Scanner;

public class Cuadrado extends Figura{
    @Override
    double area() {
        double lado = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce el lado: ");
            lado = sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("Asegurate de introducir un número.");
        }
        return lado*lado;
    }
}
