/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directionsdemo;
import java.lang.*;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.HttpConnect;
import org.json.*;
/**
 *
 * @author 20521
 */
public class tripComputer extends javax.swing.JFrame {
    private static int t;
    private static int second;
    private static int minute;
    private static int hour;
    private static String odometer;
    final static String MODE = "walking";
    /**
     * Creates new form tripComputer
     */
    public tripComputer()  {
        String s0 ="50.735459,-3.533207";
        String s1 ="50.722932 -3.530193";
        
        initComponents();
        odometer = "0";
        try {
            displayOdem(s0,s1);
        } catch (JSONException ex) {
            Logger.getLogger(tripComputer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        second = 0;
        minute = 0;
        hour = 0;
        movingTimeIncease();
        
        t=0;
        displaySpeed();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        device = new javax.swing.JPanel();
        tripComputerPanel = new javax.swing.JPanel();
        tripComputerTime = new javax.swing.JLabel();
        timeDisplay = new javax.swing.JTextField();
        tripComputerOdem = new javax.swing.JLabel();
        odemDisplay = new javax.swing.JTextField();
        tripComputerSpeed = new javax.swing.JLabel();
        speedDisplay = new javax.swing.JTextField();
        devicePanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(347, 624));

        device.setPreferredSize(new java.awt.Dimension(347, 624));
        device.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tripComputerPanel.setPreferredSize(new java.awt.Dimension(203, 245));

        tripComputerTime.setText("moving time");

        tripComputerOdem.setText("trip odem");
        tripComputerOdem.setToolTipText("");

        odemDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemDisplayActionPerformed(evt);
            }
        });

        tripComputerSpeed.setText("speed");

        javax.swing.GroupLayout tripComputerPanelLayout = new javax.swing.GroupLayout(tripComputerPanel);
        tripComputerPanel.setLayout(tripComputerPanelLayout);
        tripComputerPanelLayout.setHorizontalGroup(
            tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tripComputerTime, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(timeDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tripComputerOdem, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(odemDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tripComputerSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(speedDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
        );
        tripComputerPanelLayout.setVerticalGroup(
            tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tripComputerPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(tripComputerTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tripComputerPanelLayout.createSequentialGroup()
                    .addGap(0, 198, Short.MAX_VALUE)
                    .addComponent(timeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tripComputerPanelLayout.createSequentialGroup()
                    .addComponent(tripComputerOdem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 213, Short.MAX_VALUE)))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tripComputerPanelLayout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(odemDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(162, Short.MAX_VALUE)))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tripComputerPanelLayout.createSequentialGroup()
                    .addContainerGap(83, Short.MAX_VALUE)
                    .addComponent(tripComputerSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(133, Short.MAX_VALUE)))
            .addGroup(tripComputerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tripComputerPanelLayout.createSequentialGroup()
                    .addContainerGap(113, Short.MAX_VALUE)
                    .addComponent(speedDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        device.add(tripComputerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 239, -1, -1));

        devicePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/directionsdemo/bb.png"))); // NOI18N
        device.add(devicePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(device, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(device, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void odemDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odemDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(tripComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tripComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tripComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tripComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tripComputer().setVisible(true);
            }
        });
    }
    
    public void movingTimeIncease(){
        
        Thread time = new Thread(){
        public void run(){
        for(;;){
            String str_s = Integer.toString(second);
            String str_m = Integer.toString(minute);
            String str_h = Integer.toString(hour);
            timeDisplay.setText(str_h+"Hour    "+str_m+"Min    "+str_s+"Sec");
            try{sleep(1000);}catch(InterruptedException e){}
            
            second++;
            if(second==60){
                minute++;
                second = 0;
            }
            if(minute==60){
                hour++;
                minute = 0;
            }
        }
        }
        };
        time.start();
    }
    
    public byte[] readDirections(String start,String end){
        try {
            final String encOrigin      = URLEncoder.encode( start,      "UTF-8" );
            final String encDestination = URLEncoder.encode( end, "UTF-8" );
            final String method = "GET";
            final String url 
            = ( "https://maps.googleapis.com/maps/api/directions/json"
              + "?" + "origin"      + "=" + encOrigin
              + "&" + "destination" + "=" + encDestination
              + "&" + "mode"        + "=" + MODE
              );
            final byte[] body
             = {}; 
            final String[][] headers
             = {};
            byte[] response = HttpConnect.httpConnect( method, url, headers, body );
            return response;
            } catch ( Exception ex ) {return null;}
    }
    
    public String calculateOdem(String start,String end)throws JSONException{
        byte[] directions = readDirections(start,end);
        String s = new String(directions);
        JSONObject obj = new JSONObject(s);
        JSONArray routes = (JSONArray) obj.get("routes");
        JSONObject child1 = (JSONObject) routes.getJSONObject(0);
        JSONArray legs = (JSONArray) child1.get("legs");
        JSONObject child2 = (JSONObject) legs.getJSONObject(0);
        JSONObject distance = (JSONObject) child2.get("distance");
        String dis = distance.getString("text");
        return dis;
    }
    
    public void displayOdem(String start,String end)throws JSONException{
        String odem = calculateOdem(start,end);
        odometer = odem;
        odemDisplay.setText(odometer);
    
    }
    
    public void displaySpeed(){
        speedDisplay.setText("0   KM/H");
        Thread speed = new Thread(){
            public void run(){
               for(;;){
                   
                   try{sleep(1000);}catch(InterruptedException e){}
                   
                   t++;
                   
                   String pureSpeed = odometer.substring(0,odometer.length()-3);
                   Double distanceValue = Double.parseDouble(pureSpeed);
                   Double speedValue = distanceValue/t*3600;
                   String speedInKmh = Double.toString(speedValue) + "   KM/H";
                   
                   speedDisplay.setText(speedInKmh);
               
               
               }
            
            }
        };
        
        speed.start();
        
        //speedDisplay.setText("");
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel device;
    private javax.swing.JLabel devicePanel;
    private javax.swing.JTextField odemDisplay;
    private javax.swing.JTextField speedDisplay;
    private javax.swing.JTextField timeDisplay;
    private javax.swing.JLabel tripComputerOdem;
    private javax.swing.JPanel tripComputerPanel;
    private javax.swing.JLabel tripComputerSpeed;
    private javax.swing.JLabel tripComputerTime;
    // End of variables declaration//GEN-END:variables
}
