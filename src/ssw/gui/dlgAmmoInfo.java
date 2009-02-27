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

import ssw.CommonTools;
import ssw.components.*;

public class dlgAmmoInfo extends javax.swing.JDialog {
    frmMain Parent;
    
    /** Creates new form dlgAmmoInfo */
    public dlgAmmoInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable( false );
        setTitle( "Ammo Information" );
        Parent = (frmMain) parent;
        SetState();
    }

    private void SetState() {
        Ammunition am = (Ammunition) Parent.CurItem;
        AvailableCode a = ((abPlaceable) am).GetAvailability();

        lblName.setText( am.GetCritName() );
        lblTonnage.setText( "" + am.GetTonnage() );
        lblLotSize.setText( "" + am.GetLotSize() );
        lblCost.setText( "" + am.GetCost() );
        lblBV.setText( CommonTools.GetAggregateReportBV( am ) );
        if( am.IsExplosive() ) {
            lblExplosive.setText( "Yes" );
        } else {
            lblExplosive.setText( "No" );
        }
        lblAVSL.setText( "" + a.GetSLCode() );
        lblAVSW.setText( "" + a.GetSWCode() );
        lblAVCI.setText( "" + a.GetCICode() );
        lblIntro.setText( a.GetIntroDate() + " (" + a.GetIntroFaction() + ")" );
        if( a.WentExtinct() ) {
            lblExtinct.setText( "" + a.GetExtinctDate() );
        } else {
            lblExtinct.setText( "--" );
        }
        if( a.WasReIntroduced() ) {
            lblReintro.setText( a.GetReIntroDate() + " (" + a.GetReIntroFaction() + ")" );
        } else {
            lblReintro.setText( "--" );
        }
        lblRulesBM.setText( CommonTools.GetRulesLevelString( a.GetRulesLevelBM() ) );
        lblRulesIM.setText( CommonTools.GetRulesLevelString( a.GetRulesLevelIM() ) );
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblInfoAVSL = new javax.swing.JLabel();
        lblInfoAVSW = new javax.swing.JLabel();
        lblInfoAVCI = new javax.swing.JLabel();
        lblAVSL = new javax.swing.JLabel();
        lblAVSW = new javax.swing.JLabel();
        lblAVCI = new javax.swing.JLabel();
        lblInfoIntro = new javax.swing.JLabel();
        lblInfoExtinct = new javax.swing.JLabel();
        lblInfoReIntro = new javax.swing.JLabel();
        lblIntro = new javax.swing.JLabel();
        lblExtinct = new javax.swing.JLabel();
        lblReintro = new javax.swing.JLabel();
        lblInfoName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblInfoTonnage = new javax.swing.JLabel();
        lblTonnage = new javax.swing.JLabel();
        lblInfoLotSize = new javax.swing.JLabel();
        lblLotSize = new javax.swing.JLabel();
        lblInfoCost = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblInfoBV = new javax.swing.JLabel();
        lblBV = new javax.swing.JLabel();
        lblInfoExplosive = new javax.swing.JLabel();
        lblExplosive = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnClose = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblRulesBM = new javax.swing.JLabel();
        lblRulesIM = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblInfoAVSL.setText("Availability (AOW/SL)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        getContentPane().add(lblInfoAVSL, gridBagConstraints);

        lblInfoAVSW.setText("Availability (SW)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        getContentPane().add(lblInfoAVSW, gridBagConstraints);

        lblInfoAVCI.setText("Availability (CI)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        getContentPane().add(lblInfoAVCI, gridBagConstraints);

        lblAVSL.setText("X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblAVSL, gridBagConstraints);

        lblAVSW.setText("X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblAVSW, gridBagConstraints);

        lblAVCI.setText("X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblAVCI, gridBagConstraints);

        lblInfoIntro.setText("Introduction");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblInfoIntro, gridBagConstraints);

        lblInfoExtinct.setText("Extinction");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblInfoExtinct, gridBagConstraints);

        lblInfoReIntro.setText("Reintroduction");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblInfoReIntro, gridBagConstraints);

        lblIntro.setText("9999 (TH)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblIntro, gridBagConstraints);

        lblExtinct.setText("9999 (TH)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblExtinct, gridBagConstraints);

        lblReintro.setText("9999 (TH)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblReintro, gridBagConstraints);

        lblInfoName.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        getContentPane().add(lblInfoName, gridBagConstraints);

        lblName.setText("@ Armor-Piercing AC/20");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        getContentPane().add(lblName, gridBagConstraints);

        lblInfoTonnage.setText("Tonnage");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblInfoTonnage, gridBagConstraints);

        lblTonnage.setText("0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblTonnage, gridBagConstraints);

        lblInfoLotSize.setText("Lot Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblInfoLotSize, gridBagConstraints);

        lblLotSize.setText("999");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblLotSize, gridBagConstraints);

        lblInfoCost.setText("Cost");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblInfoCost, gridBagConstraints);

        lblCost.setText("999999.9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblCost, gridBagConstraints);

        lblInfoBV.setText("BV");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblInfoBV, gridBagConstraints);

        lblBV.setText("9999.9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(lblBV, gridBagConstraints);

        lblInfoExplosive.setText("Explosive");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        getContentPane().add(lblInfoExplosive, gridBagConstraints);

        lblExplosive.setText("Yes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        getContentPane().add(lblExplosive, gridBagConstraints);

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        getContentPane().add(jSeparator1, gridBagConstraints);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 4);
        getContentPane().add(btnClose, gridBagConstraints);

        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        getContentPane().add(jSeparator2, gridBagConstraints);

        jLabel1.setText("Rules Level (BattleMech)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        getContentPane().add(jLabel1, gridBagConstraints);

        lblRulesBM.setText("Experimental");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        getContentPane().add(lblRulesBM, gridBagConstraints);

        lblRulesIM.setText("Experimental");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        getContentPane().add(lblRulesIM, gridBagConstraints);

        jLabel4.setText("Rules Level (IndustrialMech)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        getContentPane().add(jLabel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAVCI;
    private javax.swing.JLabel lblAVSL;
    private javax.swing.JLabel lblAVSW;
    private javax.swing.JLabel lblBV;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblExplosive;
    private javax.swing.JLabel lblExtinct;
    private javax.swing.JLabel lblInfoAVCI;
    private javax.swing.JLabel lblInfoAVSL;
    private javax.swing.JLabel lblInfoAVSW;
    private javax.swing.JLabel lblInfoBV;
    private javax.swing.JLabel lblInfoCost;
    private javax.swing.JLabel lblInfoExplosive;
    private javax.swing.JLabel lblInfoExtinct;
    private javax.swing.JLabel lblInfoIntro;
    private javax.swing.JLabel lblInfoLotSize;
    private javax.swing.JLabel lblInfoName;
    private javax.swing.JLabel lblInfoReIntro;
    private javax.swing.JLabel lblInfoTonnage;
    private javax.swing.JLabel lblIntro;
    private javax.swing.JLabel lblLotSize;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReintro;
    private javax.swing.JLabel lblRulesBM;
    private javax.swing.JLabel lblRulesIM;
    private javax.swing.JLabel lblTonnage;
    // End of variables declaration//GEN-END:variables
    
}
