
public class Pratica52 {
    public static void main(String[] args) {
        
        try {
        Equacao2Grau equacao1 = new Equacao2Grau(1, -3, 2);
        Equacao2Grau equacao2 = new Equacao2Grau(1, -2, 1);
        Equacao2Grau equacao3 = new Equacao2Grau(1, -2, 3);

        
        double raiz1a, raiz1b, raiz2a, raiz2b, raiz3a, raiz3b;
        
        raiz1a = equacao1.getRaiz1();
        raiz1b = equacao1.getRaiz2();
        raiz2a = equacao2.getRaiz1();
        raiz2b = equacao2.getRaiz2();
        raiz3a = equacao3.getRaiz1();
        raiz3b = equacao3.getRaiz2();
        
        } catch(java.lang.RuntimeException invalida) {
            System.out.println(invalida.getLocalizedMessage());
        }
        
    }
}
