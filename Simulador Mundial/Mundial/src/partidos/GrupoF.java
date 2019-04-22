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
import negocio.Equipo;
import negocio.Octavo;
import negocio.Partido;

/**
 *
 * @author Mariajosé R
 */
public class GrupoF extends javax.swing.JFrame implements ActionListener, MouseListener, KeyListener 
{

    /**
     * Creates new form Inicio
     */
    private Inicio main;
    private final String rutA = "E:/Simulador Mundial/grupoF.txt";
    private final String rutaPartidos = "E:/Simulador Mundial/partidosF.txt";
    private final String rutaOctavos = "E:/Simulador Mundial/octavos.txt";
    private String clasif1 = "";
    private String clasif2 = "";
    
     public GrupoF(Inicio main) 
    {
        initComponents();
        
        this.main = main;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneaEscuchar();
        this.cargarRes();
    }

    private void poneaEscuchar()
    {
       this.salirButton.addActionListener(this);
       this.regresarButton.addActionListener(this); 
       this.tablaButton.addActionListener(this);
       this.guardar.addActionListener(this);
       this.guardar.addActionListener(this);
       this.field11.addActionListener(this);
       this.field12.addActionListener(this);
       this.field21.addActionListener(this);
       this.field22.addActionListener(this);
       this.field31.addActionListener(this);
       this.field32.addActionListener(this);
       this.field41.addActionListener(this);
       this.field42.addActionListener(this);
       this.field51.addActionListener(this);
       this.field52.addActionListener(this);
       this.field61.addActionListener(this);
       this.field62.addActionListener(this);
       //KeyListener ----->
       this.field11.addKeyListener(this);
       this.field12.addKeyListener(this);
       this.field21.addKeyListener(this);
       this.field22.addKeyListener(this);
       this.field31.addKeyListener(this);
       this.field32.addKeyListener(this);
       this.field41.addKeyListener(this);
       this.field42.addKeyListener(this);
       this.field51.addKeyListener(this);
       this.field52.addKeyListener(this);
       this.field61.addKeyListener(this);
       this.field62.addKeyListener(this);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        field11 = new javax.swing.JTextField();
        field12 = new javax.swing.JTextField();
        field22 = new javax.swing.JTextField();
        field21 = new javax.swing.JTextField();
        field31 = new javax.swing.JTextField();
        field32 = new javax.swing.JTextField();
        field42 = new javax.swing.JTextField();
        field41 = new javax.swing.JTextField();
        field52 = new javax.swing.JTextField();
        field51 = new javax.swing.JTextField();
        field61 = new javax.swing.JTextField();
        field62 = new javax.swing.JTextField();
        regresarButton1 = new javax.swing.JButton();
        salirButton1 = new javax.swing.JButton();
        tablaButton = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.setEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel1.setGradientFocus(600);
        kGradientPanel1.setStartColor(new java.awt.Color(0, 0, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 370));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mundial/banner_rusia1.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 150));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PARTIDOS GRUPO F");
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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("COREA");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 70, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ALEMANIA");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("SUECIA");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 70, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("ALEMANIA");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 70, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("COREA");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 70, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("MEXICO");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("MÉXICO");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 90, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("COREA");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 70, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("SUECIA");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 70, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("MÉXICO");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 90, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("SUECIA");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 70, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("ALEMANIA");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 70, 30));

        field11.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 40, -1));

        field12.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 40, -1));

        field22.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 40, -1));

        field21.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 40, -1));

        field31.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field31, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 40, -1));

        field32.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field32, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 40, -1));

        field42.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field42, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 40, -1));

        field41.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 40, -1));

        field52.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field52, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 40, -1));

        field51.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field51, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 40, -1));

        field61.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field61, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 40, -1));

        field62.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field62, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 40, -1));

        regresarButton1.setBackground(new java.awt.Color(102, 0, 51));
        regresarButton1.setForeground(new java.awt.Color(255, 255, 255));
        regresarButton1.setText("REGRESAR");
        regresarButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        regresarButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(regresarButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 30));

        salirButton1.setBackground(new java.awt.Color(102, 0, 51));
        salirButton1.setForeground(new java.awt.Color(255, 255, 255));
        salirButton1.setText("SALIR");
        salirButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        salirButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(salirButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 100, 30));

        tablaButton.setBackground(new java.awt.Color(93, 20, 84));
        tablaButton.setForeground(new java.awt.Color(255, 255, 255));
        tablaButton.setText("VER TABLA");
        tablaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        tablaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(tablaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 100, 30));

        guardar.setBackground(new java.awt.Color(93, 20, 84));
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("GUARDAR");
        guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 100, 30));

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

    private void regresarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarButton1ActionPerformed

    private void salirButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirButton1ActionPerformed

    private void tablaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaButtonActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

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
           Partidos ope = new Partidos(main);
        }
        if(e.getSource() == this.tablaButton)
        {
            Tabla ope = new Tabla(main, "TABLA GRUPO F", this.rutA);
            this.ordenarClasificados();
            JOptionPane.showMessageDialog(null,"Primer clasificado: " + this.clasif1);
            JOptionPane.showMessageDialog(null,"Segundo clasificado: " + this.clasif2);
        }
        if(e.getSource() == this.guardar)
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
     
    public ArrayList<Partido> getTodosPartidos()
    {
        ArrayList<Partido> partidos = new ArrayList();
        Partido partido = null;
        String registro;
        FileReader file;
        BufferedReader br;
        
        try 
        {
            file = new FileReader(this.rutaPartidos);
            br = new BufferedReader(file);
            while((registro=br.readLine())!= null)//mientras haya registro
            {
                String pieces[] = registro.split(",");
                partido = new Partido(pieces[0], Integer.parseInt(pieces[1]),Integer.parseInt(pieces[2]));    
                partidos.add(partido);
            }            
        } 
        catch (IOException ex) 
        {
            System.out.println("Problemas buscando la materia...");
        }       
        return partidos;
    }
    
    public ArrayList<Equipo> getTodosEquipos()//Si tiene que devolver los equipos
    {
        ArrayList<Equipo> teams = new ArrayList();
        Equipo team = null;
        String registro;
        FileReader file;
        BufferedReader br;
       
        try
        {
            file = new FileReader(this.rutA);
            br = new BufferedReader(file);
            while((registro=br.readLine())!= null)//mientras haya registro
            {
                String pieces[] = registro.split(",");
                team = new Equipo(pieces[0], Integer.parseInt(pieces[1]), Integer.parseInt(pieces[2]), Integer.parseInt(pieces[3]), Integer.parseInt(pieces[4]));
                teams.add(team);              
            }            
        }
        catch (IOException ex)
        {
            System.out.println("Problemas buscando equipos...");
        }      
        return teams;
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
                clasificado = new Octavo(pieces[0], pieces[1], Integer.parseInt(pieces[2]));    
                octavos.add(clasificado);
            }            
        }
        catch (IOException ex)
        {
            System.out.println("Problemas buscando la materia...");
        }      
        return octavos;
    }

    public void modificar()
    { 
        ArrayList<Partido> partidos = this.getTodosPartidos();
        
        for(Partido partido : partidos) 
        {
            if (partido.getNombre().equals("partido1"))
            {
                partido.setRes1(Integer.parseInt(this.field11.getText()));
                partido.setRes2(Integer.parseInt(this.field12.getText()));
                this.reemplazarArchivo(partidos);
            }
            if (partido.getNombre().equals("partido2") )
            {
                partido.setRes1(Integer.parseInt(this.field21.getText()));
                partido.setRes2(Integer.parseInt(this.field22.getText()));
                this.reemplazarArchivo(partidos);
            }
            if (partido.getNombre().equals("partido3"))
            {
                partido.setRes1(Integer.parseInt(this.field31.getText()));
                partido.setRes2(Integer.parseInt(this.field32.getText()));
                this.reemplazarArchivo(partidos);
            }
            if (partido.getNombre().equals("partido4"))
            {
                partido.setRes1(Integer.parseInt(this.field41.getText()));
                partido.setRes2(Integer.parseInt(this.field42.getText()));
                this.reemplazarArchivo(partidos);
            }
            if (partido.getNombre().equals("partido5"))
            {
                partido.setRes1(Integer.parseInt(this.field51.getText()));
                partido.setRes2(Integer.parseInt(this.field52.getText()));
                this.reemplazarArchivo(partidos);
            }
            if (partido.getNombre().equals("partido6"))
            {
                partido.setRes1(Integer.parseInt(this.field61.getText()));
                partido.setRes2(Integer.parseInt(this.field62.getText()));
                this.reemplazarArchivo(partidos);
            }
        }
    }
    
    public void cargarRes()
    {
        ArrayList<Partido> part = this.getTodosPartidos();
        int contador = 0;
        for(Partido partidos : part)
        {
            contador++;
            if (contador == 1) 
            {
                this.field11.setText(String.valueOf(partidos.getRes1()));
                this.field12.setText(String.valueOf(partidos.getRes2())); 
            }
            if (contador == 2) 
            {
               this.field21.setText(String.valueOf(partidos.getRes1()));
               this.field22.setText(String.valueOf(partidos.getRes2())); 
            }
            if (contador == 3) 
            {
               this.field31.setText(String.valueOf(partidos.getRes1()));
               this.field32.setText(String.valueOf(partidos.getRes2())); 
            }
            if (contador == 4) 
            {
               this.field41.setText(String.valueOf(partidos.getRes1()));
               this.field42.setText(String.valueOf(partidos.getRes2())); 
            }
            if (contador == 5) 
            {
               this.field51.setText(String.valueOf(partidos.getRes1()));
               this.field52.setText(String.valueOf(partidos.getRes2())); 
            }
            if (contador == 6) 
            {
               this.field61.setText(String.valueOf(partidos.getRes1()));
               this.field62.setText(String.valueOf(partidos.getRes2())); 
            }
        }
    }
    
    private void agregarPuntos()
    {
        ArrayList <Equipo> teams = this.getTodosEquipos();
      int puntosR = 0;
      int golesEnContraR = 0;
      int golesAFavorR = 0;
      int difGolesR = 0;
      int puntosA = 0;
      int golesEnContraA = 0;
      int golesAFavorA = 0;
      int difGolesA = 0;
      int puntosE = 0;
      int golesEnContraE = 0;
      int golesAFavorE = 0;
      int difGolesE = 0;
      int puntosU = 0;
      int golesEnContraU = 0;
      int golesAFavorU = 0;
      int difGolesU = 0;
       
       
        for(Equipo team: teams)
        {
        //puntos para Rusia
            if(team.getNombre().equals("ALEMANIA"))
            {
                //PARTIDO 1
                if(Integer.parseInt(this.field11.getText()) > Integer.parseInt(this.field12.getText()))
                {
                    puntosR = 3;
                    team.setPuntos(puntosR);
                    golesAFavorR = Integer.parseInt(this.field11.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR = Integer.parseInt(this.field12.getText());
                    team.setGolesEnContra(golesEnContraR);
                    team.setDifGoles(golesAFavorR - golesEnContraR);
                }
                else
                {
                    puntosR = 0;
                    team.setPuntos(puntosR);
                    golesAFavorR = Integer.parseInt(this.field11.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR = Integer.parseInt(this.field12.getText());
                    team.setGolesEnContra(golesEnContraR);

                    team.setDifGoles(golesAFavorR - golesEnContraR);
                }
                if(Integer.parseInt(this.field11.getText()) == Integer.parseInt(this.field12.getText()))
                {
                    puntosR = 1;
                    team.setPuntos(puntosR);
                    golesAFavorR = Integer.parseInt(this.field11.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR = Integer.parseInt(this.field12.getText());
                    team.setGolesEnContra(golesEnContraR);

                    team.setDifGoles(golesAFavorR - golesEnContraR);    
                }
                //PARTIDO 2
                if(Integer.parseInt(this.field31.getText()) > Integer.parseInt(this.field32.getText()))
                {
                    puntosR += 3;
                    team.setPuntos(puntosR);
                    golesAFavorR += Integer.parseInt(this.field31.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR += Integer.parseInt(this.field32.getText());
                    team.setGolesEnContra(golesEnContraR);

                    team.setDifGoles(golesAFavorR - golesEnContraR);
                }
                else
                {
                    //puntosR += 0;
                    team.setPuntos(puntosR);
                    golesAFavorR += Integer.parseInt(this.field31.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR += Integer.parseInt(this.field32.getText());
                    team.setGolesEnContra(golesEnContraR);

                    team.setDifGoles(golesAFavorR - golesEnContraR);
                }
                if(Integer.parseInt(this.field31.getText()) == Integer.parseInt(this.field32.getText()))
                {
                    puntosR += 1;
                    team.setPuntos(puntosR);
                    golesAFavorR += Integer.parseInt(this.field31.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR += Integer.parseInt(this.field32.getText());
                    team.setGolesEnContra(golesEnContraR);

                    team.setDifGoles(golesAFavorR - golesEnContraR);    
                }
                //PARTIDO 3
                if(Integer.parseInt(this.field61.getText()) < Integer.parseInt(this.field62.getText()))
                {
                    puntosR += 3;
                    team.setPuntos(puntosR);
                    golesAFavorR += Integer.parseInt(this.field62.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR += Integer.parseInt(this.field61.getText());
                    team.setGolesEnContra(golesEnContraR);

                    team.setDifGoles(golesAFavorR - golesEnContraR);
                }
                else
                {
                    //puntosR += 0;
                    team.setPuntos(puntosR);
                    golesAFavorR += Integer.parseInt(this.field62.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR += Integer.parseInt(this.field61.getText());
                    team.setGolesEnContra(golesEnContraR);

                    team.setDifGoles(golesAFavorR - golesEnContraR);
                }
                if(Integer.parseInt(this.field61.getText()) == Integer.parseInt(this.field62.getText()))
                {
                    puntosR += 1;
                    team.setPuntos(puntosR);
                    golesAFavorR += Integer.parseInt(this.field62.getText());
                    team.setGolesAFavor(golesAFavorR);
                    golesEnContraR += Integer.parseInt(this.field61.getText());
                    team.setGolesEnContra(golesEnContraR);

                    team.setDifGoles(golesAFavorR - golesEnContraR);    
                }


                this.actualizarTabla(teams);
            }
            //puntos para Arabia
            if(team.getNombre().equals("MEXICO"))
            {
                //PARTIDO 1
                if(Integer.parseInt(this.field11.getText()) < Integer.parseInt(this.field12.getText()))
                {
                    puntosA = 3;
                    team.setPuntos(puntosA);
                    golesAFavorA = Integer.parseInt(this.field12.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA = Integer.parseInt(this.field11.getText());
                    team.setGolesEnContra(golesEnContraA);
                    difGolesA = Integer.parseInt(this.field12.getText()) - Integer.parseInt(this.field11.getText());
                    team.setDifGoles(difGolesA);
                }
                else if(Integer.parseInt(this.field11.getText()) > Integer.parseInt(this.field12.getText()))
                {
                    puntosA = 0;
                    team.setPuntos(puntosA);
                    golesAFavorA = Integer.parseInt(this.field12.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA = Integer.parseInt(this.field11.getText());
                    team.setGolesEnContra(golesEnContraA);
                    difGolesA = Integer.parseInt(this.field12.getText()) - Integer.parseInt(this.field11.getText());
                    team.setDifGoles(difGolesA);
                }
                else if(Integer.parseInt(this.field11.getText()) == Integer.parseInt(this.field12.getText()))
                {
                    puntosA = 1;
                    team.setPuntos(puntosA);
                    golesAFavorA = Integer.parseInt(this.field12.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA = Integer.parseInt(this.field11.getText());
                    team.setGolesEnContra(golesEnContraA);

                    team.setDifGoles(0);    
                }
                //PARTIDO 2
                if(Integer.parseInt(this.field41.getText()) < Integer.parseInt(this.field42.getText()))
                {
                    puntosA += 3;
                    team.setPuntos(puntosA);
                    golesAFavorA += Integer.parseInt(this.field42.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA += Integer.parseInt(this.field41.getText());
                    team.setGolesEnContra(golesEnContraA);
                    difGolesA += Integer.parseInt(this.field42.getText()) - Integer.parseInt(this.field41.getText());
                    team.setDifGoles(difGolesA);
                }
                else if(Integer.parseInt(this.field41.getText()) > Integer.parseInt(this.field42.getText()))
                {
                    //puntosR += 0;
                    team.setPuntos(puntosA);
                    golesAFavorA += Integer.parseInt(this.field42.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA += Integer.parseInt(this.field41.getText());
                    team.setGolesEnContra(golesEnContraA);
                    difGolesA += Integer.parseInt(this.field42.getText()) - Integer.parseInt(this.field41.getText());
                    team.setDifGoles(difGolesA);
                }
                else if(Integer.parseInt(this.field41.getText()) == Integer.parseInt(this.field42.getText()))
                {
                    puntosA += 1;
                    team.setPuntos(puntosA);
                    golesAFavorA += Integer.parseInt(this.field42.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA += Integer.parseInt(this.field41.getText());
                    team.setGolesEnContra(golesEnContraA);

                    team.setDifGoles(0);    
                }
                //PAATIDO 3
                if(Integer.parseInt(this.field51.getText()) > Integer.parseInt(this.field52.getText()))
                {
                    puntosA += 3;
                    team.setPuntos(puntosA);
                    golesAFavorA += Integer.parseInt(this.field51.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA += Integer.parseInt(this.field52.getText());
                    team.setGolesEnContra(golesEnContraA);
                    difGolesA += Integer.parseInt(this.field51.getText()) - Integer.parseInt(this.field52.getText());
                    team.setDifGoles(difGolesA);
                }
                else if(Integer.parseInt(this.field51.getText()) < Integer.parseInt(this.field52.getText()))
                {
                    //puntosR += 0;
                    team.setPuntos(puntosA);
                    golesAFavorA += Integer.parseInt(this.field51.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA += Integer.parseInt(this.field52.getText());
                    team.setGolesEnContra(golesEnContraA);
                    difGolesA += Integer.parseInt(this.field51.getText()) - Integer.parseInt(this.field52.getText());
                    team.setDifGoles(difGolesA);
                }
                else if(Integer.parseInt(this.field51.getText()) == Integer.parseInt(this.field52.getText()))
                {
                    puntosA += 1;
                    team.setPuntos(puntosA);
                    golesAFavorA += Integer.parseInt(this.field51.getText());
                    team.setGolesAFavor(golesAFavorA);
                    golesEnContraA += Integer.parseInt(this.field52.getText());
                    team.setGolesEnContra(golesEnContraA);

                    team.setDifGoles(0);    
                }
               this.actualizarTabla(teams);
            }
            //puntos para EGIPTO
            if(team.getNombre().equals("SUECIA"))
            {
                //PARTIDO 1
                if(Integer.parseInt(this.field21.getText()) > Integer.parseInt(this.field22.getText()))
                {
                    puntosE = 3;
                    team.setPuntos(puntosA);
                    golesAFavorE = Integer.parseInt(this.field21.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE = Integer.parseInt(this.field22.getText());
                    team.setGolesEnContra(golesEnContraE);
                    difGolesE = Integer.parseInt(this.field21.getText()) - Integer.parseInt(this.field22.getText());
                    team.setDifGoles(difGolesE);
                }
                else if(Integer.parseInt(this.field21.getText()) < Integer.parseInt(this.field22.getText()))
                {
                    puntosE = 0;
                    team.setPuntos(puntosE);
                    golesAFavorE = Integer.parseInt(this.field21.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE = Integer.parseInt(this.field22.getText());
                    team.setGolesEnContra(golesEnContraE);
                    difGolesE = Integer.parseInt(this.field21.getText()) - Integer.parseInt(this.field22.getText());
                    team.setDifGoles(difGolesE);
                }
                else if(Integer.parseInt(this.field21.getText()) == Integer.parseInt(this.field22.getText()))
                {
                    puntosE = 1;
                    team.setPuntos(puntosE);
                    golesAFavorE = Integer.parseInt(this.field22.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE = Integer.parseInt(this.field21.getText());
                    team.setGolesEnContra(golesEnContraE);

                    team.setDifGoles(0);    
                }
                //PARTIDO 2
                if(Integer.parseInt(this.field31.getText()) < Integer.parseInt(this.field32.getText()))
                {
                    puntosE += 3;
                    team.setPuntos(puntosE);
                    golesAFavorE += Integer.parseInt(this.field32.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE += Integer.parseInt(this.field31.getText());
                    team.setGolesEnContra(golesEnContraE);
                    difGolesE += Integer.parseInt(this.field32.getText()) - Integer.parseInt(this.field31.getText());
                    team.setDifGoles(difGolesE);
                }
                else if(Integer.parseInt(this.field31.getText()) > Integer.parseInt(this.field32.getText()))
                {
                    //puntosR += 0;
                    team.setPuntos(puntosE);
                    golesAFavorE += Integer.parseInt(this.field32.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE += Integer.parseInt(this.field31.getText());
                    team.setGolesEnContra(golesEnContraE);
                    difGolesE += Integer.parseInt(this.field32.getText()) - Integer.parseInt(this.field31.getText());
                    team.setDifGoles(difGolesE);
                }
                else if(Integer.parseInt(this.field31.getText()) == Integer.parseInt(this.field32.getText()))
                {
                    puntosE += 1;
                    team.setPuntos(puntosE);
                    golesAFavorE += Integer.parseInt(this.field32.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE += Integer.parseInt(this.field31.getText());
                    team.setGolesEnContra(golesEnContraE);

                    team.setDifGoles(0);    
                }
                //PAATIDO 3
                if(Integer.parseInt(this.field51.getText()) < Integer.parseInt(this.field52.getText()))
                {
                    puntosE += 3;
                    team.setPuntos(puntosE);
                    golesAFavorE += Integer.parseInt(this.field52.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE += Integer.parseInt(this.field51.getText());
                    team.setGolesEnContra(golesEnContraE);
                    difGolesE += Integer.parseInt(this.field52.getText()) - Integer.parseInt(this.field51.getText());
                    team.setDifGoles(difGolesE);
                }
                else if(Integer.parseInt(this.field51.getText()) > Integer.parseInt(this.field52.getText()))
                {
                    //puntosR += 0;
                    team.setPuntos(puntosE);
                    golesAFavorE += Integer.parseInt(this.field52.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE += Integer.parseInt(this.field51.getText());
                    team.setGolesEnContra(golesEnContraE);
                    difGolesE += Integer.parseInt(this.field52.getText()) - Integer.parseInt(this.field51.getText());
                    team.setDifGoles(difGolesE);
                }
                else if(Integer.parseInt(this.field52.getText()) == Integer.parseInt(this.field51.getText()))
                {
                    puntosE += 1;
                    team.setPuntos(puntosE);
                    golesAFavorE += Integer.parseInt(this.field52.getText());
                    team.setGolesAFavor(golesAFavorE);
                    golesEnContraE += Integer.parseInt(this.field51.getText());
                    team.setGolesEnContra(golesEnContraE);

                    team.setDifGoles(0);    
                }
               this.actualizarTabla(teams);
            }
            //Partidos URUGUAY
            if(team.getNombre().equals("COREA"))
            {
                //PARTIDO 1
                if(Integer.parseInt(this.field21.getText()) < Integer.parseInt(this.field22.getText()))
                {
                    puntosU = 3;
                    team.setPuntos(puntosU);
                    golesAFavorU = Integer.parseInt(this.field22.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU = Integer.parseInt(this.field21.getText());
                    team.setGolesEnContra(golesEnContraU);
                    difGolesU = Integer.parseInt(this.field22.getText()) - Integer.parseInt(this.field21.getText());
                    team.setDifGoles(difGolesU);
                }
                else if(Integer.parseInt(this.field21.getText()) > Integer.parseInt(this.field22.getText()))
                {
                    puntosU = 0;
                    team.setPuntos(puntosU);
                    golesAFavorU = Integer.parseInt(this.field22.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU = Integer.parseInt(this.field21.getText());
                    team.setGolesEnContra(golesEnContraU);
                    difGolesU = Integer.parseInt(this.field22.getText()) - Integer.parseInt(this.field21.getText());
                    team.setDifGoles(difGolesU);
                }
                else if(Integer.parseInt(this.field21.getText()) == Integer.parseInt(this.field22.getText()))
                {
                    puntosU = 1;
                    team.setPuntos(puntosU);
                    golesAFavorU = Integer.parseInt(this.field22.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU = Integer.parseInt(this.field21.getText());
                    team.setGolesEnContra(golesEnContraU);

                    team.setDifGoles(0);    
                }
                //PARTIDO 2
                if(Integer.parseInt(this.field41.getText()) > Integer.parseInt(this.field42.getText()))
                {
                    puntosU += 3;
                    team.setPuntos(puntosU);
                    golesAFavorU += Integer.parseInt(this.field41.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU += Integer.parseInt(this.field42.getText());
                    team.setGolesEnContra(golesEnContraU);
                    difGolesU += Integer.parseInt(this.field41.getText()) - Integer.parseInt(this.field42.getText());
                    team.setDifGoles(difGolesU);
                }
                else if(Integer.parseInt(this.field41.getText()) < Integer.parseInt(this.field42.getText()))
                {
                    team.setPuntos(puntosU);
                    golesAFavorU += Integer.parseInt(this.field41.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU += Integer.parseInt(this.field42.getText());
                    team.setGolesEnContra(golesEnContraU);
                    difGolesU += Integer.parseInt(this.field41.getText()) - Integer.parseInt(this.field42.getText());
                    team.setDifGoles(difGolesU);
                }
                else if(Integer.parseInt(this.field41.getText()) == Integer.parseInt(this.field42.getText()))
                {
                    puntosU += 1;
                    team.setPuntos(puntosU);
                    golesAFavorU += Integer.parseInt(this.field41.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU += Integer.parseInt(this.field42.getText());
                    team.setGolesEnContra(golesEnContraU);;    
                }
                //PARTIDO 3
                if(Integer.parseInt(this.field61.getText()) > Integer.parseInt(this.field62.getText()))
                {
                    puntosU += 3;
                    team.setPuntos(puntosU);
                    golesAFavorU += Integer.parseInt(this.field61.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU += Integer.parseInt(this.field62.getText());
                    team.setGolesEnContra(golesEnContraU);
                    difGolesU += Integer.parseInt(this.field41.getText()) - Integer.parseInt(this.field42.getText());
                    team.setDifGoles(difGolesU);
                }
                else if(Integer.parseInt(this.field61.getText()) < Integer.parseInt(this.field62.getText()))
                {
                    team.setPuntos(puntosU);
                    golesAFavorU += Integer.parseInt(this.field61.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU += Integer.parseInt(this.field62.getText());
                    team.setGolesEnContra(golesEnContraU);
                    difGolesU += Integer.parseInt(this.field41.getText()) - Integer.parseInt(this.field42.getText());
                    team.setDifGoles(difGolesU);
                }
                else if(Integer.parseInt(this.field61.getText()) == Integer.parseInt(this.field62.getText()))
                {
                    puntosA += 1;
                    team.setPuntos(puntosU);
                    golesAFavorU += Integer.parseInt(this.field61.getText());
                    team.setGolesAFavor(golesAFavorU);
                    golesEnContraU += Integer.parseInt(this.field62.getText());
                    team.setGolesEnContra(golesEnContraU);
                }
               this.actualizarTabla(teams);
            }
        }
    }
    
    private void guardarClasificados()
    {
        ArrayList<Octavo> clasificados = this.getTodosOctavos();
       
        for(Octavo clasificado : clasificados)
        {
            if (clasificado.getCode().equals("F1"))
            {
                clasificado.setNombre(this.clasif1);
               
                this.actualizarOctavos(clasificados);
            }
            if (clasificado.getCode().equals("F2"))
            {
                clasificado.setNombre(this.clasif2);
               
                this.actualizarOctavos(clasificados);
            }
        }
    }
    
    private void reemplazarArchivo(ArrayList<Partido> partido)
    {
              
        File file;
        FileWriter fw;
        PrintWriter pw;
        
        try 
        {
            file = new File(this.rutaPartidos);
            fw = new FileWriter (file, false);
            pw = new PrintWriter(fw);
            for(Partido partidos : partido)
            {
                pw.println(partidos);
            }
            pw.close();             
        }
        catch (IOException ex) 
        {
            System.out.println("Problemas reemplazando archivo...");
        }
    }
    
    public void actualizarTabla(ArrayList<Equipo> teams)
    {
        File file;
        FileWriter fw;
        PrintWriter pw;
        
        try 
        {
            file = new File(this.rutA);
            fw = new FileWriter (file, false);
            pw = new PrintWriter(fw);
            for(Equipo team : teams)
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
    
    public void actualizarOctavos(ArrayList<Octavo> teams)
    {
        File file;
        FileWriter fw;
        PrintWriter pw;
       
        try
        {
            file = new File(this.rutaOctavos);
            fw = new FileWriter (file, false);
            pw = new PrintWriter(fw);
            for(Octavo team : teams)
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
        this.agregarPuntos();
        this.ordenarClasificados();
        }
    }
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
        if (!valido) 
        {
            JOptionPane.showMessageDialog(null,"No puede dejar un campo vacio", "Aviso", 2); 
        }
        return valido;
    }
    
    private void ordenarClasificados()
    {
        ArrayList<Equipo> teams = this.getTodosEquipos();
        int[] puntos = new int[4];

        for(Equipo team : teams)
        {
            if (team.getNombre().equals("ALEMANIA")) 
            {
                puntos[0] = team.getPuntos();
            }
            if (team.getNombre().equals("MEXICO")) 
            {
                puntos[1] = team.getPuntos();
            }
            if (team.getNombre().equals("SUECIA")) 
            {
                puntos[2] = team.getPuntos();
            }
            if (team.getNombre().equals("COREA")) 
            {
                puntos[3] = team.getPuntos();
            }
        }
        int auxiliar = 0;
        for (int i = 0; i < puntos.length ; i++) 
        {
            for (int j = i+1; j < puntos.length; j++) 
            {
                if (puntos[i] < puntos[j]) 
                {
                    auxiliar = puntos[i];
                    puntos[i] = puntos[j];
                    puntos[j] = auxiliar;
                }
            }
        }

        int clasificado1 = puntos[0];
        int clasificado2 = puntos[1];

        for(Equipo team : teams)
        {
            if (team.getPuntos() == clasificado1) 
            {
                this.clasif1 = team.getNombre();
            }
            if (team.getPuntos() == clasificado2) 
            {
                this.clasif2 = team.getNombre();
            }
        }
        this.guardarClasificados();
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
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton regresarButton1;
    private javax.swing.JButton salirButton;
    private javax.swing.JButton salirButton1;
    private javax.swing.JButton tablaButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) 
    {
        char c = ke.getKeyChar();//Capturar el caracter que el usuario acabo de escribir
      
        if(ke.getSource() == this.field11)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field12)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field21)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field22)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field31)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field32)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field41)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field42)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field51)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field52)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field61)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
        if(ke.getSource()==this.field62)
        {
            if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE))
            {
              getToolkit().beep();
              JOptionPane.showMessageDialog(null,"Caracter no valido en ese campo!");
              ke.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
    }

}
