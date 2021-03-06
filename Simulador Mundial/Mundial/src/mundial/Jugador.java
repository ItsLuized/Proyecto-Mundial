/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Mariajosé R
 */
public class Jugador extends javax.swing.JFrame implements ActionListener, MouseListener 
{

    /**
     * Creates new form Inicio
     */
    private Inicio main;
    private String rutaArchivo;
    private String rutaFotoE;
    private String rutaFotos;
    private String nombre;
    private String ruta;
    private String code;
    private String name;
    private String club;
    

    
     public Jugador(Inicio main, String code, String name, String club, String ruta) 
    {
        initComponents();
        
        this.main = main;
        this.rutaArchivo = rutaArchivo;
        this.rutaFotoE = rutaFotoE;
        this.nombre = nombre;
        this.code = code;
        this.name = name;
        this.club = club;
        this.ruta = ruta;
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.creaJugador();
    }

    

    private void poneaEscuchar()
    {
       this.salirButton.addActionListener(this);
       this.regresarButton.addActionListener(this); 
    }
    private void creaJugador()
    {
        
        this.codigoLabel.setText(code);
        this.nombreLabel.setText(name);
        this.clubLabel.setText(club);
        
        this.fotoLabel.setIcon(new ImageIcon(ruta));
        
        validate();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        fotoLabel = new javax.swing.JLabel();
        clubLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();

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

        fotoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(fotoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 190, 238));

        clubLabel.setBackground(new java.awt.Color(255, 255, 255));
        clubLabel.setForeground(new java.awt.Color(255, 255, 255));
        clubLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clubLabel.setText("CLUB:");
        kGradientPanel1.add(clubLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 190, -1));

        codigoLabel.setBackground(new java.awt.Color(255, 255, 255));
        codigoLabel.setForeground(new java.awt.Color(255, 255, 255));
        codigoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        codigoLabel.setText("CÓDIGO:");
        kGradientPanel1.add(codigoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 270, 190, -1));

        nombreLabel.setBackground(new java.awt.Color(255, 255, 255));
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreLabel.setText("NOMBRE:");
        kGradientPanel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == this.salirButton)
        {
            System.exit(0);
        }
        if(e.getSource() == this.regresarButton)
        {
            this.setVisible(false);
            
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
    public javax.swing.JLabel clubLabel;
    public javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JLabel nombreLabel;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

    
   
}
