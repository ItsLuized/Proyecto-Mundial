/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pulpo;

import mundial.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import partidos.Partidos;


/**
 *
 * @author Mariajosé R
 */
public class Pulpito extends javax.swing.JFrame implements ActionListener, MouseListener, KeyListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();
        B2 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        H2 = new javax.swing.JLabel();
        Semi1 = new javax.swing.JLabel();
        Cuartos6 = new javax.swing.JLabel();
        Cuartos5 = new javax.swing.JLabel();
        Cuartos2 = new javax.swing.JLabel();
        Cuartos1 = new javax.swing.JLabel();
        Semi2 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        Cuartos3 = new javax.swing.JLabel();
        Cuartos4 = new javax.swing.JLabel();
        Cuartos7 = new javax.swing.JLabel();
        Cuartos8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Semi4 = new javax.swing.JLabel();
        Semi3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel1.setGradientFocus(600);
        kGradientPanel1.setStartColor(new java.awt.Color(0, 0, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 370));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mundial/banner_rusia1.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 180));

        salirButton.setBackground(new java.awt.Color(102, 0, 51));
        salirButton.setForeground(new java.awt.Color(255, 255, 255));
        salirButton.setText("SALIR");
        salirButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        salirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 100, 30));

        B2.setText("jLabel2");
        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 70, 20));

        A1.setText("jLabel2");
        A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 70, 20));

        C1.setText("jLabel2");
        C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 70, 20));

        D2.setText("jLabel2");
        D2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 70, 20));

        E1.setText("jLabel2");
        E1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 70, 20));

        F2.setText("jLabel2");
        F2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 70, 20));

        G1.setText("jLabel2");
        G1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 70, 20));

        H2.setText("jLabel2");
        H2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 70, 20));

        Semi1.setText("jLabel2");
        Semi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Semi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 70, 20));

        Cuartos6.setText("jLabel2");
        Cuartos6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 70, 20));

        Cuartos5.setText("jLabel2");
        Cuartos5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 70, 20));

        Cuartos2.setText("jLabel2");
        Cuartos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 70, 20));

        Cuartos1.setText("jLabel2");
        Cuartos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 70, 20));

        Semi2.setText("jLabel2");
        Semi2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Semi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 70, 20));

        B1.setText("jLabel2");
        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 70, 20));

        A2.setText("jLabel2");
        A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 70, 20));

        D1.setText("jLabel2");
        D1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 70, 20));

        C2.setText("jLabel2");
        C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 70, 20));

        F1.setText("jLabel2");
        F1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 70, 20));

        E2.setText("jLabel2");
        E2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 70, 20));

        H1.setText("jLabel2");
        H1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 70, 20));

        G2.setText("jLabel2");
        G2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 70, 20));

        Cuartos3.setText("jLabel2");
        Cuartos3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 70, 20));

        Cuartos4.setText("jLabel2");
        Cuartos4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 70, 20));

        Cuartos7.setText("jLabel2");
        Cuartos7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 70, 20));

        Cuartos8.setText("jLabel2");
        Cuartos8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 70, 20));

        jLabel20.setText("jLabel2");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 70, 20));

        Semi4.setText("jLabel2");
        Semi4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Semi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 70, 20));

        Semi3.setText("jLabel2");
        Semi3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Semi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 70, 20));

        jLabel32.setText("jLabel2");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 70, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        
    }//GEN-LAST:event_salirButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel Cuartos1;
    private javax.swing.JLabel Cuartos2;
    private javax.swing.JLabel Cuartos3;
    private javax.swing.JLabel Cuartos4;
    private javax.swing.JLabel Cuartos5;
    private javax.swing.JLabel Cuartos6;
    private javax.swing.JLabel Cuartos7;
    private javax.swing.JLabel Cuartos8;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel H1;
    private javax.swing.JLabel H2;
    private javax.swing.JLabel Semi1;
    private javax.swing.JLabel Semi2;
    private javax.swing.JLabel Semi3;
    private javax.swing.JLabel Semi4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
    public static void main(String args[]) 
    {
       new Pulpito();
    }
    public Pulpito() 
    {
        initComponents();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        
    }
    
    private void poneaEscuchar()
    {
    
        this.salirButton.addActionListener(this);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        
        if(e.getSource() == this.salirButton)
        {
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
       
        
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        
        
    }


    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
