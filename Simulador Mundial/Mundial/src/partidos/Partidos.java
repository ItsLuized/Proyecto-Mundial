/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidos;

import mundial.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;

/**
 *
 * @author Mariajosé R
 */
public class Partidos extends javax.swing.JFrame implements ActionListener, MouseListener, KeyListener 
{

    /**
     * Creates new form Inicio
     */
    private final Inicio main;
    private String rutaArchivo;
    private String rutaFotoE;
    private String rutaFotos;

    
     public Partidos(Inicio main) 
    {
        initComponents();
        
        this.main = main;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
    }

    private void poneaEscuchar()
    {
       this.salirButton.addActionListener(this);
       this.regresarButton.addActionListener(this); 
       this.grupoA.addActionListener(this);
       this.grupoB.addActionListener(this);
       this.grupoC.addActionListener(this);
       this.grupoD.addActionListener(this);
       this.grupoE.addActionListener(this);
       this.grupoF.addActionListener(this);
       this.grupoG.addActionListener(this);
       this.grupoH.addActionListener(this);
       //KeyListeners ---->
       this.salirButton.addKeyListener(this);
       this.regresarButton.addKeyListener(this); 
       this.grupoA.addKeyListener(this);
       this.grupoB.addKeyListener(this);
       this.grupoC.addKeyListener(this);
       this.grupoD.addKeyListener(this);
       this.grupoE.addKeyListener(this);
       this.grupoF.addKeyListener(this);
       this.grupoG.addKeyListener(this);
       this.grupoH.addKeyListener(this);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        grupoD = new javax.swing.JButton();
        grupoC = new javax.swing.JButton();
        grupoA = new javax.swing.JButton();
        grupoB = new javax.swing.JButton();
        grupoE = new javax.swing.JButton();
        grupoF = new javax.swing.JButton();
        grupoG = new javax.swing.JButton();
        grupoH = new javax.swing.JButton();

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
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 150));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PARTIDOS POR GRUPOS");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 450, 40));

        regresarButton.setBackground(new java.awt.Color(102, 0, 51));
        regresarButton.setForeground(new java.awt.Color(255, 255, 255));
        regresarButton.setText("REGRESAR");
        regresarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        regresarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 30));

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
        kGradientPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 100, 30));

        grupoD.setBackground(new java.awt.Color(93, 20, 84));
        grupoD.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        grupoD.setForeground(new java.awt.Color(204, 204, 204));
        grupoD.setText("GRUPO D");
        grupoD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        grupoD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grupoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoDActionPerformed(evt);
            }
        });
        kGradientPanel1.add(grupoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 100, 40));

        grupoC.setBackground(new java.awt.Color(93, 20, 84));
        grupoC.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        grupoC.setForeground(new java.awt.Color(204, 204, 204));
        grupoC.setText("GRUPO C");
        grupoC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        grupoC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grupoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoCActionPerformed(evt);
            }
        });
        kGradientPanel1.add(grupoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 100, 40));

        grupoA.setBackground(new java.awt.Color(93, 20, 84));
        grupoA.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        grupoA.setForeground(new java.awt.Color(204, 204, 204));
        grupoA.setText("GRUPO A");
        grupoA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        grupoA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grupoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoAActionPerformed(evt);
            }
        });
        kGradientPanel1.add(grupoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 40));

        grupoB.setBackground(new java.awt.Color(93, 20, 84));
        grupoB.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        grupoB.setForeground(new java.awt.Color(204, 204, 204));
        grupoB.setText(" GRUPO B");
        grupoB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        grupoB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grupoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoBActionPerformed(evt);
            }
        });
        kGradientPanel1.add(grupoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 100, 40));

        grupoE.setBackground(new java.awt.Color(93, 20, 84));
        grupoE.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        grupoE.setForeground(new java.awt.Color(204, 204, 204));
        grupoE.setText("GRUPO E");
        grupoE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        grupoE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grupoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoEActionPerformed(evt);
            }
        });
        kGradientPanel1.add(grupoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 100, 40));

        grupoF.setBackground(new java.awt.Color(93, 20, 84));
        grupoF.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        grupoF.setForeground(new java.awt.Color(204, 204, 204));
        grupoF.setText(" GRUPO F");
        grupoF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        grupoF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grupoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoFActionPerformed(evt);
            }
        });
        kGradientPanel1.add(grupoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 100, 40));

        grupoG.setBackground(new java.awt.Color(93, 20, 84));
        grupoG.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        grupoG.setForeground(new java.awt.Color(204, 204, 204));
        grupoG.setText("GRUPO G");
        grupoG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        grupoG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grupoG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoGActionPerformed(evt);
            }
        });
        kGradientPanel1.add(grupoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 100, 40));

        grupoH.setBackground(new java.awt.Color(93, 20, 84));
        grupoH.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        grupoH.setForeground(new java.awt.Color(204, 204, 204));
        grupoH.setText("GRUPO H");
        grupoH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        grupoH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grupoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoHActionPerformed(evt);
            }
        });
        kGradientPanel1.add(grupoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirButtonActionPerformed

    private void grupoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoDActionPerformed

    private void grupoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoCActionPerformed

    private void grupoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoAActionPerformed

    private void grupoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoBActionPerformed

    private void grupoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoEActionPerformed

    private void grupoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoFActionPerformed

    private void grupoGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoGActionPerformed

    private void grupoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoHActionPerformed

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == this.salirButton)
        {
            System.exit(0);
        }
        if(e.getSource() == this.regresarButton)
        {
            this.setVisible(false);
            this.main.setVisible(true);
        }
        if(e.getSource() == this.grupoA)
        {
            this.setVisible(false);
            GrupoA grupo = new GrupoA(main);
        }
        if(e.getSource() == this.grupoB)
        {
            this.setVisible(false);
            GrupoB grupo = new GrupoB(main);
        }
        if(e.getSource() == this.grupoC)
        {
            this.setVisible(false);
            GrupoC grupo = new GrupoC(main);
        }
        if(e.getSource() == this.grupoD)
        {
            this.setVisible(false);
            GrupoD grupo = new GrupoD(main);
        }
        if(e.getSource() == this.grupoE)
        {
            this.setVisible(false);
            GrupoE grupo = new GrupoE(main);
        }
        if(e.getSource() == this.grupoF)
        {
            this.setVisible(false);
            GrupoF grupo = new GrupoF(main);
        }
        if(e.getSource() == this.grupoG)
        {
            this.setVisible(false);
            GrupoG grupo = new GrupoG(main);
        }
        if(e.getSource() == this.grupoH)
        {
            this.setVisible(false);
            GrupoH grupo = new GrupoH(main);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton grupoA;
    private javax.swing.JButton grupoB;
    private javax.swing.JButton grupoC;
    private javax.swing.JButton grupoD;
    private javax.swing.JButton grupoE;
    private javax.swing.JButton grupoF;
    private javax.swing.JButton grupoG;
    private javax.swing.JButton grupoH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e)
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int KeyCode = e.getKeyCode();
        if (e.getSource() == this.grupoA)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
                GrupoA grupo = new GrupoA(main);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.grupoE.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.grupoB.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.salirButton.requestFocus();
            }
        }
        if (e.getSource() == this.grupoB)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
                GrupoB grupo = new GrupoB(main);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.grupoF.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.grupoC.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.grupoA.requestFocus();
            }
        }
        if (e.getSource() == this.grupoC)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
                GrupoC grupo = new GrupoC(main);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.grupoG.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.grupoD.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.grupoB.requestFocus();
            }
        }
        if (e.getSource() == this.grupoD)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
                GrupoD grupo = new GrupoD(main);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.grupoH.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.grupoE.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.grupoC.requestFocus();
            }
        }
        if (e.getSource() == this.grupoE)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
            	GrupoE grupo = new GrupoE(main);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.grupoA.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.grupoF.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.grupoD.requestFocus();
            }
        }
        if (e.getSource() == this.grupoF)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
            	GrupoF grupo = new GrupoF(main);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.grupoB.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.grupoG.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.grupoE.requestFocus();
            }
        }
        if (e.getSource() == this.grupoG)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
            	GrupoG grupo = new GrupoG(main);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.grupoC.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.grupoH.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.grupoF.requestFocus();
            }
        }
        if (e.getSource() == this.grupoH)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
            	GrupoH grupo = new GrupoH(main);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.grupoD.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.regresarButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.grupoG.requestFocus();
            }
        }
        if (e.getSource() == this.salirButton)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                System.exit(0);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.grupoE.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.grupoA.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.grupoA.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.regresarButton.requestFocus();
            }
        }
        if (e.getSource() == this.regresarButton)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
            	this.main.setVisible(true);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.grupoE.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.grupoA.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.grupoH.requestFocus();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
