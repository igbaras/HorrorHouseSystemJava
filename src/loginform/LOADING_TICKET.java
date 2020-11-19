/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LOADING_TICKET.java
 *
 * Created on Jan 1, 2009, 1:42:51 AM
 */

package loginform;

import javax.swing.JOptionPane;

/**
 *
 * @author DFCAITTI
 */
public class LOADING_TICKET extends javax.swing.JFrame implements Runnable {
int s=0;
    Thread th;
    public LOADING_TICKET() {
       super("loading"); initComponents();
        setLocationRelativeTo(null); th=new Thread ((Runnable)this);
    }

    public void setUploading(){
    setVisible(false);
    th.start();
}
public void run(){
    try{
        for(int i=2;i<200;i++){
            s=s+2;
                    int m=jProgressBar1.getMaximum();
                    int v=jProgressBar1.getValue();
                    if(v<m){
                        jProgressBar1.setValue(jProgressBar1.getValue()+1);
                    }else{
                        i=201;
                        setVisible(false);
                      new Ticks().setVisible(true);
                    }Thread.sleep(50);
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(577, 603));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/LOWER.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 490, 430, 600);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/DWNDUMX.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-290, 0, 890, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOADING_TICKET().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    public void takbo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
