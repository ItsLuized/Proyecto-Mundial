/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundial;

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
public class Inicio extends javax.swing.JFrame implements ActionListener, MouseListener, KeyListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        clasificacionesButton = new javax.swing.JButton();
        equiposButton = new javax.swing.JButton();
        partidosButton = new javax.swing.JButton();
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

        clasificacionesButton.setBackground(new java.awt.Color(93, 20, 84));
        clasificacionesButton.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        clasificacionesButton.setForeground(new java.awt.Color(204, 204, 204));
        clasificacionesButton.setText("CLASIFICACIONES");
        clasificacionesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        clasificacionesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clasificacionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasificacionesButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(clasificacionesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 210, 60));

        equiposButton.setBackground(new java.awt.Color(93, 20, 84));
        equiposButton.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        equiposButton.setForeground(new java.awt.Color(204, 204, 204));
        equiposButton.setText("EQUIPOS");
        equiposButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        equiposButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equiposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equiposButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(equiposButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 210, 60));

        partidosButton.setBackground(new java.awt.Color(93, 20, 84));
        partidosButton.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        partidosButton.setForeground(new java.awt.Color(204, 204, 204));
        partidosButton.setText("PARTIDOS");
        partidosButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        partidosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        partidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidosButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(partidosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 210, 60));

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
        kGradientPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clasificacionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasificacionesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clasificacionesButtonActionPerformed

    private void equiposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equiposButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equiposButtonActionPerformed

    private void partidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partidosButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        
    }//GEN-LAST:event_salirButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clasificacionesButton;
    private javax.swing.JButton equiposButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton partidosButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
    public static void main(String args[]) 
    {
       new Inicio();
    }
    public Inicio() 
    {
        initComponents();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        
    }
    
    private void poneaEscuchar()
    {
    
        this.equiposButton.addActionListener(this);
        this.partidosButton.addActionListener(this);
        this.clasificacionesButton.addActionListener(this);
        this.salirButton.addActionListener(this);
        //KeyListener ------>
        this.equiposButton.addKeyListener(this);
        this.partidosButton.addKeyListener(this);
        this.clasificacionesButton.addKeyListener(this);
        this.salirButton.addKeyListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == equiposButton)
        {
            this.setVisible(false);
            Equipos ope = new Equipos(this);
        }
        if(e.getSource() == partidosButton)
        {
            this.setVisible(false);
            SeleccionarPartido ope = new SeleccionarPartido(this);
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
        int KeyCode = e.getKeyCode();
        if(e.getSource() == this.equiposButton)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
                Equipos ope = new Equipos(this);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.partidosButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.partidosButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.salirButton.requestFocus();
            }
        }
        if(e.getSource() == this.partidosButton)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                this.setVisible(false);
                Partidos ope = new Partidos(this);
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.clasificacionesButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.equiposButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.clasificacionesButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.equiposButton.requestFocus();
            }
        }
        if (e.getSource() == this.clasificacionesButton)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                JOptionPane.showMessageDialog(null,"En construccion...", "Disculpe la molestia", 2);
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.partidosButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
               this.salirButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.partidosButton.requestFocus();
            }
        }
        if(e.getSource() == this.salirButton)
        {
            if (KeyCode == KeyEvent.VK_ENTER)
            {
                System.exit(0);
            }
            if (KeyCode == KeyEvent.VK_DOWN)
            {
                this.equiposButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_RIGHT)
            {
                this.equiposButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_LEFT)
            {
                this.clasificacionesButton.requestFocus();
            }
            if (KeyCode == KeyEvent.VK_UP)
            {
                this.clasificacionesButton.requestFocus();
            }
        }
        
    }


    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
