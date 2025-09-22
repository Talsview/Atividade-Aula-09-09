public class Main {
    public static void main(String[] args) {
        
        Forma[] formas = new Forma[3];

        formas[0] = new Circulo(5.0);    
        formas[1] = new Quadrado(4.0);   
        formas[2] = new Retangulo(6.0, 3.0); 

        
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}