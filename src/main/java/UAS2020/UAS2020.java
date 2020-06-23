package UAS2020;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UAS2020 extends javax.swing.JFrame {

    ArrayList<data> datalist;
    String Header [] = new String [] {"Nama","NIM","Prodi"};
    DefaultTableModel dtm;
    int row,col;
    
    public UAS2020() {
        initComponents();
        datalist =new ArrayList<>();
        dtm=new DefaultTableModel(Header,0);
        jTable.setModel(dtm);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        NIM = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        PRODI = new javax.swing.JLabel();
        comboprodi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tombol1 = new javax.swing.JButton();
        tombol2 = new javax.swing.JButton();
        tombol3 = new javax.swing.JButton();
        tombol4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("Nama");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        NIM.setText("NIM");

        PRODI.setText("Prodi");

        comboprodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prodi", "Matematika", "Siskom", "Sisfo", "Kelautan", "Statistika" }));
        comboprodi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboprodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboprodiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(NIM)
                    .addComponent(PRODI))
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboprodi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NIM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRODI)
                    .addComponent(comboprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Mahasiswa");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tombol1.setText("Tambah");
        tombol1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol1ActionPerformed(evt);
            }
        });

        tombol2.setText("Hapus");
        tombol2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol2ActionPerformed(evt);
            }
        });

        tombol3.setText("Update");
        tombol3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol3ActionPerformed(evt);
            }
        });

        tombol4.setText("Cari");
        tombol4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombol4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tombol1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tombol2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tombol3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tombol4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol1)
                    .addComponent(tombol2)
                    .addComponent(tombol3)
                    .addComponent(tombol4))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol1ActionPerformed
        // TODO add your handling code here:
        String nama = txtnama.getText();
        Integer nim = Integer.parseInt (txtnim.getText());
        String prodi = comboprodi.getSelectedItem().toString();
        datalist.add(new data(nama,prodi,nim));
        dtm.setRowCount(0);
        for (int i=0; i<datalist.size(); i++){
            Object [] objs = {datalist.get(i).nama,datalist.get(i).nim,datalist.get(i).prodi};
            dtm.addRow(objs);
        }
        clear();
    }//GEN-LAST:event_tombol1ActionPerformed

    private void tombol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol2ActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this,"Delete this data","Delete",dialogButton);
        if (dialogResult == 0){
            dtm.removeRow (row);
            datalist.remove (row);
            dtm.setRowCount(0);
            for(int i =0; i < datalist.size();i++){
            Object [] objs = {datalist.get(i).nama,datalist.get(i).nim,datalist.get(i).prodi};
            dtm.addRow(objs);
            }
            clear();
        }else{
            
        }
    }//GEN-LAST:event_tombol2ActionPerformed

    private void tombol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol3ActionPerformed
        // TODO add your handling code here:
        String updatenama = txtnama.getText();
        Integer updatenim = Integer.parseInt(txtnim.getText());
        String updateprodi = comboprodi.getSelectedItem().toString();
        datalist.get(row).nama = updatenama;
        datalist.get(row).nim = updatenim;
        datalist.get(row).prodi = updateprodi;
        dtm.setRowCount(0);
        for (int i = 0;i < datalist.size(); i++) {
            Object [] objs ={datalist.get(i).nama,datalist.get(i).nim,datalist.get(i).prodi};
            dtm.addRow(objs);
        }
    }//GEN-LAST:event_tombol3ActionPerformed

    private void tombol4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol4ActionPerformed
        // TODO add your handling code here:
        String in =JOptionPane.showInputDialog(this,"Mencari Data");
        for (int i = 0;i < datalist.size(); i++){
        if (datalist.get(i).nama.equalsIgnoreCase(in)){
            JOptionPane.showMessageDialog(tombol4, "ketemu","Cari Nama",2);
            txtnama.setText(datalist.get(i).nama);
            txtnim.setText(String.valueOf(datalist.get(i).nim));
            String location = datalist.get(i).nama;
            for (int j= 0; j<(comboprodi.getItemCount());j++){
                if (comboprodi.getItemAt(i).equalsIgnoreCase(location)){
                    comboprodi.setSelectedIndex(i);
                }
            }
            return;
            
        }
          
        }
        JOptionPane.showMessageDialog(tombol4,"Tidak Ketemu","Cari Nama",2);
            
      
    }//GEN-LAST:event_tombol4ActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed
    private void clear(){
        txtnama.requestFocus();
        txtnama.setText("");
        txtnim.setText("");
        comboprodi.setSelectedIndex(0);
        
        
    }
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        row = jTable.getSelectedRow();
        col = jTable.getColumnCount();
        System.out.println(row+","+col);
        txtnama.setText(dtm.getValueAt(row,0).toString());
        txtnim.setText(dtm.getValueAt(row, 1).toString());
        String location =dtm.getValueAt(row,2).toString();
        for (int i = 0; i<(comboprodi.getItemCount());i++){
            if (comboprodi.getItemAt(i).equalsIgnoreCase(location)){
                comboprodi.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void comboprodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboprodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboprodiActionPerformed


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
            java.util.logging.Logger.getLogger(UAS2020.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UAS2020.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UAS2020.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UAS2020.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UAS2020().setVisible(true);
            }
        });
                }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIM;
    private javax.swing.JLabel PRODI;
    private javax.swing.JComboBox<String> comboprodi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel name;
    private javax.swing.JButton tombol1;
    private javax.swing.JButton tombol2;
    private javax.swing.JButton tombol3;
    private javax.swing.JButton tombol4;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables
}
