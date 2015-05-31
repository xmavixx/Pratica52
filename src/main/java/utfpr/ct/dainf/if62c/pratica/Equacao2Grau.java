package utfpr.ct.dainf.if62c.pratica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author askoda
 */
public class Equacao2Grau {
    private Number a;
    private Number b;
    private Number c;
    
    public Equacao2Grau(Number a, Number b, Number c) {

        if(a.equals(0))
            throw new java.lang.RuntimeException("Coeficiente a não pode ser zero");

        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    public Number getA() {
        return this.a;
    }
    
    public Number getB() {
        return this.b;
    }
    
    public Number getC() {
        return this.c;
    }
    
    public void setA(Number a) {
        
        if(a.equals(0))
            throw new java.lang.RuntimeException("Coeficiente a não pode ser zero");
        
        this.a = a;
    }
    
    public void setB(Number b) {
        this.b = b;
    }
    
    public void setC(Number c) {
        this.c = c;
    }
    
    public double getRaiz1() {
        double raiz;
        
        if(Math.pow(b.doubleValue(), 2) - 4*a.doubleValue()*c.doubleValue() < 0)
            throw new java.lang.RuntimeException("Equação não tem solução real");
        
        raiz = (-b.doubleValue() + Math.sqrt(Math.pow(b.doubleValue(), 2) - 
                4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue());
        
        return raiz;
    }
    
    public double getRaiz2() {
        double raiz;
        
        if(Math.pow(b.doubleValue(), 2) - 4*a.doubleValue()*c.doubleValue() < 0)
            throw new java.lang.RuntimeException("Equação não tem solução real");
        
        raiz = (-b.doubleValue() - Math.sqrt(Math.pow(b.doubleValue(), 2) - 
                4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue());
        
        return raiz;
    }
    
}
