import java.util.Scanner;

public class Ejercicios {

    private static void area() {
        int figura=0;

        System.out.println("Introduce la figura:\n" +
                "Circulo:\t1\n" +
                "Triangulo:\t2\n" +
                "Cuadrado:\t3"
        );
        Scanner sc = new Scanner(System.in);
        try{
            figura = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Asegurate de introducir el número entero asociado a la figura.");
        }
        switch (figura) {
            case 1: circulo();
            break;
            case 2: triangulo();
            break;
            case 3: cuadrado();
            break;
        }
    }

    private static void circulo() {
        double radio = 0;
        System.out.println("Introduce el radio: ");
        Scanner sc = new Scanner(System.in);
        try{
            radio = sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("Asegurate de introducir un número.");
        }
        System.out.println("El resultado es: "+Math.pow(radio,2)*Math.PI);
    }

    private static void triangulo() {
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
        System.out.println("El resultado es: "+(base*altura)/2);
    }

    private static void cuadrado() {
        double lado = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce el lado: ");
            lado = sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("Asegurate de introducir un número.");
        }
        System.out.println("El resultado es: "+lado*lado);
    }

    public static void main(String[] args){
        area();
    }
}
