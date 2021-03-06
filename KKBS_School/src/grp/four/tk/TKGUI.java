/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grp.four.tk;

import grp.four.bk.Dag;
import grp.four.ktr.Koretoj;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Patrick
 */
public class TKGUI extends javax.swing.JFrame {

    private TilknytKoretojHandler tilknytKoretojHandler;
    private TilfojKoretojerGUI tilfojKoretojerGUI;

    /**
     * Creates new form TKGUI
     */
    public TKGUI(TilknytKoretojHandler tilknytKoretojHandler, TilfojKoretojerGUI tilfojKoretojerGUI) {
        this.tilknytKoretojHandler = tilknytKoretojHandler;
        this.tilfojKoretojerGUI = tilfojKoretojerGUI;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setCompStatus() {
        Object selectedKurser = null;
        selectedKurser = bookedeKurser.getSelectedValue();
        Object selectedKoretojer = null;
        selectedKoretojer = tilfojedeKoretojer.getSelectedValue();
        
        
        
        if(selectedKurser != null) {
            Dag dag = tilknytKoretojHandler.hentDag(selectedKurser.toString().substring(0, 10));
            
            if(dag.getKoretojer().size() >= 6) {
                tilfoj.setEnabled(false);
            } else {
                tilfoj.setEnabled(true);
            }
            
            if(selectedKoretojer != null) {
                fjern.setEnabled(true);
            } else {
                fjern.setEnabled(false);
            }
        } else {
            tilfoj.setEnabled(false);
            fjern.setEnabled(false);
        }
    }

    public void setBookedeKurserModel(DefaultListModel bookedeKurser) {
        this.bookedeKurser.setModel(bookedeKurser);
    }

    public void setTilfojedeKoretojerModel(DefaultListModel tilfojedeKoretojer) {
        this.tilfojedeKoretojer.setModel(tilfojedeKoretojer);
    }

    public void populerBookedeKurser() {
        ArrayList<String> bookedeDage = tilknytKoretojHandler.hentBookedeDage();
        DefaultListModel bookedeDageModel = new DefaultListModel();
        

        for (String s : bookedeDage) {
            bookedeDageModel.addElement(s + " : " + tilknytKoretojHandler.hentAntalTilfojedeKoretojer(s.substring(0, 10)));
            
        }

        setBookedeKurserModel(bookedeDageModel);
    }
    
    public void populerTilfojedeKoretojer() {
        DefaultListModel dlm = new DefaultListModel();
        ArrayList<Koretoj> koretojer = tilknytKoretojHandler.hentTilfojedeKoretojer(bookedeKurser.getSelectedValue().toString().substring(0, 10));
        for(Koretoj k : koretojer) {
            dlm.addElement(k.getFdmNo());
        }
        tilfojedeKoretojer.setModel(dlm);
    }
    
    public void resetTilfojedeKoretojer() {
        DefaultListModel dlm = new DefaultListModel();
        setTilfojedeKoretojerModel(dlm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookedeKurser = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tilfojedeKoretojer = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        tilfoj = new javax.swing.JButton();
        fjern = new javax.swing.JButton();
        tilbage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tilknyt Køretøj");
        setResizable(false);

        bookedeKurser.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "14-09-2013 : Kategori A", "15-09-2013 : Kategori C", "17-09-2013 : Kategori D" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        bookedeKurser.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bookedeKurser.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                bookedeKurserValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(bookedeKurser);

        jLabel1.setText("Bookede kurser");

        tilfojedeKoretojer.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1. oisjmgksk4t54", "2. sggernldvn584", "3. asptufmcgk310" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        tilfojedeKoretojer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tilfojedeKoretojer.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tilfojedeKoretojerValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(tilfojedeKoretojer);

        jLabel2.setText("Tilføjede køretøjer");

        tilfoj.setText("Tilføj");
        tilfoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilfojActionPerformed(evt);
            }
        });

        fjern.setText("Fjern");
        fjern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fjernActionPerformed(evt);
            }
        });

        tilbage.setText("Tilbage");
        tilbage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilbageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tilfoj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fjern))
                    .addComponent(tilbage))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tilfoj)
                            .addComponent(fjern))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tilbage)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookedeKurserValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_bookedeKurserValueChanged
        boolean cont = true;
        String selection = "";

        try {
            selection = this.bookedeKurser.getSelectedValue().toString();
        } catch (Exception e) {
            cont = false;
        }

        if (cont) {
            String dato = selection.substring(0, 10);
            ArrayList<Koretoj> tilfojedeKoretojer = this.tilknytKoretojHandler.hentTilfojedeKoretojer(dato);
            DefaultListModel tilfojedeKoretojerModel = new DefaultListModel();

            try {
                for (Koretoj k : tilfojedeKoretojer) {
                    tilfojedeKoretojerModel.addElement(k.getFdmNo());
                }
            } catch (NullPointerException e) {
            }

            setTilfojedeKoretojerModel(tilfojedeKoretojerModel);
        }
        setCompStatus();
    }//GEN-LAST:event_bookedeKurserValueChanged

    private void tilbageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilbageActionPerformed
        dispose();
    }//GEN-LAST:event_tilbageActionPerformed

    private void tilfojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilfojActionPerformed
        Dag dag = tilknytKoretojHandler.hentDag(bookedeKurser.getSelectedValue().toString().substring(0, 10));
        tilfojKoretojerGUI.setTkGUI(this);
        tilfojKoretojerGUI.setDag(dag);
        tilfojKoretojerGUI.populerKoretojer();
        tilfojKoretojerGUI.setVisible(true);
    }//GEN-LAST:event_tilfojActionPerformed

    private void fjernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fjernActionPerformed
        boolean cont = true;
        String selection = "";
        String koretojSelection = "";

        try {
            selection = this.bookedeKurser.getSelectedValue().toString();
            koretojSelection = this.tilfojedeKoretojer.getSelectedValue().toString();
        } catch (Exception e) {
            cont = false;
        }

        if (cont) {
            String dato = selection.substring(0, 10);
            this.tilknytKoretojHandler.fjernKoretojFraDag(dato, koretojSelection);
        }
        populerTilfojedeKoretojer();
        setCompStatus();
    }//GEN-LAST:event_fjernActionPerformed

    private void tilfojedeKoretojerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tilfojedeKoretojerValueChanged
        setCompStatus();
    }//GEN-LAST:event_tilfojedeKoretojerValueChanged
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TKGUI().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList bookedeKurser;
    private javax.swing.JButton fjern;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton tilbage;
    private javax.swing.JButton tilfoj;
    private javax.swing.JList tilfojedeKoretojer;
    // End of variables declaration//GEN-END:variables
}
