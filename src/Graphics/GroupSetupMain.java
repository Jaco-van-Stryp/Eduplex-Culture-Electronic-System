//This class was created on 2019.01.16 by Jaco van Stryp
package Graphics;

import handle.dbLocationManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Jaco van Stryp
 */
public class GroupSetupMain extends javax.swing.JFrame {

    /**
     * Creates new form FirstInstalation
     */
    dbLocationManager cm = new dbLocationManager();
    String studentName = "";

    public GroupSetupMain() {

        initComponents();
        txfGroupText.setVisible(false);
        jLabel8.setVisible(false);
        txfGroupText.setVisible(false);
        this.loadAllUserEvents();
        sName.setVisible(false);

        try {

            String sLoc = cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "Student_Name.db";
            Scanner scFileMainName = new Scanner(new File(sLoc));
            studentName = scFileMainName.nextLine();
            scFileMainName.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadAllUserEvents() {
        try {
            String loc = cm.getLocalStorageLocation() + "\\Culture_Management_System\\" + "UserCurrentStatus.db";
            Scanner scFile = new Scanner(new File(loc));
            String nextEvt;
            String isGroup;
            String line = "";
            while (scFile.hasNextLine()) {
                line = scFile.nextLine();
                String[] linePart = line.split(":::");

                nextEvt = linePart[0];
                isGroup = linePart[1];
                if (isGroup.equalsIgnoreCase("true")) {
                    GroupTextArea.append(nextEvt + "\n");
                } else if (isGroup.equalsIgnoreCase("false")) {
                    SoloTextArea.append(nextEvt + "\n");
                }
            }
            scFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfGroupText = new javax.swing.JLabel();
        btnVote8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GroupTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        SoloTextArea = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sName = new javax.swing.JTextField();
        btnVote11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Culture Management System");
        setUndecorated(true);
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

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eduplex Culture Management System - Group Selection");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 30, 30));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 477, 8, 24));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Session Complte - Thank You For Participating");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        txfGroupText.setBackground(new java.awt.Color(255, 255, 255));
        txfGroupText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txfGroupText.setForeground(new java.awt.Color(255, 255, 255));
        txfGroupText.setText("Enter A Group Name For ");
        jPanel1.add(txfGroupText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        btnVote8.setBackground(new java.awt.Color(255, 89, 33));
        btnVote8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote8.setForeground(new java.awt.Color(255, 255, 255));
        btnVote8.setText("Confirm That The Above Mentioned Is Correct");
        btnVote8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 570, 50));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Individual Events");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        GroupTextArea.setEditable(false);
        GroupTextArea.setBackground(new java.awt.Color(34, 34, 78));
        GroupTextArea.setColumns(20);
        GroupTextArea.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        GroupTextArea.setForeground(new java.awt.Color(255, 255, 255));
        GroupTextArea.setRows(5);
        jScrollPane1.setViewportView(GroupTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 380, 290));

        SoloTextArea.setEditable(false);
        SoloTextArea.setBackground(new java.awt.Color(34, 34, 78));
        SoloTextArea.setColumns(20);
        SoloTextArea.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        SoloTextArea.setForeground(new java.awt.Color(255, 255, 255));
        SoloTextArea.setRows(5);
        jScrollPane2.setViewportView(SoloTextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 380, 290));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Group Events");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Group Members");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1060, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Any Group Events,");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1050, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("You Can Enter");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1050, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("A Group Name");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1050, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("You Wish To");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1050, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Be Apart Of");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1050, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("If You Have");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1050, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("You And Your");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1060, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("On A Group Name");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1060, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Have To Decide");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1060, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Please Make Sure The Following Information Is Correct");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("I Want To");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        sName.setBackground(new java.awt.Color(34, 34, 78));
        sName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sName.setForeground(new java.awt.Color(255, 255, 255));
        sName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameActionPerformed(evt);
            }
        });
        jPanel1.add(sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 380, 50));

        btnVote11.setBackground(new java.awt.Color(255, 89, 33));
        btnVote11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote11.setForeground(new java.awt.Color(255, 255, 255));
        btnVote11.setText("Reselect Events");
        btnVote11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote11ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 260, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed

    }//GEN-LAST:event_jLabel15MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased


    }//GEN-LAST:event_jPanel2MouseReleased

    public void saveSoloEventsToServer() {
        try {
            if (SoloTextArea.getText().equalsIgnoreCase("")) {

            } else {

                String[] data = SoloTextArea.getText().split("\n");
                String dbLocationMain = cm.getDatabaseLocation();
                for (int i = 0; i < data.length; i++) {
                    PrintWriter printer = new PrintWriter(new FileWriter(dbLocationMain + "\\Culture_Management_Admin\\Students\\Grade_" + cm.getUserGrade() + "\\" + data[i] + "\\" + studentName + ".db"));
                    printer.println(studentName);
                    printer.close();
                }
            }

        } catch (Exception e) {

        }

    }
    boolean saved = false;
    int mainCountValue = 0;
    int len = 0;

    private void btnVote8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote8ActionPerformed
       
        if (GroupTextArea.getText().equalsIgnoreCase("")) {
            this.saveSoloEventsToServer();
            this.saveFinalAllData();
            btnVote11.setVisible(false);
            jLabel12.setVisible(false);
        } else {

            try {
                String[] groupEventName = null;
                if (saved == false) {
                    groupEventName = GroupTextArea.getText().split("\n");
                    System.out.println(GroupTextArea.getText());

                    len = groupEventName.length;
                    saved = true;
                    this.saveSoloEventsToServer();
                    jLabel23.setText("You Will Now");
                    jLabel16.setText("Be Able To Join");
                    jLabel25.setText("Or Create A Group");
                    jLabel24.setText("Name");
                    jLabel22.setText("Make Sure Your");
                    jLabel17.setText("Group Memebers");
                    jLabel18.setText("Agree On This");
                    jLabel19.setText("Group Name");
                    jLabel12.setVisible(false);
                    btnVote11.setVisible(false);
                    btnVote11.setVisible(false);
                    btnVote11.setVisible(false);
                    jLabel21.setVisible(false);
                    GroupTextArea.setVisible(false);
                    SoloTextArea.setVisible(false);
                    jScrollPane2.setVisible(false);
                    jScrollPane1.setVisible(false);
                    jLabel21.setVisible(false);
                    jLabel13.setVisible(false);
                    jLabel14.setVisible(false);
                    txfGroupText.setVisible(false);
                    jLabel9.setVisible(false);
                    saveSoloEventsToServer();
                    txfGroupText.setVisible(true);
                    btnVote8.setVisible(true);
                    btnVote8.setText("Next");
                    jLabel20.setVisible(true);
                    sName.setVisible(true);
                    mainCountValue = 0;

                    if (groupEventName[mainCountValue] != null) {

                        txfGroupText.setText("Enter A Group Name For \"" + groupEventName[0] + "\" - ");
                        jLabel20.setText("(Max " + cm.getMaxGroupMembers(grade, groupEventName[mainCountValue]) + " Members)");

                    }

                } else {
                    System.err.println(mainCountValue + "\t" + len);
                    if (mainCountValue >= len) {
                        this.saveFinalAllData();

                    } else {
                        groupEventName = GroupTextArea.getText().split("\n");
                        System.out.println("ENTER GROUP");
                        txfGroupText.setVisible(true);
                        jLabel20.setText("(Max " + cm.getMaxGroupMembers(grade, groupEventName[mainCountValue]) + " Members)");
                      
                        txfGroupText.setText("Enter A Group Name For \"" + groupEventName[mainCountValue] + "\" - ");

                        sName.setVisible(true);
                        String groupJoinInQry = sName.getText();     //= JOptionPane.showInputDialog(null, "Please Enter The Group Name You Want To Be Apart Of For The Event \"" + groupEventName[i] + "\"\n\nThis Group Can Have A Maximum Of " + cm.getMaxGroupMembers(cm.getUserGrade(), groupEventName[i]) + " Members\n\nPlease Make Sure This Group Name Matches The Group Name Your Friends & Group Members Decided On!", "Please Note", JOptionPane.QUESTION_MESSAGE).trim();
                        
                        if (groupJoinInQry.equalsIgnoreCase("") || groupJoinInQry.equalsIgnoreCase(" ")) {
                            System.out.println("INFORMATION INCORECT");

                            JOptionPane.showMessageDialog(null, "Please Make Sure You Entered The Information correctly", "Error", JOptionPane.ERROR_MESSAGE);
                            sName.setText("");

                        } else {

                            if (cm.isOverLim(groupJoinInQry, grade, groupEventName[mainCountValue]) == true) {
                                System.out.println("GROUP FULL");

                                JOptionPane.showMessageDialog(null, "This Group Is Full, Please Join Another Group", "Error", JOptionPane.ERROR_MESSAGE);
                                sName.setText("");
                              jLabel20.setText("(Max " + cm.getMaxGroupMembers(grade, groupEventName[mainCountValue]) + " Members)");


                            } else {
                                File customDir = new File(dbLoc + "\\Culture_Management_Admin\\Students\\Grade_" + grade + "\\" + groupEventName[mainCountValue] + "\\Groups");
                                System.out.println("DONE");
                                PrintWriter printer = new PrintWriter(new FileWriter(customDir + "\\" + groupJoinInQry + ".db", true));
                                printer.println(studentName);
                                printer.close();

                                mainCountValue++;

                                sName.setText("");
                                if (mainCountValue >= len) {
                                    this.saveFinalAllData();
                                        
                                } else {
                                    txfGroupText.setText("Enter A Group Name For \"" + groupEventName[mainCountValue] + "\" - ");
                                    jLabel20.setText("(Max " + cm.getMaxGroupMembers(grade, groupEventName[mainCountValue]) + " Members)");

                                }
                            }

                        }
                    }

                    //Take User To Next Section     
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Something Went Wrong With Saving Your Information!\n\nPlease Call An Administrator", "Error", JOptionPane.ERROR_MESSAGE);
                //TODO FIX
            }
        }

    }//GEN-LAST:event_btnVote8ActionPerformed
    String dbLoc = cm.getDatabaseLocation();
    String grade = cm.getUserGrade();
    private void btnVote11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote11ActionPerformed
        new EventSelection().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVote11ActionPerformed

    private void sNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameActionPerformed

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
            java.util.logging.Logger.getLogger(GroupSetupMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroupSetupMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroupSetupMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroupSetupMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupSetupMain().setVisible(true);
            }
        });
    }

    public void closeAll() {

        String uuidVal = "";

        try {
            Scanner scFile = new Scanner(new File(cm.getLocalStorageLocation() + "\\Culture_Management_System" + "\\Client_Role"));
            {
                uuidVal = scFile.nextLine();

            }

        } catch (Exception e) {
            uuidVal = "invalid";
        }

        if (uuidVal.equalsIgnoreCase("d4247c2f-97ee-4c20-b317-dc0b27d2d182")) {

            new Administration().setVisible(true);
            this.dispose();
        } else if (uuidVal.equalsIgnoreCase("db64d440-949d-4056-9c82-f6a20fc23ab3")) {
            new GradeSelection().setVisible(true);
            this.dispose();
        } else if (uuidVal.equalsIgnoreCase("invalid")) {

            JOptionPane.showMessageDialog(null, "This Instalation Of Eduplex Culture Management System Has Been Tampered With\n\nThis Program Will Remain Locked For To Security Reasons\n\nPlease Ask An Admniistrator To Resolve The Problem", "Warning", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        } else {
            JOptionPane.showMessageDialog(null, "This Instalation Of Eduplex Culture Management System Has Been Tampered With\n\nThis Program Will Remain Locked For To Security Reasons\n\nPlease Ask An Admniistrator To Resolve The Problem", "Warning", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    ActionListener task = new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            closeAll();
        }
    };
    ActionListener taskFirst = new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            jLabel8.setText("Session Complete - Thank You For Participating!");
            Timer timer = new Timer(7000, task);
            timer.setRepeats(false);
            timer.start();
        }
    };

    public void saveFinalAllData() {

        boolean test = false;
        Random r = new Random();
        int low = 1;
        int high = 15;
        int result = r.nextInt(high - low) + low;
        if (test == false) {
            btnVote8.setVisible(false);
            sName.setVisible(false);
            txfGroupText.setVisible(false);
            System.out.println(result);
            jLabel23.setVisible(false);
            jLabel16.setVisible(false);
            jLabel25.setVisible(false);
            jLabel25.setVisible(false);
            jLabel22.setVisible(false);
            jLabel17.setVisible(false);
            jLabel18.setVisible(false);
            jLabel19.setVisible(false);
            jLabel19.setVisible(false);
            jLabel21.setVisible(false);
            GroupTextArea.setVisible(false);
            SoloTextArea.setVisible(false);
            jScrollPane2.setVisible(false);
            jScrollPane1.setVisible(false);
            jLabel21.setVisible(false);
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            jLabel8.setVisible(true);
            txfGroupText.setVisible(false);
            jLabel9.setVisible(false);
            jLabel20.setVisible(false);
            jLabel24.setVisible(false);

            jLabel8.setText("Please Wait While We Save All Your Information...");
            Timer timer02 = new Timer(result * 1000, taskFirst);
            timer02.setRepeats(false);
            timer02.start();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea GroupTextArea;
    private javax.swing.JTextArea SoloTextArea;
    private javax.swing.JButton btnVote11;
    private javax.swing.JButton btnVote8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField sName;
    private javax.swing.JLabel txfGroupText;
    // End of variables declaration//GEN-END:variables
}
