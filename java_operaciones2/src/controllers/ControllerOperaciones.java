/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelOperaciones;
import views.ViewOperaciones;
/**
 *
 * @author PC17
 */
public class ControllerOperaciones {
    ModelOperaciones model_operaciones;
    ViewOperaciones view_operaciones;
    
    
    public ControllerOperaciones(ModelOperaciones model_operaciones,ViewOperaciones view_operaciones ){
        this.model_operaciones = model_operaciones;
        this.view_operaciones = view_operaciones;
        view_operaciones.jbtn_mas.addActionListener(e-> jbtn_suma_click());
        view_operaciones.jbtn_menos.addActionListener(e-> jbtn_resta_click());
        view_operaciones.jbtn_por.addActionListener(e-> jbtn_multiplicacion_click());
        view_operaciones.jbtn_entre.addActionListener(e-> jbtn_division_click());
        initViews();
    }
    
    public void initViews(){
    view_operaciones.jtf_num1.setText(String.valueOf(model_operaciones.getNum1()));
    view_operaciones.jtf_num2.setText(String.valueOf(model_operaciones.getNum2()));
    view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
    view_operaciones.setVisible(true);
    }
    
    public void jbtn_suma_click(){
        model_operaciones.setNum1(Integer.parseInt(view_operaciones.jtf_num1.getText()));
        model_operaciones.setNum2(Integer.parseInt(view_operaciones.jtf_num2.getText()));
        model_operaciones.suma();
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
    }
    
    public void jbtn_resta_click(){
        model_operaciones.setNum1(Integer.parseInt(view_operaciones.jtf_num1.getText()));
        model_operaciones.setNum2(Integer.parseInt(view_operaciones.jtf_num2.getText()));
        model_operaciones.resta();
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
    }
    
    public void jbtn_multiplicacion_click(){
        model_operaciones.setNum1(Integer.parseInt(view_operaciones.jtf_num1.getText()));
        model_operaciones.setNum2(Integer.parseInt(view_operaciones.jtf_num2.getText()));
        model_operaciones.multiplicacion();
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
    }
    
    public void jbtn_division_click(){
        model_operaciones.setNum1(Integer.parseInt(view_operaciones.jtf_num1.getText()));
        model_operaciones.setNum2(Integer.parseInt(view_operaciones.jtf_num2.getText()));
        model_operaciones.division();
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
    }
}
