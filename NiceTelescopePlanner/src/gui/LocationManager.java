/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import core.Location;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import jparsec.math.Constant;
import jparsec.observer.City;
import jparsec.observer.CityElement;

import jparsec.observer.Country;
import jparsec.observer.Country.COUNTRY;
import jparsec.observer.LocationElement;
import jparsec.util.JPARSECException;

/**
 *
 * @author victordomingos
 */
public class LocationManager extends javax.swing.JFrame {
    private final db.DbConnection mydb = new db.DbConnection();
    /**
     * Creates new form Sessions
     */
    public LocationManager() {
        initComponents();
        
        
        this.centerBottomPanel.setVisible(false);
        this.btn_locationDetails.setSelected(false);
        
        initCombos();
    }
    
    private void updateTable() {
        ArrayList<Location> locations = mydb.getAllLocations();
    }
    
    private void initCombos(){
        for (Country.COUNTRY c: Country.COUNTRY.values()) {
            cmb_country.addItem(c.toString());
        }
        
        try {
            CityElement[] cities = City.getAllCities();
            ArrayList<String> cities_names = new ArrayList<>();
            
            for (CityElement c : cities) {
                cities_names.add(c.name);
            } 
            
            Collections.sort(cities_names);

            for (String city : cities_names) {
                cmb_city.addItem(city);
            } 
        }    
        catch (JPARSECException e) {
                System.out.println(e);
        }
        
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
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jXPanel3 = new org.jdesktop.swingx.JXPanel();
        cmb_city = new javax.swing.JComboBox<>();
        cmb_country = new javax.swing.JComboBox<>();
        jXPanel4 = new org.jdesktop.swingx.JXPanel();
        txt_latitude = new javax.swing.JTextField();
        txt_longitude = new javax.swing.JTextField();
        txt_height = new javax.swing.JTextField();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXPanel5 = new org.jdesktop.swingx.JXPanel();
        txt_address = new javax.swing.JTextField();
        jXPanel6 = new org.jdesktop.swingx.JXPanel();
        btn_saveLocation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        img_map = new org.jdesktop.swingx.JXImageView();
        jLabel21 = new javax.swing.JLabel();

        setTitle("Location Manager");

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
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

        jXPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pick a City"));

        cmb_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city" }));
        cmb_city.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_cityItemStateChanged(evt);
            }
        });

        cmb_country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select country" }));
        cmb_country.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_countryItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jXPanel3Layout = new javax.swing.GroupLayout(jXPanel3);
        jXPanel3.setLayout(jXPanel3Layout);
        jXPanel3Layout.setHorizontalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_city, 0, 169, Short.MAX_VALUE)
                    .addComponent(cmb_country, 0, 169, Short.MAX_VALUE))
                .addContainerGap())
        );
        jXPanel3Layout.setVerticalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(cmb_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jXPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter GPS coords"));

        txt_latitude.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_longitude.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_height.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jXLabel1.setText("Latitude ");

        jXLabel2.setText("Longitude ");

        jXLabel3.setText("Altitude (m)");

        javax.swing.GroupLayout jXPanel4Layout = new javax.swing.GroupLayout(jXPanel4);
        jXPanel4.setLayout(jXPanel4Layout);
        jXPanel4Layout.setHorizontalGroup(
            jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel4Layout.createSequentialGroup()
                        .addGroup(jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_longitude, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txt_height)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel4Layout.createSequentialGroup()
                        .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_latitude)))
                .addContainerGap())
        );

        jXPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_latitude, txt_longitude});

        jXPanel4Layout.setVerticalGroup(
            jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jXPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter an address"));

        javax.swing.GroupLayout jXPanel5Layout = new javax.swing.GroupLayout(jXPanel5);
        jXPanel5.setLayout(jXPanel5Layout);
        jXPanel5Layout.setHorizontalGroup(
            jXPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jXPanel5Layout.setVerticalGroup(
            jXPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        btn_saveLocation.setText("Save Location");

        javax.swing.GroupLayout jXPanel6Layout = new javax.swing.GroupLayout(jXPanel6);
        jXPanel6.setLayout(jXPanel6Layout);
        jXPanel6Layout.setHorizontalGroup(
            jXPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_saveLocation)
                .addContainerGap())
        );
        jXPanel6Layout.setVerticalGroup(
            jXPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel6Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(btn_saveLocation))
        );

        jLabel3.setText("Choose one of these 3 methods. GPS coordinates should be the best option, when possible.");

        javax.swing.GroupLayout img_mapLayout = new javax.swing.GroupLayout(img_map);
        img_map.setLayout(img_mapLayout);
        img_mapLayout.setHorizontalGroup(
            img_mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
        img_mapLayout.setVerticalGroup(
            img_mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        jLabel21.setBackground(javax.swing.UIManager.getDefaults().getColor("Nb.browser.picker.background.light"));
        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("New location");

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jXPanel2Layout.createSequentialGroup()
                                .addComponent(jXPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jXPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(img_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jXPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {img_map, jXPanel3, jXPanel4, jXPanel5});

        javax.swing.GroupLayout centerBottomPanelLayout = new javax.swing.GroupLayout(centerBottomPanel);
        centerBottomPanel.setLayout(centerBottomPanelLayout);
        centerBottomPanelLayout.setHorizontalGroup(
            centerBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerBottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        centerBottomPanelLayout.setVerticalGroup(
            centerBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void cmb_countryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_countryItemStateChanged
        if(cmb_country.getSelectedIndex() < 1){ 
            return;
        }
        
        String selectedCountry = cmb_country.getSelectedItem().toString();
        
        try {
            COUNTRY countryID = Country.getID(selectedCountry);
            CityElement[] cities = City.getCities(countryID);
           
            ArrayList<String> cities_names = new ArrayList<>();
            
            for (CityElement c : cities) {
                cities_names.add(c.name);
            } 
            
            Collections.sort(cities_names);
            cmb_city.removeAllItems();
            cmb_city.addItem("Select city");
            for (String city : cities_names) {
                cmb_city.addItem(city);
            } 
        }    
        catch (JPARSECException e) {
                System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_countryItemStateChanged

    private void cmb_cityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_cityItemStateChanged
        // Not forgetting that we have a "Select city" item in the combo box.
        if(cmb_city.getSelectedIndex() < 1){ 
            return;
        }
        CityElement realCity = null;    
        String selectedCity = cmb_city.getSelectedItem().toString();
        
        try {
            CityElement[] cities = City.getCities(selectedCity);
            
            // TODO: 
            // We definitely should add a clear way to choose between multiple 
            // cities in case they happen to have the same name, but for now, 
            // for the sake of a faster MVP release, let's present the user with
            // a single, quick result…
            
            if (cmb_country.getSelectedIndex() >= 1) {
                
                // Not forgetting that we have a "Select country" item in the combo box.
                
                String selectedCountry = cmb_country.getSelectedItem().toString();
                COUNTRY countryID = Country.getID(selectedCountry);
                
                realCity = cities[0];
                // Make sure the city is at least in the same country...
                for (int i = 0; i < cities.length && realCity != null; i++) {
                    if (cities[i].country.equals(countryID.name())) {
                        realCity = cities[i];
                    }
                }
            }
            
            LocationElement loc = LocationElement.parseCity(realCity);
            Double lat = Constant.RAD_TO_DEG * loc.getLatitude();
            Double lon = Constant.RAD_TO_DEG * loc.getLongitude();
            
            DecimalFormat df = new DecimalFormat("###0.00000");
            txt_latitude.setText(df.format(lat));
            txt_longitude.setText(df.format(lon));
            // TODO: See if we can provide a better default value here.
            txt_height.setText("0");  
            
        }
        catch (JPARSECException e) {
            System.out.println("excecao!!");
            System.out.println(e);
        }
    }//GEN-LAST:event_cmb_cityItemStateChanged

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
    private javax.swing.JButton btn_saveLocation;
    private org.jdesktop.swingx.JXPanel centerBottomPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JComboBox<String> cmb_city;
    private javax.swing.JComboBox<String> cmb_country;
    private org.jdesktop.swingx.JXImageView img_map;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel jXPanel3;
    private org.jdesktop.swingx.JXPanel jXPanel4;
    private org.jdesktop.swingx.JXPanel jXPanel5;
    private org.jdesktop.swingx.JXPanel jXPanel6;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_height;
    private javax.swing.JTextField txt_latitude;
    private javax.swing.JTextField txt_longitude;
    // End of variables declaration//GEN-END:variables
}
