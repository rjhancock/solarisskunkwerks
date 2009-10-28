/*
Copyright (c) 2008~2009, Justin R. Bengtson (poopshotgun@yahoo.com)
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
        this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
        this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
    * Neither the name of Justin R. Bengtson nor the names of contributors may
        be used to endorse or promote products derived from this software
        without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package ssw.gui;
import java.awt.Image;
import java.io.File;
import java.util.Vector;
import javax.swing.JFileChooser;
import components.Mech;
import filehandlers.MechReader;
import filehandlers.Media;
import ssw.print.*;


/**
 *
 * @author Michael Mills
 */
public class dlgPrintBatchMechs extends javax.swing.JDialog {
    private class mechData{
        public String name;
        public Mech m;
        public dlgPrintSavedMechOptions POptions;

        public mechData (String name, Mech m, dlgPrintSavedMechOptions POptions){
            this.name = name;
            this.m = m;
            this.POptions = POptions;
        }

        public mechData (String name, Mech m){
            this.name = name;
            this.m = m;
            this.POptions = new dlgPrintSavedMechOptions(parent, true, m);
        }

        @Override
        public String toString(){
            return name;
        }
    }

    private frmMain parent;
    private Vector<mechData> mechList;

    public boolean isPrinted = false;

    /** Creates new form dlgPrintBatchMechs */
    public dlgPrintBatchMechs(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = (frmMain) parent;
        initComponents();
        mechList = new Vector<mechData>();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstChoosenMechs = new javax.swing.JList();
        btnRemoveMech = new javax.swing.JButton();
        btnPrintAll = new javax.swing.JButton();
        btnAddMech = new javax.swing.JButton();
        btnMechDetails = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jButton1.setText("Cancel");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Print Multiple Mechs");

        lstChoosenMechs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstChoosenMechs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstChoosenMechsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstChoosenMechs);

        btnRemoveMech.setText("Remove Mech");
        btnRemoveMech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveMechActionPerformed(evt);
            }
        });

        btnPrintAll.setText("Print");
        btnPrintAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintAllActionPerformed(evt);
            }
        });

        btnAddMech.setText("Add Mech(s)");
        btnAddMech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMechActionPerformed(evt);
            }
        });

        btnMechDetails.setText("Mech Details");
        btnMechDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMechDetailsActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnClear.setText("Clear List");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrintAll, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(btnAddMech, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMechDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemoveMech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveMech)
                    .addComponent(btnMechDetails)
                    .addComponent(btnAddMech))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrintAll)
                    .addComponent(btnCancel)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMechActionPerformed
        File[] files = SelectMechs();
        if (files.length > 0)
        {
            for (int i = 0; i<= files.length-1; i++) {
                Mech m = LoadMechFromFile(files[i]);
                mechList.add(new mechData(BuildMechName(m), m));
                lstChoosenMechs.setListData(mechList);
            }
        }
    }//GEN-LAST:event_btnAddMechActionPerformed

    private void btnPrintAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintAllActionPerformed
        Printer printer = new Printer(parent);
        for (int i = 0; i < mechList.size(); ++i){
            mechData current = mechList.get(i);
            printer.AddMech(current.m, current.POptions.GetWarriorName(), current.POptions.GetGunnery(), current.POptions.GetPiloting());
        }
        printer.Print();

        //clear the list of mechs
        btnClearActionPerformed(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrintAllActionPerformed

    private void btnMechDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMechDetailsActionPerformed
        mechData selected = (mechData) lstChoosenMechs.getSelectedValue();
        if (selected == null){
            return;
        }
        dlgPrintSavedMechOptions POptions = selected.POptions;
        Mech m = selected.m;
        POptions.setLocationRelativeTo( parent );
        POptions.setVisible( true );
        selected.name = BuildMechName(m, POptions);
    }//GEN-LAST:event_btnMechDetailsActionPerformed

    private void btnRemoveMechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveMechActionPerformed
        mechData selected = (mechData) lstChoosenMechs.getSelectedValue();
        if (selected == null){
            return;
        }
        mechList.remove(selected);
        lstChoosenMechs.setListData(mechList);
    }//GEN-LAST:event_btnRemoveMechActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lstChoosenMechsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstChoosenMechsMouseClicked
        if (evt.getClickCount() >= 2) {
            parent.CurMech = ((mechData) lstChoosenMechs.getSelectedValue()).m;
            parent.LoadMechIntoGUI();
            this.setVisible(false);
        }
    }//GEN-LAST:event_lstChoosenMechsMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        mechList.removeAllElements();
        lstChoosenMechs.setListData(mechList);
    }//GEN-LAST:event_btnClearActionPerformed

    public Image GetImage( String filename ) {
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        Image retval = toolkit.getImage( filename );
        java.awt.MediaTracker mediaTracker = new java.awt.MediaTracker( this );
        mediaTracker.addImage( retval, 0 );
        try {
            mediaTracker.waitForID( 0 );
        } catch( InterruptedException ie ) {
            Media.Messager( this, "Interrupted while loading image " + filename );
            return null;
        }
        return retval;
    }

    private String BuildMechName(Mech m, dlgPrintSavedMechOptions po){
        String name = m.GetFullName();
        if (po.PrintPilot()) {
            name += " [" + po.GetWarriorName() + "] [" + po.GetGunnery() + "/" + po.GetPiloting() + "]";
        }
        return name.replace(" []", "");
    }

    private String BuildMechName(Mech m) {
        return m.GetFullName() + " [4/5]";
    }

    private File[] SelectMechs(){
        File[] files = null;
        File tempFile = new File( parent.Prefs.get("LastOpenDirectory", "" ) );
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(true);
        fc.addChoosableFileFilter( new javax.swing.filechooser.FileFilter() {
            public boolean accept( File f ) {
                if (f.isDirectory()) {
                    return true;
                }

                String extension = Utils.getExtension( f );
                if ( extension != null ) {
                    if ( extension.equals( "ssw" ) ) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }

            //The description of this filter
            public String getDescription() {
                return "*.ssw";
            }
        } );
        fc.setAcceptAllFileFilterUsed( false );
        fc.setCurrentDirectory(tempFile);
        int returnVal = fc.showDialog( this, "Select Mech(s)" );
        if( returnVal == JFileChooser.APPROVE_OPTION ) {
            files = fc.getSelectedFiles();
        }
        return files;
    }

    private Mech LoadMechFromFile(File file) {
        Mech m = null;
        try {
            MechReader XMLr = new MechReader();
            m = XMLr.ReadMech( file.getCanonicalPath(), parent.data );
        } catch( Exception e ) {
            // had a problem loading the mech.  let the user know.
            Media.Messager( this, e.getMessage() );
        }
        return m;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMech;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnMechDetails;
    private javax.swing.JButton btnPrintAll;
    private javax.swing.JButton btnRemoveMech;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstChoosenMechs;
    // End of variables declaration//GEN-END:variables

}
