package Interface;

import Programs.Export;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;

public class Canva extends javax.swing.JFrame implements ClipboardOwner {

    int mouseX, mouseY;
    int pointAmount = 0;
    String shapeType = "";
    ArrayList<Integer> xPoints = new ArrayList<>();
    ArrayList<Integer> yPoints = new ArrayList<>();

    public void copyToClipboard(String text) {
        StringSelection txt = new StringSelection(text);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(txt, this);
    }

    public Canva() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(1.0F, 1.0F, 1.0F, 0.0F));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        superiorBar = new Programs.PanelRound();
        ovalBotton = new Programs.PanelRound();
        ovalLabel = new javax.swing.JLabel();
        lineBotton = new Programs.PanelRound();
        lineLabel = new javax.swing.JLabel();
        squareBotton = new Programs.PanelRound();
        squareLabel = new javax.swing.JLabel();
        triangleBotton = new Programs.PanelRound();
        triangleLabel = new javax.swing.JLabel();
        exitBotton = new Programs.PanelRound();
        exitLabel = new javax.swing.JLabel();
        minimizeBotton = new Programs.PanelRound();
        minimizeLabel = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        fillCheck = new javax.swing.JCheckBox();
        colorPanel = new Programs.PanelRound();
        colorLabel = new javax.swing.JLabel();
        canva = new Programs.PanelRound();
        exportPanel = new Programs.PanelRound();
        exportLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        superiorBar.setBackground(new java.awt.Color(102, 0, 0));
        superiorBar.setRoundTopLeft(20);
        superiorBar.setRoundTopRight(20);
        superiorBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorBarMouseDragged(evt);
            }
        });
        superiorBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorBarMousePressed(evt);
            }
        });
        superiorBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ovalBotton.setBackground(new java.awt.Color(102, 0, 0));
        ovalBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ovalBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ovalBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ovalBottonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ovalBottonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ovalBottonMouseReleased(evt);
            }
        });

        ovalLabel.setFont(new java.awt.Font("Kollektif", 0, 12)); // NOI18N
        ovalLabel.setForeground(new java.awt.Color(255, 255, 255));
        ovalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ovalLabel.setText("Oval");
        ovalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ovalBottonLayout = new javax.swing.GroupLayout(ovalBotton);
        ovalBotton.setLayout(ovalBottonLayout);
        ovalBottonLayout.setHorizontalGroup(
            ovalBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ovalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        ovalBottonLayout.setVerticalGroup(
            ovalBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ovalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        superiorBar.add(ovalBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 70, 30));

        lineBotton.setBackground(new java.awt.Color(102, 0, 0));
        lineBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lineBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lineBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lineBottonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lineBottonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lineBottonMouseReleased(evt);
            }
        });

        lineLabel.setFont(new java.awt.Font("Kollektif", 0, 12)); // NOI18N
        lineLabel.setForeground(new java.awt.Color(255, 255, 255));
        lineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lineLabel.setText("Line");
        lineLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout lineBottonLayout = new javax.swing.GroupLayout(lineBotton);
        lineBotton.setLayout(lineBottonLayout);
        lineBottonLayout.setHorizontalGroup(
            lineBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        lineBottonLayout.setVerticalGroup(
            lineBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        superiorBar.add(lineBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 70, 30));

        squareBotton.setBackground(new java.awt.Color(102, 0, 0));
        squareBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                squareBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                squareBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                squareBottonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                squareBottonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                squareBottonMouseReleased(evt);
            }
        });

        squareLabel.setFont(new java.awt.Font("Kollektif", 0, 12)); // NOI18N
        squareLabel.setForeground(new java.awt.Color(255, 255, 255));
        squareLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        squareLabel.setText("Square");
        squareLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout squareBottonLayout = new javax.swing.GroupLayout(squareBotton);
        squareBotton.setLayout(squareBottonLayout);
        squareBottonLayout.setHorizontalGroup(
            squareBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(squareLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        squareBottonLayout.setVerticalGroup(
            squareBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(squareLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        superiorBar.add(squareBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 30));

        triangleBotton.setBackground(new java.awt.Color(102, 0, 0));
        triangleBotton.setRoundTopLeft(20);
        triangleBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                triangleBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                triangleBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                triangleBottonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                triangleBottonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                triangleBottonMouseReleased(evt);
            }
        });

        triangleLabel.setFont(new java.awt.Font("Kollektif", 0, 12)); // NOI18N
        triangleLabel.setForeground(new java.awt.Color(255, 255, 255));
        triangleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        triangleLabel.setText("Triangle");
        triangleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout triangleBottonLayout = new javax.swing.GroupLayout(triangleBotton);
        triangleBotton.setLayout(triangleBottonLayout);
        triangleBottonLayout.setHorizontalGroup(
            triangleBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(triangleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        triangleBottonLayout.setVerticalGroup(
            triangleBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(triangleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        superiorBar.add(triangleBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        exitBotton.setBackground(new java.awt.Color(102, 0, 0));
        exitBotton.setRoundTopRight(20);
        exitBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBottonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitBottonMousePressed(evt);
            }
        });

        exitLabel.setFont(new java.awt.Font("Kollektif", 0, 12)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("X");

        javax.swing.GroupLayout exitBottonLayout = new javax.swing.GroupLayout(exitBotton);
        exitBotton.setLayout(exitBottonLayout);
        exitBottonLayout.setHorizontalGroup(
            exitBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        exitBottonLayout.setVerticalGroup(
            exitBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        superiorBar.add(exitBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 50, 30));

        minimizeBotton.setBackground(new java.awt.Color(102, 0, 0));
        minimizeBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeBottonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeBottonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeBottonMouseReleased(evt);
            }
        });

        minimizeLabel.setFont(new java.awt.Font("Kollektif", 0, 12)); // NOI18N
        minimizeLabel.setForeground(new java.awt.Color(255, 255, 255));
        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setText("-");

        javax.swing.GroupLayout minimizeBottonLayout = new javax.swing.GroupLayout(minimizeBotton);
        minimizeBotton.setLayout(minimizeBottonLayout);
        minimizeBottonLayout.setHorizontalGroup(
            minimizeBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        minimizeBottonLayout.setVerticalGroup(
            minimizeBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        superiorBar.add(minimizeBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 50, 30));

        message.setFont(new java.awt.Font("Kollektif", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setText("Paint Writer");
        superiorBar.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 490, 30));

        fillCheck.setBackground(new java.awt.Color(102, 0, 0));
        fillCheck.setFont(new java.awt.Font("Kollektif", 0, 12)); // NOI18N
        fillCheck.setForeground(new java.awt.Color(255, 255, 255));
        fillCheck.setText("Fill");
        superiorBar.add(fillCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 30));

        colorPanel.setBackground(new java.awt.Color(51, 51, 51));
        colorPanel.setRoundBottomLeft(10);
        colorPanel.setRoundBottomRight(10);
        colorPanel.setRoundTopLeft(10);
        colorPanel.setRoundTopRight(10);

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        superiorBar.add(colorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, 10));

        colorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorLabelMousePressed(evt);
            }
        });
        superiorBar.add(colorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 120, 30));

        getContentPane().add(superiorBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 30));

        canva.setBackground(new java.awt.Color(255, 255, 255));
        canva.setRoundBottomLeft(20);
        canva.setRoundBottomRight(20);
        canva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvaMousePressed(evt);
            }
        });
        canva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exportPanel.setBackground(new java.awt.Color(102, 0, 0));
        exportPanel.setRoundBottomLeft(30);
        exportPanel.setRoundBottomRight(30);
        exportPanel.setRoundTopLeft(30);
        exportPanel.setRoundTopRight(30);
        exportPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exportPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exportPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exportPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exportPanelMouseReleased(evt);
            }
        });

        exportLabel.setFont(new java.awt.Font("Kollektif", 0, 14)); // NOI18N
        exportLabel.setForeground(new java.awt.Color(255, 255, 255));
        exportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exportLabel.setText("Export");
        exportLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout exportPanelLayout = new javax.swing.GroupLayout(exportPanel);
        exportPanel.setLayout(exportPanelLayout);
        exportPanelLayout.setHorizontalGroup(
            exportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exportLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        exportPanelLayout.setVerticalGroup(
            exportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportPanelLayout.createSequentialGroup()
                .addComponent(exportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        canva.add(exportPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 594, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Captura de pantalla 2022-09-19 202100.png"))); // NOI18N
        canva.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 500, 370));

        getContentPane().add(canva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1140, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBottonMouseEntered
        exitBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_exitBottonMouseEntered

    private void exitBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBottonMouseExited
        exitBotton.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_exitBottonMouseExited

    private void exitBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBottonMousePressed
        exitBotton.setBackground(new Color(60, 0, 0));
    }//GEN-LAST:event_exitBottonMousePressed

    private void exitBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBottonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBottonMouseClicked

    private void minimizeBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBottonMouseEntered
        minimizeBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_minimizeBottonMouseEntered

    private void minimizeBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBottonMouseExited
        minimizeBotton.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_minimizeBottonMouseExited

    private void minimizeBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBottonMousePressed
        minimizeBotton.setBackground(new Color(60, 0, 0));
    }//GEN-LAST:event_minimizeBottonMousePressed

    private void minimizeBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBottonMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeBottonMouseClicked

    private void superiorBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_superiorBarMousePressed

    private void superiorBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_superiorBarMouseDragged

    private void triangleBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangleBottonMouseClicked
        shapeType = "triangle";
        pointAmount = 3;
        message.setText("Drawing a triangle - Point: " + pointAmount + " / 3");
    }//GEN-LAST:event_triangleBottonMouseClicked

    private void triangleBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangleBottonMouseEntered
        triangleBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_triangleBottonMouseEntered

    private void triangleBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangleBottonMouseExited
        triangleBotton.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_triangleBottonMouseExited

    private void triangleBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangleBottonMousePressed
        triangleBotton.setBackground(new Color(60, 0, 0));
    }//GEN-LAST:event_triangleBottonMousePressed

    private void squareBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareBottonMouseClicked
        shapeType = "square";
        pointAmount = 4;
        message.setText("Drawing a square - Point: " + pointAmount + " / 4");
    }//GEN-LAST:event_squareBottonMouseClicked

    private void squareBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareBottonMouseEntered
        squareBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_squareBottonMouseEntered

    private void squareBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareBottonMouseExited
        squareBotton.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_squareBottonMouseExited

    private void squareBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareBottonMousePressed
        squareBotton.setBackground(new Color(60, 0, 0));
    }//GEN-LAST:event_squareBottonMousePressed

    private void lineBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineBottonMouseClicked
        shapeType = "line";
        pointAmount = 2;
        message.setText("Drawing a line - Point: " + pointAmount + " / 2");
    }//GEN-LAST:event_lineBottonMouseClicked

    private void lineBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineBottonMouseEntered
        lineBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_lineBottonMouseEntered

    private void lineBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineBottonMouseExited
        lineBotton.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_lineBottonMouseExited

    private void lineBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineBottonMousePressed
        lineBotton.setBackground(new Color(60, 0, 0));
    }//GEN-LAST:event_lineBottonMousePressed

    private void lineBottonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineBottonMouseReleased
        lineBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_lineBottonMouseReleased

    private void triangleBottonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangleBottonMouseReleased
        triangleBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_triangleBottonMouseReleased

    private void minimizeBottonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBottonMouseReleased
        minimizeBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_minimizeBottonMouseReleased

    private void squareBottonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareBottonMouseReleased
        squareBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_squareBottonMouseReleased

    private void canvaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvaMousePressed
        if (shapeType.equals("triangle")) {
            if (pointAmount > 0) {
                xPoints.add(evt.getX());
                yPoints.add(evt.getY());
                pointAmount--;
                message.setText("Drawing a triangle - Point: " + pointAmount + " / 3");
                if (pointAmount == 0) {
                    //Get the graphics
                    Graphics p = canva.getGraphics();

                    //Get the points
                    int[] xPointsArray = new int[xPoints.size()];
                    int[] yPointsArray = new int[yPoints.size()];
                    for (int i = 0; i < xPoints.size(); i++) {
                        xPointsArray[i] = xPoints.get(i);
                        yPointsArray[i] = yPoints.get(i);
                    }

                    p.setColor(colorPanel.getBackground());
                    if (fillCheck.isSelected()) {
                        p.fillPolygon(xPointsArray, yPointsArray, xPoints.size());
                    } else {
                        p.drawPolygon(xPointsArray, yPointsArray, xPoints.size());
                    }

                    //Add the actual to the export
                    Export.appendTriangle(xPointsArray, yPointsArray, colorPanel.getBackground(), fillCheck.isSelected());

                    //Clear the points
                    xPoints.clear();
                    yPoints.clear();

                    //Reset the settings
                    message.setText("Paint Writer");
                    shapeType = "none";
                }
            }
        } else if (shapeType.equals("square")) {
            if (pointAmount > 0) {
                xPoints.add(evt.getX());
                yPoints.add(evt.getY());
                pointAmount--;
                message.setText("Drawing a square - Point: " + pointAmount + " / 4");
                if (pointAmount == 0) {
                    //Get the graphics
                    Graphics p = canva.getGraphics();

                    //Get the points
                    int[] xPointsArray = new int[xPoints.size()];
                    int[] yPointsArray = new int[yPoints.size()];
                    for (int i = 0; i < xPoints.size(); i++) {
                        xPointsArray[i] = xPoints.get(i);
                        yPointsArray[i] = yPoints.get(i);
                    }

                    p.setColor(colorPanel.getBackground());
                    if (fillCheck.isSelected()) {
                        p.fillPolygon(xPointsArray, yPointsArray, xPoints.size());
                    } else {
                        p.drawPolygon(xPointsArray, yPointsArray, xPoints.size());
                    }

                    //Add the actual to the export
                    Export.appendSquare(xPointsArray, yPointsArray, colorPanel.getBackground(), fillCheck.isSelected());

                    //Clear the points
                    xPoints.clear();
                    yPoints.clear();

                    //Reset the settings
                    message.setText("Paint Writer");
                    shapeType = "none";
                }
            }
        } else if (shapeType.equals("line")) {
            if (pointAmount > 0) {
                xPoints.add(evt.getX());
                yPoints.add(evt.getY());
                pointAmount--;
                message.setText("Drawing a line - Point: " + pointAmount + " / 2");
                if (pointAmount == 0) {
                    //Get the graphics
                    Graphics p = canva.getGraphics();

                    //Get the points
                    int[] xPointsArray = new int[xPoints.size()];
                    int[] yPointsArray = new int[yPoints.size()];
                    for (int i = 0; i < xPoints.size(); i++) {
                        xPointsArray[i] = xPoints.get(i);
                        yPointsArray[i] = yPoints.get(i);
                    }

                    p.setColor(colorPanel.getBackground());
                    p.drawLine(xPointsArray[0], yPointsArray[0], xPointsArray[1], yPointsArray[1]);

                    //Add the actual to the export
                    Export.appendLine(xPointsArray, yPointsArray, colorPanel.getBackground());

                    //Clear the points
                    xPoints.clear();
                    yPoints.clear();

                    //Reset the settings
                    message.setText("Paint Writer");
                    shapeType = "none";
                }
            }
        } else if (shapeType.equals("oval")) {
            if (pointAmount > 0) {
                xPoints.add(evt.getX());
                yPoints.add(evt.getY());
                
                System.out.println(evt.getX());
                System.out.println(evt.getY());
                pointAmount--;
                switch (pointAmount) {
                    case 3:
                        message.setText("Drawing a oval - Center: " + pointAmount + " / 3");
                        break;

                    case 2:
                        message.setText("Drawing a oval - Width: " + pointAmount + " / 3");
                        break;

                    case 1:
                        message.setText("Drawing a oval - Height: " + pointAmount + " / 3");
                        break;
                }

                if (pointAmount == 0) {
                    //Get the graphics
                    Graphics p = canva.getGraphics();

                    //Get the points
                    int[] xPointsArray = new int[xPoints.size()];
                    int[] yPointsArray = new int[yPoints.size()];
                    for (int i = 0; i < xPoints.size(); i++) {
                        xPointsArray[i] = xPoints.get(i);
                        yPointsArray[i] = yPoints.get(i);
                    }
                    
                    int width = (xPointsArray[0] - xPointsArray[1]) * 2;
                    int height = (yPointsArray[2] - yPointsArray[0]) * 2;
                    int centerX = Math.abs(xPointsArray[0] - width / 2);
                    int centerY = Math.abs(yPointsArray[0] - height / 2);
                    
                    System.out.println("Center X:" + centerX);
                    System.out.println("Center Y:" + centerY);
                    System.out.println("Width:" + width);
                    System.out.println("Height:" + height);

                    p.setColor(colorPanel.getBackground());
                    if (fillCheck.isSelected()) {
                        p.fillOval(centerX, centerY, width, height);
                    } else {
                        p.drawOval(centerX, centerY, width, height);
                    }

                    //Add the actual to the export

                    //Clear the points
                    xPoints.clear();
                    yPoints.clear();

                    //Reset the settings
                    message.setText("Paint Writer");
                    shapeType = "none";
                }
            }
        }
    }//GEN-LAST:event_canvaMousePressed

    private void colorLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorLabelMousePressed
        Color color = JColorChooser.showDialog(null, "Choose a color", colorPanel.getBackground());
        colorPanel.setBackground(color);
    }//GEN-LAST:event_colorLabelMousePressed

    private void exportPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPanelMouseClicked
        String actualData = Export.getCode();
        copyToClipboard(actualData);
        Export.resetCode();
        Graphics g = canva.getGraphics();
        g.fillRect(0, 0, canva.getWidth(), canva.getHeight());
        message.setText("Code copied to clipboard");
    }//GEN-LAST:event_exportPanelMouseClicked

    private void exportPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPanelMouseEntered
        exportPanel.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_exportPanelMouseEntered

    private void exportPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPanelMouseExited
        exportPanel.setBackground(new Color(60, 0, 0));
    }//GEN-LAST:event_exportPanelMouseExited

    private void exportPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPanelMousePressed
        exportPanel.setBackground(new Color(100, 0, 0));
    }//GEN-LAST:event_exportPanelMousePressed

    private void exportPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPanelMouseReleased
        exportPanel.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_exportPanelMouseReleased

    private void ovalBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalBottonMouseClicked
        shapeType = "oval";
        pointAmount = 3;
        message.setText("Drawing an oval - Point: 3 / 3");
    }//GEN-LAST:event_ovalBottonMouseClicked

    private void ovalBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalBottonMouseEntered
        ovalBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_ovalBottonMouseEntered

    private void ovalBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalBottonMouseExited
        ovalBotton.setBackground(new Color(60, 0, 0));
    }//GEN-LAST:event_ovalBottonMouseExited

    private void ovalBottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalBottonMousePressed
        ovalBotton.setBackground(new Color(102, 0, 0));
    }//GEN-LAST:event_ovalBottonMousePressed

    private void ovalBottonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalBottonMouseReleased
        ovalBotton.setBackground(new Color(80, 0, 0));
    }//GEN-LAST:event_ovalBottonMouseReleased

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
            java.util.logging.Logger.getLogger(Canva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Canva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Canva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Canva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Canva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Programs.PanelRound canva;
    private javax.swing.JLabel colorLabel;
    private Programs.PanelRound colorPanel;
    private Programs.PanelRound exitBotton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel exportLabel;
    private Programs.PanelRound exportPanel;
    private javax.swing.JCheckBox fillCheck;
    private javax.swing.JLabel jLabel1;
    private Programs.PanelRound lineBotton;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JLabel message;
    private Programs.PanelRound minimizeBotton;
    private javax.swing.JLabel minimizeLabel;
    private Programs.PanelRound ovalBotton;
    private javax.swing.JLabel ovalLabel;
    private Programs.PanelRound squareBotton;
    private javax.swing.JLabel squareLabel;
    private Programs.PanelRound superiorBar;
    private Programs.PanelRound triangleBotton;
    private javax.swing.JLabel triangleLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
