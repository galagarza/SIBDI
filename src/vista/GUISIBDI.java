/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlSIBDI;
import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class GUISIBDI extends javax.swing.JFrame {

    /**
     * Creates new form GUISIBDI
     */
    public GUISIBDI() {
        initComponents();
        ControlSIBDI control=new ControlSIBDI();
        escucharMenu(control);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmRegistros = new javax.swing.JMenu();
        jmiLibros = new javax.swing.JMenuItem();
        jmiPrestamos = new javax.swing.JMenuItem();
        jmiDevolucion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Menu.selectionBackground"));
        jLabel1.setText("SISTEMA DE BIBLIOTECA (SIBDI)");

        jmArchivo.setText("Archivo");

        jmiSalir.setText("Salir");
        jmArchivo.add(jmiSalir);

        barraMenu.add(jmArchivo);

        jmRegistros.setText("Registros");

        jmiLibros.setText("Libros");
        jmRegistros.add(jmiLibros);

        jmiPrestamos.setText("Prestamos");
        jmRegistros.add(jmiPrestamos);

        jmiDevolucion.setText("Devolución");
        jmRegistros.add(jmiDevolucion);

        barraMenu.add(jmRegistros);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 249, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUISIBDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISIBDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISIBDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISIBDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISIBDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmRegistros;
    private javax.swing.JMenuItem jmiDevolucion;
    private javax.swing.JMenuItem jmiLibros;
    private javax.swing.JMenuItem jmiPrestamos;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables

    public void escucharMenu(ActionListener control) {
        this.jmiDevolucion.addActionListener(control);
        this.jmiLibros.addActionListener(control);
        this.jmiPrestamos.addActionListener(control);
        this.jmiSalir.addActionListener(control);
    }

    public static final String MENU_SALIR = "Salir";
    public static final String MENU_LIBRO = "Libros";
    public static final String MENU_PRESTAMO = "Prestamos";
    public static final String MENU_DEVOLUCION = "Devolución";

}
