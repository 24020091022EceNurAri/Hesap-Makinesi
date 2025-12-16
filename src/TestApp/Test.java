
package TestApp;
import java.lang.Math;
/**
 *
 * @author ariec
 */
public class Test extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Test.class.getName());


    public Test() {
        initComponents();
    }
    double a;
    double b;
    double sonuc;
    String op;
    String cevap;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jSayi7 = new javax.swing.JButton();
        jSayi8 = new javax.swing.JButton();
        jSayi9 = new javax.swing.JButton();
        jSayi1 = new javax.swing.JButton();
        jSayi4 = new javax.swing.JButton();
        jSayi5 = new javax.swing.JButton();
        jCikarma = new javax.swing.JButton();
        jSayi3 = new javax.swing.JButton();
        jSayi6 = new javax.swing.JButton();
        jToplama = new javax.swing.JButton();
        jSayi0 = new javax.swing.JButton();
        jSayi2 = new javax.swing.JButton();
        jBolme = new javax.swing.JButton();
        jNokta = new javax.swing.JButton();
        jEsittir = new javax.swing.JButton();
        jCarpma = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jKok = new javax.swing.JButton();
        jMod = new javax.swing.JButton();
        jSonucEkrani = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 227, 227));

        jSayi7.setBackground(new java.awt.Color(27, 60, 83));
        jSayi7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi7.setForeground(new java.awt.Color(255, 255, 255));
        jSayi7.setText("7");
        jSayi7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi7ActionPerformed(evt);
            }
        });

        jSayi8.setBackground(new java.awt.Color(27, 60, 83));
        jSayi8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi8.setForeground(new java.awt.Color(255, 255, 255));
        jSayi8.setText("8");
        jSayi8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi8ActionPerformed(evt);
            }
        });

        jSayi9.setBackground(new java.awt.Color(27, 60, 83));
        jSayi9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi9.setForeground(new java.awt.Color(255, 255, 255));
        jSayi9.setText("9");
        jSayi9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi9ActionPerformed(evt);
            }
        });

        jSayi1.setBackground(new java.awt.Color(27, 60, 83));
        jSayi1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi1.setForeground(new java.awt.Color(255, 255, 255));
        jSayi1.setText("1");
        jSayi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi1ActionPerformed(evt);
            }
        });

        jSayi4.setBackground(new java.awt.Color(27, 60, 83));
        jSayi4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi4.setForeground(new java.awt.Color(255, 255, 255));
        jSayi4.setText("4");
        jSayi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi4ActionPerformed(evt);
            }
        });

        jSayi5.setBackground(new java.awt.Color(27, 60, 83));
        jSayi5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi5.setForeground(new java.awt.Color(255, 255, 255));
        jSayi5.setText("5");
        jSayi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi5ActionPerformed(evt);
            }
        });

        jCikarma.setBackground(new java.awt.Color(35, 76, 106));
        jCikarma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCikarma.setForeground(new java.awt.Color(255, 255, 255));
        jCikarma.setText("-");
        jCikarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCikarmaActionPerformed(evt);
            }
        });

        jSayi3.setBackground(new java.awt.Color(27, 60, 83));
        jSayi3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi3.setForeground(new java.awt.Color(255, 255, 255));
        jSayi3.setText("3");
        jSayi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi3ActionPerformed(evt);
            }
        });

        jSayi6.setBackground(new java.awt.Color(27, 60, 83));
        jSayi6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi6.setForeground(new java.awt.Color(255, 255, 255));
        jSayi6.setText("6");
        jSayi6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi6ActionPerformed(evt);
            }
        });

        jToplama.setBackground(new java.awt.Color(35, 76, 106));
        jToplama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToplama.setForeground(new java.awt.Color(255, 255, 255));
        jToplama.setText("+");
        jToplama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToplamaActionPerformed(evt);
            }
        });

        jSayi0.setBackground(new java.awt.Color(27, 60, 83));
        jSayi0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi0.setForeground(new java.awt.Color(255, 255, 255));
        jSayi0.setText("0");
        jSayi0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi0ActionPerformed(evt);
            }
        });

        jSayi2.setBackground(new java.awt.Color(27, 60, 83));
        jSayi2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSayi2.setForeground(new java.awt.Color(255, 255, 255));
        jSayi2.setText("2");
        jSayi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSayi2ActionPerformed(evt);
            }
        });

        jBolme.setBackground(new java.awt.Color(35, 76, 106));
        jBolme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBolme.setForeground(new java.awt.Color(255, 255, 255));
        jBolme.setText("÷");
        jBolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBolmeActionPerformed(evt);
            }
        });

        jNokta.setBackground(new java.awt.Color(27, 60, 83));
        jNokta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jNokta.setForeground(new java.awt.Color(255, 255, 255));
        jNokta.setText(".");
        jNokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNoktaActionPerformed(evt);
            }
        });

        jEsittir.setBackground(new java.awt.Color(69, 104, 130));
        jEsittir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jEsittir.setForeground(new java.awt.Color(255, 255, 255));
        jEsittir.setText("=");
        jEsittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEsittirActionPerformed(evt);
            }
        });

        jCarpma.setBackground(new java.awt.Color(35, 76, 106));
        jCarpma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCarpma.setForeground(new java.awt.Color(255, 255, 255));
        jCarpma.setText("x");
        jCarpma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarpmaActionPerformed(evt);
            }
        });

        jClear.setBackground(new java.awt.Color(69, 104, 130));
        jClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jClear.setForeground(new java.awt.Color(255, 255, 255));
        jClear.setText("C");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jKok.setBackground(new java.awt.Color(35, 76, 106));
        jKok.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jKok.setForeground(new java.awt.Color(255, 255, 255));
        jKok.setText("√");
        jKok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKokActionPerformed(evt);
            }
        });

        jMod.setBackground(new java.awt.Color(35, 76, 106));
        jMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMod.setForeground(new java.awt.Color(255, 255, 255));
        jMod.setText("%");
        jMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModActionPerformed(evt);
            }
        });

        jSonucEkrani.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jKok, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jMod, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEsittir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jSayi7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jSayi8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jSayi9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSayi2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSayi4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSayi5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSayi3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBolme, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSayi6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jToplama, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jSayi0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jNokta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jCarpma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jCikarma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSonucEkrani))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jSonucEkrani, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSayi7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSayi8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSayi9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSayi4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSayi5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSayi6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToplama, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSayi2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSayi3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBolme, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSayi0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNokta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCarpma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCikarma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEsittir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKok, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModActionPerformed
        a = Double.parseDouble(jSonucEkrani.getText());
        op = "%";
        jSonucEkrani.setText("");
    }//GEN-LAST:event_jModActionPerformed

    private void jKokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKokActionPerformed

    }//GEN-LAST:event_jKokActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed

    }//GEN-LAST:event_jClearActionPerformed

    private void jCarpmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarpmaActionPerformed
        a = Double.parseDouble(jSonucEkrani.getText());
        op = "*";
        jSonucEkrani.setText("");
    }//GEN-LAST:event_jCarpmaActionPerformed

    private void jEsittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEsittirActionPerformed
        if(!jSonucEkrani.getText().contains(".")){
            
        }
            jSonucEkrani.setText(jSonucEkrani.getText()+jEsittir.getText());
    }//GEN-LAST:event_jEsittirActionPerformed

    private void jNoktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNoktaActionPerformed

    }//GEN-LAST:event_jNoktaActionPerformed

    private void jBolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBolmeActionPerformed
        a = Double.parseDouble(jSonucEkrani.getText());
        op = "/";
        jSonucEkrani.setText("");
    }//GEN-LAST:event_jBolmeActionPerformed

    private void jSayi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi2ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi2.getText());
    }//GEN-LAST:event_jSayi2ActionPerformed

    
    private void jSayi0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi0ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi0.getText());
    }//GEN-LAST:event_jSayi0ActionPerformed

    private void jToplamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToplamaActionPerformed
        a = Double.parseDouble(jSonucEkrani.getText());
        op = "+";
        jSonucEkrani.setText("");
    }//GEN-LAST:event_jToplamaActionPerformed

    private void jSayi6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi6ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi6.getText());
    }//GEN-LAST:event_jSayi6ActionPerformed

    private void jSayi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi3ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi3.getText());
    }//GEN-LAST:event_jSayi3ActionPerformed

    private void jCikarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCikarmaActionPerformed
        a = Double.parseDouble(jSonucEkrani.getText());
        op = "-";
        jSonucEkrani.setText("");
    }//GEN-LAST:event_jCikarmaActionPerformed

    private void jSayi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi5ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi5.getText());
    }//GEN-LAST:event_jSayi5ActionPerformed

    private void jSayi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi4ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi4.getText());
    }//GEN-LAST:event_jSayi4ActionPerformed

    private void jSayi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi1ActionPerformed
        jSonucEkrani.setText (jSonucEkrani.getText()+jSayi1.getText());
    }//GEN-LAST:event_jSayi1ActionPerformed

    private void jSayi9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi9ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi9.getText());
    }//GEN-LAST:event_jSayi9ActionPerformed

    private void jSayi8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi8ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi8.getText());
    }//GEN-LAST:event_jSayi8ActionPerformed

    private void jSayi7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSayi7ActionPerformed
        jSonucEkrani.setText(jSonucEkrani.getText()+jSayi7.getText());
    }//GEN-LAST:event_jSayi7ActionPerformed


    public static void main(String args[]) {
        
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

       
        java.awt.EventQueue.invokeLater(() -> new Test().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBolme;
    private javax.swing.JButton jCarpma;
    private javax.swing.JButton jCikarma;
    private javax.swing.JButton jClear;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JButton jEsittir;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JButton jKok;
    private javax.swing.JButton jMod;
    private javax.swing.JButton jNokta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSayi0;
    private javax.swing.JButton jSayi1;
    private javax.swing.JButton jSayi2;
    private javax.swing.JButton jSayi3;
    private javax.swing.JButton jSayi4;
    private javax.swing.JButton jSayi5;
    private javax.swing.JButton jSayi6;
    private javax.swing.JButton jSayi7;
    private javax.swing.JButton jSayi8;
    private javax.swing.JButton jSayi9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jSonucEkrani;
    private javax.swing.JButton jToplama;
    // End of variables declaration//GEN-END:variables
}
