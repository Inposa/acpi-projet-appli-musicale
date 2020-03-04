package fr.iut.musidex.view;

import fr.iut.musidex.controller.*;
import fr.iut.musidex.view.*;
import fr.iut.musidex.modelview.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class HomeWindow extends javax.swing.JFrame {
    HomeController currentController = null;
    DefaultTableModel tableModel = null;
    HomeMode currentMode = null;
    
    private enum HomeMode {
	Playlist,
        Music
    }

    public HomeWindow(HomeController controller) 
    {
        this.setTitle("Mozart Gang");
        initComponents();
        
        tableModel = (DefaultTableModel) mainTable.getModel();
        currentController = controller;
        LoadPlaylist(currentController.getPlaylists()); 
        
        this.setVisible(true);
    }
    
    private void EmptyTable(){
        for (int i = tableModel.getRowCount() -1; i >= 0 ; i--) {
            tableModel.removeRow(i);
        }
        
        concertModeButton.setVisible(false);
    }
    
    public void LoadPlaylist(List<PlaylistModelView> list)
    {
        EmptyTable();
        
        tableModel.setColumnIdentifiers(new Object[] {"Playlist","Count"});
        
        for (int i = 0; i < list.size(); i++) 
        {
            tableModel.addRow(new Object[] {list.get(i).getNom(),list.get(i).getCount()});
        }
        
        currentMode = HomeMode.Playlist;
    }
    
     public void LoadMusic(List<MorceauModelView> list)
    {
        EmptyTable();
        tableModel.setColumnIdentifiers(new Object[] {"Title","Interprete","Duree","Tonalite"});

        for (int i = 0; i < list.size(); i++) 
        {
            tableModel.addRow(new Object[] {list.get(i).getNom(), 
                list.get(i).getInterprete(),
                list.get(i).getDuree(),
                list.get(i).getTonalite(),
                list.get(i).getLienYT()});
        }
        
        currentMode = HomeMode.Music;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        playlistButton = new javax.swing.JButton();
        musicButton = new javax.swing.JButton();
        optionName = new javax.swing.JButton();
        SearchBar = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        concertModeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Playlist", "Nombre de piste"
            }
        ));
        mainTable.setMaximumSize(new java.awt.Dimension(1000, 144));
        mainTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mainTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(mainTable);

        scrollPane1.add(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Utopia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 203));
        jLabel1.setText("Mozart Gang");

        playlistButton.setText("Playlist");
        playlistButton.setToolTipText("");
        playlistButton.setActionCommand("jgjg");
        playlistButton.setAlignmentY(0.0F);
        playlistButton.setPreferredSize(new java.awt.Dimension(70, 29));
        playlistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistButtonActionPerformed(evt);
            }
        });

        musicButton.setLabel("Musique");
        musicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicButtonActionPerformed(evt);
            }
        });

        optionName.setText("Options");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playlistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musicButton, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(optionName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playlistButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(musicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(optionName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        SearchBar.setText("Rechercher");
        SearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarActionPerformed(evt);
            }
        });

        AddButton.setText("Add New One");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        concertModeButton.setText("Launch Concert Mode");
        concertModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concertModeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(concertModeButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(concertModeButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playlistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistButtonActionPerformed
        LoadPlaylist(currentController.getPlaylists()); 
    }//GEN-LAST:event_playlistButtonActionPerformed

    private void musicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicButtonActionPerformed
        LoadMusic(currentController.getMorceaux());
    }//GEN-LAST:event_musicButtonActionPerformed

    private void SearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBarActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if(currentMode == HomeMode.Playlist){
            System.out.println("Launch add playlist windows");
        }
        else if(currentMode == HomeMode.Music) {
            System.out.println("Launch add music windows");
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void concertModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concertModeButtonActionPerformed
        concertForm concertWindows = new concertForm();
    }//GEN-LAST:event_concertModeButtonActionPerformed

    private void mainTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mainTableFocusGained
        if(currentMode == HomeMode.Playlist)
            concertModeButton.setVisible(true);
    }//GEN-LAST:event_mainTableFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton concertModeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton musicButton;
    private javax.swing.JButton optionName;
    private javax.swing.JButton playlistButton;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
