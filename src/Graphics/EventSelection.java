package Graphics;

import handle.dbLocationManager;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;

public class EventSelection extends javax.swing.JFrame {

    String grade = "";
    int sCompSelections = 0;
int sMaxSelections = 0;
    String name = "";
    dbLocationManager cm = new dbLocationManager();


    public EventSelection() {
        {

            initComponents();
            
            loadUserSettings();
            loadAllData();
          //  this.loadAllData();

        }//end else
    }
    int xMouse;
    int yMouse;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sel01 = new javax.swing.JButton();
        sel16 = new javax.swing.JButton();
        sel06 = new javax.swing.JButton();
        sel11 = new javax.swing.JButton();
        sel17 = new javax.swing.JButton();
        sel12 = new javax.swing.JButton();
        sel07 = new javax.swing.JButton();
        sel02 = new javax.swing.JButton();
        sel18 = new javax.swing.JButton();
        sel13 = new javax.swing.JButton();
        sel08 = new javax.swing.JButton();
        sel03 = new javax.swing.JButton();
        sel19 = new javax.swing.JButton();
        sel14 = new javax.swing.JButton();
        sel09 = new javax.swing.JButton();
        sel04 = new javax.swing.JButton();
        sel05 = new javax.swing.JButton();
        sel10 = new javax.swing.JButton();
        sel15 = new javax.swing.JButton();
        sel20 = new javax.swing.JButton();
        sel21 = new javax.swing.JButton();
        sel22 = new javax.swing.JButton();
        sel23 = new javax.swing.JButton();
        sel24 = new javax.swing.JButton();
        sel25 = new javax.swing.JButton();
        sel26 = new javax.swing.JButton();
        sel27 = new javax.swing.JButton();
        sel28 = new javax.swing.JButton();
        sel29 = new javax.swing.JButton();
        sel30 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNextPage = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Highschool Electronic Voting System");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sel01.setBackground(new java.awt.Color(255, 102, 102));
        sel01.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel01.setText("Loading...");
        sel01.setMaximumSize(new java.awt.Dimension(125, 125));
        sel01.setMinimumSize(new java.awt.Dimension(106, 106));
        sel01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel01ActionPerformed(evt);
            }
        });
        jPanel1.add(sel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 125, 105));

        sel16.setBackground(new java.awt.Color(255, 102, 102));
        sel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel16.setText("Loading...");
        sel16.setMaximumSize(new java.awt.Dimension(125, 125));
        sel16.setMinimumSize(new java.awt.Dimension(106, 106));
        sel16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel16ActionPerformed(evt);
            }
        });
        jPanel1.add(sel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 304, 125, 100));

        sel06.setBackground(new java.awt.Color(255, 102, 102));
        sel06.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel06.setText("Loading...");
        sel06.setMaximumSize(new java.awt.Dimension(125, 125));
        sel06.setMinimumSize(new java.awt.Dimension(106, 106));
        sel06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel06ActionPerformed(evt);
            }
        });
        jPanel1.add(sel06, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 76, 125, 106));

        sel11.setBackground(new java.awt.Color(255, 102, 102));
        sel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel11.setText("Loading...");
        sel11.setMaximumSize(new java.awt.Dimension(125, 125));
        sel11.setMinimumSize(new java.awt.Dimension(106, 106));
        sel11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel11ActionPerformed(evt);
            }
        });
        jPanel1.add(sel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 193, 125, 100));

        sel17.setBackground(new java.awt.Color(255, 102, 102));
        sel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel17.setText("Loading...");
        sel17.setMaximumSize(new java.awt.Dimension(125, 125));
        sel17.setMinimumSize(new java.awt.Dimension(106, 106));
        sel17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel17ActionPerformed(evt);
            }
        });
        jPanel1.add(sel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 304, 125, 100));

        sel12.setBackground(new java.awt.Color(255, 102, 102));
        sel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel12.setText("Loading...");
        sel12.setMaximumSize(new java.awt.Dimension(125, 125));
        sel12.setMinimumSize(new java.awt.Dimension(106, 106));
        sel12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel12ActionPerformed(evt);
            }
        });
        jPanel1.add(sel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 193, 125, 100));

        sel07.setBackground(new java.awt.Color(255, 102, 102));
        sel07.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel07.setText("Loading...");
        sel07.setMaximumSize(new java.awt.Dimension(125, 125));
        sel07.setMinimumSize(new java.awt.Dimension(106, 106));
        sel07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel07ActionPerformed(evt);
            }
        });
        jPanel1.add(sel07, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, 125, 100));

        sel02.setBackground(new java.awt.Color(255, 102, 102));
        sel02.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel02.setText("Loading...");
        sel02.setMaximumSize(new java.awt.Dimension(125, 125));
        sel02.setMinimumSize(new java.awt.Dimension(106, 106));
        sel02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel02ActionPerformed(evt);
            }
        });
        jPanel1.add(sel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 76, 125, 105));

        sel18.setBackground(new java.awt.Color(255, 102, 102));
        sel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel18.setText("Loading...");
        sel18.setMaximumSize(new java.awt.Dimension(125, 125));
        sel18.setMinimumSize(new java.awt.Dimension(106, 106));
        sel18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel18ActionPerformed(evt);
            }
        });
        jPanel1.add(sel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 304, 125, 100));

        sel13.setBackground(new java.awt.Color(255, 102, 102));
        sel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel13.setText("Loading...");
        sel13.setMaximumSize(new java.awt.Dimension(125, 125));
        sel13.setMinimumSize(new java.awt.Dimension(106, 106));
        sel13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel13ActionPerformed(evt);
            }
        });
        jPanel1.add(sel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 304, 125, 100));

        sel08.setBackground(new java.awt.Color(255, 102, 102));
        sel08.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel08.setText("Loading...");
        sel08.setMaximumSize(new java.awt.Dimension(125, 125));
        sel08.setMinimumSize(new java.awt.Dimension(106, 106));
        sel08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel08ActionPerformed(evt);
            }
        });
        jPanel1.add(sel08, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 193, 125, 100));

        sel03.setBackground(new java.awt.Color(255, 102, 102));
        sel03.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel03.setText("Loading...");
        sel03.setMaximumSize(new java.awt.Dimension(125, 125));
        sel03.setMinimumSize(new java.awt.Dimension(106, 106));
        sel03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel03ActionPerformed(evt);
            }
        });
        jPanel1.add(sel03, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 76, 125, 106));

        sel19.setBackground(new java.awt.Color(255, 102, 102));
        sel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel19.setText("Loading...");
        sel19.setMaximumSize(new java.awt.Dimension(125, 125));
        sel19.setMinimumSize(new java.awt.Dimension(106, 106));
        sel19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel19ActionPerformed(evt);
            }
        });
        jPanel1.add(sel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 413, 125, 100));

        sel14.setBackground(new java.awt.Color(255, 102, 102));
        sel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel14.setText("Loading...");
        sel14.setMaximumSize(new java.awt.Dimension(125, 125));
        sel14.setMinimumSize(new java.awt.Dimension(106, 106));
        sel14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel14ActionPerformed(evt);
            }
        });
        jPanel1.add(sel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 304, 125, 100));

        sel09.setBackground(new java.awt.Color(255, 102, 102));
        sel09.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel09.setText("Loading...");
        sel09.setMaximumSize(new java.awt.Dimension(125, 125));
        sel09.setMinimumSize(new java.awt.Dimension(106, 106));
        sel09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel09ActionPerformed(evt);
            }
        });
        jPanel1.add(sel09, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 193, 125, 100));

        sel04.setBackground(new java.awt.Color(255, 102, 102));
        sel04.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel04.setText("Loading...");
        sel04.setMaximumSize(new java.awt.Dimension(125, 125));
        sel04.setMinimumSize(new java.awt.Dimension(106, 106));
        sel04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel04ActionPerformed(evt);
            }
        });
        jPanel1.add(sel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 76, 125, 106));

        sel05.setBackground(new java.awt.Color(255, 102, 102));
        sel05.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel05.setText("Loading...");
        sel05.setMaximumSize(new java.awt.Dimension(125, 125));
        sel05.setMinimumSize(new java.awt.Dimension(106, 106));
        sel05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel05ActionPerformed(evt);
            }
        });
        jPanel1.add(sel05, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 76, 125, 106));

        sel10.setBackground(new java.awt.Color(255, 102, 102));
        sel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel10.setText("Loading...");
        sel10.setMaximumSize(new java.awt.Dimension(125, 125));
        sel10.setMinimumSize(new java.awt.Dimension(106, 106));
        sel10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel10ActionPerformed(evt);
            }
        });
        jPanel1.add(sel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 193, 125, 100));

        sel15.setBackground(new java.awt.Color(255, 102, 102));
        sel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel15.setText("Loading...");
        sel15.setMaximumSize(new java.awt.Dimension(125, 125));
        sel15.setMinimumSize(new java.awt.Dimension(106, 106));
        sel15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel15ActionPerformed(evt);
            }
        });
        jPanel1.add(sel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 304, 125, 100));

        sel20.setBackground(new java.awt.Color(255, 102, 102));
        sel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel20.setText("Loading...");
        sel20.setMaximumSize(new java.awt.Dimension(125, 125));
        sel20.setMinimumSize(new java.awt.Dimension(106, 106));
        sel20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel20ActionPerformed(evt);
            }
        });
        jPanel1.add(sel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 413, 125, 100));

        sel21.setBackground(new java.awt.Color(255, 102, 102));
        sel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel21.setText("Loading...");
        sel21.setMaximumSize(new java.awt.Dimension(125, 125));
        sel21.setMinimumSize(new java.awt.Dimension(106, 106));
        sel21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel21ActionPerformed(evt);
            }
        });
        jPanel1.add(sel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 413, 125, 100));

        sel22.setBackground(new java.awt.Color(255, 102, 102));
        sel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel22.setText("Loading...");
        sel22.setMaximumSize(new java.awt.Dimension(125, 125));
        sel22.setMinimumSize(new java.awt.Dimension(106, 106));
        sel22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel22ActionPerformed(evt);
            }
        });
        jPanel1.add(sel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 412, 125, 102));

        sel23.setBackground(new java.awt.Color(255, 102, 102));
        sel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel23.setText("Loading...");
        sel23.setMaximumSize(new java.awt.Dimension(125, 125));
        sel23.setMinimumSize(new java.awt.Dimension(106, 106));
        sel23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel23ActionPerformed(evt);
            }
        });
        jPanel1.add(sel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 410, 125, 106));

        sel24.setBackground(new java.awt.Color(255, 102, 102));
        sel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel24.setText("Loading...");
        sel24.setMaximumSize(new java.awt.Dimension(125, 125));
        sel24.setMinimumSize(new java.awt.Dimension(106, 106));
        sel24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel24ActionPerformed(evt);
            }
        });
        jPanel1.add(sel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 410, 125, 106));

        sel25.setBackground(new java.awt.Color(255, 102, 102));
        sel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel25.setText("Loading...");
        sel25.setMaximumSize(new java.awt.Dimension(125, 125));
        sel25.setMinimumSize(new java.awt.Dimension(106, 106));
        sel25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel25ActionPerformed(evt);
            }
        });
        jPanel1.add(sel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 522, 125, 106));

        sel26.setBackground(new java.awt.Color(255, 102, 102));
        sel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel26.setText("Loading...");
        sel26.setMaximumSize(new java.awt.Dimension(125, 125));
        sel26.setMinimumSize(new java.awt.Dimension(106, 106));
        sel26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel26ActionPerformed(evt);
            }
        });
        jPanel1.add(sel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 522, 125, 106));

        sel27.setBackground(new java.awt.Color(255, 102, 102));
        sel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel27.setText("Loading...");
        sel27.setMaximumSize(new java.awt.Dimension(125, 125));
        sel27.setMinimumSize(new java.awt.Dimension(106, 106));
        sel27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel27ActionPerformed(evt);
            }
        });
        jPanel1.add(sel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 522, 125, 106));

        sel28.setBackground(new java.awt.Color(255, 102, 102));
        sel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel28.setText("Loading...");
        sel28.setMaximumSize(new java.awt.Dimension(125, 125));
        sel28.setMinimumSize(new java.awt.Dimension(106, 106));
        sel28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel28ActionPerformed(evt);
            }
        });
        jPanel1.add(sel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 522, 125, 106));

        sel29.setBackground(new java.awt.Color(255, 102, 102));
        sel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel29.setText("Loading...");
        sel29.setMaximumSize(new java.awt.Dimension(125, 125));
        sel29.setMinimumSize(new java.awt.Dimension(106, 106));
        sel29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel29ActionPerformed(evt);
            }
        });
        jPanel1.add(sel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 522, 125, 106));

        sel30.setBackground(new java.awt.Color(255, 102, 102));
        sel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sel30.setText("Loading...");
        sel30.setMaximumSize(new java.awt.Dimension(125, 125));
        sel30.setMinimumSize(new java.awt.Dimension(106, 106));
        sel30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel30ActionPerformed(evt);
            }
        });
        jPanel1.add(sel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 522, 125, 106));

        jPanel2.setBackground(new java.awt.Color(8, 8, 94));

        btnNextPage.setBackground(new java.awt.Color(255, 82, 24));
        btnNextPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextPage.setText("Finish");
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPageActionPerformed(evt);
            }
        });

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Events You Wish");

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Click On All The");

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("To Participate In.");

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("You As A Grade [x]");

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("No More Than");

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("[z] Events");

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("[y] Events And");

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Student Must Choose");

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Click Again To");

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Deselect An Event");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNextPage, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 270, 540));

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, -1, -1));

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resourses/Eduplex EVS v5 Small.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eduplex Culture Management System - Event Selection");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 660, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int totalSelected = 0;
//variables for every button to see if its clicked or not
    boolean chosen01 = false;
    boolean chosen02 = false;
    boolean chosen03 = false;
    boolean chosen04 = false;
    boolean chosen05 = false;
    boolean chosen06 = false;
    boolean chosen07 = false;
    boolean chosen08 = false;
    boolean chosen09 = false;
    boolean chosen10 = false;
    boolean chosen11 = false;
    boolean chosen12 = false;
    boolean chosen13 = false;
    boolean chosen14 = false;
    boolean chosen15 = false;
    boolean chosen16 = false;
    boolean chosen17 = false;
    boolean chosen18 = false;
    boolean chosen19 = false;
    boolean chosen20 = false;
    boolean chosen21 = false;
    boolean chosen22 = false;
    boolean chosen23 = false;
    boolean chosen24 = false;
    boolean chosen25 = false;
    boolean chosen26 = false;
    boolean chosen27 = false;
    boolean chosen28 = false;
    boolean chosen29 = false;
    boolean chosen30 = false;

    int activeVotes = 0; // amount of buttons the user has clicked

    // All code marked "//x" is different from the code above it 
    private void sel01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel01ActionPerformed
//this comment counts for all buttons, it sets the value to true if clicked, and change the color to green
//and adds one vote, if its clicked again, it reverses all code
        if (chosen01 == false) {
            chosen01 = true;
            sel01.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel01.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen01 = false;
            System.out.println("FALSE");
            activeVotes--;

        }

    }//GEN-LAST:event_sel01ActionPerformed

    private void btnNextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPageActionPerformed
        if(activeVotes > sMaxSelections || activeVotes < sCompSelections)
        {
            JOptionPane.showMessageDialog(null, "Please Make Sure You followed The Instructions Correctly\n\nYou Must Choose A Minimum Of " + sCompSelections + " Events\nAnd You Can Only Select A Maximum Of " + sMaxSelections + " Events", "Please Check Your Selections", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            System.out.println("Saving Data To Server");
                  this.saveDataToServer();
                  new GroupSetupMain().setVisible(true);
                  this.dispose();
                  //This Seciton Will Take The User To A Preview Of His Data So The User Can Create Groups
//new LanguageSelectionMain().setVisible(true);
        //this.dispose();
        
        }
        
    }//GEN-LAST:event_btnNextPageActionPerformed

    private void sel02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel02ActionPerformed

        if (chosen02 == false) {//x
            chosen02 = true;//x
            sel02.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel02.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen02 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }

    }//GEN-LAST:event_sel02ActionPerformed

    private void sel03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel03ActionPerformed

        if (chosen03 == false) {//x
            chosen03 = true;//x
            sel03.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel03.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen03 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }

    }//GEN-LAST:event_sel03ActionPerformed

    private void sel04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel04ActionPerformed

        if (chosen04 == false) {//x
            chosen04 = true;//x
            sel04.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel04.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen04 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }

    }//GEN-LAST:event_sel04ActionPerformed

    private void sel05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel05ActionPerformed

        if (chosen05 == false) {//x
            chosen05 = true;//x
            sel05.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel05.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen05 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }

    }//GEN-LAST:event_sel05ActionPerformed

    private void sel06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel06ActionPerformed

        if (chosen06 == false) {//x
            chosen06 = true;//x
            sel06.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel06.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen06 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }

    }//GEN-LAST:event_sel06ActionPerformed

    private void sel07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel07ActionPerformed

        if (chosen07 == false) {//x
            chosen07 = true;//x
            sel07.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel07.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen07 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel07ActionPerformed

    private void sel08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel08ActionPerformed

        if (chosen08 == false) {//x
            chosen08 = true;//x
            sel08.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel08.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen08 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel08ActionPerformed

    private void sel09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel09ActionPerformed
        if (chosen09 == false) {//x
            chosen09 = true;//x
            sel09.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel09.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen09 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel09ActionPerformed

    private void sel10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel10ActionPerformed
        if (chosen10 == false) {//x
            chosen10 = true;//x
            sel10.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel10.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen10 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel10ActionPerformed

    private void sel11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel11ActionPerformed
        if (chosen11 == false) {//x
            chosen11 = true;//x
            sel11.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel11.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen11 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel11ActionPerformed

    private void sel12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel12ActionPerformed
        if (chosen12 == false) {//x
            chosen12 = true;//x
            sel12.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel12.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen12 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel12ActionPerformed

    private void sel13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel13ActionPerformed
        if (chosen13 == false) {//x
            chosen13 = true;//x
            sel13.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel13.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen13 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel13ActionPerformed

    private void sel14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel14ActionPerformed
        if (chosen14 == false) {//x
            chosen14 = true;//x
            sel14.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel14.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen14 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel14ActionPerformed

    private void sel15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel15ActionPerformed
        if (chosen15 == false) {//x
            chosen15 = true;//x
            sel15.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel15.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen15 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel15ActionPerformed

    private void sel16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel16ActionPerformed
        if (chosen16 == false) {//x
            chosen16 = true;//x
            sel16.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel16.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen16 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel16ActionPerformed

    private void sel17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel17ActionPerformed
        if (chosen17 == false) {//x
            chosen17 = true;//x
            sel17.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel17.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen17 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel17ActionPerformed

    private void sel18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel18ActionPerformed
        if (chosen18 == false) {//x
            chosen18 = true;//x
            sel18.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel18.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen18 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel18ActionPerformed

    private void sel19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel19ActionPerformed
        if (chosen19 == false) {//x
            chosen19 = true;//x
            sel19.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel19.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen19 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel19ActionPerformed

    private void sel20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel20ActionPerformed
        if (chosen20 == false) {//x
            chosen20 = true;//x
            sel20.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel20.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen20 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel20ActionPerformed

    private void sel21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel21ActionPerformed
        if (chosen21 == false) {//x
            chosen21 = true;//x
            sel21.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel21.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen21 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel21ActionPerformed

    private void sel22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel22ActionPerformed
        if (chosen22 == false) {//x
            chosen22 = true;//x
            sel22.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel22.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen22 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel22ActionPerformed

    private void sel23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel23ActionPerformed
        if (chosen23 == false) {//x
            chosen23 = true;//x
            sel23.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel23.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen23 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel23ActionPerformed

    private void sel24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel24ActionPerformed
        if (chosen24 == false) {//x
            chosen24 = true;//x
            sel24.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel24.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen24 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel24ActionPerformed

    private void sel25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel25ActionPerformed
        if (chosen25 == false) {//x
            chosen25 = true;//x
            sel25.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel25.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen25 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel25ActionPerformed

    private void sel26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel26ActionPerformed
        if (chosen26 == false) {//x
            chosen26 = true;//x
            sel26.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel26.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen26 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel26ActionPerformed

    private void sel27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel27ActionPerformed
        if (chosen27 == false) {//x
            chosen27 = true;//x
            sel27.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel27.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen27 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel27ActionPerformed

    private void sel28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel28ActionPerformed
        if (chosen28 == false) {//x
            chosen28 = true;//x
            sel28.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel28.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen28 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel28ActionPerformed

    private void sel29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel29ActionPerformed
        if (chosen29 == false) {//x
            chosen29 = true;//x
            sel29.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel29.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen29 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel29ActionPerformed

    private void sel30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel30ActionPerformed
        if (chosen30 == false) {//x
            chosen30 = true;//x
            sel30.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;

        } else {
            sel30.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen30 = false;//x
            System.out.println("FALSE");
            activeVotes--;

        }
    }//GEN-LAST:event_sel30ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //Code will log the user out and then close the program

        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed

    }//GEN-LAST:event_jLabel15MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        //This is used so the user can drag the window around without it having an frame
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MouseReleased

    public void loadUserSettings()
{
    try
    {
         String localLocation = cm.getLocalStorageLocation() + "\\Culture_Management_System";
    Scanner scFileGrade = new Scanner(new File(localLocation + "\\Student_Grade.db"));
    String grade = scFileGrade.nextLine();
    scFileGrade.close();
    
    Scanner scFilePropval1 = new Scanner(new File(localLocation + "\\server.propperties"));
    Scanner scFilePropval2 = new Scanner(new File(localLocation + "\\server.propperties"));
    if(grade.equalsIgnoreCase("Teacher"))
    {
        
        grade = "13";
            jLabel58.setText("You As A Non-Student");
            jLabel62.setText("Must Choose");

    }
    else
    {
        
                    jLabel58.setText("You As A Grade " + grade);
                    
    }
    
    int GIV = Integer.parseInt(grade);
        for (int i = 0; i < GIV; i++) {
            sCompSelections = scFilePropval1.nextInt();
            System.out.println(sCompSelections);
        }
            for (int i = 0; i < GIV + 13; i++) {
            sMaxSelections = scFilePropval2.nextInt();
            System.out.println(sMaxSelections);
        }
        jLabel61.setText(sCompSelections + " Events And");
        jLabel60.setText(sMaxSelections + " Events.");
        scFilePropval1.close();
        scFilePropval2.close();
    }
     catch(Exception e)
     {
         e.printStackTrace();
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
            java.util.logging.Logger.getLogger(EventSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNextPage;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton sel01;
    private javax.swing.JButton sel02;
    private javax.swing.JButton sel03;
    private javax.swing.JButton sel04;
    private javax.swing.JButton sel05;
    private javax.swing.JButton sel06;
    private javax.swing.JButton sel07;
    private javax.swing.JButton sel08;
    private javax.swing.JButton sel09;
    private javax.swing.JButton sel10;
    private javax.swing.JButton sel11;
    private javax.swing.JButton sel12;
    private javax.swing.JButton sel13;
    private javax.swing.JButton sel14;
    private javax.swing.JButton sel15;
    private javax.swing.JButton sel16;
    private javax.swing.JButton sel17;
    private javax.swing.JButton sel18;
    private javax.swing.JButton sel19;
    private javax.swing.JButton sel20;
    private javax.swing.JButton sel21;
    private javax.swing.JButton sel22;
    private javax.swing.JButton sel23;
    private javax.swing.JButton sel24;
    private javax.swing.JButton sel25;
    private javax.swing.JButton sel26;
    private javax.swing.JButton sel27;
    private javax.swing.JButton sel28;
    private javax.swing.JButton sel29;
    private javax.swing.JButton sel30;
    // End of variables declaration//GEN-END:variables

    public void loadAllData() {
        Thread t = new Thread(() -> {
            try {
                // method loads all appropriate text into the buttons and sets them visable if they should have text

                Scanner studentGrade = new Scanner(new File(cm.getLocalStorageLocation() + "\\Culture_Management_System\\Student_Grade.db"));
                Scanner studentName = new Scanner(new File(cm.getLocalStorageLocation() + "\\Culture_Management_System\\Student_Name.db"));

                grade = studentGrade.nextLine();
                name = studentName.nextLine();
              
                studentGrade.close();
                studentName.close();

             

                String location = cm.getLocalStorageLocation() + "Culture_Management_System\\Server_Events_Clone\\" + "Grade_" + grade;//Loads Folder
                System.out.println("FILE NAME - " + location);
                File folder = new File(location);
                File[] listOfFiles = folder.listFiles();
                String finalLocation = "";
                String line = "";
                String subject = "";
                //CHANGED
                String[] loadArr = new String[30];
                int counter = 0;
                int totalFiles = listOfFiles.length;

                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile()) {

                        finalLocation = listOfFiles[i].getName();

                        String extention = finalLocation.substring(finalLocation.length() - 3, finalLocation.length());

                        if (extention.equalsIgnoreCase(".db")) {

                            loadArr[counter] = finalLocation;
                            counter++;

                        }

                    }

                }
                int newC = 0;
                for (int i = 0; i < loadArr.length; i++) {
                    if (loadArr[i] != null) {
                        loadArr[i] = loadArr[i].substring(0, loadArr[i].length() - 3);
                        loadArr[i] = loadArr[i].trim();
                        loadArr[i] = "<html>" + loadArr[i].replaceAll(" ", "<br>") + "</html>";
                    }

                }
                ToolTipManager.sharedInstance().setInitialDelay(0); //xx

                //Loading Begins Here
                //LoadFileNum
                if (loadArr[0] != null) {
                    sel01.setText(loadArr[0]);
                    sel01.setToolTipText(sel01.getText());
                } else {
                    sel01.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[1] != null) {
                    sel02.setText(loadArr[1]);
                    sel02.setToolTipText(sel02.getText());

                } else {
                    sel02.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[2] != null) {
                    sel03.setText(loadArr[2]);
                    sel03.setToolTipText(sel03.getText());

                } else {
                    sel03.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[3] != null) {
                    sel04.setText(loadArr[3]);
                    sel04.setToolTipText(sel04.getText());

                } else {
                    sel04.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[4] != null) {
                    sel05.setText(loadArr[4]);
                    sel05.setToolTipText(sel05.getText());

                } else {
                    sel05.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[5] != null) {
                    sel06.setText(loadArr[5]);
                    sel06.setToolTipText(sel06.getText());

                } else {
                    sel06.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[6] != null) {
                    sel07.setText(loadArr[6]);
                    sel07.setToolTipText(sel07.getText());

                } else {
                    sel07.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[7] != null) {
                    sel08.setText(loadArr[7]);
                    sel08.setToolTipText(sel08.getText());

                } else {
                    sel08.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[8] != null) {
                    sel09.setText(loadArr[8]);
                    sel09.setToolTipText(sel09.getText());

                } else {
                    sel09.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[9] != null) {
                    sel10.setText(loadArr[9]);
                    sel10.setToolTipText(sel10.getText());

                } else {
                    sel10.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[10] != null) {
                    sel11.setText(loadArr[10]);
                    sel11.setToolTipText(sel11.getText());

                } else {
                    sel11.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[11] != null) {
                    sel12.setText(loadArr[11]);
                    sel12.setToolTipText(sel12.getText());

                } else {
                    sel12.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[12] != null) {
                    sel13.setText(loadArr[12]);
                    sel13.setToolTipText(sel13.getText());

                } else {
                    sel13.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[13] != null) {
                    sel14.setText(loadArr[13]);
                    sel14.setToolTipText(sel14.getText());

                } else {
                    sel14.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[14] != null) {
                    sel15.setText(loadArr[14]);
                    sel15.setToolTipText(sel15.getText());

                } else {
                    sel15.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[15] != null) {
                    sel16.setText(loadArr[15]);
                    sel16.setToolTipText(sel16.getText());

                } else {
                    sel16.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[16] != null) {
                    sel17.setText(loadArr[16]);
                    sel17.setToolTipText(sel17.getText());

                } else {
                    sel17.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[17] != null) {
                    sel18.setText(loadArr[17]);
                    sel18.setToolTipText(sel18.getText());

                } else {
                    sel18.setVisible(false);
                }
                //LoadFileNum
                if (loadArr[18] != null) {
                    sel19.setText(loadArr[18]);
                    sel19.setToolTipText(sel19.getText());

                } else {
                    sel19.setVisible(false);
                }
                if (loadArr[19] != null) {
                    sel20.setText(loadArr[19]);
                    sel20.setToolTipText(sel20.getText());

                } else {
                    sel20.setVisible(false);
                }
                if (loadArr[20] != null) {
                    sel21.setText(loadArr[20]);
                    sel21.setToolTipText(sel21.getText());

                } else {
                    sel21.setVisible(false);
                }
                if (loadArr[21] != null) {
                    sel22.setText(loadArr[21]);
                    sel22.setToolTipText(sel22.getText());

                } else {
                    sel22.setVisible(false);
                }
                if (loadArr[22] != null) {
                    sel23.setText(loadArr[22]);
                    sel23.setToolTipText(sel23.getText());

                } else {
                    sel23.setVisible(false);
                }
                if (loadArr[23] != null) {
                    sel24.setText(loadArr[23]);
                    sel24.setToolTipText(sel24.getText());

                } else {
                    sel24.setVisible(false);
                }
                if (loadArr[24] != null) {
                    sel25.setText(loadArr[24]);
                    sel25.setToolTipText(sel25.getText());

                } else {
                    sel25.setVisible(false);
                }
                if (loadArr[25] != null) {
                    sel26.setText(loadArr[25]);
                    sel26.setToolTipText(sel26.getText());

                } else {
                    sel26.setVisible(false);
                }
                if (loadArr[26] != null) {
                    sel27.setText(loadArr[26]);
                    sel27.setToolTipText(sel27.getText());

                } else {
                    sel27.setVisible(false);
                }
                if (loadArr[27] != null) {
                    sel28.setText(loadArr[27]);
                    sel28.setToolTipText(sel28.getText());

                } else {
                    sel28.setVisible(false);
                }
                if (loadArr[28] != null) {
                    sel29.setText(loadArr[28]);
                    sel29.setToolTipText(sel29.getText());

                } else {
                    sel29.setVisible(false);
                }
                if (loadArr[29] != null) {
                    sel30.setText(loadArr[29]);
                    sel30.setToolTipText(sel30.getText());

                } else {
                    sel30.setVisible(false);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Something Went Wrong With Loading Events", "Error", JOptionPane.ERROR_MESSAGE);

            }

        });
        t.start();

    }

    public void saveDataToServer() {
        try {
            Scanner studentGrade = new Scanner(new File(cm.getLocalStorageLocation() + "\\Culture_Management_System\\Student_Grade.db"));
            Scanner studentName = new Scanner(new File(cm.getLocalStorageLocation() + "\\Culture_Management_System\\Student_Name.db"));

            grade = studentGrade.nextLine();
            name = studentName.nextLine();
            
            studentGrade.close();
            studentName.close();
            System.out.println("Colecting Data...");

            //This section of code will get all selected buttons
            String events[] = new String[30];
            int counter = 0;
            if (chosen01 == true) {
                events[counter] = sel01.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen02 == true) {
                events[counter] = sel02.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen03 == true) {
                events[counter] = sel03.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen04 == true) {
                events[counter] = sel04.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen05 == true) {
                events[counter] = sel05.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen06 == true) {
                events[counter] = sel06.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen07 == true) {
                events[counter] = sel07.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen08 == true) {
                events[counter] = sel08.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen09 == true) {
                events[counter] = sel09.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen10 == true) {
                events[counter] = sel10.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen11 == true) {
                events[counter] = sel11.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen12 == true) {
                events[counter] = sel12.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen13 == true) {
                events[counter] = sel13.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen14 == true) {
                events[counter] = sel14.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen15 == true) {
                events[counter] = sel15.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen16 == true) {
                events[counter] = sel16.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen17 == true) {
                events[counter] = sel17.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen18 == true) {
                events[counter] = sel18.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen19 == true) {
                events[counter] = sel19.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen20 == true) {
                events[counter] = sel20.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen21 == true) {
                events[counter] = sel21.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen22 == true) {
                events[counter] = sel22.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen23 == true) {
                events[counter] = sel23.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen24 == true) {
                events[counter] = sel24.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen25 == true) {
                events[counter] = sel25.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen26 == true) {
                events[counter] = sel26.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen27 == true) {
                events[counter] = sel27.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen28 == true) {
                events[counter] = sel28.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen29 == true) {
                events[counter] = sel29.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
            if (chosen30 == true) {
                events[counter] = sel30.getText();
            }
            //Increse Counter
            counter++;
            //end copy
            //start copy
        

            //This will Create A User Profile
            String dbLoc = cm.getDatabaseLocation();
            for (int i = 0; i < events.length; i++) {
                if (events[i] != null) {
                    events[i] = events[i].replaceAll("<html>", "");
                    events[i] = events[i].replaceAll("</html>", "");
                    events[i] = events[i].replaceAll("<br>", " ");
                }
            }
            PrintWriter printToLocalData = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\Culture_Management_System\\UserCurrentStatus.db", false));
            for (int p = 0; p < events.length; p++) {
                if(events[p] != null)
                {
                    if(events[p].equalsIgnoreCase(""))
                    {
                        
                    }
                    else
                {
                    printToLocalData.println(events[p] + ":::" + cm.isGroup(grade, events[p]));
                }
                }
                
            }
            printToLocalData.close();

            
            
            
            
               /*
                String location = dbLoc + "\\Culture_Management_Admin\\Culture\\Events" + "\\" + "Grade_" + grade;//Loads Folder
                File folder = new File(location);
                File[] listOfFiles = folder.listFiles();
                String finalLocation = "";
                String subjectNameCurScanning = "";
                for (int j = 0; j < listOfFiles.length; j++) {
                    if (listOfFiles[j].isFile()) {
                        subjectNameCurScanning = listOfFiles[j].getName().substring(0, listOfFiles[j].getName().length() - 3); //This is the file name;
                 System.out.println("Woring With - " + subjectNameCurScanning);
                        for (int k = 0; k < events.length; k++) {
                            if(events[k] != null)
                            {
                              if(events[k].equalsIgnoreCase(subjectNameCurScanning))
                              {
                                  Scanner scFile = new Scanner(new File(listOfFiles[j].getAbsoluteFile() + ""));
                                  System.out.println("MATCH FOUND - FILE NAME - " + name + "\nContents = ");
                                  PrintWriter printer = new PrintWriter(new FileWriter(dbLoc + "\\Book_Management_Admin\\Students\\" + "Grade_" + grade + "\\" + name + ".db", true));
                                  while(scFile.hasNextLine())
                                  {
                                     printer.println(events[k] + "#" + scFile.nextLine() + "-" + sCode + "#" + getCurrentTimeUsingDate());
                                  }
                                  printer.close();
                                  
                              }
                            }
                            
                        }

                    }

                
            }
*/
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public String getCurrentTimeUsingDate() {
    Date date = new Date();
    String strDateFormat = "yyyy:dd:MM-hh:mm:ss a";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    String formattedDate= dateFormat.format(date);
    return formattedDate;
}

   

}
