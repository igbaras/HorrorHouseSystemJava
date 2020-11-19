/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on Nov 28, 2018, 9:43:58 PM
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
public class login extends javax.swing.JFrame {
int s=0;
Thread th;
    public login() {
        initComponents();
           setLocationRelativeTo(null);
    }

  private void setupLoading(){
       setVisible(false);
    th.start();
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        uname = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        pword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(null);

        uname.setFont(new java.awt.Font("Tw Cen MT", 0, 20));
        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        uname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unameKeyPressed(evt);
            }
        });
        jPanel3.add(uname);
        uname.setBounds(80, 40, 350, 50);

        Login.setBackground(new java.awt.Color(0, 0, 0));
        Login.setForeground(new java.awt.Color(255, 0, 0));
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/reaper.png"))); // NOI18N
        Login.setText("Login");
        Login.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel3.add(Login);
        Login.setBounds(120, 210, 270, 37);

        pword.setFont(new java.awt.Font("Tw Cen MT", 0, 20));
        pword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwordKeyPressed(evt);
            }
        });
        jPanel3.add(pword);
        pword.setBounds(80, 140, 350, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/user.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(250, 10, 24, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/lock.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(240, 100, 32, 32);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/fire.gif"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 500, 300);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 10, 500, 255);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 140, 520, 275);

        jPanel1.setBackground(new java.awt.Color(135, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 0, 30, 60);

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/login.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 20, 440, 160);

        jButton9.setBackground(new java.awt.Color(0, 102, 153));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton9.setText("X");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(480, 0, 80, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-4, -10, 620, 450);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-537)/2, (screenSize.height-422)/2, 537, 422);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        login();
        
    }//GEN-LAST:event_LoginActionPerformed

    private void unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyPressed

       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
     Login.doClick();
       }// TODO add your handling code here:
    }//GEN-LAST:event_unameKeyPressed

    private void pwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwordKeyPressed

       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        Login.doClick();
       }// TODO add your handling code here:
    }//GEN-LAST:event_pwordKeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
setState(ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_jLabel5MouseClicked

private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    int YesorNO =JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
    if(YesorNO==0){
        System.exit(0);
    }
    // TODO add your handling code here:
}//GEN-LAST:event_jButton9ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pword;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
private void login(){
     String host="jdbc:derby://localhost:1527/slaught";
        String username="login";
      String password="login";
      try{
  Connection con = DriverManager.getConnection(host,username,password);
  Statement stmt = con.createStatement();
  String query="select name, type from APP.slaught where username='"+uname.getText()+"'and password='"+pword.getText()+"'";
  ResultSet rs = stmt.executeQuery(query);
  if(rs.next()){
      JOptionPane.showMessageDialog(null, "Logged in successfully!");
      dispose();
    Loading ob = new Loading();
    ob.setUploading();
      ob.setVisible(true);
  }else{
       JOptionPane.showMessageDialog(null, "Username and Password does not match!");
  }


      }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
      }

}
}
