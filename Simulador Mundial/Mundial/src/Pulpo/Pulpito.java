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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import negocio.Cuarto;
import negocio.Final;
import negocio.Octavo;
import negocio.Semi;
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
        regresarButton = new javax.swing.JButton();
        B2 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        Semi1 = new javax.swing.JLabel();
        Cuartos6 = new javax.swing.JLabel();
        Cuartos5 = new javax.swing.JLabel();
        Cuartos2 = new javax.swing.JLabel();
        Cuartos1 = new javax.swing.JLabel();
        Semi2 = new javax.swing.JLabel();
        Cuartos3 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        Cuartos4 = new javax.swing.JLabel();
        Cuartos7 = new javax.swing.JLabel();
        Cuartos8 = new javax.swing.JLabel();
        Final2 = new javax.swing.JLabel();
        Semi4 = new javax.swing.JLabel();
        Semi3 = new javax.swing.JLabel();
        Final1 = new javax.swing.JLabel();
        H2 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();

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
        kGradientPanel1.add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 100, 30));

        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 90, 20));

        A1.setForeground(new java.awt.Color(255, 255, 255));
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 90, 20));

        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 90, 20));

        D2.setForeground(new java.awt.Color(255, 255, 255));
        D2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 90, 20));

        E1.setForeground(new java.awt.Color(255, 255, 255));
        E1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 90, 20));

        F2.setForeground(new java.awt.Color(255, 255, 255));
        F2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 90, 20));

        G1.setForeground(new java.awt.Color(255, 255, 255));
        G1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 90, 20));

        G2.setForeground(new java.awt.Color(255, 255, 255));
        G2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 90, 20));

        Semi1.setForeground(new java.awt.Color(255, 255, 255));
        Semi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Semi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Semi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 90, 20));

        Cuartos6.setForeground(new java.awt.Color(255, 255, 255));
        Cuartos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuartos6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 90, 20));

        Cuartos5.setForeground(new java.awt.Color(255, 255, 255));
        Cuartos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuartos5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 90, 20));

        Cuartos2.setForeground(new java.awt.Color(255, 255, 255));
        Cuartos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuartos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 100, 20));

        Cuartos1.setForeground(new java.awt.Color(255, 255, 255));
        Cuartos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuartos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 90, 20));

        Semi2.setForeground(new java.awt.Color(255, 255, 255));
        Semi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Semi2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Semi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 90, 20));

        Cuartos3.setForeground(new java.awt.Color(255, 255, 255));
        Cuartos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuartos3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 90, 20));

        A2.setForeground(new java.awt.Color(255, 255, 255));
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 90, 20));

        D1.setForeground(new java.awt.Color(255, 255, 255));
        D1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 90, 20));

        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 90, 20));

        F1.setForeground(new java.awt.Color(255, 255, 255));
        F1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 90, 20));

        E2.setForeground(new java.awt.Color(255, 255, 255));
        E2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 90, 20));

        H1.setForeground(new java.awt.Color(255, 255, 255));
        H1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 90, 20));

        Cuartos4.setForeground(new java.awt.Color(255, 255, 255));
        Cuartos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuartos4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 90, 20));

        Cuartos7.setForeground(new java.awt.Color(255, 255, 255));
        Cuartos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuartos7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 90, 20));

        Cuartos8.setForeground(new java.awt.Color(255, 255, 255));
        Cuartos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cuartos8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Cuartos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 90, 20));

        Final2.setForeground(new java.awt.Color(255, 255, 255));
        Final2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Final2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Final2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 90, 20));

        Semi4.setForeground(new java.awt.Color(255, 255, 255));
        Semi4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Semi4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Semi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 90, 20));

        Semi3.setForeground(new java.awt.Color(255, 255, 255));
        Semi3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Semi3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Semi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 90, 20));

        Final1.setForeground(new java.awt.Color(255, 255, 255));
        Final1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Final1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(Final1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 90, 20));

        H2.setForeground(new java.awt.Color(255, 255, 255));
        H2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 90, 20));

        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 90, 20));

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
        kGradientPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 100, 30));

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

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JLabel Final1;
    private javax.swing.JLabel Final2;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel H1;
    private javax.swing.JLabel H2;
    private javax.swing.JLabel Semi1;
    private javax.swing.JLabel Semi2;
    private javax.swing.JLabel Semi3;
    private javax.swing.JLabel Semi4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
    private String rutaOctavos;
    private String rutaCuartos;
    private String rutaSemi;
    private String rutaFinal;
    
    
    public Pulpito(Inicio main) 
    {
        initComponents();
        
        this.rutaOctavos = "E:/Simulador Mundial/octavos.txt";
        this.rutaCuartos = "E:/Simulador Mundial/cuartos.txt";
        this.rutaSemi = "E:/Simulador Mundial/semi.txt";
        this.rutaFinal = "E:/Simulador Mundial/finales.txt";
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.mostrarOctavos();
        this.mostrarCuartos();
        this.mostrarSemi();
        this.mostrarFinal();
        
    }
    
    private void poneaEscuchar()
    {
    
       this.regresarButton.addActionListener(this);
       this.salirButton.addActionListener(this);
         
       this.A1.addKeyListener(this); 
       this.A2.addKeyListener(this); 
       this.B2.addKeyListener(this); 
       this.C1.addKeyListener(this); 
       this.C2.addKeyListener(this); 
       this.D1.addKeyListener(this); 
       this.D2.addKeyListener(this); 
       this.E1.addKeyListener(this); 
       this.E2.addKeyListener(this); 
       this.F1.addKeyListener(this); 
       this.F2.addKeyListener(this); 
       this.G1.addKeyListener(this); 
       this.G2.addKeyListener(this); 
       this.H1.addKeyListener(this); 
       this.H2.addKeyListener(this);
       this.Cuartos1.addKeyListener(this); 
       this.Cuartos2.addKeyListener(this); 
       this.Cuartos3.addKeyListener(this); 
       this.Cuartos4.addKeyListener(this); 
       this.Cuartos5.addKeyListener(this); 
       this.Cuartos6.addKeyListener(this); 
       this.Cuartos7.addKeyListener(this); 
       this.Cuartos8.addKeyListener(this); 
       
    }
    private void mostrarOctavos()
    {
       ArrayList<Octavo> clasificados = this.getTodosOctavos();
        
        for(Octavo clasificado : clasificados) 
        {
            if (clasificado.getCode().equals("A1"))
            {
                this.A1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("B2"))
            {
                this.B2.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("B1"))
            {
                this.B1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("A2"))
            {
                this.A2.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("C1"))
            {
                this.C1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("D2"))
            {
                this.D2.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("D1"))
            {
                this.D1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("C2"))
            {
                this.C2.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("E1"))
            {
                this.E1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("F2"))
            {
                this.F2.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("F1"))
            {
                this.F1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("E2"))
            {
                this.E2.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("G1"))
            {
                this.G1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("H2"))
            {
                this.H2.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("H1"))
            {
                this.H1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("G2"))
            {
                this.G2.setText(clasificado.getNombre());
            }
        }
    }
    private void mostrarCuartos()
    {
        ArrayList<Cuarto> clasificados = this.getTodosCuartos();
        
        for(Cuarto clasificado : clasificados) 
        {
            if (clasificado.getCode().equals("A"))
            {
                this.Cuartos1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("B"))
            {
                this.Cuartos3.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("C"))
            {
                this.Cuartos2.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("D"))
            {
                this.Cuartos4.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("E"))
            {
                this.Cuartos5.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("F"))
            {
                this.Cuartos7.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("G"))
            {
                this.Cuartos6.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("H"))
            {
                this.Cuartos8.setText(clasificado.getNombre());
            }
        }
    }
    private void mostrarSemi()
    {
        ArrayList<Semi> clasificados = this.getTodosSemi();
        
        for(Semi clasificado : clasificados) 
        {
            if (clasificado.getCode().equals("A"))
            {
                this.Semi1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("B"))
            {
                this.Semi3.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("C"))
            {
                this.Semi2.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("D"))
            {
                this.Semi4.setText(clasificado.getNombre());
            }
            
        }
    }
    private void mostrarFinal()
    {
        ArrayList<Final> clasificados = this.getTodosFinales();
        
        for(Final clasificado : clasificados) 
        {
            if (clasificado.getCode().equals("A"))
            {
                this.Final1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("B"))
            {
                this.Final2.setText(clasificado.getNombre());
            }
            
            
        }
    }
    public ArrayList<Octavo> getTodosOctavos()
    {
        ArrayList<Octavo> octavos = new ArrayList();
        Octavo clasificado = null;
        String registro;
        FileReader file;
        BufferedReader br;
        
        try 
        {
            file = new FileReader(this.rutaOctavos);
            br = new BufferedReader(file);
            while((registro=br.readLine())!= null)//mientras haya registro
            {
                String pieces[] = registro.split(",");
                clasificado = new Octavo(pieces[0], pieces[1],Integer.parseInt(pieces[2]));    
                octavos.add(clasificado);
            }            
        } 
        catch (IOException ex) 
        {
            System.out.println("Problemas buscando la materia...");
        }       
        return octavos;
    }
    public ArrayList<Cuarto> getTodosCuartos()
    {
        ArrayList<Cuarto> cuartos = new ArrayList();
        Cuarto clasificado = null;
        String registro;
        FileReader file;
        BufferedReader br;
        
        try 
        {
            file = new FileReader(this.rutaCuartos);
            br = new BufferedReader(file);
            while((registro=br.readLine())!= null)//mientras haya registro
            {
                String pieces[] = registro.split(",");
                clasificado = new Cuarto(pieces[0], pieces[1],Integer.parseInt(pieces[2]));    
                cuartos.add(clasificado);
            }            
        } 
        catch (IOException ex) 
        {
            System.out.println("Problemas buscando la materia...");
        }       
        return cuartos;
    }
    public ArrayList<Semi> getTodosSemi()
    {
        ArrayList<Semi> semis = new ArrayList();
        Semi clasificado = null;
        String registro;
        FileReader file;
        BufferedReader br;
        
        try 
        {
            file = new FileReader(this.rutaSemi);
            br = new BufferedReader(file);
            while((registro=br.readLine())!= null)//mientras haya registro
            {
                String pieces[] = registro.split(",");
                clasificado = new Semi(pieces[0], pieces[1],Integer.parseInt(pieces[2]));    
                semis.add(clasificado);
            }            
        } 
        catch (IOException ex) 
        {
            System.out.println("Problemas buscando la materia...");
        }       
        return semis;
    }
    public ArrayList<Final> getTodosFinales()
    {
        ArrayList<Final> finales = new ArrayList();
        Final clasificado = null;
        String registro;
        FileReader file;
        BufferedReader br;
        
        try 
        {
            file = new FileReader(this.rutaFinal);
            br = new BufferedReader(file);
            while((registro=br.readLine())!= null)//mientras haya registro
            {
                String pieces[] = registro.split(",");
                clasificado = new Final(pieces[0], pieces[1],Integer.parseInt(pieces[2]));    
                finales.add(clasificado);
            }            
        } 
        catch (IOException ex) 
        {
            System.out.println("Problemas buscando la materia...");
        }       
        return finales;
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == this.regresarButton)
        {
            this.dispose();
            Inicio ope = new Inicio();
        }
        
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
