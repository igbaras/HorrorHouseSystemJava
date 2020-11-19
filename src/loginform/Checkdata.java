/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Checkdata.java
 *
 * Created on Jan 18, 2019, 1:18:52 PM
 */

package loginform;


import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DFCAITTI
 */
public class Checkdata extends javax.swing.JFrame {

    /** Creates new form Checkdata */
    public Checkdata() {
        initComponents();
        setLocationRelativeTo(null);
        getdata();
  
       
   
    }
String filename= null;
String person_image = null;
byte [] picture;
 


   String host="jdbc:derby://localhost:1527/slaught";
        String username="login";
      String password="login";
      
      private void getdata(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    try{
        Connection con = DriverManager.getConnection(host,username,password);
       Statement stmt = con.createStatement();
       String query = "select * from APP.CHECKD";
       ResultSet rs = stmt.executeQuery(query);
       while(rs.next()){
           model.addRow(new Object[]{rs.getInt("id"),rs.getString("name"),rs.getString("housetype"),rs.getString("housenumber")});


       }       
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        type = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/checky.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 90, 320, 110);

        jTable1.setBackground(new java.awt.Color(214, 128, 6));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("DialogInput", 1, 24));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "House Type", "House Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 10, 450, 530);

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 33));
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("House Number:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 380, 240, 50);

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));
        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 33));
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 260, 110, 50);

        jLabel9.setBackground(new java.awt.Color(204, 0, 0));
        jLabel9.setFont(new java.awt.Font("Bodoni MT", 1, 33));
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 210, 70, 50);

        number.setFont(new java.awt.Font("Rockwell", 1, 24));
        number.setForeground(new java.awt.Color(204, 102, 0));
        number.setOpaque(false);
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberKeyTyped(evt);
            }
        });
        getContentPane().add(number);
        number.setBounds(240, 380, 200, 50);

        id.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        id.setForeground(new java.awt.Color(204, 102, 0));
        id.setOpaque(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        getContentPane().add(id);
        id.setBounds(240, 200, 200, 50);

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Calisto MT", 1, 18));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/ADD33.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorderPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/ADD.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 460, 170, 80);

        jButton3.setBackground(new java.awt.Color(102, 0, 102));
        jButton3.setFont(new java.awt.Font("Calisto MT", 1, 18));
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/EDIT2.png"))); // NOI18N
        jButton3.setText("Edit");
        jButton3.setBorderPainted(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/ediiiit.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 460, 140, 80);

        jButton4.setBackground(new java.awt.Color(102, 0, 102));
        jButton4.setFont(new java.awt.Font("Calisto MT", 1, 18));
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/deleee.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.setBorderPainted(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/deleee2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(340, 460, 160, 80);

        jButton5.setBackground(new java.awt.Color(102, 0, 102));
        jButton5.setFont(new java.awt.Font("Calisto MT", 1, 18));
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/BACKKKKKKK.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.setBorderPainted(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/BACK2DEAD.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 10, 130, 60);

        jLabel7.setBackground(new java.awt.Color(204, 0, 0));
        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 33));
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("House Type:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 320, 190, 50);

        name.setFont(new java.awt.Font("Rockwell", 1, 24));
        name.setForeground(new java.awt.Color(204, 102, 0));
        name.setOpaque(false);
        getContentPane().add(name);
        name.setBounds(240, 260, 200, 50);

        type.setBackground(new java.awt.Color(224, 168, 88));
        type.setFont(new java.awt.Font("Rockwell", 1, 24));
        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "VIP" }));
        getContentPane().add(type);
        type.setBounds(240, 320, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/BGTOADD.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 547);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int indexrow = jTable1.getSelectedRow();
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
id.setText(model.getValueAt(indexrow,0).toString());
name.setText(model.getValueAt(indexrow,1).toString());
type.setSelectedItem(model.getValueAt(indexrow, 2));
number.setText(model.getValueAt(indexrow,3).toString());


}//GEN-LAST:event_jTable1MouseClicked
private void empty(){
    name.setText(null);
    type.setSelectedIndex(-1);
    id.setText(null);
    number.setText(null); 
   
}
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    
    try{

    Connection con = DriverManager.getConnection(host,username,password);
    Statement stmt = con.createStatement();
    String query = "update APP.CHECKD set name='"+name.getText()+"',housenumber='"+number.getText()+"',housetype='"+type.getSelectedItem().toString()+"' where id=" + id.getText()+"";
    stmt.execute(query);
    JOptionPane.showMessageDialog(null, "Updated!");
    getdata();empty();
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
 

}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

 if(id!=null){
    try{
    Connection con = DriverManager.getConnection(host,username,password);
    Statement stmt = con.createStatement();
    String query = "delete from APP.CHECKD where id="+id.getText()+"";
    stmt.execute(query);
    JOptionPane.showMessageDialog(null, "Deleted!");
    getdata();empty();
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}} 
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
       Connection con = DriverManager.getConnection(host,username,password);
    Statement stmt = con.createStatement();
    PreparedStatement pst;
    pst=con.prepareStatement("insert into APP.CHECKD(id,name,housetype,housenumber) values(?,?,?,?)");
   pst.setString(1,id.getText());
    pst.setString(2,name.getText());
     pst.setString(3,type.getSelectedItem().toString());
      pst.setString(4,number.getText());
      pst.executeUpdate(); 
    JOptionPane.showMessageDialog(null, "Saved!"); 
     getdata();empty();
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
}//GEN-LAST:event_jButton1ActionPerformed

private void numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyTyped
char c=evt.getKeyChar();
if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
  getToolkit().beep();
    evt.consume();
    
}
}//GEN-LAST:event_numberKeyTyped

private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
char c=evt.getKeyChar();
if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
  getToolkit().beep();
    evt.consume();
}
}//GEN-LAST:event_idKeyTyped

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
new Home().setVisible(true);
dispose();
}//GEN-LAST:event_jButton5ActionPerformed

private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_idActionPerformed


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JComboBox type;
    // End of variables declaration//GEN-END:variables
byte[]photo=null;
String pic = null;
ImageIcon format=null;
}
