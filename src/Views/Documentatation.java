/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Niko
 */
public class Documentatation extends javax.swing.JFrame {

    /**
     * Creates new form Exercices
     */
    public Documentatation() {
        setResizable(false);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/Logo_Lambda.png")).getImage());
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Manual = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        jTextArea5 = new javax.swing.JTextArea();
        jTextArea6 = new javax.swing.JTextArea();
        jTextArea7 = new javax.swing.JTextArea();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        comentarios = new javax.swing.JButton();
        control = new javax.swing.JButton();
        logicas = new javax.swing.JButton();
        matematicas = new javax.swing.JButton();
        funciones = new javax.swing.JButton();
        listas = new javax.swing.JButton();
        lectura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_Lambda.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 54, 60);

        Manual.setOpaque(false);
        Manual.setBackground(new Color(0,0,0,0));
        Manual.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Manual.setForeground(new java.awt.Color(255, 255, 255));
        Manual.setText("Manual");
        Manual.setBorder(null);
        Manual.setContentAreaFilled(false);
        Manual.setDefaultCapable(false);
        Manual.setFocusPainted(false);
        Manual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManualMouseExited(evt);
            }
        });
        Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualActionPerformed(evt);
            }
        });
        jPanel2.add(Manual);
        Manual.setBounds(790, 20, 60, 23);

        Manual.setOpaque(false);
        Manual.setBackground(new Color(0,0,0,0));
        Menu.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menu");
        Menu.setBorder(null);
        Menu.setContentAreaFilled(false);
        Menu.setDefaultCapable(false);
        Menu.setFocusPainted(false);
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
        });
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel2.add(Menu);
        Menu.setBounds(720, 20, 50, 20);

        Manual.setOpaque(false);
        Manual.setBackground(new Color(0,0,0,0));
        Inicio.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("Inicio");
        Inicio.setBorder(null);
        Inicio.setContentAreaFilled(false);
        Inicio.setDefaultCapable(false);
        Inicio.setFocusPainted(false);
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioMouseExited(evt);
            }
        });
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel2.add(Inicio);
        Inicio.setBounds(650, 20, 50, 20);

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel10.setText("Lisp");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(70, 10, 60, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gradiente-azul-azul.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 890, 60);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/marca_UTP.png"))); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(620, 10, 234, 113);

        jLabel12.setText("<html> © 2020 - Universidad Tecnológica de Pereira<br>Carrera 27 #10-02 Barrio Alamos - Risaralda - Colombia - AA: 97<br>Código postal: 660003 - CERES - PBX: +57 6 3137300 - Fax: +57 6 3213206<br>Línea gratuita de Quejas y Reclamos: 018000966781 - contactenos@utp.edu.co<html>");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 0, 530, 120);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gradiente-azul-azul.png"))); // NOI18N
        jPanel4.add(jLabel9);
        jLabel9.setBounds(0, 0, 900, 130);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel2.setText("Documentación LISP");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(260, 50, 410, 80);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("En  esta  sección  se  encontrará  la  información  requerida para aprender a programar en el \nleguaje Lisp, se explicará de manera concisa el uso y aplicación de las palabras reservadas del \n                     lenguaje, se dará una explicación tanto escrita como ilustrativa.");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jPanel5.add(jTextArea1);
        jTextArea1.setBounds(100, 130, 690, 80);

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lectura y Escritura");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(60, 650, 230, 40);

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Expresiones Matematicas");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(600, 650, 220, 40);

        jLabel14.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Definición de Funciones");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(60, 1090, 230, 40);

        jLabel16.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Estructuras Lógicas");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(320, 870, 230, 40);

        jLabel17.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Comentarios");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(330, 450, 210, 40);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("En  esta  sección  se  explicará  que son\n     y como definir funciones en Lisp");
        jTextArea3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea3.setFocusable(false);
        jTextArea3.setOpaque(false);
        jPanel5.add(jTextArea3);
        jTextArea3.setBounds(60, 1120, 240, 70);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("En  esta  sección  se explicará la forma\ncorrecta  y  adecuada de como mostrar\ninformación por pantalla, así mismo de\n   como leer información por teclado\n");
        jTextArea4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea4.setFocusable(false);
        jTextArea4.setOpaque(false);
        jPanel5.add(jTextArea4);
        jTextArea4.setBounds(60, 680, 250, 90);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("En esta sección se explicará los diferentes\nmétodos  para  crear comentarios en Lisp\n");
        jTextArea5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea5.setFocusable(false);
        jTextArea5.setOpaque(false);
        jPanel5.add(jTextArea5);
        jTextArea5.setBounds(320, 480, 240, 50);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setText("En  esta  sección se explicará las funciones\nque permiten realizar diversas operaciones\n                      aritméticas.\n");
        jTextArea6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea6.setFocusable(false);
        jTextArea6.setOpaque(false);
        jPanel5.add(jTextArea6);
        jTextArea6.setBounds(590, 680, 250, 70);

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextArea7.setRows(5);
        jTextArea7.setText("En  esta  sección  se  explicará  qué son los\ntipos de datos boleanos, así mismo se dara\na   conocer   las   funciones   basiscas   del\n                        lenguaje");
        jTextArea7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea7.setFocusable(false);
        jTextArea7.setOpaque(false);
        jPanel5.add(jTextArea7);
        jTextArea7.setBounds(320, 900, 246, 90);

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextArea8.setRows(5);
        jTextArea8.setText("En  esta  sección  se  explicará que son\nlas estructuras de control, que tipos se \n        pueden usar y como usarlos");
        jTextArea8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea8.setFocusable(false);
        jTextArea8.setOpaque(false);
        jPanel5.add(jTextArea8);
        jTextArea8.setBounds(600, 1120, 240, 70);

        jLabel19.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Estructuras de Control");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(600, 1090, 220, 40);

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextArea9.setRows(5);
        jTextArea9.setText("En  esta  sección  se  explicará de forma\nfacil e  ilustrativa que  y como funcionan \n                 las listas en Lisp");
        jTextArea9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea9.setFocusable(false);
        jTextArea9.setOpaque(false);
        jPanel5.add(jTextArea9);
        jTextArea9.setBounds(330, 1360, 240, 80);

        jLabel21.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Listas");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(330, 1330, 220, 40);

        comentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Documentacion/Comentarios.png"))); // NOI18N
        comentarios.setBorderPainted(false);
        comentarios.setContentAreaFilled(false);
        jPanel5.add(comentarios);
        comentarios.setBounds(330, 240, 220, 223);

        control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Documentacion/estructuras de control.png"))); // NOI18N
        control.setBorderPainted(false);
        control.setContentAreaFilled(false);
        jPanel5.add(control);
        control.setBounds(600, 880, 220, 220);

        logicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Documentacion/logicas.png"))); // NOI18N
        logicas.setBorderPainted(false);
        logicas.setContentAreaFilled(false);
        jPanel5.add(logicas);
        logicas.setBounds(330, 660, 220, 220);

        matematicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Documentacion/matematicas.png"))); // NOI18N
        matematicas.setBorderPainted(false);
        matematicas.setContentAreaFilled(false);
        jPanel5.add(matematicas);
        matematicas.setBounds(600, 440, 220, 220);

        funciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Documentacion/funciones.png"))); // NOI18N
        funciones.setBorderPainted(false);
        funciones.setContentAreaFilled(false);
        jPanel5.add(funciones);
        funciones.setBounds(60, 880, 220, 223);

        listas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Documentacion/Listas.png"))); // NOI18N
        listas.setBorderPainted(false);
        listas.setContentAreaFilled(false);
        jPanel5.add(listas);
        listas.setBounds(330, 1120, 220, 220);

        lectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu Documentacion/lectura.png"))); // NOI18N
        lectura.setBorderPainted(false);
        lectura.setContentAreaFilled(false);
        jPanel5.add(lectura);
        lectura.setBounds(60, 440, 220, 220);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManualMouseEntered
        Manual.setForeground(Color.gray);
    }//GEN-LAST:event_ManualMouseEntered

    private void ManualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManualMouseExited
        Manual.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_ManualMouseExited

    private void ManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualActionPerformed
        /*try {
            File path = new File ("src/View/Manual.pdf");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_ManualActionPerformed

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        Menu.setForeground(Color.gray);
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        Menu.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_MenuMouseExited

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuActionPerformed

    private void InicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseEntered
        Inicio.setForeground(Color.gray);
    }//GEN-LAST:event_InicioMouseEntered

    private void InicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseExited
        Inicio.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_InicioMouseExited

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioActionPerformed

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
            java.util.logging.Logger.getLogger(Documentatation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documentatation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documentatation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documentatation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Documentatation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Inicio;
    private javax.swing.JButton Manual;
    public javax.swing.JButton Menu;
    public javax.swing.JButton comentarios;
    public javax.swing.JButton control;
    public javax.swing.JButton funciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    public javax.swing.JButton lectura;
    public javax.swing.JButton listas;
    public javax.swing.JButton logicas;
    public javax.swing.JButton matematicas;
    // End of variables declaration//GEN-END:variables
}
