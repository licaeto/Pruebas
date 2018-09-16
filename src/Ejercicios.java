import java.util.*;

public class Ejercicios {

    public static void area() {
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

    public static void iterator(){
       LinkedList<Integer> list = new LinkedList<Integer>();
       for(int i=0; i<3; i++) list.add(i+1);
       ListIterator<Integer> iterator = list.listIterator(0);
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
       while(iterator.hasPrevious()){
           System.out.println(iterator.previous());
       }

    }

    public static void loop(int m) {
    	int i = 0; 
    	int n = m;
    	for(i=0; i<n; i++) n--;	
    	System.out.println(i);
    }
    
    public static int raiz(int n) {
    	int m=0;
    	while(m*m < n) m++;
    	return m;
    }
    
    public static void division(int a, int b) {
    	int c=0;
    	int r=0;
    	int x=a;
    	
    	while(x > 0) {
    		x=x-b;
    		c++;
    	}
    	
    	r=a-b*c;
    	System.out.println("[Cociente: "+c+", Resto: "+r+"]");
    }
    
    public static int potencia(int a, int n) {
    	int res=1;
    	for(int i=n; i>0; i--)
    		res=res*a;	
    	return res;	
    }
    
    public static int resta(int x, int y) {
    	int res=x;
    	for(int i=y; i>0; i--) {
    		res--;
    	}
    	return res;
    }
    
    public static void spell(String s) {
    	int n = s.length();
    	for(int i=0; i<n; i++) System.out.println(s.charAt(i));
    }
    
    public static String naturales(int n) {
    	String res = "";
    	if(n == 1) {
    		res = "1";
    	}
    	else {
    		res = naturales(n-1)+", "+n;
    	}
    	return res;
   
    }
    
    public static String naturalesDesc(int n) {
    	String res="";
    	if(n==1) res="1";
    	else res = n+", "+naturalesDesc(n-1);
    	return res;
    }
    
    public static int divisionEnt(int a, int b) {
    	int res;
    	if(a < b) res = 0;
    	else res = divisionEnt(a-b,b)+1;
    	return res;
    }
    
    public static int producto(int a, int b) {
    	int res;
    	if(b==0) res=0;
    	else res=producto(a,b-1)+a;
    	return res;
    }
    
    public static int sumaDig(int n) {
    	int res;
    	if(n/10==0) res=n;
    	else res=sumaDig(n/10)+n%10;
    	return res;
    }
    
    public static boolean esPrefijo(String s1, String s2) {
    	if(s1.length()==0) return false;
    	else return s1.equals(s2) || esPrefijo(s1.substring(0, s1.length()-1),s2);
    }
    
    public static boolean esSubcadena(String s1, String s2) {
    	int n = s2.length();
    	if(s1.length() < s2.length()) return false;
    	else return s1.substring(0, n).equals(s2) || esSubcadena(s1.substring(1,s1.length()),s2);
    }
    
    public static void main(String[] args){
        System.out.println(esSubcadena("hola","ol"));
    }
}
