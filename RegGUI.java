import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 95farfar
 */
/*
 * Här är GUI-klassen
 */
public class RegGUI extends javax.swing.JFrame {

    String filnamn;
    AbstractItem item;
    ArrayList <AbstractItem> data;
    Library library;
    AbstractItem c1;
    
    public RegGUI() {
        initComponents();
        this.data = new ArrayList<AbstractItem>();
        this.library = new Library();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txfTitle = new javax.swing.JTextField();
        txfGenre = new javax.swing.JTextField();
        txfYear = new javax.swing.JTextField();
        lblTitel = new javax.swing.JLabel();
        lblGenre = new javax.swing.JLabel();
        lblReleaseYear = new javax.swing.JLabel();
        rdbGame = new javax.swing.JRadioButton();
        rdbFilm = new javax.swing.JRadioButton();
        rdbAlbum = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultat = new javax.swing.JTextArea();
        btnAddCSV = new javax.swing.JButton();
        btnValjFil = new javax.swing.JButton();
        btnLasFil = new javax.swing.JButton();
        txfProducer = new javax.swing.JTextField();
        lblProducer = new javax.swing.JLabel();
        btnAddXML = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setText("Title:");

        lblGenre.setText("Genre:");

        lblReleaseYear.setText("Release year:");

        buttonGroup1.add(rdbGame);
        rdbGame.setText("Game");

        buttonGroup1.add(rdbFilm);
        rdbFilm.setText("Film");

        buttonGroup1.add(rdbAlbum);
        rdbAlbum.setText("Album");

        txaResultat.setColumns(20);
        txaResultat.setRows(5);
        jScrollPane1.setViewportView(txaResultat);

        btnAddCSV.setText("Add CSV");
        btnAddCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCSVActionPerformed(evt);
            }
        });

        btnValjFil.setText("Choose file");
        btnValjFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjFilActionPerformed(evt);
            }
        });

        btnLasFil.setText("Read file");
        btnLasFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLasFilActionPerformed(evt);
            }
        });

        lblProducer.setText("Producer:");

        btnAddXML.setText("Add XML");
        btnAddXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddXMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddXML)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddCSV))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbFilm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGenre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbAlbum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblReleaseYear)
                                    .addComponent(lblProducer))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfGenre, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txfYear, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txfProducer))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnValjFil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnLasFil)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitel)
                    .addComponent(rdbGame))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenre)
                    .addComponent(rdbFilm))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReleaseYear)
                    .addComponent(rdbAlbum))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfProducer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducer))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCSV)
                    .addComponent(btnAddXML))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValjFil)
                    .addComponent(btnLasFil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arkiv");

        jMenuItem3.setText("Avsluta Program");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Om");

        jMenuItem2.setText("HJÄLP");
        jMenu2.add(jMenuItem2);

        jMenuItem1.setText("Om Skaparen");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
        System.exit(0);
            
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null,
                        "Copyright:...");
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /*
    Detta är vad som kommer att hända då knappen btnLasfil trycks! Först raderas
    textarean så att den blir tom, sedan fylls den med värderna som kommer
    från metoden lasFil i Library. Efter detta så görs textarean till så att
    man inte kan radera eller skriva nåt i den från GUI:t.
    */
    private void btnLasFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLasFilActionPerformed

        txaResultat.setText("");
        
        for(AbstractItem Item: library.lasFil()){
            txaResultat.append("Title: " + Item.getName() + "\n"
                + "Release year: " + Item.getYear() + "\n"
                + "Genre: " + Item.getGenre() + "\n"
                + "Producer: " + Item.getProducer() + "\n"
                + "Type: " + Item.getType() + "\n\n");
        }

        txaResultat.setEditable(false);
    }//GEN-LAST:event_btnLasFilActionPerformed
    /*
    När knappen Valjfil blir tryckt så körs metoden filechooser som ligger i 
    klassen Library.
    */
    private void btnValjFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjFilActionPerformed
        filnamn = library.fileChooser();
    }//GEN-LAST:event_btnValjFilActionPerformed
    /*
    Här är metoden för att skriva till CSV-filer. Den borde ligga i klassen
    Lirary men eftersom den är knappt 2 rader kod så kändes det önödigt att 
    flytta den dit. Beroende på vilken rdb som är tryckt så skapas ett obejkt 
    subklass som obektet tillhör.
    */
    private void btnAddCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCSVActionPerformed
        try{
            PrintWriter skrivfil = new PrintWriter(new BufferedWriter
                    (new FileWriter(filnamn, true)));
        
            if(rdbGame.isSelected()){
                
               c1 = new Game (txfTitle.getText(), txfYear.getText(), 
                    txfGenre.getText(), txfProducer.getText());
               data.add(c1);
                   
               skrivfil.println(c1.toString());
            }
            else if (rdbFilm.isSelected()){
                
                c1 = new Film (txfTitle.getText(), txfYear.getText(), 
                    txfGenre.getText(), txfProducer.getText());
                data.add(c1);
                   
                skrivfil.println(c1.toString());
            }
            else if (rdbAlbum.isSelected()){
                
                c1 = new Album (txfTitle.getText(), txfYear.getText(), 
                    txfGenre.getText(), txfProducer.getText());
                data.add(c1);
                   
                skrivfil.println(c1.toString());
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "You have not chosen a type to your object!");
            }
            
            skrivfil.close();
            txfTitle.setText("");
            txfYear.setText("");
            txfGenre.setText("");
            txfProducer.setText("");
            txaResultat.setText("");
            buttonGroup1.clearSelection();
        }
        catch(NullPointerException e){JOptionPane.showMessageDialog(null,
            "You have not selected which file you want to upload to!");} catch (IOException ex) {
            Logger.getLogger(RegGUI.class.getName()).log(Level.SEVERE, null, ex);
        };
    }//GEN-LAST:event_btnAddCSVActionPerformed
    /*
     * Detta är vad som händer när knappen btnAddXML trycks. Det som händer ska
    vara likanande det som händer när knappen addCSV trycks men av dnågon anledning 
    har detta slutat fungera. Förr kunnde jag ha ett item i XML filen och nu
    kan jag inte ha ens det....
     */
    
    private void btnAddXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddXMLActionPerformed
       
        
       if(rdbGame.isSelected()){
                
            item = new Game (txfTitle.getText(), txfYear.getText(), 
                 txfGenre.getText(), txfProducer.getText());
            

        }
        else if (rdbFilm.isSelected()){
                
            item = new Film (txfTitle.getText(), txfYear.getText(), 
                txfGenre.getText(), txfProducer.getText());
            
            
        }
        else if (rdbAlbum.isSelected()){
                
            item = new Album (txfTitle.getText(), txfYear.getText(), 
                txfGenre.getText(), txfProducer.getText());
            
            
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "You have not chosen a type to your object!");
        }
       
        library.writeXML(filnamn, item);
       
        txfTitle.setText("");
        txfYear.setText("");
        txfGenre.setText("");
        txfProducer.setText("");
        txaResultat.setText("");
            
        buttonGroup1.clearSelection();
        
        JOptionPane.showMessageDialog(null,"Du har nu skrivit till en XML-filen "
        + "myXML\n"
        + "som du kan hitta bland projektfilerna. XML-filen kan endast\n"
        + "innehålla ett item vilket betyder att varje gång du\n"
        + "skriver till filen så kommer det att skrivas över det\n"
        + "gamla! Med andra ord är den ganska värdelös!!"
        );
        
                      
    }//GEN-LAST:event_btnAddXMLActionPerformed

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
            java.util.logging.Logger.getLogger(RegGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCSV;
    private javax.swing.JButton btnAddXML;
    private javax.swing.JButton btnLasFil;
    private javax.swing.JButton btnValjFil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblProducer;
    private javax.swing.JLabel lblReleaseYear;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JRadioButton rdbAlbum;
    private javax.swing.JRadioButton rdbFilm;
    private javax.swing.JRadioButton rdbGame;
    private javax.swing.JTextArea txaResultat;
    private javax.swing.JTextField txfGenre;
    private javax.swing.JTextField txfProducer;
    private javax.swing.JTextField txfTitle;
    private javax.swing.JTextField txfYear;
    // End of variables declaration//GEN-END:variables
}