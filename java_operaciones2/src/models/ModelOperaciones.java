/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author PC17
 */
public class ModelOperaciones {
    private int num1= 0;
    private int num2 = 0;
    private int resultado = 0;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
    public void suma(){
        resultado = num1 + num2;
    }
    
    public void resta (){
        resultado = num1 - num2;
    }
    public void multiplicacion(){
        resultado = num1 * num2;
    }
    public void division(){
        resultado = num1 / num2;
    }
    
}
