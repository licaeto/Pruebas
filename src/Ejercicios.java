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
            case 1: System.out.println("El area es:\t" + new Circulo().area());
            break;
            case 2: System.out.println("El area es:\t" + new Triangulo().area());
            break;
            case 3: System.out.println("El area es:\t" + new Cuadrado().area());
            break;
        }
    }

    public static void main(String[] args){
        area();
    }
}
