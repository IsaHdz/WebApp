package com.mycompany.actividad3;

public class Calculos {
    
    private int num1;
    private int num2;
    private int resultado;
    
    public void Calculos(String base,String altura){
        this.setNum1(Integer.parseInt(base));
        this.setNum2(Integer.parseInt(altura));      
    }
    
    public void calcularArea (){
        int a=(this.getNum1()*this.getNum2())/2;
        this.setResultado(a);
    }
     public void calcularPerimetro (){
        int a=this.getNum1()*3;
        this.setResultado(a);
    }    
    public int getNum1(){
        return num1;
    }
    
    public void setNum1(int num1){
        this.num1 = num1;        
    }
    
    public int getNum2(){
        return num2;
    }
    
    public void setNum2(int num2){
        this.num2 = num2;        
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public void setResultado(int resultado){
        this.resultado = resultado;        
    }
    
}
