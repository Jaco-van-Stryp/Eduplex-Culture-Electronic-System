//This class was created on 2018.11.23 by Jaco van Stryp
package Graphics;

import handle.dbLocationManager;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaco van Stryp
 */
public class RegNewCultureEvent extends javax.swing.JFrame {

    /**
     * Creates new form MainUserInterface
     */
    dbLocationManager cm = new dbLocationManager();
    private String curGroupValue = "Solo";
    private String eName = "";
    private String eGrade = "";
    private String eDate = "";
    private String eTotal = "";
    private boolean isCompulsory = false;

    public RegNewCultureEvent() {
        initComponents();
        jLabel7.setVisible(false);
        maxPerGroup.setVisible(false);
    }
    int xMouse;
    int yMouse;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnGroupSelect = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        eventName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        eventGrade = new javax.swing.JComboBox<>();
        btnVote6 = new javax.swing.JButton();
        btnSoloSelect = new javax.swing.JButton();
        btnVote7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        maxPerGroup = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnA = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Book Management System");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eduplex Culture Management System - Registration");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        btnGroupSelect.setBackground(new java.awt.Color(249, 16, 48));
        btnGroupSelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGroupSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnGroupSelect.setText("Group Event");
        btnGroupSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroupSelectActionPerformed(evt);
            }
        });
        jPanel1.add(btnGroupSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 190, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Max / Group -");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("[I]");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Event Name -");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        eventName.setBackground(new java.awt.Color(34, 34, 78));
        eventName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eventName.setForeground(new java.awt.Color(255, 255, 255));
        eventName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(eventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 700, 60));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Event Grade -");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        eventGrade.setBackground(new java.awt.Color(37, 37, 103));
        eventGrade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eventGrade.setForeground(new java.awt.Color(255, 255, 255));
        eventGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "Teacher", "All" }));
        jPanel1.add(eventGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 750, 60));

        btnVote6.setBackground(new java.awt.Color(255, 89, 33));
        btnVote6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote6.setForeground(new java.awt.Color(255, 255, 255));
        btnVote6.setText("Register Event");
        btnVote6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 190, 50));

        btnSoloSelect.setBackground(new java.awt.Color(0, 153, 51));
        btnSoloSelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSoloSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSoloSelect.setText("Individual Event");
        btnSoloSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoloSelectActionPerformed(evt);
            }
        });
        jPanel1.add(btnSoloSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 190, 50));

        btnVote7.setBackground(new java.awt.Color(255, 89, 33));
        btnVote7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote7.setForeground(new java.awt.Color(255, 255, 255));
        btnVote7.setText("Back");
        btnVote7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 190, 50));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("This Is A -");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        maxPerGroup.setBackground(new java.awt.Color(34, 34, 78));
        maxPerGroup.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        maxPerGroup.setForeground(new java.awt.Color(255, 255, 255));
        maxPerGroup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maxPerGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxPerGroupActionPerformed(evt);
            }
        });
        jPanel1.add(maxPerGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 110, 60));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Please Fill In All Required Information");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        btnA.setBackground(new java.awt.Color(255, 255, 255));
        btnA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 255, 255));
        btnA.setSelected(true);
        btnA.setText("Enable Event Tags");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 260, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //Code will log the user out and then close the program

        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        //This is used so the user can drag the window around without it having an frame
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MouseReleased

    private void btnGroupSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroupSelectActionPerformed
        btnGroupSelect.setBackground(new java.awt.Color(80, 153, 51));
        btnSoloSelect.setBackground(new java.awt.Color(249, 16, 48));
        curGroupValue = "Group";
                       jLabel8.setText("[G]");


        jLabel7.setVisible(true);
        maxPerGroup.setVisible(true);

    }//GEN-LAST:event_btnGroupSelectActionPerformed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed

    }//GEN-LAST:event_jLabel15MousePressed

    private void btnVote6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote6ActionPerformed
       
        if(eventGrade.getSelectedItem().equals("All"))
        {
            this.allOptionSave();
        }
        else
        {
            
        eName = eventName.getText().trim();
        eGrade = eventGrade.getSelectedItem().toString();
        eDate = "2000";
        eTotal = "100";
        if(btnA.isSelected() == true)
        {
            
        if(curGroupValue.equalsIgnoreCase("Group"))
        {
              eName = (eName + " [G]");
        }
        else if(curGroupValue.equalsIgnoreCase("Solo"))
        {
                          eName = (eName + " [I]");
        }
                }

                
        
        String maxpg = maxPerGroup.getText().trim();
        isCompulsory = false;
        if (eTotal.equalsIgnoreCase("-")) {
            eTotal = "Unlimited";
        }
       
        if (eName.equalsIgnoreCase("") || eDate.equalsIgnoreCase("") || eTotal.equalsIgnoreCase("") || isNumeric(eTotal) == false) {
            JOptionPane.showMessageDialog(null, "Some Of The Information That Was Required To Submit This Event Was Missing\nPlease Make Sure Everything Is Filled In Correctly", "Operation Failed", JOptionPane.ERROR_MESSAGE);
        } else if (maxpg.equalsIgnoreCase("") && curGroupValue.equalsIgnoreCase("Group")) {
            JOptionPane.showMessageDialog(null, "Some Of The Information That Was Required To Submit This Event Was Missing\nPlease Make Sure Everything Is Filled In Correctly", "Operation Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            String dbLocation = cm.getDatabaseLocation();

            try {
                PrintWriter printer = new PrintWriter(new FileWriter(dbLocation + "\\Culture_Management_Admin\\" + "Culture\\Events\\" + "Grade_" + eGrade + "\\" + eName + ".db"), false);
                printer.println(eName);
                printer.println(eDate);
                printer.println(eGrade);
                printer.println(eTotal);
                printer.println(isCompulsory);
                printer.println(curGroupValue);
                printer.println(maxpg);
                printer.close();
                if (curGroupValue.equalsIgnoreCase("Group")) {

                    File customDir = new File(dbLocation + "\\Culture_Management_Admin\\Students\\Grade_" + eGrade + "\\" + eName + "\\Groups");

                    if (customDir.exists()) {
                        System.out.println(customDir + " already exists");
                    } else if (customDir.mkdirs()) {
                        System.out.println(customDir + " was created");
                    } else {
                        System.out.println(customDir + " was not created");
                    }
                } else if (curGroupValue.equalsIgnoreCase("Solo")) {

                    File customDir = new File(dbLocation + "\\Culture_Management_Admin\\Students\\Grade_" + eGrade + "\\" + eName);

                    if (customDir.exists()) {
                        System.out.println(customDir + " already exists");
                    } else if (customDir.mkdirs()) {
                        System.out.println(customDir + " was created");
                    } else {
                        System.out.println(customDir + " was not created");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Unable To Save Data To The Database, Please Make Sure This Decice Has Read And Write Access!", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                System.exit(0);
            }
            //If All Is Good, Do This
            eventName.setText("");
            String curGroupValueN = "";
              if(curGroupValue.equalsIgnoreCase("Solo"))
           {
               curGroupValueN = "Individual";
           }
              else
              {
                  curGroupValueN = "Group";
              }
                       JOptionPane.showMessageDialog(null, eName + " Has Been Created And Saved To The Server" + "\nThis will be a " + curGroupValueN + " Event", "Opperation Succesful", JOptionPane.INFORMATION_MESSAGE);


        }
        }


    }//GEN-LAST:event_btnVote6ActionPerformed
    public boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    private void btnSoloSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoloSelectActionPerformed
        btnSoloSelect.setBackground(new java.awt.Color(80, 153, 51));
        btnGroupSelect.setBackground(new java.awt.Color(249, 16, 48));
        curGroupValue = "Solo";
        jLabel7.setVisible(false);
        jLabel8.setText("[I]");
        maxPerGroup.setVisible(false);
    }//GEN-LAST:event_btnSoloSelectActionPerformed

    private void btnVote7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote7ActionPerformed
        new Administration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVote7ActionPerformed

    private void maxPerGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxPerGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxPerGroupActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        if(btnA.isSelected())
        {
            jLabel8.setVisible(true);
        }
        else
        {
            jLabel8.setVisible(false);
        }
    }//GEN-LAST:event_btnAActionPerformed
public void allOptionSave()
{
     eName = eventName.getText().trim();
        eGrade = eventGrade.getSelectedItem().toString();
        eDate = "2000";
        eTotal = "100";
         if(btnA.isSelected() == true)
        {
        if(curGroupValue.equalsIgnoreCase("Group"))
        {
              eName = (eName + " [G]");
        }
        else if(curGroupValue.equalsIgnoreCase("Solo"))
        {
                          eName = (eName + " [I]");

        }
        }   
        
        String maxpg = maxPerGroup.getText().trim();
        isCompulsory = false;
        if (eTotal.equalsIgnoreCase("-")) {
            eTotal = "Unlimited";
        }
       
        if (eName.equalsIgnoreCase("") || eDate.equalsIgnoreCase("") || eTotal.equalsIgnoreCase("") || isNumeric(eTotal) == false) {
            JOptionPane.showMessageDialog(null, "Some Of The Information That Was Required To Submit This Event Was Missing\nPlease Make Sure Everything Is Filled In Correctly", "Operation Failed", JOptionPane.ERROR_MESSAGE);
        } else if (maxpg.equalsIgnoreCase("") && curGroupValue.equalsIgnoreCase("Group")) {
            JOptionPane.showMessageDialog(null, "Some Of The Information That Was Required To Submit This Event Was Missing\nPlease Make Sure Everything Is Filled In Correctly", "Operation Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            String dbLocation = cm.getDatabaseLocation();
            for (int i = 1; i < 14; i++) {
                if(i >= 13)
                {
                    eGrade = "Teacher";
                }
                else
                {
                                    eGrade = i + "";

                }
                
            try {
                PrintWriter printer = new PrintWriter(new FileWriter(dbLocation + "\\Culture_Management_Admin\\" + "Culture\\Events\\" + "Grade_" + eGrade + "\\" + eName + ".db"), false);
                printer.println(eName);
                printer.println(eDate);
                printer.println(eGrade);
                printer.println(eTotal);
                printer.println(isCompulsory);
                printer.println(curGroupValue);
                printer.println(maxpg);
                printer.close();
                if (curGroupValue.equalsIgnoreCase("Group")) {

                    File customDir = new File(dbLocation + "\\Culture_Management_Admin\\Students\\Grade_" + eGrade + "\\" + eName + "\\Groups");

                    if (customDir.exists()) {
                        System.out.println(customDir + " already exists");
                    } else if (customDir.mkdirs()) {
                        System.out.println(customDir + " was created");
                    } else {
                        System.out.println(customDir + " was not created");
                    }
                } else if (curGroupValue.equalsIgnoreCase("Solo")) {

                    File customDir = new File(dbLocation + "\\Culture_Management_Admin\\Students\\Grade_" + eGrade + "\\" + eName);

                    if (customDir.exists()) {
                        System.out.println(customDir + " already exists");
                    } else if (customDir.mkdirs()) {
                        System.out.println(customDir + " was created");
                    } else {
                        System.out.println(customDir + " was not created");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Unable To Save Data To The Database, Please Make Sure This Decice Has Read And Write Access!", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                System.exit(0);
            }
                        } //end loop

            //If All Is Good, Do This
            eventName.setText("");
            
        String curGroupValueN = "";
              if(curGroupValue.equalsIgnoreCase("Solo"))
           {
               curGroupValueN = "Individual";
           }
               else
              {
                  curGroupValueN = "Group";
              }
            JOptionPane.showMessageDialog(null, eName + " Has Been Created And Saved To The Server" + "\nThis will be a " + curGroupValueN + " Event", "Opperation Succesful", JOptionPane.INFORMATION_MESSAGE);

        }
}
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
            java.util.logging.Logger.getLogger(RegNewCultureEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegNewCultureEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegNewCultureEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegNewCultureEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegNewCultureEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnA;
    private javax.swing.JButton btnGroupSelect;
    private javax.swing.JButton btnSoloSelect;
    private javax.swing.JButton btnVote6;
    private javax.swing.JButton btnVote7;
    private javax.swing.JComboBox<String> eventGrade;
    private javax.swing.JTextField eventName;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField maxPerGroup;
    // End of variables declaration//GEN-END:variables
}
