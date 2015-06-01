package utfpr.ct.dainf.if62c.pratica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitholken
 */
public class Equacao2Grau <T extends Number> {
    private T a;
    private T b;
    private T c;
    
    public Equacao2Grau(T a, T b, T c) {

        if(a.doubleValue() == 0.0)
            throw new RuntimeException("Coeficiente a não pode ser zero");

        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    public T getA() {
        return this.a;
    }
    
    public T getB() {
        return this.b;
    }
    
    public T getC() {
        return this.c;
    }
    
    public void setA(T a) {
        
        if(a.doubleValue() == 0.0)
            throw new RuntimeException("Coeficiente a não pode ser zero");
        
        this.a = a;
    }
    
    public void setB(T b) {
        this.b = b;
    }
    
    public void setC(T c) {
        this.c = c;
    }
    
    public double getRaiz1() {
        double raiz;
        
        if(Math.pow(b.doubleValue(), 2) - 4*a.doubleValue()*c.doubleValue() < 0)
            throw new RuntimeException("Equação não tem solução real");
        
        raiz = (-1*b.doubleValue() + Math.sqrt(Math.pow(b.doubleValue(), 2) - 
                4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue());
        
        return raiz;
    }
    
    public double getRaiz2() {
        double raiz;
        
        if(Math.pow(b.doubleValue(), 2) - 4*a.doubleValue()*c.doubleValue() < 0)
            throw new RuntimeException("Equação não tem solução real");
        
        raiz = (-1*b.doubleValue() - Math.sqrt(Math.pow(b.doubleValue(), 2) - 
                4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue());
        
        return raiz;
    }
    
}
