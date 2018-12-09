/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReliefOrgAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ReliefOrganizationEnterprise;
import Business.Incident.Incident;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author prath
 */
public class DonationAnalysis extends javax.swing.JPanel {
    private JPanel container;
    private Incident incident;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;

    /**
     * Creates new form DonationAnalysis
     */
    public DonationAnalysis(JPanel container, Enterprise enterprise, UserAccount account, EcoSystem system) {
        initComponents();
        this.container = container;
        this.incident = incident;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        emrgnonemrgBtn1 = new javax.swing.JButton();
        foodareaBtn1 = new javax.swing.JButton();
        fundsareaBtn2 = new javax.swing.JButton();
        fundsareaBtn3 = new javax.swing.JButton();
        jCharts1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        emrgnonemrgBtn = new javax.swing.JButton();
        jCharts = new javax.swing.JPanel();
        foodareaBtn = new javax.swing.JButton();
        fundsareaBtn = new javax.swing.JButton();
        fundsareaBtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTabbedPane1.setBackground(new java.awt.Color(255, 253, 208));

        jPanel2.setBackground(new java.awt.Color(255, 253, 208));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\prath\\Documents\\icons\\arrow-back-icon_1_40x40.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setIconTextGap(0);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        emrgnonemrgBtn1.setText("Funds Donor");
        emrgnonemrgBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emrgnonemrgBtn1ActionPerformed(evt);
            }
        });

        foodareaBtn1.setText("Food Donor");
        foodareaBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodareaBtn1ActionPerformed(evt);
            }
        });

        fundsareaBtn2.setText("Cloths Donor");
        fundsareaBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundsareaBtn2ActionPerformed(evt);
            }
        });

        fundsareaBtn3.setText("Total Donation Analysis");
        fundsareaBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundsareaBtn3ActionPerformed(evt);
            }
        });

        jCharts1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCharts1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(emrgnonemrgBtn1)
                        .addGap(18, 18, 18)
                        .addComponent(foodareaBtn1)
                        .addGap(18, 18, 18)
                        .addComponent(fundsareaBtn2)
                        .addGap(18, 18, 18)
                        .addComponent(fundsareaBtn3))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emrgnonemrgBtn1)
                    .addComponent(foodareaBtn1)
                    .addComponent(fundsareaBtn2)
                    .addComponent(fundsareaBtn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCharts1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Donor", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 253, 208));

        emrgnonemrgBtn.setText("Emergency / Non Emergency");
        emrgnonemrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emrgnonemrgBtnActionPerformed(evt);
            }
        });

        jCharts.setLayout(new java.awt.BorderLayout());

        foodareaBtn.setText("Food / Area");
        foodareaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodareaBtnActionPerformed(evt);
            }
        });

        fundsareaBtn.setText("Funds / Area");
        fundsareaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundsareaBtnActionPerformed(evt);
            }
        });

        fundsareaBtn1.setText("Clothes / Area");
        fundsareaBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundsareaBtn1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/arrow-back-icon_1_40x40.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCharts, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emrgnonemrgBtn)
                        .addGap(18, 18, 18)
                        .addComponent(foodareaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(fundsareaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(fundsareaBtn1))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emrgnonemrgBtn)
                    .addComponent(foodareaBtn)
                    .addComponent(fundsareaBtn)
                    .addComponent(fundsareaBtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCharts, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Donation", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void foodareaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodareaBtnActionPerformed
        // TODO add your handling code here:
       DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
       Map<String, Integer> areaFunds = new HashMap<String, Integer>();

for (Network network : system.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){

                                System.out.println(((DonationWorkRequest) wr).getDonation().getDonatedTo());
                                if (((DonationWorkRequest) wr).getDonation().getDonatedTo() != null)
                                {
                                    System.out.println(((DonationWorkRequest) wr).getDonation().getDonatedTo());
                                    barChartData.setValue(((DonationWorkRequest) wr).getDonation().getFood_quantity(), "Food", ((DonationWorkRequest) wr).getDonation().getDonatedTo());
                                }
                        }
                    }
                }
            }
        }       
       

       JFreeChart barChart = ChartFactory.createBarChart("Emergency Donation", "Area", "Food", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       jCharts.removeAll();
       jCharts.add(barPanel, BorderLayout.CENTER);
       jCharts.validate();

    }//GEN-LAST:event_foodareaBtnActionPerformed

    private void emrgnonemrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emrgnonemrgBtnActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        Map<String, Integer> areaFunds = new HashMap<String, Integer>();

        double emergencyCounter = 0;
        double nonEmergencyCounter = 0;
        for (Network network : system.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){

                            if(wr instanceof DonationWorkRequest){

                                /*if(((DonationWorkRequest) wr).getStatus().equals("Approved")){
                                    System.out.println(((DonationWorkRequest) wr).getDonation().getMoneyDonation());
                                    System.out.println(((DonationWorkRequest) wr).getDonationType());

                                }*/
                                if (((DonationWorkRequest) wr).getDonationType().equals(DonationWorkRequest.DonationType.Emergency)) {
                                    emergencyCounter++;
                                } else if (((DonationWorkRequest) wr).getDonationType().equals(DonationWorkRequest.DonationType.NonEmergency)) {
                                    nonEmergencyCounter++;
                                }
                            }
                        }
                    }
                }
            }
        }

        pieDataset.setValue("Emergency", emergencyCounter);
        pieDataset.setValue("Non Emergency", nonEmergencyCounter);

        JFreeChart barChart = ChartFactory.createPieChart("Number of Donations", pieDataset, true, true, false);
        //CategoryPlot brChart = barChart.getCategoryPlot();
        //brChart.setRangeGridlinePaint(Color.GREEN);

        ChartPanel barPanel = new ChartPanel(barChart);
        jCharts.removeAll();
        jCharts.add(barPanel, BorderLayout.CENTER);
        jCharts.validate();
    }//GEN-LAST:event_emrgnonemrgBtnActionPerformed

    private void fundsareaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundsareaBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

        for (Network network : system.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){

                            if(wr instanceof DonationWorkRequest){
                                if (((DonationWorkRequest) wr).getDonation().getDonatedTo() != null) {
                                    barChartData.setValue(((DonationWorkRequest) wr).getDonation().getMoneyDonation(), "Funds", ((DonationWorkRequest) wr).getDonation().getDonatedTo());
                                }
                            }
                        }
                    }
                }
            }
        }
                
        JFreeChart barChart = ChartFactory.createBarChart("Emergency Donation", "Area", "Funds", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot brChart = barChart.getCategoryPlot();
        brChart.setRangeGridlinePaint(Color.GREEN);

        ChartPanel barPanel = new ChartPanel(barChart);
        jCharts.removeAll();
        jCharts.add(barPanel, BorderLayout.CENTER);
        jCharts.validate();
    }//GEN-LAST:event_fundsareaBtnActionPerformed

    private void fundsareaBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundsareaBtn1ActionPerformed
        // TODO add your handling code here:
// TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
       Map<String, Integer> areaFunds = new HashMap<String, Integer>();
       
       
       for (Network network : system.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){

                            if(wr instanceof DonationWorkRequest){
                                if (((DonationWorkRequest) wr).getDonation().getDonatedTo() != null)
                                {
                                    barChartData.setValue(((DonationWorkRequest) wr).getDonation().getCloth_quantity(), "Clothes", ((DonationWorkRequest) wr).getDonation().getDonatedTo());
                                }
                            }
                        }
                    }
                }
            }
        }

       JFreeChart barChart = ChartFactory.createBarChart("Emergency Donation", "Area", "Clothes", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       jCharts.removeAll();
       jCharts.add(barPanel, BorderLayout.CENTER);
       jCharts.validate();        
    }//GEN-LAST:event_fundsareaBtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void emrgnonemrgBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emrgnonemrgBtn1ActionPerformed
        // TODO add your handling code here:
       DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

       
       for (Network network : system.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){

                            if (((DonationWorkRequest) wr).getDonation().getMoneyDonation() != 0.0) {
                                System.out.println(((DonationWorkRequest) wr).getDonation().getMoneyDonation() + " " + wr.getSender().getUsername());
                                barChartData.setValue(((DonationWorkRequest) wr).getDonation().getMoneyDonation(), "funds", wr.getSender().getUsername());
                            }
                        }
                    }
                }
            }
        }

       JFreeChart barChart = ChartFactory.createBarChart("Monetory Donation", "Donor name", "Contribution Amount", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       jCharts1.removeAll();
       jCharts1.add(barPanel, BorderLayout.CENTER);
       jCharts1.validate();
        // TODO add your handling code here:
    }//GEN-LAST:event_emrgnonemrgBtn1ActionPerformed

    private void foodareaBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodareaBtn1ActionPerformed
        
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        
        for (Network network : system.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){

                            if (((DonationWorkRequest) wr).getDonation().getFood_quantity() != 0.0)
                            {
                                System.out.println(((DonationWorkRequest) wr).getDonation().getFood_quantity() + " " + wr.getSender().getUsername());
                                barChartData.setValue(((DonationWorkRequest) wr).getDonation().getFood_quantity(), "Food Qty", wr.getSender().getUsername());
                            }
                        }
                    }
                }
            }
        }
               
       JFreeChart barChart = ChartFactory.createBarChart("Food Donation", "Donor name", "Food quantity donated", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       jCharts1.removeAll();
       jCharts1.add(barPanel, BorderLayout.CENTER);
       jCharts1.validate();
        // TODO add your handling code here:
    }//GEN-LAST:event_foodareaBtn1ActionPerformed

    private void fundsareaBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundsareaBtn2ActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

       for (Network network : system.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){
                        if (((DonationWorkRequest) wr).getDonation().getCloth_quantity() != 0.0)
                        {
                           System.out.println(((DonationWorkRequest) wr).getDonation().getCloth_quantity() + " " + wr.getSender().getUsername());
                           barChartData.setValue(((DonationWorkRequest) wr).getDonation().getCloth_quantity(), "Clothes Qty", wr.getSender().getUsername());
                        }
                        }
                    }
                }
            }
        }

       JFreeChart barChart = ChartFactory.createBarChart("Clothes Donation", "Donor name", "Clothes quantity donated", barChartData, PlotOrientation.VERTICAL, false, true, false);
       CategoryPlot brChart = barChart.getCategoryPlot();
       brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       jCharts1.removeAll();
       jCharts1.add(barPanel, BorderLayout.CENTER);
       jCharts1.validate();
        // TODO add your handling code here:
    }//GEN-LAST:event_fundsareaBtn2ActionPerformed

    private void fundsareaBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundsareaBtn3ActionPerformed
       DefaultPieDataset pieDataset = new DefaultPieDataset();
       double foodCounter = 0;
       double clothCounter = 0;
       double moneyCounter = 0;
       for (Network network : system.getNetworkList()) {
            if (network.getNetworkName().equals(enterprise.getNetworkName())) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof ReliefOrganizationEnterprise) {
                        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){
                            foodCounter += ((DonationWorkRequest) wr).getDonation().getFood_quantity();
                            clothCounter += ((DonationWorkRequest) wr).getDonation().getCloth_quantity();
                            moneyCounter += ((DonationWorkRequest) wr).getDonation().getMoneyDonation();
                        }
                    }
                }
            }
        }

       pieDataset.setValue("Food", foodCounter);
       pieDataset.setValue("Cloth", clothCounter);
       pieDataset.setValue("money", moneyCounter);
//        pieDataset.setValue("April",40000);
//        pieDataset.setValue("May",30000);

       JFreeChart barChart = ChartFactory.createPieChart("Donation", pieDataset, true, true, false);
       //CategoryPlot brChart = barChart.getCategoryPlot();
       //brChart.setRangeGridlinePaint(Color.GREEN);

       ChartPanel barPanel = new ChartPanel(barChart);
       jCharts1.removeAll();
       jCharts1.add(barPanel, BorderLayout.CENTER);
       jCharts1.validate();
        // TODO add your handling code here:
    }//GEN-LAST:event_fundsareaBtn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton emrgnonemrgBtn;
    private javax.swing.JButton emrgnonemrgBtn1;
    private javax.swing.JButton foodareaBtn;
    private javax.swing.JButton foodareaBtn1;
    private javax.swing.JButton fundsareaBtn;
    private javax.swing.JButton fundsareaBtn1;
    private javax.swing.JButton fundsareaBtn2;
    private javax.swing.JButton fundsareaBtn3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jCharts;
    private javax.swing.JPanel jCharts1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
