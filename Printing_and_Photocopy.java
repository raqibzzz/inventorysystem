/*
 * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** *
 * @author raqibmuktadir
 */
import com.itextpdf.text.BaseColor; import com.itextpdf.text.Document; import com.itextpdf.text.Element; import com.itextpdf.text.FontFactory; import com.itextpdf.text.Paragraph; import com.itextpdf.text.pdf.PdfPCell; import com.itextpdf.text.pdf.PdfPTable; import com.itextpdf.text.pdf.PdfWriter; import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils; import java.awt.event.*;
import java.awt.*;
import java.text.*;
import java.io.File;
import java.io.FileOutputStream; import java.util.Calendar;
import java.util.GregorianCalendar;
public class Printing_and_Photocopy extends javax.swing.JFrame {
    Connection conn=null; ResultSet rs=null; PreparedStatement pst=null; /**
     * Creates new form Printing_and_Photocopy
     */
    public Printing_and_Photocopy() {
        initComponents(); conn=javaconnect.ConnecrDb(); Update_table();
    }
    public void Update_table(){
        try{
            String sql= "select * from Printing_and_Photocopy"; pst=conn.prepareStatement(sql);
            rs=pst.executeQuery(); Table_PnP.setModel(DbUtils.resultSetToTableModel(rs)); }
        catch(Exception e){ JOptionPane.showMessageDialog(null, e);
        } finally{
            try{ rs.close(); pst.close();
            }
            catch(Exception e){ }
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
    cmd_print = new javax.swing.JButton(); jScrollPane1 = new javax.swing.JScrollPane(); Table_PnP = new javax.swing.JTable(); jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    txt_quantity = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txt_work_type = new javax.swing.JTextField(); cmd_save = new javax.swing.JButton();
    txt_name = new javax.swing.JTextField();
    txt_id = new javax.swing.JTextField();
    cmd_update = new javax.swing.JButton(); cmd_delete = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel(); txt_choice_of_paper = new javax.swing.JTextField(); back = new javax.swing.JButton();
    cmd_clear = new javax.swing.JButton();
    cmd_print1 = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    txt_search = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    cmd_attach = new javax.swing.JButton(); txt_filechooser = new javax.swing.JTextField(); cmd_generate = new javax.swing.JButton();
cmd_print.setText("Print");
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
Table_PnP.setModel(new javax.swing.table.DefaultTableModel( new Object [][] {
        {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}

    },
            new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4" }
));
Table_PnP.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) { Table_PnPMouseClicked(evt);
        } });
Table_PnP.addKeyListener(new java.awt.event.KeyAdapter() { public void keyPressed(java.awt.event.KeyEvent evt) {
        Table_PnPKeyPressed(evt); }
    }); jScrollPane1.setViewportView(Table_PnP);
jPanel1.setBackground(new java.awt.Color(204, 255, 255));
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uwc-logo.png"))); // NOI18N
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addGap(550, 550, 550) .addComponent(jLabel1) .addGap(550, 550, 550))
            ); jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);
jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Printing and Photocopy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
jLabel3.setText("Name");

jLabel5.setText("Quantity");
cmd_save.setText("Save");
cmd_save.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_saveActionPerformed(evt);
        } });
txt_name.addActionListener(new java.awt.event.ActionListener() { public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_nameActionPerformed(evt); }
    });
cmd_update.setText("Update");
cmd_update.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_updateActionPerformed(evt);
        } });
cmd_delete.setText("Delete");
cmd_delete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_deleteActionPerformed(evt);
        } });
jLabel4.setText("Work Type"); jLabel2.setText("ID"); jLabel6.setText("Paper Type");
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
.addComponent(cmd_update) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(back) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(cmd_save) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(cmd_clear) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(cmd_delete) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(cmd_print1)
.addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(jLabel6)
.addComponent(jLabel2) .addComponent(jLabel3) .addComponent(jLabel4) .addComponent(jLabel5))
            .addGap(53, 53, 53)

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(txt_quantity)
.addComponent(txt_work_type) .addComponent(txt_name) .addComponent(txt_id) .addComponent(txt_choice_of_paper))))
            .addContainerGap()) );
jPanel2Layout.setVerticalGroup( jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel2Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel2)
.addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel3)
.addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel4)
.addComponent(txt_work_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel5)
.addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel6)
.addComponent(txt_choice_of_paper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(cmd_update)
.addComponent(cmd_save) .addComponent(cmd_delete) .addComponent(back) .addComponent(cmd_clear) .addComponent(cmd_print1)))
            );
jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
txt_search.addKeyListener(new java.awt.event.KeyAdapter() { public void keyReleased(java.awt.event.KeyEvent evt) {
        txt_searchKeyReleased(evt); }
    });
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
jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "File Chooser", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

cmd_attach.setText("Attach");
cmd_attach.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_attachActionPerformed(evt);
        } });
    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4); jPanel4.setLayout(jPanel4Layout);
jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel4Layout.createSequentialGroup()
.addContainerGap()
.addComponent(txt_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(cmd_attach) .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            ); jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(jPanel4Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(txt_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                      javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(cmd_attach))
            .addContainerGap()) );
cmd_generate.setText("Generate Report"); cmd_generate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) { cmd_generateActionPerformed(evt);
        } });
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); getContentPane().setLayout(layout);
layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(layout.createSequentialGroup() .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(26, 26, 26)
.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(cmd_generate)
.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))) .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                   javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) .addGap(18, 18, 18)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap()) );
layout.setVerticalGroup( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                         layout.createSequentialGroup()
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createSequentialGroup()
.addGap(8, 8, 8)
.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

.addComponent(cmd_generate))) .addContainerGap(21, Short.MAX_VALUE))
            );
    pack();
}// </editor-fold>
    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) { try{
        String value1 = txt_id.getText();
        String value2 = txt_name.getText();
        String value3 = txt_work_type.getText();
        String value4 = txt_quantity.getText();
        String value5 = txt_choice_of_paper.getText();
        String sql= "update Printing_and_Photocopy set ID='"+value1+"' ,Name='"+value2+"'
                ,Work_Type='"+value3+"' ,Quantity='"+value4+"' ,Paper_Type='"+value5+"' where ID='"+value1+"'";
        pst=conn.prepareStatement(sql);
        pst.execute(); JOptionPane.showMessageDialog(null, "Updated");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e); }
        Update_table(); // TODO add your handling code here: }
        private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
        }
        private void Table_PnPMouseClicked(java.awt.event.MouseEvent evt) { try{
            int row = Table_PnP.getSelectedRow();
            String Table_click= (Table_PnP.getModel().getValueAt(row, 0).toString()); String sql ="select * from Printing_and_Photocopy where ID='"+Table_click+"'"; pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("ID");
                txt_id.setText(add1);
                String add2=rs.getString("Name");
                txt_name.setText(add2);
                String add3=rs.getString("Work_Type");

            }
            txt_work_type.setText(add3);
            String add4=rs.getString("Quantity"); txt_quantity.setText(add4);
            String add5=rs.getString("Paper_Type"); txt_choice_of_paper.setText(add5);
        } }
catch(Exception e){ JOptionPane.showMessageDialog(null, e); } finally{
            try{ rs.close(); pst.close();
            }
            catch(Exception e){ }
// TODO add your handling code here:
            private void backActionPerformed(java.awt.event.ActionEvent evt) { Reprographicsdata a =new Reprographicsdata(); a.setVisible(true);
                close();// TODO add your handling code here:
            }
            private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) { try{
                String sql= "Insert into Printing_and_Photocopy (ID,Name,Work_Type,Quantity,Paper_Type) values (?,?,?,?,?)";
                pst=conn.prepareStatement(sql); pst.setString(1, txt_id.getText());
                pst.setString(2, txt_name.getText()); pst.setString(3, txt_work_type.getText()); pst.setString(4, txt_quantity.getText()); pst.setString(5, txt_choice_of_paper.getText()); pst.execute(); JOptionPane.showMessageDialog(null, "Saved");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e); }
                Update_table(); // TODO add your handling code here: }
            }

            private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) { String sql= "delete from Printing_and_Photocopy where ID=?";
                try{
                    pst=conn.prepareStatement(sql);
                    pst.setString(1, txt_id.getText());
                    pst.execute(); JOptionPane.showMessageDialog(null, "Deleted"); }
                catch(Exception e){ JOptionPane.showMessageDialog(null, e);
                } Update_table(); }
            private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) { txt_id.setText("");
                txt_name.setText("");
                txt_work_type.setText("");
                txt_quantity.setText(""); txt_choice_of_paper.setText(""); }
            private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) { try{
                String sql= "select * from Printing_and_Photocopy where Name=?"; pst=conn.prepareStatement(sql);
                pst.setString(1, txt_search.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    String add1=rs.getString("ID"); txt_id.setText(add1);
                    String add2=rs.getString("Name"); txt_name.setText(add2);
                    String add3=rs.getString("Work_Type"); txt_work_type.setText(add3);
                    String add4=rs.getString("Quantity"); txt_quantity.setText(add4);
                    String add5=rs.getString("Paper_Type"); txt_choice_of_paper.setText(add5);
                } }
            catch(Exception e){ JOptionPane.showMessageDialog(null, e);
            }finally{

                try{ rs.close(); pst.close();
                }
                catch(Exception e){ }
            }
                try{
                    String sql= "select * from Printing_and_Photocopy where ID=?"; pst=conn.prepareStatement(sql);
                    pst.setString(1, txt_search.getText());
                    rs=pst.executeQuery();
                    if(rs.next()){
                        String add1=rs.getString("ID"); txt_id.setText(add1);
                        String add2=rs.getString("Name"); txt_name.setText(add2);
                        String add3=rs.getString("Work_Type"); txt_work_type.setText(add3);
                        String add4=rs.getString("Quantity"); txt_quantity.setText(add4);
                        String add5=rs.getString("Paper_Type");
                        txt_choice_of_paper.setText(add5); }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e); }finally{
                    try{ rs.close(); pst.close();
                    }
                    catch(Exception e){ }
                }
                try{
                    String sql= "select * from Printing_and_Photocopy where Work_Type=?"; pst=conn.prepareStatement(sql);
                    pst.setString(1, txt_search.getText());
                    rs=pst.executeQuery();
                    if(rs.next()){
                        String add1=rs.getString("ID");

                        txt_id.setText(add1);
                        String add2=rs.getString("Name"); txt_name.setText(add2);
                        String add3=rs.getString("Work_Type"); txt_work_type.setText(add3);
                        String add4=rs.getString("Quantity"); txt_quantity.setText(add4);
                        String add5=rs.getString("Paper_Type"); txt_choice_of_paper.setText(add5);
                    } }
                catch(Exception e){ JOptionPane.showMessageDialog(null, e);
                }finally{ try{
                    rs.close();
                    pst.close(); }
                catch(Exception e){ }
                }
                try{
                    String sql= "select * from Printing_and_Photocopy where Quantity=?"; pst=conn.prepareStatement(sql);
                    pst.setString(1, txt_search.getText());
                    rs=pst.executeQuery();
                    if(rs.next()){
                        String add1=rs.getString("ID"); txt_id.setText(add1);
                        String add2=rs.getString("Name"); txt_name.setText(add2);
                        String add3=rs.getString("Work_Type"); txt_work_type.setText(add3);
                        String add4=rs.getString("Quantity"); txt_quantity.setText(add4);
                        String add5=rs.getString("Paper_Type");
                        txt_choice_of_paper.setText(add5); }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e); }finally{
                    try{

                        rs.close();
                        pst.close(); }
                    catch(Exception e){ }
                }
                try{
                    String sql= "select * from Printing_and_Photocopy where Paper_Type=?"; pst=conn.prepareStatement(sql);
                    pst.setString(1, txt_search.getText());
                    rs=pst.executeQuery();
                    if(rs.next()){
                        String add1=rs.getString("ID"); txt_id.setText(add1);
                        String add2=rs.getString("Name"); txt_name.setText(add2);
                        String add3=rs.getString("Work_Type"); txt_work_type.setText(add3);
                        String add4=rs.getString("Quantity"); txt_quantity.setText(add4);
                        String add5=rs.getString("Paper_Type");
                        txt_choice_of_paper.setText(add5); }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e); }finally{
                    try{ rs.close(); pst.close();
                    }
                    catch(Exception e){ }
                }
            }
            private void Table_PnPKeyPressed(java.awt.event.KeyEvent evt) { if(evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP){
                try{
                    int row = Table_PnP.getSelectedRow();
                    String Table_click= (Table_PnP.getModel().getValueAt(row, 0).toString()); String sql ="select * from Printing_and_Photocopy where ID='"+Table_click+"'"; pst=conn.prepareStatement(sql);

                    rs=pst.executeQuery();
                    if(rs.next()){
                        String add1=rs.getString("ID"); txt_id.setText(add1);
                        String add2=rs.getString("Name"); txt_name.setText(add2);
                        String add3=rs.getString("Work_Type"); txt_work_type.setText(add3);
                        String add4=rs.getString("Quantity"); txt_quantity.setText(add4);
                        String add5=rs.getString("Paper_Type"); txt_choice_of_paper.setText(add5);
                    } }
                catch(Exception e){ JOptionPane.showMessageDialog(null, e); } finally{
                    try{ rs.close(); pst.close();
                    }
                    catch(Exception e){ }
                } }
            }
            private void cmd_print1ActionPerformed(java.awt.event.ActionEvent evt) { MessageFormat header= new MessageFormat("Printing and Photocopy Report"); MessageFormat footer= new MessageFormat("Page{0,number,integer}");
                try{
                    Table_PnP.print(JTable.PrintMode.NORMAL, header, footer); }
                catch(java.awt.print.PrinterException e){ System.err.format("Cannot print", e.getMessage());
                } }
            private void cmd_attachActionPerformed(java.awt.event.ActionEvent evt) { JFileChooser chooser= new JFileChooser(); chooser.showOpenDialog(null);
                File f =chooser.getSelectedFile();
                String filename =f.getAbsolutePath(); txt_filechooser.setText(filename);

            }
            private void cmd_generateActionPerformed(java.awt.event.ActionEvent evt) { String Value1 = txt_id.getText();
                String Value2 = txt_name.getText();
                String Value3 = txt_work_type.getText();
                String Value4 = txt_quantity.getText();
                String Value5 = txt_choice_of_paper.getText();
                Calendar cal= new GregorianCalendar();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH); System.out.println("Current date : "
                        + day + "/" + (month + 1) + "/" + year);
                try{
                    Document document= new Document();
                    PdfWriter.getInstance(document, new FileOutputStream("Report.pdf")); document.open();
                    com.itextpdf.text.Image image=com.itextpdf.text.Image.getInstance("logo.png"); document.add(image);
                    document.add(new Paragraph("Printing and Photocopy",
                            FontFactory.getFont(FontFactory.TIMES_BOLD,24,Font.BOLD,BaseColor.BLACK))); document.add(new Paragraph(new java.util.Date().toString()));
                    document.add(new Paragraph("------------------------------------------------------------------------------
                            -------"));
                            PdfPTable table=new PdfPTable(2);
                    PdfPCell cell= new PdfPCell(new Paragraph("Report")); cell.setColspan(4); cell.setHorizontalAlignment(Element.ALIGN_CENTER); cell.setBackgroundColor(BaseColor.CYAN); table.addCell(cell);
                    table.addCell("ID");
                    table.addCell(Value1);
                    table.addCell("Name");
                    table.addCell(Value2);
                    table.addCell("Work Type");
                    table.addCell(Value3);
                    table.addCell("Quantity");
                    table.addCell(Value4);
                    table.addCell("Paper Type");
                    table.addCell(Value5);
                    document.add(table);

                    document.close();
                    JOptionPane.showMessageDialog(null, "Report created"); }catch(Exception e){ JOptionPane.showMessageDialog(null, e);
                }
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
                    java.util.logging.Logger.getLogger(Printing_and_Photocopy.class.getName()).log(java.util.loggin g.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(Printing_and_Photocopy.class.getName()).log(java.util.loggin g.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(Printing_and_Photocopy.class.getName()).log(java.util.loggin g.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(Printing_and_Photocopy.class.getName()).log(java.util.loggin g.Level.SEVERE, null, ex);
                } //</editor-fold>

                /* Create and display the form */ java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Printing_and_Photocopy().setVisible(true);
                    } });
            }
// Variables declaration - do not modify private javax.swing.JTable Table_PnP; private javax.swing.JButton back;
            private javax.swing.JButton cmd_attach; private javax.swing.JButton cmd_clear; private javax.swing.JButton cmd_delete; private javax.swing.JButton cmd_generate; private javax.swing.JButton cmd_print; private javax.swing.JButton cmd_print1; private javax.swing.JButton cmd_save; private javax.swing.JButton cmd_update; private javax.swing.JLabel jLabel1;
            private javax.swing.JLabel jLabel2;
            private javax.swing.JLabel jLabel3;
            private javax.swing.JLabel jLabel4;
            private javax.swing.JLabel jLabel5;
            private javax.swing.JLabel jLabel6;
            private javax.swing.JPanel jPanel1;
            private javax.swing.JPanel jPanel2;
            private javax.swing.JPanel jPanel3;
            private javax.swing.JPanel jPanel4;
            private javax.swing.JScrollPane jScrollPane1; private javax.swing.JTextField txt_choice_of_paper; private javax.swing.JTextField txt_filechooser; private javax.swing.JTextField txt_id;
            private javax.swing.JTextField txt_name; private javax.swing.JTextField txt_quantity; private javax.swing.JTextField txt_search; private javax.swing.JTextField txt_work_type; // End of variables declaration
        }