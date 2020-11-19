/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Feedback.java
 *
 * Created on Jan 16, 2019, 5:12:04 PM
 */

package loginform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DFCAITTI
 */
public class Feedback extends javax.swing.JFrame {

    /** Creates new form Feedback */
    public Feedback() {
        initComponents();setLocationRelativeTo(null);getdata();
    }
 String host="jdbc:derby://localhost:1527/slaught";
        String username="login";
      String password="login";

      private void getdata(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    try{
        Connection con = DriverManager.getConnection(host,username,password);
       Statement stmt = con.createStatement();
       String query = "select * from APP.feed";
       ResultSet rs = stmt.executeQuery(query);
       while(rs.next()){
           model.addRow(new Object[]{rs.getString("feedback")});
}
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(543, 631));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(716, 695));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 440, 110, 50);

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 440, 120, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Feedback"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 500, 560, 200);

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(140, 440, 140, 50);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setFont(new java.awt.Font("Microsoft Uighur", 2, 36));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 200, 380, 200);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/fedd.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 70, 520, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/letter5.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 170, 510, 270);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/tenor.gif"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, -10, 150, 90);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/tenor.gif"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, -10, 150, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/tenor.gif"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-60, -10, 150, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/forfeed.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 160, 560, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/tenor.gif"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, -10, 150, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   new Home().setVisible(true);
   dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      try{
           Connection con = DriverManager.getConnection(host,username,password);
 
    PreparedStatement pst;
    pst=con.prepareStatement("insert into APP.feed values(?)");
    pst.setString(1, jTextArea1.getText());
    pst.executeUpdate();
    getdata();
    jTextArea1.setText(null);
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     int indexrow = jTable1.getSelectedRow();
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
jTextArea1.setText(model.getValueAt(indexrow,0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   jTextArea1.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
