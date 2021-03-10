package ecuacionescuadraticas;
import java.util.Scanner;
public class EcuacionesCuadraticas {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int a,b,c,igual;
        System.out.println("Ingresa el valor de a(x^2)");
        a=teclado.nextInt();
        System.out.println("Ingresa el valor de b(x)");
        b=teclado.nextInt();
        System.out.println("Ingresa el valor de c(termino independiente)");
        c=teclado.nextInt();
        System.out.println("Todo esto es igual a:");
        igual=teclado.nextInt();
        c=c-igual;
        System.out.println("Resolucion por formula general:");
        FormulaGeneral(a,b,c);
        System.out.println("Resolucion por el metodo de Po-Shen Loh");
        PoShenLoh(a,b,c);
    }
    
    public static void FormulaGeneral(int a,int b,int c){
        double ac,x1,x2;
        ac=(Math.pow(b,2))-(4*(a)*(c));
        if(ac<0){
            System.out.println("El problema no tiene solucion");
        }
        else{
            x1=(-(b)+Math.sqrt(ac))/(2*(a));
            x2=(-(b)-Math.sqrt(ac))/(2*(a));
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
    }
    public static void PoShenLoh(int a,int b,int c){
        double ac=(Math.pow(b,2))-(4*(a)*(c));
        if(ac<0){
            System.out.println("El problema no tiene solucion");
        }
        else{
            double b1=b/a;
            double c1=c/a;
            double p=-(b1)/2;
            double u=Math.sqrt((c1-(Math.pow(p, 2)))*-1);
            double x1=p+u;
            double x2=p-u;
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);  
        }
        
    }
    
}
