/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificaciones;

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
import negocio.Cuarto;
import negocio.Final;
import negocio.Octavo;
import negocio.Semi;

/**
 *
 * @author Mariajosé R
 */
public class Semis extends javax.swing.JFrame implements ActionListener, MouseListener, KeyListener 
{

    /**
     * Creates new form Inicio
     */
    private Inicio main;
    private String rutaFinales;
    private String rutaSemi;

    
     public Semis(Inicio main) 
    {
        initComponents();
        
        this.main = main;
        this.rutaFinales = "E:/Simulador Mundial/finales.txt";
        this.rutaSemi = "E:/Simulador Mundial/semi.txt";
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
       this.field11.addKeyListener(this); 
       this.field12.addKeyListener(this); 
       this.field21.addKeyListener(this); 
       this.field22.addKeyListener(this); 
    }
    
    private void mostrarPaises()
    {
       ArrayList<Semi> clasificados = this.getTodosSemi();
        
        for(Semi clasificado : clasificados) 
        {
            if (clasificado.getCode().equals("A"))
            {
                this.label1.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("B"))
            {
                this.label2.setText(clasificado.getNombre());
            }
            if (clasificado.getCode().equals("C"))
            {
                this.label3.setText(clasificado.getNombre());  
            }
            if (clasificado.getCode().equals("D"))
            {
                this.label4.setText(clasificado.getNombre());
            }
            
        } 
    }
    
    public ArrayList<Semi> getTodosSemi()
    {
        ArrayList<Semi> semi = new ArrayList();
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
                semi.add(clasificado);
            }            
        } 
        catch (IOException ex) 
        {
            System.out.println("Problemas buscando la materia...");
        }       
        return semi;
    }
    public ArrayList<Final> getTodosFinal()
    {
        ArrayList<Final> finales = new ArrayList();
        Final clasificado = null;
        String registro;
        FileReader file;
        BufferedReader br;
        
        try 
        {
            file = new FileReader(this.rutaFinales);
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
    
    private void cargarPuntuacion()
    {
        ArrayList<Semi> part = this.getTodosSemi();
        int contador = 0;
        for(Semi partidos : part)
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
        guardarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel3.setText("SEMI-FINALES");
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
        kGradientPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 90, 20));

        field11.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 40, 20));

        field12.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 40, 20));

        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label2.setText("B2");
        kGradientPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 90, 20));

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label3.setText("B1");
        kGradientPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 90, 20));

        field21.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 40, 20));

        field22.setBackground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.add(field22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 40, 20));

        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("A2");
        kGradientPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 90, 20));

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
        kGradientPanel1.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
     public void actualizarSemi(ArrayList<Cuarto> teams)
    {
        File file;
        FileWriter fw;
        PrintWriter pw;
        
        try 
        {
            file = new File(this.rutaSemi);
            fw = new FileWriter (file, false);
            pw = new PrintWriter(fw);
            for(Cuarto team : teams)
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
        //this.compararResultado();
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
        
        if (!valido) 
        {
            JOptionPane.showMessageDialog(null,"No puede dejar un campo vacio", "Aviso", 2); 
        }
        return valido;
    }
    public void modificar()
    { 
        ArrayList<Final> finales = this.getTodosFinal();
        String ganador = "";
        //Partido 1
        if( Integer.parseInt(field11.getText()) >  Integer.parseInt(field12.getText()))
        {
            ganador = this.label1.getText();
        }
        if( Integer.parseInt(field11.getText()) <  Integer.parseInt(field12.getText()))
        {
            ganador = this.label2.getText();
        }
        for(Final cuarto : finales)
        {
            if(cuarto.getCode().equals("A"))
            {
                cuarto.setNombre(ganador);
            }
        }
        //Partido 2
        if( Integer.parseInt(field21.getText()) >  Integer.parseInt(field22.getText()))
        {
            ganador = this.label3.getText();
        }
        if( Integer.parseInt(field21.getText()) <  Integer.parseInt(field22.getText()))
        {
            ganador = this.label4.getText();
        }
        for(Final cuarto : finales)
        {
            if(cuarto.getCode().equals("B"))
            {
                cuarto.setNombre(ganador);
            }
        }
        this.actualizarFinal(finales);
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField field11;
    private javax.swing.JTextField field12;
    private javax.swing.JTextField field21;
    private javax.swing.JTextField field22;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton salirButton;
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
        
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    private void actualizarFinal(ArrayList <Final> fin) 
    {
        File file;
        FileWriter fw;
        PrintWriter pw;
        
        try 
        {
            file = new File(this.rutaFinales);
            fw = new FileWriter (file, false);
            pw = new PrintWriter(fw);
            for(Final team : fin)
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
 
}
