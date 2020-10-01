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
 * @author nykoo
 */
public class PseudoCodigo extends javax.swing.JFrame {

    /**
     * Creates new form PseudoCodigo
     */
    public PseudoCodigo() {
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
        Algoritmos = new javax.swing.JButton();
        Manual = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        GoCode = new javax.swing.JButton();
        PsCode = new javax.swing.JTextArea();
        Enunciado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_Lambda.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 54, 60);

        Manual.setOpaque(false);
        Manual.setBackground(new Color(0,0,0,0));
        Algoritmos.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Algoritmos.setForeground(new java.awt.Color(255, 255, 255));
        Algoritmos.setText("Algoritmos");
        Algoritmos.setBorder(null);
        Algoritmos.setContentAreaFilled(false);
        Algoritmos.setDefaultCapable(false);
        Algoritmos.setFocusPainted(false);
        Algoritmos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlgoritmosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlgoritmosMouseExited(evt);
            }
        });
        Algoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgoritmosActionPerformed(evt);
            }
        });
        jPanel2.add(Algoritmos);
        Algoritmos.setBounds(680, 20, 100, 20);

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
        Menu.setBounds(620, 20, 50, 20);

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
        Inicio.setBounds(550, 20, 50, 20);

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel10.setText("Lisp");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(70, 10, 60, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gradiente-azul-azul.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 890, 60);

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
        jLabel9.setBounds(0, 0, 910, 120);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        GoCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botones/GoCode.png"))); // NOI18N
        GoCode.setBorderPainted(false);
        GoCode.setContentAreaFilled(false);
        GoCode.setDefaultCapable(false);
        GoCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GoCodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GoCodeMouseExited(evt);
            }
        });
        jPanel3.add(GoCode);
        GoCode.setBounds(370, 340, 140, 40);

        PsCode.setEditable(false);
        PsCode.setColumns(20);
        PsCode.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        PsCode.setRows(5);
        PsCode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PsCode.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PsCode.setFocusable(false);
        PsCode.setOpaque(false);
        jPanel3.add(PsCode);
        PsCode.setBounds(510, 110, 330, 220);

        Enunciado.setEditable(false);
        Enunciado.setColumns(20);
        Enunciado.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Enunciado.setRows(5);
        Enunciado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Enunciado.setFocusable(false);
        Enunciado.setOpaque(false);
        jPanel3.add(Enunciado);
        Enunciado.setBounds(60, 110, 330, 230);

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel2.setText("Pseudocodigo");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(600, 40, 140, 40);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel3.setText("Enunciado");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(150, 50, 160, 40);

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void AlgoritmosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgoritmosMouseEntered
        Algoritmos.setForeground(Color.gray);
    }//GEN-LAST:event_AlgoritmosMouseEntered

    private void AlgoritmosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgoritmosMouseExited
        Algoritmos.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_AlgoritmosMouseExited

    private void AlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgoritmosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlgoritmosActionPerformed

    private void GoCodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoCodeMouseEntered
        GoCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/GoCode2.png")));
    }//GEN-LAST:event_GoCodeMouseEntered

    private void GoCodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoCodeMouseExited
        GoCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/GoCode.png")));
    }//GEN-LAST:event_GoCodeMouseExited

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
            java.util.logging.Logger.getLogger(PseudoCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PseudoCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PseudoCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PseudoCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PseudoCodigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Algoritmos;
    public javax.swing.JTextArea Enunciado;
    public javax.swing.JButton GoCode;
    public javax.swing.JButton Inicio;
    private javax.swing.JButton Manual;
    public javax.swing.JButton Menu;
    public javax.swing.JTextArea PsCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
