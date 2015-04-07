/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Libro;
import modelo.RegistroLibro;
import vista.GUIReporte;
import vista.GUILibro;
import vista.PanelBotones;
import vista.PanelDataLibro;
import vista.Reporte;

/**
 *
 * @author aaron
 */
public class ControlLibro implements ActionListener {
    
    private PanelDataLibro panelData;
    private RegistroLibro registroLibro;
    private PanelBotones panelBotones;
    private GUILibro guiLibro;
    
    public ControlLibro(PanelDataLibro panelDataLibro, PanelBotones panelBotones, RegistroLibro registroLibro,GUILibro guiLibro) {
        
        this.panelData = panelDataLibro;
        this.registroLibro = registroLibro;
        this.panelBotones = panelBotones;
        this.guiLibro=guiLibro;
        
    }
    
    public void actionPerformed(ActionEvent evento) {
        
        if (evento.getActionCommand().equals(PanelBotones.BTN_AGREGAR)) {
            if (panelData.getTxtID().equalsIgnoreCase("")) {
                GUILibro.mensaje("Debe agregar el ID del Libro!");
            } else if (panelData.getTxtAutor().equalsIgnoreCase("")) {
                GUILibro.mensaje("Debe agregar el autor del Libro!");
            } else if (panelData.getTxtEdicion().equalsIgnoreCase("")) {
                GUILibro.mensaje("Debe agregar la edición del Libro!");
            } else if (panelData.getTxtEditorial().equalsIgnoreCase("")) {
                GUILibro.mensaje("Debe agregar la editorial del Libro!");
            } else if (panelData.getTxtTitulo().equalsIgnoreCase("")) {
                GUILibro.mensaje("Debe agregar el título del Libro!");
            } else if (panelData.getTxtCategoria().equalsIgnoreCase("")) {
                GUILibro.mensaje("Debe agregar la categoría del Libro!");
            } else {
                
                GUILibro.mensaje(registroLibro.addBook(
                        new Libro(
                                panelData.getTxtTitulo(),
                                panelData.getTxtAutor(),
                                panelData.getTxtID(),
                                panelData.getTxtEdicion(),
                                panelData.getTxtEditorial(),
                                panelData.getTxtCategoria())
                ));
                panelData.limpiarCampos();
                
            }
            
        }//FIN DEL EVENTO AGREGAR

        if (evento.getActionCommand().equals(PanelDataLibro.BTN_BUSCAR)) {
            
            Libro libro = registroLibro.buscarLibro(panelData.getTxtID());
            if (libro != null) {
                panelData.setTxtAutor(libro.getAutor());
                panelData.setTxtCategoria(libro.getCategoria());
                panelData.setTxtEdicion(libro.getEdicion());
                panelData.setTxtEditorial(libro.getEditorial());
                panelData.setTxtTitulo(libro.getTitulo());
                panelBotones.enableBotones(true);
            } else {
                GUILibro.mensaje("El libro no se encuentra registrado.");
            }
        }
        
        if (evento.getActionCommand().equals(PanelBotones.BTN_MODIFICAR)) {
            panelBotones.enableBotones(false);
        }
        if (evento.getActionCommand().equals(PanelBotones.BTN_ELIMINAR)) {
            
            GUILibro.mensaje(registroLibro.eliminarLibro(panelData.getTxtID()));
            panelData.limpiarCampos();
            panelBotones.enableBotones(false);
            
        }
        if (evento.getActionCommand().equals(PanelBotones.BTN_CONSULTAR)) {
           
            //GUISibdi.mensaje(registroLibro.consultarLibros());
//            GUIReporte reporte=new GUIReporte();
//            reporte.setReporte(registroLibro.consultarLibros());
//            reporte.setVisible(true);
            Reporte reporte=new Reporte();
            reporte.getPanelTabla().llenarTabla(registroLibro.getMatriz(), Libro.getEtiquetas());
            reporte.show();
        }
        if (evento.getActionCommand().equals(PanelBotones.BTN_SALIR)) {
            guiLibro.dispose();
        }
    }
    
}
