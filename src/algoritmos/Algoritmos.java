package algoritmos;

public class Algoritmos {

    public static void quadrado(double n) {
        double r = n * n;
        System.out.println("Quadrado: " + r);
    }

    public static double metade(double v) {
        double r = v / 2;
        return r;
    }

    public static void main(String[] args) {

        System.out.println("Raiz: " + Math.sqrt(15));

        //System.out.println("Quadrado: "+ quadrado(15));
        quadrado(15);

        System.out.println("Metade: " + metade(15));
        
        double raiz;
        
        raiz = Math.sqrt(15);
    }

}
