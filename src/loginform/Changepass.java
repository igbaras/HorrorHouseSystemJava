/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Changepass.java
 *
 * Created on Jan 16, 2019, 4:59:21 PM
 */

package loginform;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DFCAITTI
 */
public class Changepass extends javax.swing.JFrame {

    /** Creates new form Changepass */
    public Changepass() {
        initComponents();
        setLocationRelativeTo(null);

    }

   String host="jdbc:derby://localhost:1527/slaught";
        String username="login";
      String password="login";
private void getdata(){
    String query ="select * from APP.slaught";
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField4 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        old = new javax.swing.JPasswordField();
        jNew = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();

        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("GulimChe", 1, 48), new java.awt.Color(0, 204, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24));
        jLabel1.setForeground(new java.awt.Color(204, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Username:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(80, 40, 137, 29);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24));
        jLabel2.setForeground(new java.awt.Color(204, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("New Password:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 140, 196, 29);

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Change Pass");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(10, 240, 123, 50);

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18));
        jButton3.setText("Back");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(310, 240, 90, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 184, 196, 39);

        old.setFont(new java.awt.Font("Verdana", 1, 18));
        old.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        jPanel3.add(old);
        old.setBounds(220, 90, 170, 35);

        jNew.setFont(new java.awt.Font("Verdana", 1, 18));
        jNew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        jNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewActionPerformed(evt);
            }
        });
        jNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNewKeyPressed(evt);
            }
        });
        jPanel3.add(jNew);
        jNew.setBounds(220, 140, 170, 33);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24));
        jLabel3.setForeground(new java.awt.Color(204, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Old Password:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 90, 185, 29);

        user.setFont(new java.awt.Font("Verdana", 1, 18));
        user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel3.add(user);
        user.setBounds(220, 40, 170, 37);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 10, 420, 298);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNewActionPerformed

    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    JOptionPane.showMessageDialog(null, "Successfully changed!");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jNewKeyPressed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

try{

    Connection con = DriverManager.getConnection(host,username,password);
    Statement stmt = con.createStatement();
    String query = "select name, type from APP.slaught where username='"+user.getText()+"'and password='"+old.getText()+"'";
  ResultSet rs = stmt.executeQuery(query);
    if(rs.next()==true){
        String query1 = "update APP.slaught set password='"+jNew.getText()+"'";
       stmt.execute(query1);getdata();
       user.setText(null);
       old.setText(null);
       jNew.setText(null);
JOptionPane.showMessageDialog(null, "Password changed successfully!");


        
}else{
       JOptionPane.showMessageDialog(null, "Old password does not match");
        user.setText(null);
       old.setText(null);
       jNew.setText(null);
}
    
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}

}//GEN-LAST:event_jButton1ActionPerformed

private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_userActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Changepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jNew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField old;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}

