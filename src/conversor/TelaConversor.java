package conversor;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.net.URL;
import javax.swing.JOptionPane;

public class TelaConversor extends javax.swing.JFrame {

    public TelaConversor() {
        initComponents();
        
        URL caminhLogo = getClass().getResource("/imagens/colar.png");
        Image icone = Toolkit.getDefaultToolkit().getImage(caminhLogo);
        this.setIconImage(icone);
        
        
        txtSaida.setVisible(false);
        jScrollPane1.setVisible(false);
        lblResultado.setVisible(false);
        btnCopiar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCopiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSaida = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextPane();
        comboOpcao = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnColar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(770, 720));
        setMinimumSize(new java.awt.Dimension(770, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCopiar.setBackground(new java.awt.Color(255, 255, 255));
        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/colar.png"))); // NOI18N
        btnCopiar.setText("Copiar");
        btnCopiar.setMaximumSize(new java.awt.Dimension(91, 33));
        btnCopiar.setMinimumSize(new java.awt.Dimension(91, 33));
        btnCopiar.setPreferredSize(new java.awt.Dimension(91, 33));
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 110, 50));

        txtSaida.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSaida.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSaida.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtSaida);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 440, 180));

        txtTexto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTexto.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtTexto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 440, 150));

        comboOpcao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas as letras maiúsculas", "Todas as letras minúsculas", "Somente a primeira letra maiúscula" }));
        jPanel1.add(comboOpcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 440, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Converter");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 120, 50));

        btnColar.setBackground(new java.awt.Color(255, 255, 255));
        btnColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/colar.png"))); // NOI18N
        btnColar.setText("Colar");
        btnColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColarActionPerformed(evt);
            }
        });
        jPanel1.add(btnColar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 110, 50));

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultado");
        jPanel1.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 770, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String iniMaiuscula(String textoEntrada) {
        String resultado = "";
        String[] frase = textoEntrada.split(" ");

        for (String palavra : frase) {
            resultado = resultado + " " + palavra.replaceFirst(palavra.substring(0, 1), palavra.substring(0, 1).toUpperCase());
        }
        return resultado.trim();
    }

    public static String tudoMinusculo(String textoEntrada) {
        String resultado = "";
        String[] frase = textoEntrada.split(" ");

        for (String palavra : frase) {
            resultado = resultado + " " + palavra.toLowerCase();
        }
        return resultado.trim();
    }

    public static String tudoMaiusculo(String textoEntrada) {
        String resultado = "";
        String[] frase = textoEntrada.split(" ");

        for (String palavra : frase) {
            resultado = resultado + " " + palavra.toUpperCase();
        }
        return resultado.trim();
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtTexto.getText().isEmpty() || txtTexto.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o texto para realizar a conversão");
        } else {

            txtSaida.setVisible(true);
            lblResultado.setVisible(true);
            txtSaida.setEnabled(false);
            btnCopiar.setVisible(true);
            jScrollPane1.setVisible(true);

            String entrada = txtTexto.getText().toLowerCase();

            if (comboOpcao.getSelectedItem().equals("Somente a primeira letra maiúscula")) {
                txtSaida.setText(iniMaiuscula(entrada));
            }

            if (comboOpcao.getSelectedItem().equals("Todas as letras minúsculas")) {
                txtSaida.setText(tudoMinusculo(entrada));
            }

            if (comboOpcao.getSelectedItem().equals("Todas as letras maiúsculas")) {
                txtSaida.setText(tudoMaiusculo(entrada));
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColarActionPerformed
        txtTexto.paste();
    }//GEN-LAST:event_btnColarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();

        ClipboardOwner selection = new StringSelection(txtSaida.getText());

        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_btnCopiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaConversor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JComboBox<String> comboOpcao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextPane txtSaida;
    private javax.swing.JTextPane txtTexto;
    // End of variables declaration//GEN-END:variables
}
