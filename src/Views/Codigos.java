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
public class Codigos extends javax.swing.JFrame {

    /**
     * Creates new form Codigos
     */
    
    public int count = 0;
    
    public Codigos() {
        setResizable(false);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/Logo_Lambda.png")).getImage());
        jScrollPane5.getVerticalScrollBar().setUnitIncrement(16);
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
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        numero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Variables = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Explicacion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        CodigoFuente = new javax.swing.JTextArea();
        Run = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();

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

        jPanel16.setLayout(null);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/marca_UTP.png"))); // NOI18N
        jPanel16.add(jLabel22);
        jLabel22.setBounds(620, 10, 234, 113);

        jLabel23.setText("<html> © 2020 - Universidad Tecnológica de Pereira<br>Carrera 27 #10-02 Barrio Alamos - Risaralda - Colombia - AA: 97<br>Código postal: 660003 - CERES - PBX: +57 6 3137300 - Fax: +57 6 3213206<br>Línea gratuita de Quejas y Reclamos: 018000966781 - contactenos@utp.edu.co<html>");
        jPanel16.add(jLabel23);
        jLabel23.setBounds(10, 0, 530, 120);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gradiente-azul-azul.png"))); // NOI18N
        jPanel16.add(jLabel24);
        jLabel24.setBounds(0, 0, 900, 130);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(null);

        numero.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        numero.setText("#");
        jPanel17.add(numero);
        numero.setBounds(500, 50, 200, 40);

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://www.youtube.com/watch?v=qKTsxuqvvJQ&ab_channel=LaCapital")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel4.setText("Algoritmo:");
        jPanel17.add(jLabel4);
        jLabel4.setBounds(380, 50, 120, 40);

        Variables.setEditable(false);
        Variables.setColumns(20);
        Variables.setRows(5);
        Variables.setText("Aqui van las lineas de codigo \ncorrespodniente a la linea en \nejecicion");
        Variables.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Variables.setFocusable(false);
        jScrollPane1.setViewportView(Variables);

        jPanel17.add(jScrollPane1);
        jScrollPane1.setBounds(510, 140, 330, 130);

        Explicacion.setColumns(20);
        Explicacion.setRows(5);
        Explicacion.setText("Aqui va la explicacion de las palabras\nreservadas usadas");
        Explicacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(Explicacion);

        jPanel17.add(jScrollPane2);
        jScrollPane2.setBounds(510, 290, 330, 130);

        Salida.setEditable(false);
        Salida.setColumns(20);
        Salida.setRows(5);
        Salida.setText("Aqui van las salidas del codigo al \najecutarse");
        Salida.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Salida.setFocusable(false);
        jScrollPane3.setViewportView(Salida);

        jPanel17.add(jScrollPane3);
        jScrollPane3.setBounds(510, 450, 330, 130);

        CodigoFuente.setEditable(false);
        CodigoFuente.setColumns(20);
        CodigoFuente.setRows(5);
        CodigoFuente.setText("Aqui va el codigo");
        CodigoFuente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CodigoFuente.setFocusable(false);
        jScrollPane4.setViewportView(CodigoFuente);

        jPanel17.add(jScrollPane4);
        jScrollPane4.setBounds(20, 140, 460, 440);

        Run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botones/Run.png"))); // NOI18N
        Run.setBorderPainted(false);
        Run.setContentAreaFilled(false);
        Run.setDefaultCapable(false);
        Run.setFocusPainted(false);
        Run.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RunMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RunMouseExited(evt);
            }
        });
        Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunActionPerformed(evt);
            }
        });
        jPanel17.add(Run);
        Run.setBounds(160, 590, 70, 40);

        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/botones/Explain.png"))); // NOI18N
        Siguiente.setBorderPainted(false);
        Siguiente.setContentAreaFilled(false);
        Siguiente.setDefaultCapable(false);
        Siguiente.setEnabled(false);
        Siguiente.setFocusPainted(false);
        Siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SiguienteMouseExited(evt);
            }
        });
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        jPanel17.add(Siguiente);
        Siguiente.setBounds(240, 590, 120, 40);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane5.setViewportView(jPanel15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
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

    private void AlgoritmosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgoritmosMouseEntered
        Algoritmos.setForeground(Color.gray);
    }//GEN-LAST:event_AlgoritmosMouseEntered

    private void AlgoritmosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlgoritmosMouseExited
        Algoritmos.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_AlgoritmosMouseExited

    private void AlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgoritmosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlgoritmosActionPerformed

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

    private void RunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RunMouseEntered
        Run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/Run2.png")));
    }//GEN-LAST:event_RunMouseEntered

    private void RunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RunMouseExited
        Run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/Run.png")));
    }//GEN-LAST:event_RunMouseExited

    private void SiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SiguienteMouseEntered
        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/Explain2.png")));
    }//GEN-LAST:event_SiguienteMouseEntered

    private void SiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SiguienteMouseExited
        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Botones/Explain.png")));
    }//GEN-LAST:event_SiguienteMouseExited

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed

    }//GEN-LAST:event_SiguienteActionPerformed

    private void RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunActionPerformed

    }//GEN-LAST:event_RunActionPerformed

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
            java.util.logging.Logger.getLogger(Codigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Codigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Codigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Codigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Codigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Algoritmos;
    public javax.swing.JTextArea CodigoFuente;
    public javax.swing.JTextArea Explicacion;
    public javax.swing.JButton Inicio;
    private javax.swing.JButton Manual;
    public javax.swing.JButton Menu;
    public javax.swing.JButton Run;
    public javax.swing.JTextArea Salida;
    public javax.swing.JButton Siguiente;
    public javax.swing.JTextArea Variables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JLabel numero;
    // End of variables declaration//GEN-END:variables
}
