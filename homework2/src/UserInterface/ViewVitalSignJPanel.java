/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface;
import Business.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jauzh
 */
public class ViewVitalSignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewVitalSignJPanel
     */
    private Patient patient;
    public ViewVitalSignJPanel(Patient patient) {
        initComponents();
        this.patient=patient;
        populateTable();
        
        this.namejTextField.setText(patient.getName());
        this.idjTextField.setText(patient.getId());
        this.agejTextField.setText(String.valueOf(patient.getAge()));
        this.doctorNamejTextField.setText(patient.getDoctorName());
        this.pharmacyjTextField.setText(patient.getPharmacy());
        
    }
    public void populateTable(){
        DefaultTableModel dtm=(DefaultTableModel)VitalSignjTable.getModel();
        //empty your table
       int totalRows=dtm.getRowCount();
         for(int i=totalRows-1; i>=0; i--){
             dtm.removeRow(i);
         }
        for(VitalSign vitalSign : patient.getVitalSignHistory().getVitalSignList()){
               Object row[]=new Object[2];
               row[0]=vitalSign;
               if(vitalSign.getIsNormal()){
                   row[1] = "Normal";
               }else{
                   row[1] = "Abnormal";
               }
               dtm.addRow(row);
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

        respiratoryjLabel = new javax.swing.JLabel();
        heartRatejLabel = new javax.swing.JLabel();
        systolicPressurejLabel = new javax.swing.JLabel();
        weightjLabel = new javax.swing.JLabel();
        timejLabel = new javax.swing.JLabel();
        respiratoryRatejTextField = new javax.swing.JTextField();
        heartRatejTextField = new javax.swing.JTextField();
        systolicPressurejTextField = new javax.swing.JTextField();
        weightjTextField = new javax.swing.JTextField();
        timejTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        VitalSignjTable = new javax.swing.JTable();
        viewVitalSignjLabel = new javax.swing.JLabel();
        viewjButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        pharmacyjLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        idjTextField = new javax.swing.JTextField();
        agejTextField = new javax.swing.JTextField();
        doctorNamejTextField = new javax.swing.JTextField();
        namejLabel = new javax.swing.JLabel();
        idjLabel = new javax.swing.JLabel();
        agejLabel = new javax.swing.JLabel();
        doctorNamejLabel = new javax.swing.JLabel();
        pharmacyjTextField = new javax.swing.JTextField();

        respiratoryjLabel.setText("Respiratory Rate");

        heartRatejLabel.setText("Heart Rate");

        systolicPressurejLabel.setText("Systolic Pressure");

        weightjLabel.setText("Weight");

        timejLabel.setText("Time");

        VitalSignjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Time", "Normal"
            }
        ));
        jScrollPane2.setViewportView(VitalSignjTable);

        viewVitalSignjLabel.setText("View Vital Sign");

        viewjButton.setText("View");
        viewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButtonActionPerformed(evt);
            }
        });

        deletejButton.setText("Delete");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        pharmacyjLabel.setText("Pharmacy");

        namejLabel.setText("Name");

        idjLabel.setText("ID");

        agejLabel.setText("Age");

        doctorNamejLabel.setText("Doctor Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewjButton)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(viewVitalSignjLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(agejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doctorNamejLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pharmacyjLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(respiratoryjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(heartRatejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weightjLabel)
                                    .addComponent(systolicPressurejLabel)
                                    .addComponent(timejLabel))))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pharmacyjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respiratoryRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heartRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(systolicPressurejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletejButton))))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(viewVitalSignjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namejLabel)
                        .addGap(18, 18, 18)
                        .addComponent(idjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agejLabel)
                        .addGap(28, 28, 28)
                        .addComponent(doctorNamejLabel)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deletejButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(doctorNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pharmacyjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pharmacyjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respiratoryRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respiratoryjLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heartRatejLabel)
                    .addComponent(heartRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(systolicPressurejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightjLabel)))
                    .addComponent(systolicPressurejLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timejLabel)
                    .addComponent(timejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow=VitalSignjTable.getSelectedRow();
        if(selectedRow>=0){
            VitalSign vitalSign=(VitalSign)VitalSignjTable.getValueAt(selectedRow,0);
            respiratoryRatejTextField.setText(String.valueOf(vitalSign.getRespiratoryRate()));
            heartRatejTextField.setText(String.valueOf(vitalSign.getHeartRate()));
            systolicPressurejTextField.setText(String.valueOf(vitalSign.getSystolicBloodPressure()));
            weightjTextField.setText(String.valueOf(vitalSign.getWeight()));  
            timejTextField.setText(vitalSign.getTime());
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select Vital Sign..!");
        }
        
    }//GEN-LAST:event_viewjButtonActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow=VitalSignjTable.getSelectedRow();
        if(selectedRow>=0){
          VitalSign vitalSign=(VitalSign)VitalSignjTable.getValueAt(selectedRow,0);
          int result=JOptionPane.showConfirmDialog(null, 
                     "Are you sure you want to delete VitalSign ..?",
                     "Warning",
                     JOptionPane.YES_NO_OPTION);
              if(result==JOptionPane.YES_OPTION){
                  patient.getVitalSignHistory().deleteVitalSign(vitalSign);
                  populateTable();
              }
          } else {
              JOptionPane.showMessageDialog(null, "Please select Vital Sign..!");
        }
    }//GEN-LAST:event_deletejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VitalSignjTable;
    private javax.swing.JLabel agejLabel;
    private javax.swing.JTextField agejTextField;
    private javax.swing.JButton deletejButton;
    private javax.swing.JLabel doctorNamejLabel;
    private javax.swing.JTextField doctorNamejTextField;
    private javax.swing.JLabel heartRatejLabel;
    private javax.swing.JTextField heartRatejTextField;
    private javax.swing.JLabel idjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel pharmacyjLabel;
    private javax.swing.JTextField pharmacyjTextField;
    private javax.swing.JTextField respiratoryRatejTextField;
    private javax.swing.JLabel respiratoryjLabel;
    private javax.swing.JLabel systolicPressurejLabel;
    private javax.swing.JTextField systolicPressurejTextField;
    private javax.swing.JLabel timejLabel;
    private javax.swing.JTextField timejTextField;
    private javax.swing.JLabel viewVitalSignjLabel;
    private javax.swing.JButton viewjButton;
    private javax.swing.JLabel weightjLabel;
    private javax.swing.JTextField weightjTextField;
    // End of variables declaration//GEN-END:variables
}