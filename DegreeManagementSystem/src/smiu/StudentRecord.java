/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smiu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Syed Taqi
 */
public class StudentRecord extends javax.swing.JFrame {

    /**
     * Creates new form StudentRecord
     */
    Connection con;
    public StudentRecord() {
        initComponents();
        con = DB.connect();
        DataRecords DR = new DataRecords();
        ResultSet rs = DR.getStudentRecord();
        try{
            while(rs.next()){
                String data[] = {rs.getString("ID"),rs.getString("Name"),rs.getString("Father"),rs.getString("PhoneNo"),rs.getString("CNIC"),rs.getString("Email"),rs.getString("Department")};
                DefaultTableModel tb = (DefaultTableModel)jTable1.getModel();
                tb.addRow(data);
            }
        }
        catch(Exception e){
            System.out.println(e);
    }
    }
    PreparedStatement st;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnExit2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        GenerateReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(490, 220));
        setUndecorated(true);

        jBtnExit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        jBtnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExit2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Father", "Phone.No", "CNIC", "Email", "Department"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        GenerateReport.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        GenerateReport.setText("Generate Report");
        GenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnExit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenerateReport, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnExit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GenerateReport)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExit2ActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnExit2ActionPerformed

    private void GenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportActionPerformed
        try{
        JasperDesign design = JRXmlLoader.load("C:\\Users\\Syed Taqi\\Documents\\NetBeansProjects\\SMIU\\src\\smiu\\report1.jrxml");
        String query = "SELECT\n" +
"     registerform.`Name` AS registerform_Name,\n" +
"     registerform.`ID` AS registerform_ID,\n" +
"     registerform.`Email` AS registerform_Email,\n" +
"     registerform.`Department` AS registerform_Department\n" +
"FROM\n" +
"     `registerform` registerform";
        JRDesignQuery newQuery = new JRDesignQuery();
        newQuery.setText(query);
        
        design.setQuery(newQuery);
        
        JasperReport report = JasperCompileManager.compileReport(design);
        JasperPrint print = JasperFillManager.fillReport(report, null, con);
        JasperViewer.viewReport(print);
        }catch(Exception e){
        System.out.println(e);
       }
    }//GEN-LAST:event_GenerateReportActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerateReport;
    private javax.swing.JButton jBtnExit2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
