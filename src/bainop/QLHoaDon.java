/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bainop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Team4_MMT
 */
public class QLHoaDon extends javax.swing.JFrame {
    DefaultTableModel tableModel;

    /**
     * Creates new form QLCustomer
     */
    public QLHoaDon() {
        initComponents();
         tableModel = (DefaultTableModel) jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtCodeCustomer = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_HDSO = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textTong = new javax.swing.JTextField();
        btnSum = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Qu???n l?? h??a ????n "));

        jLabel3.setText("Ng??y ");

        jLabel4.setText("M?? kh??ch h??ng ");

        jLabel5.setText("Tr??? gi?? ");

        btnInsert.setText("Save");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnSearch.setText("Find");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btn_Reset.setText("Exit");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "S??? HD", "NG??Y", "M?? KH", "TR??? GI?? "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel2.setText("HD S??? ");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel6.setText("T???ng ti???n ");

        textTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTongActionPerformed(evt);
            }
        });

        btnSum.setText("Sum");
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(btnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDate)
                                    .addComponent(txtCodeCustomer)
                                    .addComponent(txtPrice)
                                    .addComponent(txt_HDSO, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTong, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(19, 19, 19))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_HDSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnSearch)
                    .addComponent(btnShowAll)
                    .addComponent(btnSum))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btn_Reset)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
         Connection conn = null;
        Statement statement = null;
        List<Bill> bills = new ArrayList<>();
        try {
            // TODO add your handling code here:
            //mo ket noi toi database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhd", "root", "");
            
            //tao truy van - query - lay du lieu + them + sua + xoa
            //select query => Hien thi danh sach + tim kiem
           
            // l???y d??? li???u ra
             statement = conn.createStatement();// chu???n b??? c??u truy v???n 
            String sql = "select * from hoadon";
             // ?????i t?????ng resultSet
            ResultSet resultSet = statement.executeQuery(sql);
            // l???y t???ng ?????i t?????ng ra l??u v??o l???p ?????i t?????ng Qu???n l?? h??a ????n
            while(resultSet.next()){// l???p t???ng b???n ghi d??? li???u 
                Bill std = new Bill(
                // l???y d??? li???u 
                resultSet.getString("hdso"),
                resultSet.getString("ngay"),
                resultSet.getString("maKH"),  
                resultSet.getDouble("trigia")); 
                // th??m d??? li???u v??o m???ng 
                bills.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //dong ket noi
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        // T???o truy v???n query th??m s???a x??a 
       // ????ng k???t n???i 
        }
        System.out.println("S??? L?????NG H??A ????N "+bills.size());
        for(Bill bill :bills){
            // l???y ra t???ng b???n ghi 
            System.out.println(bill);
            tableModel.addRow(new Object[] {
                tableModel.getRowCount() + 1,
                bill.getHdso(), bill.getNgay(),
               bill.getMaKH(), bill.getTrigia()
             
            });
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
         Connection conn = null;
        PreparedStatement statement = null;
         List<Bill> bills = new ArrayList<>();
         // l???y th??ng tin ng?????i d??ng 
        String date = txtDate.getText();
        String codeCustomer = txtCodeCustomer.getText();
        String price = txtPrice.getText();
        
        try {
            //mo ket noi toi database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhd", "root", "");
            
            //insert, update, delete data from database
            String sql = "insert into hoadon(ngay, makh,trigia)"
                    + "values(?, ?, ?)";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, date);
            statement.setString(2, codeCustomer);
            statement.setString(3, price);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txt_HDSO.setText("");
        txtDate.setText("");
        txtCodeCustomer.setText("");
        txtPrice.setText("");
         btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       String codeCustomer = txt_HDSO.getText().toString();
       if(codeCustomer.isEmpty()){
           JOptionPane.showMessageDialog(this,"Nh???p m?? t??m ki???m ");
       }else{
           search(codeCustomer);
       }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String date = txtDate.getText().toString();
         String codeCustomer= txtCodeCustomer.getText().toString();
          String price = txtPrice.getText().toString();
//          String hdso = txt_HDSO.getText().toString();
           Connection conn = null;
            PreparedStatement statement = null;
                 
           try {
            //mo ket noi toi database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhd", "root", "");
            
            //insert, update, delete data from database
            String sql = "update hoadon set (ngay = ?,makh = ?, trigia = ?) where hdso = ?";
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, date);
            statement.setString(2, codeCustomer);
            statement.setString(3, price);

            statement.execute();
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
          }
          btnResetActionPerformed(null);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void textTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTongActionPerformed
        Connection conn = null;
        Statement statement = null;
        List<Bill> bills = new ArrayList<>();
        try {
            // TODO add your handling code here:
            //mo ket noi toi database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhd", "root", "");
            
            //tao truy van - query - lay du lieu + them + sua + xoa
            //select query => Hien thi danh sach + tim kiem
           
            // l???y d??? li???u ra
             statement = conn.createStatement();// chu???n b??? c??u truy v???n 
            String sql = "select trigia from hoadon";
             // ?????i t?????ng resultSet
            ResultSet resultSet = statement.executeQuery(sql);
            // l???y t???ng ?????i t?????ng ra l??u v??o l???p ?????i t?????ng Qu???n l?? h??a ????n
            while(resultSet.next()){// l???p t???ng b???n ghi d??? li???u 
                Bill std = new Bill(
                // l???y d??? li???u   
                resultSet.getDouble("trigia")); 
                // th??m d??? li???u v??o m???ng 
                bills.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //dong ket noi
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        // T???o truy v???n query th??m s???a x??a 
       // ????ng k???t n???i 
        }
        double sum = 0;
        for(Bill bill :bills){
            // l???y ra t???ng b???n ghi 
            System.out.println(bill);
            tableModel.addRow(new Object[] {
                tableModel.getRowCount() + 1,
               sum += bill.getTrigia()
             
            });
        }
           System.out.println("T???ng ti???n l?? : "+sum);
    }//GEN-LAST:event_textTongActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
              Connection conn = null;
        Statement statement = null;
        List<Bill> bills = new ArrayList<>();
        try {
            // TODO add your handling code here:
            //mo ket noi toi database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhd", "root", "");
            
            //tao truy van - query - lay du lieu + them + sua + xoa
            //select query => Hien thi danh sach + tim kiem
           
            // l???y d??? li???u ra
             statement = conn.createStatement();// chu???n b??? c??u truy v???n 
            String sql = "select trigia from hoadon";
             // ?????i t?????ng resultSet
            ResultSet resultSet = statement.executeQuery(sql);
            // l???y t???ng ?????i t?????ng ra l??u v??o l???p ?????i t?????ng Qu???n l?? h??a ????n
             double sum = 0;
            while(resultSet.next()){// l???p t???ng b???n ghi d??? li???u 
                Bill std = new Bill(
                // l???y d??? li???u   
                sum += resultSet.getDouble("trigia")); 
            }
              System.out.println("sum = "+sum);
        } catch (SQLException ex) {
            Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //dong ket noi
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
      
//        double sum = 0;
//        for(Bill bill :bills){
//            // l???y ra t???ng b???n ghi 
//            System.out.println(bill);
//            tableModel.addRow(new Object[] {
//                tableModel.getRowCount() + 1,
//               sum += bill.getTrigia()
//             
//            });
//        }
//        System.out.println("T???ng ti???n l?? : "+sum);
    }//GEN-LAST:event_btnSumActionPerformed
     private void search(String codeCustomer) {
        Connection conn = null;
        Statement statement = null;
        
          try {
            // TODO add your handling code here:
            //mo ket noi toi database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhd", "root", "");
            // l???y d??? li???u ra
             String sql = "select * from hoadon where hdso = '"+codeCustomer+"'";
             statement = conn.createStatement();
             // ?????i t?????ng resultSet
             //ResultSet duy tr?? m???t con tr??? tr??? ?????n m???t h??ng c???a m???t b???ng. Ban ?????u, con tr??? tr??? ?????n h??ng ?????u ti??n.
            ResultSet resultSet = statement.executeQuery(sql); 
            while (resultSet.next()){
                 txtDate.setText(resultSet.getString("ngay"));
                 txtCodeCustomer.setText(resultSet.getString("maKH"));
                 txtPrice.setText(resultSet.getString("trigia"));
                 btnUpdate.setEnabled(true);
              }
          if(txtCodeCustomer.getText().isEmpty()){
             JOptionPane.showMessageDialog(this,"Not 404!!!");
              btnUpdate.setEnabled(false);
          }
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            //dong ket noi
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
     }
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
            java.util.logging.Logger.getLogger(QLHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnSum;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textTong;
    private javax.swing.JTextField txtCodeCustomer;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txt_HDSO;
    // End of variables declaration//GEN-END:variables

   
}
