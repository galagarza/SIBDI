/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroLibro;
import vista.GUILibro;
import vista.GUISIBDI;

/**
 *
 * @author aaron
 */
public class ControlSIBDI implements ActionListener{
    
    private RegistroLibro registroLibro;
    
    public ControlSIBDI(){
        registroLibro=new RegistroLibro();
    }

    public void actionPerformed(ActionEvent evento) {
        if(evento.getActionCommand().equalsIgnoreCase(GUISIBDI.MENU_LIBRO)){
            GUILibro guiLibro=new GUILibro(registroLibro);
            guiLibro.show();
        }
    }
    
}
