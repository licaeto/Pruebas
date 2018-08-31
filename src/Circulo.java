import java.util.Scanner;

import static java.lang.Math.*;

public class Circulo extends Figura {
    @Override
    double area() {
        double radio = 0;
        System.out.println("Introduce el radio: ");
        Scanner sc = new Scanner(System.in);
        try{
            radio = sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("Asegurate de introducir un número.");
        }
        return Math.pow(radio,2)*Math.PI;
    }
}
