/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author victor
 */
public class LocationManager extends javax.swing.JFrame {

    private Main master;

    /**
     * Creates new form Sessions
     */
    public LocationManager() {
        initComponents();
        this.centerBottomPanel.setVisible(false);
        this.btn_locationDetails.setSelected(false);
    }
    
    public LocationManager(Main master) {
        this();
        this.master = master;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btn_newLocation = new org.jdesktop.swingx.JXButton();
        btn_editSelectedLocation = new org.jdesktop.swingx.JXButton();
        btn_deleteSelectedLocation = new org.jdesktop.swingx.JXButton();
        centerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        btn_locationDetails = new javax.swing.JToggleButton();
        centerBottomPanel = new org.jdesktop.swingx.JXPanel();

        setTitle("Location Manager");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar1.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.background"));
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(2400, 32));
        jToolBar1.setMinimumSize(new java.awt.Dimension(800, 32));
        jToolBar1.setPreferredSize(new java.awt.Dimension(1000, 50));

        btn_newLocation.setText("New Location");
        btn_newLocation.setFocusable(false);
        btn_newLocation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_newLocation.setMaximumSize(new java.awt.Dimension(400, 32));
        btn_newLocation.setMinimumSize(new java.awt.Dimension(100, 32));
        btn_newLocation.setPreferredSize(new java.awt.Dimension(200, 32));
        jToolBar1.add(btn_newLocation);

        btn_editSelectedLocation.setText("Edit Selected");
        btn_editSelectedLocation.setFocusable(false);
        btn_editSelectedLocation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editSelectedLocation.setMaximumSize(new java.awt.Dimension(400, 32));
        btn_editSelectedLocation.setMinimumSize(new java.awt.Dimension(100, 32));
        btn_editSelectedLocation.setPreferredSize(new java.awt.Dimension(200, 32));
        btn_editSelectedLocation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_editSelectedLocation);

        btn_deleteSelectedLocation.setText("Delete Selected");
        btn_deleteSelectedLocation.setFocusable(false);
        btn_deleteSelectedLocation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_deleteSelectedLocation.setMaximumSize(new java.awt.Dimension(400, 32));
        btn_deleteSelectedLocation.setMinimumSize(new java.awt.Dimension(100, 32));
        btn_deleteSelectedLocation.setPreferredSize(new java.awt.Dimension(200, 32));
        btn_deleteSelectedLocation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_deleteSelectedLocation);

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Latitude", "Longitude", "Altitude"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColumnSelectionAllowed(true);
        table.setMaximumSize(new java.awt.Dimension(2147483647, 640));
        table.setMinimumSize(new java.awt.Dimension(110, 32));
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        btn_locationDetails.setText("Show Location Details");
        btn_locationDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_locationDetails.setFocusable(false);
        btn_locationDetails.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_locationDetails.setMaximumSize(new java.awt.Dimension(300, 28));
        btn_locationDetails.setMinimumSize(new java.awt.Dimension(100, 28));
        btn_locationDetails.setPreferredSize(new java.awt.Dimension(200, 28));
        btn_locationDetails.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_locationDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_locationDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_locationDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_locationDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout centerBottomPanelLayout = new javax.swing.GroupLayout(centerBottomPanel);
        centerBottomPanel.setLayout(centerBottomPanelLayout);
        centerBottomPanelLayout.setHorizontalGroup(
            centerBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        centerBottomPanelLayout.setVerticalGroup(
            centerBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(centerBottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(centerBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_locationDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_locationDetailsActionPerformed
        String btn_text = this.btn_locationDetails.isSelected()? "Hide Location Details": "Show Location Details";
        this.centerBottomPanel.setVisible(this.btn_locationDetails.isSelected());
        this.btn_locationDetails.setText(btn_text);
    }//GEN-LAST:event_btn_locationDetailsActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.master.getBtn_manageLocations().setSelected(false);
    }//GEN-LAST:event_formWindowClosing

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LocationManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocationManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocationManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocationManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocationManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btn_deleteSelectedLocation;
    private org.jdesktop.swingx.JXButton btn_editSelectedLocation;
    private javax.swing.JToggleButton btn_locationDetails;
    private org.jdesktop.swingx.JXButton btn_newLocation;
    private org.jdesktop.swingx.JXPanel centerBottomPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
