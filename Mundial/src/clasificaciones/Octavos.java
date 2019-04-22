/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificaciones;

import partidos.*;
import mundial.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Partido;

/**
 *
 * @author Mariajosé R
 */
public class Octavos extends javax.swing.JFrame implements ActionListener, MouseListener, KeyListener 
{

    /**
     * Creates new form Inicio
     */
    private Inicio main;
    private String rutaOctavos;

    
     public Octavos(Inicio main) 
    {
        initComponents();
        
        this.main = main;
        this.rutaOctavos = "F:/Simulador Mundial/octavos.txt";
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.mostrarPaises();
        this.cargarPuntuacion();
    }

    private void poneaEscuchar()
    {
       this.salirButton.addActionListener(this);
       this.regresarButton.addActionListener(this); 
       this.guardarButton.addActionListener(this); 
       
      
       //KeyListeners ---->
       this.salirButton.addKeyListener(this);
       this.regresarButton.addKeyListener(this); 
       
    }
    
    private void mostrarPaises()
    {
       /* ArrayList<negocio.Octavos> clasificados = this.getTodosOctavos();
        
        for(negocio.Octavos clasificado : clasificados) 
        {
            if (clasificado.getCode().equals("A1"))
            {
                this.label1.setText(clasificado.getNombre());
                
            }
            if (clasificado.getCode().equals("A2"))
            {
                this.label2.setText(clasificado.getNombre());
                
            }
        }*/
        
    }
    public ArrayList<negocio.Octavos> getTodosOctavos()
    {
        ArrayList<negocio.Octavos> octavos = new ArrayList();
        negocio.Octavos clasificado = null;
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
                clasificado = new negocio.Octavos(pieces[0], pieces[1],Integer.parseInt(pieces[2]), Boolean.parseBoolean(pieces[3]));    
                octavos.add(clasificado);
            }            
        } 
        catch (IOException ex) 
        {
            System.out.println("Problemas buscando la materia...");
        }       
        return octavos;
    }
    
    private void cargarPuntuacion()
    {
        ArrayList<negocio.Octavos> part = this.getTodosOctavos();
        int contador = 0;
        for(negocio.Octavos partidos : part)
        {
            contador++;
            if (contador == 1) 
            {
                this.field11.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 2) 
            {
               this.field12.setText(String.valueOf(partidos.getGoles())); 
            }
            if (contador == 3) 
            {
               this.field21.setText(String.valueOf(partidos.getGoles())); 
            }
            if (contador == 4) 
            {
               this.field22.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 5) 
            {
               this.field31.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 6) 
            {
               this.field32.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 7) 
            {
               this.field41.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 8) 
            {
               this.field42.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 9) 
            {
               this.field51.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 10) 
            {
               this.field52.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 11) 
            {
               this.field61.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 12) 
            {
               this.field62.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 13) 
            {
               this.field71.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 14) 
            {
               this.field72.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 15) 
            {
               this.field81.setText(String.valueOf(partidos.getGoles()));
            }
            if (contador == 16) 
            {
               this.field82.setText(String.valueOf(partidos.getGoles()));
            }
            
        }
    
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
        label1 = new javax.swing.JLabel();
        field11 = new javax.swing.JTextField();
        field12 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        field21 = new javax.swing.JTextField();
        field22 = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        field31 = new javax.swing.JTextField();
        field32 = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        field41 = new javax.swing.JTextField();
        field42 = new javax.swing.JTextField();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        field51 = new javax.swing.JTextField();
        field52 = new javax.swing.JTextField();
        label10 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        field61 = new javax.swing.JTextField();
        field62 = new javax.swing.JTextField();
        label12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        field71 = new javax.swing.JTextField();
        field72 = new javax.swing.JTextField();
        label14 = new javax.swing.JLabel();
        label16 = new javax.swing.JLabel();
        field82 = new javax.swing.JTextField();
        field81 = new javax.swing.JTextField();
        label15 = new javax.swing.JLabel();
        nextButtons = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();

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
        jLabel3.setText("OCTAVOS");
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

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label1.setText("A1");
        kGradientPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 90, 20));

        field11.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 40, 20));

        field12.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 40, 20));

        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label2.setText("B2");
        kGradientPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 90, 20));

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label3.setText("B1");
        kGradientPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 90, 20));

        field21.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 40, 20));

        field22.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 40, 20));

        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("A2");
        kGradientPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 90, 20));

        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label5.setText("C1");
        kGradientPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 80, 20));

        field31.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field31, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 40, 20));

        field32.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field32, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 40, 20));

        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label6.setText("D2");
        kGradientPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 90, 20));

        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label7.setText("D1");
        kGradientPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 90, 20));

        field41.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 40, 20));

        field42.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field42, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 40, 20));

        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label8.setText("C2");
        kGradientPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 90, 20));

        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label9.setText("E1");
        kGradientPanel1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 100, 20));

        field51.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field51, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 40, 20));

        field52.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field52, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 40, 20));

        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label10.setText("F2");
        kGradientPanel1.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 80, 20));

        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label11.setText("F1");
        kGradientPanel1.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 90, 20));

        field61.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field61, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 40, 20));

        field62.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field62, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 40, 20));

        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label12.setText("E2");
        kGradientPanel1.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 80, 20));

        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label13.setText("G1");
        kGradientPanel1.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 90, 20));

        field71.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field71, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 40, 20));

        field72.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field72, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 40, 20));

        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label14.setText("H2");
        kGradientPanel1.add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 80, 20));

        label16.setForeground(new java.awt.Color(255, 255, 255));
        label16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label16.setText("G2");
        kGradientPanel1.add(label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 70, 20));

        field82.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field82, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 40, 20));

        field81.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field81, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 40, 20));

        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label15.setText("H1");
        kGradientPanel1.add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 90, 20));

        nextButtons.setBackground(new java.awt.Color(102, 0, 51));
        nextButtons.setForeground(new java.awt.Color(255, 255, 255));
        nextButtons.setText("IR A CUARTOS");
        nextButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        nextButtons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonsActionPerformed(evt);
            }
        });
        kGradientPanel1.add(nextButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 100, 30));

        guardarButton.setBackground(new java.awt.Color(102, 0, 51));
        guardarButton.setForeground(new java.awt.Color(255, 255, 255));
        guardarButton.setText("GUARDAR");
        guardarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        guardarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 30));

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

    private void nextButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonsActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarButtonActionPerformed

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == this.salirButton)
        {
            System.exit(0);
        }
        if(e.getSource() == this.regresarButton)
        {
            this.dispose();
            SeleccionarPartido ope = new SeleccionarPartido(main);
        }
        if(e.getSource() == this.guardarButton)
        {
            this.preValido();
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
     public void actualizarOctavos(ArrayList<negocio.Octavos> teams)
    {
        File file;
        FileWriter fw;
        PrintWriter pw;
        
        try 
        {
            file = new File(this.rutaOctavos);
            fw = new FileWriter (file, false);
            pw = new PrintWriter(fw);
            for(negocio.Octavos team : teams)
            {
                pw.println(team);
            }
            pw.close();             
        }
        catch (IOException ex) 
        {
            System.out.println("Problemas reemplazando archivo...");
        }   
    }
     public void preValido()
    {
        boolean valido = this.ValidarFields();
        if(valido)
        {
        this.modificar();
        //this.agregarPuntos();
        }
    }
     
     //TERMINAR DE LLENAR ESTO PARA TODOS LOS FIELDS
      public boolean ValidarFields()
    {
        boolean valido = true;
       
        if(this.field11.getText().length()==0)
        {
            valido = false;
        }
        if(this.field12.getText().length()==0)
        {
            valido = false;
        }
        if(this.field21.getText().length()==0)
        {
            valido = false;
        }
        if(this.field22.getText().length()==0)
        {
            valido = false;
        }
        if(this.field31.getText().length()==0)
        {
            valido = false;
        }
        if(this.field32.getText().length()==0)
        {
            valido = false;
        }
        if(this.field41.getText().length()==0)
        { 
            valido = false;
        }
        if(this.field42.getText().length()==0)
        {
            valido = false;
        }
        if(this.field51.getText().length()==0)
        {
            valido = false;
        }
        if(this.field52.getText().length()==0)
        { 
            valido = false;
        }
        if(this.field61.getText().length()==0)
        {
            valido = false;
        }
        if(this.field62.getText().length()==0)
        { 
            valido = false;
        }
        if(this.field71.getText().length()==0)
        { 
            valido = false;
        }
        if(this.field72.getText().length()==0)
        { 
            valido = false;
        }
        if(this.field81.getText().length()==0)
        { 
            valido = false;
        }
        if(this.field82.getText().length()==0)
        { 
            valido = false;
        }
        
        if (!valido) 
        {
            JOptionPane.showMessageDialog(null,"No puede dejar un campo vacio", "Aviso", 2); 
        }
        return valido;
    }
    public void modificar()
    { 
        ArrayList<negocio.Octavos> goles = this.getTodosOctavos();
        
        for(negocio.Octavos gol : goles) 
        {
            if (gol.getCode().equals("A1"))
            {
                gol.setGoles(Integer.parseInt(this.field11.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("A2"))
            {
                gol.setGoles(Integer.parseInt(this.field22.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("B1"))
            {
                gol.setGoles(Integer.parseInt(this.field21.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("B2"))
            {
                gol.setGoles(Integer.parseInt(this.field12.getText()));
                this.actualizarOctavos(goles);
            }if (gol.getCode().equals("C1"))
            {
                gol.setGoles(Integer.parseInt(this.field31.getText()));
                this.actualizarOctavos(goles);
            }if (gol.getCode().equals("C2"))
            {
                gol.setGoles(Integer.parseInt(this.field42.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("D1"))
            {
                gol.setGoles(Integer.parseInt(this.field41.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("D2"))
            {
                gol.setGoles(Integer.parseInt(this.field32.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("E1"))
            {
                gol.setGoles(Integer.parseInt(this.field51.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("E2"))
            {
                gol.setGoles(Integer.parseInt(this.field62.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("F1"))
            {
                gol.setGoles(Integer.parseInt(this.field61.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("F2"))
            {
                gol.setGoles(Integer.parseInt(this.field52.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("G1"))
            {
                gol.setGoles(Integer.parseInt(this.field71.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("G2"))
            {
                gol.setGoles(Integer.parseInt(this.field82.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("H1"))
            {
                gol.setGoles(Integer.parseInt(this.field81.getText()));
                this.actualizarOctavos(goles);
            }
            if (gol.getCode().equals("H2"))
            {
                gol.setGoles(Integer.parseInt(this.field72.getText()));
                this.actualizarOctavos(goles);
            }
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField field11;
    private javax.swing.JTextField field12;
    private javax.swing.JTextField field21;
    private javax.swing.JTextField field22;
    private javax.swing.JTextField field31;
    private javax.swing.JTextField field32;
    private javax.swing.JTextField field41;
    private javax.swing.JTextField field42;
    private javax.swing.JTextField field51;
    private javax.swing.JTextField field52;
    private javax.swing.JTextField field61;
    private javax.swing.JTextField field62;
    private javax.swing.JTextField field71;
    private javax.swing.JTextField field72;
    private javax.swing.JTextField field81;
    private javax.swing.JTextField field82;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JButton nextButtons;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables

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
