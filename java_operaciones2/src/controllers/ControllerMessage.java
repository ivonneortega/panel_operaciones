/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewMessage;
import models.ModelMessage;

public class ControllerMessage implements ActionListener{
    private final ViewMessage viewMessage;
    private final ModelMessage modelMessage;
    
    public ControllerMessage(ViewMessage viewMessage, ModelMessage modelMessage){
        this.viewMessage = viewMessage;
        this.modelMessage = modelMessage;
        this.viewMessage.jbtnHello.addActionListener(this);
        this.viewMessage.jbtnBye.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMessage.jbtnHello)
            jbtnHelloActionPerformed();
        else if(e.getSource()==viewMessage.jbtnBye)
            jbtnByeActionPerformed();
    }
    
    private void jbtnHelloActionPerformed(){
        modelMessage.setMessage("Hello from MVC Panel");
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }
    
    private void jbtnByeActionPerformed(){
        modelMessage.setMessage("Bye from MVC Panel");
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }
    
    private void initView(){
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }
}