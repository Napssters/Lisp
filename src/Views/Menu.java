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
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Manu
     */
    public Menu() {
        setResizable(false);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/Logo_Lambda.png")).getImage());
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
        jPanel3 = new javax.swing.JPanel();
        LispDocs = new javax.swing.JButton();
        Algoritmos = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        jPanel3.setLayout(null);

        LispDocs.setBackground(new java.awt.Color(255, 255, 255));
        LispDocs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botones/lispDocs.png"))); // NOI18N
        LispDocs.setBorder(null);
        LispDocs.setBorderPainted(false);
        LispDocs.setContentAreaFilled(false);
        LispDocs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LispDocsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LispDocsMouseExited(evt);
            }
        });
        LispDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LispDocsActionPerformed(evt);
            }
        });
        jPanel3.add(LispDocs);
        LispDocs.setBounds(620, 350, 100, 50);

        Algoritmos.setBackground(new java.awt.Color(255, 255, 255));
        Algoritmos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botones/Algoritmos.png"))); // NOI18N
        Algoritmos.setBorder(null);
        Algoritmos.setBorderPainted(false);
        Algoritmos.setContentAreaFilled(false);
        Algoritmos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlgoritmosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlgoritmosMouseExited(evt);
            }
        });
        jPanel3.add(Algoritmos);
        Algoritmos.setBounds(160, 220, 100, 50);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("En esta seccion encontraras 101 algoritmos\ndesarrolados  en   lisp,   con   una  serie  de \nejercicios   que    iran    incrementando  su \ndificultad,   en    los   cuales   se   enseñara \ncomo  programar  en  este  lenguaje");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jPanel3.add(jTextArea1);
        jTextArea1.setBounds(60, 80, 330, 170);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("En esta seccion encontraras 101 algoritmos\ndesarrolados  en   lisp,   con   una  sere  de \nejercicios   que    iran    incrementando  su \ndificultad,  con   los   cuales   se   enseñara \ncomo  programar  en  este  lenguaje");
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea2.setFocusable(false);
        jTextArea2.setOpaque(false);
        jPanel3.add(jTextArea2);
        jTextArea2.setBounds(520, 210, 330, 170);

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel4.setText("Lisp");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(640, 160, 70, 50);

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Documentacion");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(530, 120, 290, 50);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel3.setText("101 Algoritmos");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(90, 20, 270, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menus.png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 880, 460);

        jPanel4.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/marca_UTP.png"))); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(620, 10, 240, 113);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("<html> © 2020 - Universidad Tecnológica de Pereira<br>Carrera 27 #10-02 Barrio Alamos - Risaralda - Colombia - AA: 97<br>Código postal: 660003 - CERES - PBX: +57 6 3137300 - Fax: +57 6 3213206<br>Línea gratuita de Quejas y Reclamos: 018000966781 - contactenos@utp.edu.co<html>");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, -10, 530, 130);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gradiente-azul-azul.png"))); // NOI18N
        jPanel4.add(jLabel9);
        jLabel9.setBounds(0, 0, 910, 130);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
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

    private void AlgoritmosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgoritmosMouseEntered
        Algoritmos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/Algoritmos2.png")));
    }//GEN-LAST:event_AlgoritmosMouseEntered

    private void AlgoritmosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgoritmosMouseExited
        Algoritmos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/Algoritmos.png")));
    }//GEN-LAST:event_AlgoritmosMouseExited

    private void LispDocsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LispDocsMouseEntered
        LispDocs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/lispDocs2.png")));
    }//GEN-LAST:event_LispDocsMouseEntered

    private void LispDocsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LispDocsMouseExited
        LispDocs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/lispDocs.png")));
    }//GEN-LAST:event_LispDocsMouseExited

    private void LispDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LispDocsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LispDocsActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Algoritmos;
    public javax.swing.JButton Inicio;
    public javax.swing.JButton LispDocs;
    private javax.swing.JButton Manual;
    public javax.swing.JButton Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
