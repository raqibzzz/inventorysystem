import java.awt.event.*; import java.awt.*; import java.sql.*; import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *
 * @author raqibmuktadir
 */
public class Loginpage extends javax.swing.JFrame {
    Connection conn=null; ResultSet rs=null; PreparedStatement pst=null; /**
     * Creates new form Loginpage
     */
    public Loginpage() {
        initComponents(); conn=javaconnect.ConnecrDb(); //FillCombo();
    }
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent); }
/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always * regenerated by the Form Editor.
 */
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code"> private void initComponents() {
    jLabel1 = new javax.swing.JLabel();
    jScrollBar1 = new javax.swing.JScrollBar(); jOptionPane1 = new javax.swing.JOptionPane(); cmd_usertype = new javax.swing.JComboBox<>(); jLabel2 = new javax.swing.JLabel();
    jTextField2 = new javax.swing.JTextField(); jTextField1 = new javax.swing.JTextField(); jPanel1 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    password = new javax.swing.JLabel(); txt_password = new javax.swing.JPasswordField(); username = new javax.swing.JLabel(); txt_username = new javax.swing.JTextField(); cmd_login = new javax.swing.JButton();
    cmd_exit = new javax.swing.JButton();
    cmd_clear = new javax.swing.JButton();
jLabel1.setFont(new java.awt.Font("Apple LiGothic", 1, 36)); // NOI18N jLabel1.setText("MUWCI Reprographics");
jOptionPane1.setMessage("Login Failed");

cmd_usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "standard user" }));
jLabel2.setText("User Type");
jTextField1.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1ActionPerformed(evt); }
    });
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
jPanel1.setBackground(new java.awt.Color(204, 255, 255));
jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uwc-logo.png"))); // NOI18N
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel1Layout.createSequentialGroup()
.addGap(150, 150, 150) .addComponent(jLabel5) .addGap(150, 150, 150))
            ); jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) .addComponent(jLabel5)
.addContainerGap())
            );
jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
password.setText("Password"); username.setText("Username");

txt_username.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_usernameActionPerformed(evt); }
    });
cmd_login.setBackground(new java.awt.Color(255, 255, 255)); cmd_login.setText("LOGIN");
cmd_login.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_loginActionPerformed(evt);
        } });
cmd_exit.setText("EXIT");
cmd_exit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_exitActionPerformed(evt);
        } });
cmd_clear.setText("CLEAR");
cmd_clear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_clearActionPerformed(evt);
        } });
    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2); jPanel2.setLayout(jPanel2Layout);
jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel2Layout.createSequentialGroup()
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) .addComponent(cmd_exit)
.addGap(18, 18, 18)
.addComponent(cmd_login)
.addGap(18, 18, 18) .addComponent(cmd_clear) .addGap(124, 124, 124))
            .addGroup(jPanel2Layout.createSequentialGroup() .addContainerGap()

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(username)
.addComponent(password)) .addGap(35, 35, 35)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(txt_username)
.addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) );
jPanel2Layout.setVerticalGroup( jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel2Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(username)
.addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(31, 31, 31)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(password)
.addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(cmd_exit)
.addComponent(cmd_clear)
.addComponent(cmd_login)) .addContainerGap())
            );
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); getContentPane().setLayout(layout);
layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(layout.createSequentialGroup()

.addGap(157, 157, 157)
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) );
layout.setVerticalGroup( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(layout.createSequentialGroup()
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(27, 27, 27)
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(85, Short.MAX_VALUE)) );
    pack();
}// </editor-fold>
    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
    }
    private void cmd_loginActionPerformed(java.awt.event.ActionEvent evt) {
        String sql ="select * from UserDetails where Username=? and Password=?"; try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_username.getText()); pst.setString(2,txt_password.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Welcome to Reprographics!"); close();
                User_Details s =new User_Details();
                s.setVisible(false);
                Reprographicsdata a =new Reprographicsdata();
                a.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Access Denied");

            }
        }
        catch(Exception e){ JOptionPane.showMessageDialog(null, e);
        } finally{ try{
            rs.close();
            pst.close(); }
        catch(Exception e){
        } }
    }
    private void cmd_exitActionPerformed(java.awt.event.ActionEvent evt) { System.exit(0);
    }
    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) { txt_username.setText("");
        txt_password.setText("");
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
    }
    /**
     * @param args the command line arguments */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) "> /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
*/ try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    break; }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE , null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE , null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE , null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE , null, ex);
        } //</editor-fold>
        /* Create and display the form */ java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            } });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_exit;
    private javax.swing.JButton cmd_login;
    private javax.swing.JComboBox<String> cmd_usertype; private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1; private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1; private javax.swing.JTextField jTextField1; private javax.swing.JTextField jTextField2;

    private javax.swing.JLabel password;
    private javax.swing.JPasswordField txt_password; private javax.swing.JTextField txt_username; private javax.swing.JLabel username;
// End of variables declaration
}