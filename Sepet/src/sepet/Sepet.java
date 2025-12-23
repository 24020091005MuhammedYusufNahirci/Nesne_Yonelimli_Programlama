package sepet;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import tr.edu.istiklal.*;


public class Sepet extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Sepet.class.getName());
    DefaultTableModel model;
    Ekmek[] ekmekler = {
        new Ekmek("Tam Buğday", 10.0, "Esmer", 250),
        new Ekmek("Beyaz Ekmek", 8.0, "Beyaz", 200),
        new Ekmek("Çavdar", 12.0, "Siyah", 300)
    };

    Tekstil[] tekstiller = {
        new Tekstil("Mavi Tişört", 250.0, "Pamuk", 38, "LCW"),
        new Tekstil("Siyah Pantolon", 500.0, "Keten", 42, "Zara"),
        new Tekstil("Yün Kazak", 450.0, "Yün", 40, "Koton")
    };

    CepTelefonu[] telefonlar = {
        new CepTelefonu("iPhone 15", 55000.0, "Apple", "15 Pro"),
        new CepTelefonu("S24 Ultra", 50000.0, "Samsung", "S24"),
        new CepTelefonu("Redmi Note 13", 15000.0, "Xiaomi", "Pro")
    };

    public Sepet() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) jTable1.getModel(); 
    
    
        jComboBox3.removeAllItems();
        jComboBox3.addItem("Seçiniz...");
        jComboBox3.addItem("Ekmek");
        jComboBox3.addItem("Tekstil");
        jComboBox3.addItem("Cep Telefonu");
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTableSepet = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTableSepet.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableSepet);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "URUN TURU", "URUN", "FIYAT", "KDV'Lİ FİYAT"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jButton1.setText("EKLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(jButton1);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "URUN SECİNİZ" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jScrollPane2.setViewportView(jComboBox4);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "URUN TURU SECİN" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jScrollPane5.setViewportView(jComboBox3);

        jButton2.setText("SEPETTEN ÇIKAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("TOPLAM TUTAR:0,0 TL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object secilenObje = jComboBox4.getSelectedItem();
        
        if (secilenObje instanceof Urun) {
            Urun secilenUrun = (Urun) secilenObje; 
            String tur = jComboBox3.getSelectedItem().toString();
            
            model.addRow(new Object[]{
                tur,                            
                secilenUrun.getUrunAdi(),       
                secilenUrun.getUrunFiyati() + " TL",    
                String.format("%.2f TL", secilenUrun.kdvHesapla())
            });
            toplamHesapla(); // Toplamı güncelle
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Lütfen bir ürün seçin!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if (jComboBox3.getSelectedItem() == null) return;
        
        String secilenTur = jComboBox3.getSelectedItem().toString();
        jComboBox4.removeAllItems(); 
        
        if (secilenTur.equals("Ekmek")) {
            for (Ekmek e : ekmekler) jComboBox4.addItem(e);
        } else if (secilenTur.equals("Tekstil")) {
            for (Tekstil t : tekstiller) jComboBox4.addItem(t);
        } else if (secilenTur.equals("Cep Telefonu")) {
            for (CepTelefonu c : telefonlar) jComboBox4.addItem(c);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int seciliSatir = jTable1.getSelectedRow(); // Fareyle seçilen satırı bul
    
    if (seciliSatir != -1) {
        model.removeRow(seciliSatir); // Satırı tablodan sil
        toplamHesapla(); // Silme işleminden sonra toplamı güncelle
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Lütfen sepetten çıkarılacak ürünü seçin!");
    }
    }//GEN-LAST:event_jButton2ActionPerformed
   
    private void toplamHesapla() {
    double toplam = 0;
    // Tablodaki her satırı tek tek geziyoruz
    for (int i = 0; i < model.getRowCount(); i++) {
        // KDV'li fiyat 3. sütunda (index 3). 
        // Oradaki "10.50 TL" metninden sadece rakamı alıp double'a çeviriyoruz.
        String deger = model.getValueAt(i, 3).toString();
        deger = deger.replace(" TL", "").replace(",", "."); // "TL"yi sil ve virgülü noktaya çevir
        toplam += Double.parseDouble(deger);
    }
    // Sonucu etikete yazdırıyoruz
    jLabel1.setText(String.format("TOPLAM TUTAR: %.2f TL", toplam));
}


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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> new Sepet().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<Object> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableSepet;
    // End of variables declaration//GEN-END:variables
}
