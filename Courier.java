import com.itextpdf.text.BaseColor; import com.itextpdf.text.Document; import com.itextpdf.text.Element; import com.itextpdf.text.FontFactory; import com.itextpdf.text.Paragraph; import com.itextpdf.text.pdf.PdfPCell; import com.itextpdf.text.pdf.PdfPTable; import com.itextpdf.text.pdf.PdfWriter; import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication; import javax.mail.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.awt.*;
import java.text.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.mail.internet.InternetAddress; import javax.mail.internet.MimeMessage; /*
 * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *
 * @author raqibmuktadir
 */
public class Courier extends javax.swing.JFrame {
    Connection conn=null; ResultSet rs=null; PreparedStatement pst=null; /**
     * Creates new form Courier
     */
    public Courier() {
        initComponents(); conn=javaconnect.ConnecrDb(); Update_table();
    }
    public void Update_table(){
        try{
            String sql= "select * from Courier"; pst=conn.prepareStatement(sql);
            rs=pst.executeQuery(); Table_courier.setModel(DbUtils.resultSetToTableModel(rs)); }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            try{ rs.close(); pst.close();
            }
            catch(Exception e){ }finally{
                try{
                    rs.close();
                    pst.close(); }
                catch(Exception e){ }
            }
        }
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
    jLabel6 = new javax.swing.JLabel();
    txt_email = new javax.swing.JTextField(); cmd_report = new javax.swing.JButton(); jPanel3 = new javax.swing.JPanel();
    txt_search = new javax.swing.JTextField(); jScrollPane1 = new javax.swing.JScrollPane(); Table_courier = new javax.swing.JTable(); jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel7 = new javax.swing.JPanel(); cmd_attach3 = new javax.swing.JButton(); txt_filechooser = new javax.swing.JTextField(); jPanel2 = new javax.swing.JPanel();
    txt_doa = new javax.swing.JTextField(); jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txt_mail = new javax.swing.JTextField(); cmd_save = new javax.swing.JButton(); txt_from = new javax.swing.JTextField(); txt_rname = new javax.swing.JTextField(); cmd_update = new javax.swing.JButton(); cmd_delete = new javax.swing.JButton(); jLabel4 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    back = new javax.swing.JButton();
    cmd_clear = new javax.swing.JButton(); cmd_print1 = new javax.swing.JButton(); jPanel4 = new javax.swing.JPanel(); cmd_email = new javax.swing.JButton(); txt_sendmail = new javax.swing.JTextField();
jLabel6.setText("Email"); setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

cmd_report.setText("Generate Report"); cmd_report.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_reportActionPerformed(evt);
        } });
jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
txt_search.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_searchActionPerformed(evt); }
    });
txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) { txt_searchKeyReleased(evt);
        } });
    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3); jPanel3.setLayout(jPanel3Layout);
jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel3Layout.createSequentialGroup()
.addContainerGap()
.addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap()) );
jPanel3Layout.setVerticalGroup( jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel3Layout.createSequentialGroup()
.addContainerGap()
.addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap()) );
Table_courier.setModel(new javax.swing.table.DefaultTableModel( new Object [][] {

        {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}
    },
            new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4" }
));
Table_courier.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) { Table_courierMouseClicked(evt);
        } });
Table_courier.addKeyListener(new java.awt.event.KeyAdapter() { public void keyPressed(java.awt.event.KeyEvent evt) {
        Table_courierKeyPressed(evt); }
    }); jScrollPane1.setViewportView(Table_courier);
jPanel1.setBackground(new java.awt.Color(204, 255, 255));
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uwc-logo.png"))); // NOI18N
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel1Layout.createSequentialGroup()
.addGap(550, 550, 550) .addComponent(jLabel1) .addGap(550, 550, 550))
            ); jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);
jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "File Chooser", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,

    javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
cmd_attach3.setText("Attach");
cmd_attach3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_attach3ActionPerformed(evt);
        } });
    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7); jPanel7.setLayout(jPanel7Layout);
jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel7Layout.createSequentialGroup()
.addContainerGap()
.addComponent(txt_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(cmd_attach3) .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            ); jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel7Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(txt_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                      javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(cmd_attach3))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) );
jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Courier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
txt_doa.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_doaActionPerformed(evt); }
    });

jLabel3.setText("Origin"); jLabel5.setText("Date of Arrival");
cmd_save.setText("Save");
cmd_save.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_saveActionPerformed(evt);
        } });
txt_from.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_fromActionPerformed(evt); }
    });
cmd_update.setText("Update");
cmd_update.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_updateActionPerformed(evt);
        } });
cmd_delete.setText("Delete");
cmd_delete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_deleteActionPerformed(evt);
        } });
jLabel4.setText("Email"); jLabel2.setText("Recipient Name");
back.setText("Back to Main Menu"); back.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { backActionPerformed(evt);
        } });
cmd_clear.setText("Clear");

cmd_clear.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmd_clearActionPerformed(evt); }
    });
cmd_print1.setText("Print");
cmd_print1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_print1ActionPerformed(evt);
        } });
    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2); jPanel2.setLayout(jPanel2Layout);
jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel2Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel2Layout.createSequentialGroup()
.addGap(0, 0, Short.MAX_VALUE)
.addComponent(cmd_update) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(back)
.addGap(18, 18, 18)
.addComponent(cmd_save) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) .addComponent(cmd_clear) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) .addComponent(cmd_print1) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) .addComponent(cmd_delete))
            .addGroup(jPanel2Layout.createSequentialGroup()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(jLabel2)
.addComponent(jLabel3) .addComponent(jLabel4) .addComponent(jLabel5))
            .addGap(53, 53, 53) .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addComponent(txt_doa) .addComponent(txt_mail) .addComponent(txt_from) .addComponent(txt_rname)))))
            ); jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel2Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel2)
.addComponent(txt_rname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel3)
.addComponent(txt_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel4)
.addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel5)
.addComponent(txt_doa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(cmd_update)
.addComponent(cmd_save) .addComponent(cmd_delete) .addComponent(back) .addComponent(cmd_clear) .addComponent(cmd_print1)))
            );

jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Send Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
cmd_email.setText("Send Email"); cmd_email.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_emailActionPerformed(evt);
        } });
txt_sendmail.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_sendmailActionPerformed(evt); }
    });
    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4); jPanel4.setLayout(jPanel4Layout);
jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel4Layout.createSequentialGroup()
.addContainerGap()
.addComponent(txt_sendmail) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(cmd_email)
.addContainerGap())
            ); jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel4Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(txt_sendmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                      javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(cmd_email))
            .addContainerGap()) );
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); getContentPane().setLayout(layout);
layout.setHorizontalGroup(

        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(layout.createSequentialGroup() .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup() .addGap(17, 17, 17)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                          javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(cmd_report))
            .addGap(20, 20, 20)) .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                           layout.createSequentialGroup() .addContainerGap()
.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))) .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 633,
                                                                                     Short.MAX_VALUE) .addGap(20, 20, 20)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            ); layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(layout.createSequentialGroup()
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) .addGroup(layout.createSequentialGroup()
.addGap(20, 20, 20)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) .addGroup(layout.createSequentialGroup()

.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                     javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(18, 18, 18)
.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(55, 55, 55)
.addComponent(cmd_report))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) .addGap(0, 0, Short.MAX_VALUE))))
            );
    pack();
}// </editor-fold>
    private void cmd_reportActionPerformed(java.awt.event.ActionEvent evt) { String Value1 = txt_rname.getText();
        String Value2 = txt_from.getText();
        String Value3 = txt_mail.getText();
        String Value4 = txt_doa.getText();
        Calendar cal= new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH); System.out.println("Current date : "
                + day + "/" + (month + 1) + "/" + year);
        try{
            Document document= new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Report.pdf")); document.open();
            com.itextpdf.text.Image image=com.itextpdf.text.Image.getInstance("logo.png"); document.add(image);
            document.add(new Paragraph("Courier",
                    FontFactory.getFont(FontFactory.TIMES_BOLD,24,Font.BOLD,BaseColor.BLACK))); document.add(new Paragraph(new java.util.Date().toString()));
            document.add(new Paragraph("---------------------------------------------------------------------------
                    ----------"));

                    PdfPTable table=new PdfPTable(2);
            PdfPCell cell= new PdfPCell(new Paragraph("Report")); cell.setColspan(4); cell.setHorizontalAlignment(Element.ALIGN_CENTER); cell.setBackgroundColor(BaseColor.CYAN); table.addCell(cell);
            table.addCell("Recipient Name");
            table.addCell(Value1);
            table.addCell("Origin");
            table.addCell(Value2);
            table.addCell("Email");
            table.addCell(Value3);
            table.addCell("Date of Arrival");
            table.addCell(Value4);
            document.add(table);
            document.close();
            JOptionPane.showMessageDialog(null, "Report created");
        }catch(Exception e){ JOptionPane.showMessageDialog(null, e);
        } // TODO add your handling code here: }
        private void cmd_emailActionPerformed(java.awt.event.ActionEvent evt) { String To= txt_sendmail.getText();
            Properties props= new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com"); props.put("mail.smtp.socketFactory.port", "465"); props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            Session session =Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("raqibm@muwci.net", "Playstationvita1");
                } }
            ); try{
                Message message=new MimeMessage(session);
                message.setFrom(new InternetAddress("raqibm@muwci.net", "Reprographics")); message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To)); message.setSubject("Courier");

                message.setText("Please collect your Courier from Reprographics"); Transport.send(message);
                JOptionPane.showMessageDialog(null, "Message Sent");
            }catch(Exception e){ JOptionPane.showMessageDialog(null, e);
            } }
        private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
        }
        private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) { try{
            String sql= "select * from Courier where Recipient_Name=?"; pst=conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Recipient_Name"); txt_rname.setText(add1);
                String add2=rs.getString("Origin"); txt_from.setText(add2);
                String add3=rs.getString("Email"); txt_mail.setText(add3);
                String add4=rs.getString("Date_of_Arrival"); txt_doa.setText(add4);
            } }
        catch(Exception e){ JOptionPane.showMessageDialog(null, e);
        }finally{ try{
            rs.close();
            pst.close(); }
        catch(Exception e){
        } }
            try{
                String sql= "select * from Courier where Origin=?"; pst=conn.prepareStatement(sql);

                pst.setString(1, txt_search.getText()); rs=pst.executeQuery();
                if(rs.next()){
                    String add1=rs.getString("Recipient_Name"); txt_rname.setText(add1);
                    String add2=rs.getString("Origin"); txt_from.setText(add2);
                    String add3=rs.getString("Email"); txt_mail.setText(add3);
                    String add4=rs.getString("Date_of_Arrival"); txt_doa.setText(add4);
                } }
            catch(Exception e){ JOptionPane.showMessageDialog(null, e);
            }finally{ try{
                rs.close();
                pst.close(); }
            catch(Exception e){
            } }
            try{
                String sql= "select * from Courier where Email=?"; pst=conn.prepareStatement(sql);
                pst.setString(1, txt_search.getText()); rs=pst.executeQuery();
                if(rs.next()){
                    String add1=rs.getString("Recipient_Name"); txt_rname.setText(add1);
                    String add2=rs.getString("Origin"); txt_from.setText(add2);
                    String add3=rs.getString("Email"); txt_mail.setText(add3);
                    String add4=rs.getString("Date_of_Arrival"); txt_doa.setText(add4);
                } }
            catch(Exception e){ JOptionPane.showMessageDialog(null, e);

            }finally{ try{
                rs.close();
                pst.close(); }
            catch(Exception e){
            } }
            try{
                String sql= "select * from Courier where Date_of_Arrival=?"; pst=conn.prepareStatement(sql);
                pst.setString(1, txt_search.getText()); rs=pst.executeQuery();
                if(rs.next()){
                    String add1=rs.getString("Recipient_Name"); txt_rname.setText(add1);
                    String add2=rs.getString("Origin"); txt_from.setText(add2);
                    String add3=rs.getString("Email"); txt_mail.setText(add3);
                    String add4=rs.getString("Date_of_Arrival"); txt_doa.setText(add4);
                } }
            catch(Exception e){ JOptionPane.showMessageDialog(null, e);
            }finally{ try{
                rs.close();
                pst.close(); }
            catch(Exception e){
            } }
        }
        private void Table_courierMouseClicked(java.awt.event.MouseEvent evt) { try{
            int row = Table_courier.getSelectedRow();
            String Table_click= (Table_courier.getModel().getValueAt(row, 0).toString()); String sql ="select * from Courier where Recipient_Name='"+Table_click+"'"; pst=conn.prepareStatement(sql);

        }
            rs=pst.executeQuery(); if(rs.next()){
                String add1=rs.getString("Recipient_Name"); txt_rname.setText(add1);
                String add2=rs.getString("Origin"); txt_from.setText(add2);
                String add3=rs.getString("Email"); txt_mail.setText(add3);
                String add4=rs.getString("Date_of_Arrival"); txt_doa.setText(add4); txt_sendmail.setText(add3);
            } }
catch(Exception e){ JOptionPane.showMessageDialog(null, e);
        } finally{ try{
            rs.close();
            pst.close(); }
        catch(Exception e){ }
// TODO add your handling code here:
            private void Table_courierKeyPressed(java.awt.event.KeyEvent evt) { if(evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP){
                try{
                    int row = Table_courier.getSelectedRow();
                    String Table_click= (Table_courier.getModel().getValueAt(row, 0).toString()); String sql ="select * from Courier where Recipient_Name='"+Table_click+"'"; pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    if(rs.next()){
                        String add1=rs.getString("Recipient_Name"); txt_rname.setText(add1);
                        String add2=rs.getString("Origin"); txt_from.setText(add2);
                        String add3=rs.getString("Email"); txt_mail.setText(add3);
                        String add4=rs.getString("Date_of_Arrival"); txt_doa.setText(add4);
                    }

                } }
catch(Exception e){ JOptionPane.showMessageDialog(null, e);
                } finally{ try{
                    rs.close();
                    pst.close(); }
                catch(Exception e){
                } }
            } }
        private void cmd_attach3ActionPerformed(java.awt.event.ActionEvent evt) { JFileChooser chooser= new JFileChooser();
            chooser.showOpenDialog(null);
            File f =chooser.getSelectedFile();
            String filename =f.getAbsolutePath();
            txt_filechooser.setText(filename); }
        private void txt_doaActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
        }
        private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) { try{
            String sql= "Insert into Courier (Recipient_Name,Origin,Email,Date_of_Arrival) values (?,?,?,?)";
            pst=conn.prepareStatement(sql); pst.setString(1, txt_rname.getText()); pst.setString(2, txt_from.getText()); pst.setString(3, txt_mail.getText()); pst.setString(4, txt_doa.getText()); pst.execute(); JOptionPane.showMessageDialog(null, "Saved");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e); }
            Update_table(); // TODO add your handling code here: }

            private void txt_fromActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
            }
            private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) { try{
                String value1 = txt_rname.getText(); String value2 = txt_from.getText(); String value3 = txt_mail.getText(); String value4 = txt_doa.getText();
                String sql= "update Courier set Recipient_Name='"+value1+"' ,Origin='"+value2+"' ,Email='"+value3+"' ,Date_of_Arrival='"+value4+"' where Recipient_Name='"+value1+"'";
                pst=conn.prepareStatement(sql);
                pst.execute(); JOptionPane.showMessageDialog(null, "Updated");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e); }
                Update_table(); }
            private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) { String sql= "delete from Courier where Recipient_Name=?";
                try{
                    pst=conn.prepareStatement(sql);
                    pst.setString(1, txt_rname.getText()); pst.execute(); JOptionPane.showMessageDialog(null, "Deleted");
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e); }
                Update_table(); // TODO add your handling code here: }
                private void backActionPerformed(java.awt.event.ActionEvent evt) { Reprographicsdata a =new Reprographicsdata(); a.setVisible(true);
                    close(); // TODO add your handling code here:
                }

                private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) { txt_rname.setText("");
                    txt_from.setText("");
                    txt_mail.setText("");
                    txt_doa.setText("");
                    txt_email.setText(""); }
                private void cmd_print1ActionPerformed(java.awt.event.ActionEvent evt) { MessageFormat header= new MessageFormat("Courier Report"); MessageFormat footer= new MessageFormat("Page{0,number,integer}"); try{
                    Table_courier.print(JTable.PrintMode.NORMAL, header, footer); }
                catch(java.awt.print.PrinterException e){ System.err.format("Cannot print", e.getMessage());
                } }
                private void txt_sendmailActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
                }
/**
 * @param args the command line arguments */
                public static void main(String args[]) {
                    /* Set the Nimbus look and feel */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) "> /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
*/ try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName()); break;
                            } }
                    } catch (ClassNotFoundException ex) {

                        java.util.logging.Logger.getLogger(Courier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Courier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Courier.class.getName()).log(java.util.logging.Leve l.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Courier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } //</editor-fold>
                    /* Create and display the form */ java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Courier().setVisible(true);
                        } });
                }
// Variables declaration - do not modify private javax.swing.JTable Table_courier; private javax.swing.JButton back;
                private javax.swing.JButton cmd_attach3; private javax.swing.JButton cmd_clear; private javax.swing.JButton cmd_delete; private javax.swing.JButton cmd_email; private javax.swing.JButton cmd_print1; private javax.swing.JButton cmd_report; private javax.swing.JButton cmd_save; private javax.swing.JButton cmd_update; private javax.swing.JLabel jLabel1; private javax.swing.JLabel jLabel2; private javax.swing.JLabel jLabel3; private javax.swing.JLabel jLabel4; private javax.swing.JLabel jLabel5; private javax.swing.JLabel jLabel6; private javax.swing.JPanel jPanel1;

                private javax.swing.JPanel jPanel2;
                private javax.swing.JPanel jPanel3;
                private javax.swing.JPanel jPanel4;
                private javax.swing.JPanel jPanel7;
                private javax.swing.JScrollPane jScrollPane1; private javax.swing.JTextField txt_doa; private javax.swing.JTextField txt_email; private javax.swing.JTextField txt_filechooser; private javax.swing.JTextField txt_from; private javax.swing.JTextField txt_mail; private javax.swing.JTextField txt_rname; private javax.swing.JTextField txt_search; private javax.swing.JTextField txt_sendmail; // End of variables declaration
            }