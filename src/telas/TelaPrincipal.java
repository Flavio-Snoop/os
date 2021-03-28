
package telas;

import dal.ModuloConexao;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;
import java.util.TooManyListenersException;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class TelaPrincipal extends javax.swing.JFrame {
    Connection conexao = null;
     
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
        setIcon();        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadCli = new javax.swing.JMenuItem();
        menCadOs = new javax.swing.JMenuItem();
        menCadUsu = new javax.swing.JMenuItem();
        menRel = new javax.swing.JMenu();
        menRelCli = new javax.swing.JMenuItem();
        menRelServ = new javax.swing.JMenuItem();
        menAjuda = new javax.swing.JMenu();
        menAjuSob = new javax.swing.JMenuItem();
        menOpc = new javax.swing.JMenu();
        menOpcSai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/desktop.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblData.setText("Data");

        menCad.setText("Cadastro");

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menCadCli.setText("Cliente");
        menCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadCliActionPerformed(evt);
            }
        });
        menCad.add(menCadCli);

        menCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menCadOs.setText("OS");
        menCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadOsActionPerformed(evt);
            }
        });
        menCad.add(menCadOs);

        menCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menCadUsu.setText("Usuáros");
        menCadUsu.setEnabled(false);
        menCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuActionPerformed(evt);
            }
        });
        menCad.add(menCadUsu);

        Menu.add(menCad);

        menRel.setText("Relatório");
        menRel.setEnabled(false);

        menRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        menRelCli.setText("Clientes");
        menRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelCliActionPerformed(evt);
            }
        });
        menRel.add(menRelCli);

        menRelServ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menRelServ.setText("Serviços");
        menRelServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelServActionPerformed(evt);
            }
        });
        menRel.add(menRelServ);

        Menu.add(menRel);

        menAjuda.setText("Ajuda");

        menAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menAjuSob.setText("Sobre");
        menAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjuSobActionPerformed(evt);
            }
        });
        menAjuda.add(menAjuSob);

        Menu.add(menAjuda);

        menOpc.setText("Opções");

        menOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menOpcSai.setText("Sair");
        menOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcSaiActionPerformed(evt);
            }
        });
        menOpc.add(menOpcSai);

        Menu.add(menOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblData)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(784, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcSaiActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja saír?","Atenção",JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
         System.exit(0);   
        }
    }//GEN-LAST:event_menOpcSaiActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Date data = new Date();
       DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
       lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjuSobActionPerformed
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menAjuSobActionPerformed

    private void menCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuActionPerformed
       TelaUsuario usuario = new TelaUsuario();
       usuario.setVisible(true);
       Desktop.add(usuario);
    }//GEN-LAST:event_menCadUsuActionPerformed

    private void menCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadCliActionPerformed
        TelaCliente cliente = new TelaCliente ();
        cliente.setVisible(true);
        Desktop.add(cliente);
    }//GEN-LAST:event_menCadCliActionPerformed

    private void menCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadOsActionPerformed
       TelaOS os = new TelaOS();
       os.setVisible(true);
       Desktop.add(os);
    }//GEN-LAST:event_menCadOsActionPerformed

    private void menRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelCliActionPerformed
        //gerando um relatório de cliente
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?","Atenção",JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION);
        //imprimindo relatório com o frameword jasperReports
        try {
            // usando a classe jasperreport para preparar a impressão de um relatório
            JasperPrint print = JasperFillManager.fillReport("C:/reports/clientes.jasper",null,conexao);
            // a linha abaixo exibe o relatório atráves da classe JasperReport
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_menRelCliActionPerformed

    private void menRelServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelServActionPerformed
       
        //gerando um relatório de serviços
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a emissão deste relatório?","Atenção",JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION);
        //emitindo relatório com o frameword jasperReports
        try {
            // usando a classe jasperreport para preparar a impressão de um relatório
            JasperPrint print = JasperFillManager.fillReport("C:/reports/servicos.jasper",null,conexao);
            // a linha abaixo exibe o relatório atráves da classe JasperReport
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_menRelServActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menAjuSob;
    private javax.swing.JMenu menAjuda;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCli;
    private javax.swing.JMenuItem menCadOs;
    public static javax.swing.JMenuItem menCadUsu;
    private javax.swing.JMenu menOpc;
    private javax.swing.JMenuItem menOpcSai;
    public static javax.swing.JMenu menRel;
    private javax.swing.JMenuItem menRelCli;
    private javax.swing.JMenuItem menRelServ;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("login.png")));
    }
}
