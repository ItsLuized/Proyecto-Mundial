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
public class Equipos extends javax.swing.JFrame implements ActionListener, MouseListener 
{

    /**
     * Creates new form Inicio
     */
    private Inicio main;
    private String rutaArchivo;
    private String rutaFotoE;
    private String rutaFotos;

    
     public Equipos(Inicio main) 
    {
        initComponents();
        
        this.main = main;
        this.rutaArchivo = rutaArchivo;
        this.rutaFotoE = rutaFotoE;
        this.rutaFotos = rutaFotos;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
    }

    Equipos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void poneaEscuchar()
    {
       this.salirButton.addActionListener(this);
       this.regresarButton.addActionListener(this); 
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        listaCombo = new javax.swing.JComboBox<>();
        regresarButton = new javax.swing.JButton();
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
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 150));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PAISES");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 320, 40));

        listaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un equipo:", "Alemania", "Arabia Saudita", "Argentina", "Australia", "Brasil", "Bélgica", "Colombia", "Corea del Sur", "Costa Rica", "Croacia", "Dinamarca", "Egipto", "España", "Francia", "Inglaterra", "Irán", "Islandia", "Japón", "Marruecos", "México", "Nigeria", "Panamá", "Perú", "Polonia", "Portugal", "Rusia", "Senegal", "Serbia", "Suecia", "Suiza", "Tunez", "Uruguay" }));
        listaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaComboActionPerformed(evt);
            }
        });
        kGradientPanel1.add(listaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 320, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void listaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaComboActionPerformed
       if(listaCombo.getSelectedIndex() == 1) //Alemania
       {
           
               
           //ImageIcon rutaFotoE = new ImageIcon("F:/Simulador Mundial/Alemania/aleequipo.jpg");
        
           this.rutaArchivo = "F:\\Simulador Mundial\\Alemania\\alemania.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Alemania\\aleequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Alemania";
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Alemania", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 2) //Arabia Saudita
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Arabia S\\arabia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Arabia S\\arsequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Arabia S";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Arabia Saudí", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 3) //Argentina
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Argentina\\argentina.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Argentina\\argequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Argentina";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Argentina", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 4) //Australia
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Australia\\australia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Australia\\ausequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Australia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Australia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 5) //Brasil
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Brasil\\brasil.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Brasil\\braequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Brasil";

           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Brasil", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 6) //Bélgica
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Belgica\\belgica.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Belgica\\belequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Belgica";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Bélgica", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 7) //Colombia
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Colombia\\colombia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Colombia\\colequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Colombia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Colombia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 8) //Corea del Sur
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Corea\\corea.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Corea\\corequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Corea";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Corea del Sur", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 9) //Costa Rica
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Costa Rica\\costarica.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Costa Rica\\cosequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Costa Rica";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Costa Rica",this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }if(listaCombo.getSelectedIndex() == 10) //Croacia  
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Croacia\\croacia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Croacia\\croequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Croacia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Croacia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 11) //Dinamarca
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Dinamarca\\dinamarca.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Dinamarca\\dinequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Dinamarca";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Dinamarca", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 12) //Egipto
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Egipto\\egipto.txt"; 
           this.rutaFotoE = "F:\\Simulador Mundial\\Egipto\\egyequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Egipto";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Egipto", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 13) //España
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\España\\españa.txt"; 
           this.rutaFotoE = "F:\\Simulador Mundial\\España\\espequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\España";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "España", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 14) //Francia
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Francia\\francia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Francia\\fraequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Francia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Francia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 15) //Inglaterra
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Inglaterra\\inglaterra.txt"; 
           this.rutaFotoE = "F:\\Simulador Mundial\\Inglaterra\\ingequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Inglaterra";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Inglaterra", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }if(listaCombo.getSelectedIndex() == 16) //Irán
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Iran\\iran.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Iran\\iraequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Iran";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Irán", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 17) //Islandia
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Islandia\\islandia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Islandia\\iceequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Islandia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Islandia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 18) //Japón
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Japon\\japon.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Japon\\japequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Japon";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Japón", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 19) //Marruecos
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Marruecos\\marruecos.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Marruecos\\marequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Marruecos";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Marruecos", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 20) //México
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Mexico\\mexico.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Mexico\\mexequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Mexico";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "México", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 21) //Nigeria
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Nigeria\\nigeria.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Nigeria\\nigequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Nigeria";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Nigeria", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 22) //Panamá
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Panama\\panama.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Panama\\panequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Panama";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Panamá", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 23) //Perú
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Peru\\peru.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Peru\\perequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Peru";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Perú", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 24) //Polonia
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Polonia\\polonia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Polonia\\polequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Polonia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Polonia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 25) //Portugal
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Portugal\\portugal.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Portugal\\porequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Portugal";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Portugal", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 26) //Rusia
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Rusia\\rusia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Rusia\\rusequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Rusia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Rusia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 27) //Senegal
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Senegal\\Senegal.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Senegal\\senequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Senegal";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Senegal", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 28) //Serbia
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Serbia\\serbia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Serbia\\serequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Serbia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Serbia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 29) //Suecia
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Suecia\\suecia.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Suecia\\sueequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Suecia";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Suecia", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 30) //Suiza
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Suiza\\suiza.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Suiza\\suiequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Suiza";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Suiza", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 31) //Túnez
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Tunez\\Tunez.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Tunez\\tunequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Tunez";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Túnez", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
       if(listaCombo.getSelectedIndex() == 32) //Uruguay
       {
           this.rutaArchivo = "F:\\Simulador Mundial\\Uruguay\\uruguay.txt";
           this.rutaFotoE = "F:\\Simulador Mundial\\Uruguay\\uruequipo.jpg";
           this.rutaFotos = "F:\\Simulador Mundial\\Uruguay";
           
           this.setVisible(false);
           EquipoIndividual ope = new EquipoIndividual(main, "Uruguay", this.rutaArchivo, this.rutaFotoE, this.rutaFotos);
       }
    }//GEN-LAST:event_listaComboActionPerformed

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
            this.dispose();
            Inicio ope = new Inicio();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JComboBox<String> listaCombo;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

    
   
}
