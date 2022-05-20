/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineMall;

import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.io.FileWriter;  
import  java.util.Random;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
/**imp
 *
 * @author hp
 */



public class ShopApplicationInterface extends javax.swing.JFrame  {

    
      Random r = new Random();
    
    
    ArrayList <ShopAccount> shops;
    ArrayList <Applications> Applications;
  
    
    public ShopApplicationInterface() {
        initComponents();
        shops = new ArrayList<ShopAccount>();
        Applications = new ArrayList<Applications>();
        populateArrayList1();
    }

    
    public void populateArrayList1()
    {
        try
        {
        
            FileInputStream file = new FileInputStream("Shops.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
        boolean endOfFile = false;
        
        while (!endOfFile){
            
            try 
            {
              shops.add((ShopAccount) inputFile.readObject());
                
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
            catch (Exception f)
            {
             JOptionPane.showMessageDialog(null, f.getMessage());
            }
        }
        
        inputFile.close();
        }
        catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        
    }
    
    public void saveShopsToFile(){
         
            try 
            {
              FileOutputStream file = new FileOutputStream("src\\DataBase\\Shops.dat");
              ObjectOutputStream outputFile = new ObjectOutputStream(file);
                
              
              for (int i=0; i<shops.size(); i++){
                  
                  outputFile.writeObject(shops.get(i));
                  
              }
              
              outputFile.close();
              JOptionPane.showMessageDialog(null, "The Application was succefully submited to one of our Employees");
              JOptionPane.showMessageDialog(null, "please use the following Application number to check your application status later when employee reviews it");
             
             
              
  
             
            }
        
         catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
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

        ApplyLabel = new javax.swing.JLabel();
        ShopsUserName = new javax.swing.JLabel();
        UploadText = new javax.swing.JTextField();
        PasswordText = new javax.swing.JPasswordField();
        Password = new javax.swing.JLabel();
        ConfirmPassword = new javax.swing.JLabel();
        ConfirmPasswordText = new javax.swing.JPasswordField();
        AddressText = new javax.swing.JTextField();
        EmailAddress = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JLabel();
        AddressOfShop = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        Please = new javax.swing.JLabel();
        Approved = new javax.swing.JLabel();
        UserNameText = new javax.swing.JTextField();
        UploadButton = new javax.swing.JButton();
        Already = new javax.swing.JLabel();
        LoginUserName = new javax.swing.JLabel();
        LoginUserNameText = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        ForgotButton = new javax.swing.JButton();
        LoginPasswordText = new javax.swing.JPasswordField();
        LoginPassword = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PhoneText = new javax.swing.JTextField();
        ApplyButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        LoginUserName1 = new javax.swing.JLabel();
        ApplicationNumberText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome to our Online service firm");
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 517, 745));
        setMinimumSize(new java.awt.Dimension(517, 650));
        getContentPane().setLayout(null);

        ApplyLabel.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        ApplyLabel.setText("Apply and get your products in the hands of more customers");
        getContentPane().add(ApplyLabel);
        ApplyLabel.setBounds(30, 30, 464, 50);

        ShopsUserName.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        ShopsUserName.setText("UserName:");
        ShopsUserName.setToolTipText("");
        getContentPane().add(ShopsUserName);
        ShopsUserName.setBounds(50, 90, 70, 17);

        UploadText.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        UploadText.setText("application.pdf");
        UploadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadTextActionPerformed(evt);
            }
        });
        getContentPane().add(UploadText);
        UploadText.setBounds(20, 330, 360, 30);

        PasswordText.setText("jPasswordField1");
        getContentPane().add(PasswordText);
        PasswordText.setBounds(140, 120, 340, 20);

        Password.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        Password.setText("Password:");
        getContentPane().add(Password);
        Password.setBounds(50, 120, 70, 17);

        ConfirmPassword.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        ConfirmPassword.setText("Confirm password: ");
        getContentPane().add(ConfirmPassword);
        ConfirmPassword.setBounds(10, 150, 110, 17);

        ConfirmPasswordText.setText("jPasswordField1");
        getContentPane().add(ConfirmPasswordText);
        ConfirmPasswordText.setBounds(140, 150, 340, 20);

        AddressText.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        AddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTextActionPerformed(evt);
            }
        });
        getContentPane().add(AddressText);
        AddressText.setBounds(140, 240, 340, 19);

        EmailAddress.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        EmailAddress.setText("       Email Adrress:");
        getContentPane().add(EmailAddress);
        EmailAddress.setBounds(10, 180, 110, 17);

        PhoneNumber.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        PhoneNumber.setText("Phone Number:");
        getContentPane().add(PhoneNumber);
        PhoneNumber.setBounds(30, 210, 90, 17);

        AddressOfShop.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        AddressOfShop.setText(" Address of the shop:");
        getContentPane().add(AddressOfShop);
        AddressOfShop.setBounds(10, 240, 110, 20);

        EmailText.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });
        getContentPane().add(EmailText);
        EmailText.setBounds(140, 180, 340, 19);

        Please.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Please.setText("Please Proceed to upload the Necesary legal paper Documents that are associated with the Shop");
        getContentPane().add(Please);
        Please.setBounds(20, 270, 490, 21);

        Approved.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Approved.setText("Take notice that the  fomat acceptable for the submited documents shall be in the form of .PDF");
        getContentPane().add(Approved);
        Approved.setBounds(20, 290, 470, 29);
        getContentPane().add(UserNameText);
        UserNameText.setBounds(140, 90, 340, 20);

        UploadButton.setText("Upload:");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UploadButton);
        UploadButton.setBounds(390, 330, 90, 30);

        Already.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Already.setText("Already have A Registered Shop? ");
        getContentPane().add(Already);
        Already.setBounds(30, 440, 223, 19);

        LoginUserName.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        LoginUserName.setText("username:");
        getContentPane().add(LoginUserName);
        LoginUserName.setBounds(40, 480, 68, 20);
        getContentPane().add(LoginUserNameText);
        LoginUserNameText.setBounds(140, 480, 201, 20);

        LoginButton.setText("Log in");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton);
        LoginButton.setBounds(350, 480, 130, 23);

        ForgotButton.setText("Forgot password?");
        ForgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ForgotButton);
        ForgotButton.setBounds(350, 510, 130, 23);

        LoginPasswordText.setText("jPasswordField1");
        LoginPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPasswordTextActionPerformed(evt);
            }
        });
        getContentPane().add(LoginPasswordText);
        LoginPasswordText.setBounds(140, 510, 201, 20);

        LoginPassword.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        LoginPassword.setText("Password:");
        getContentPane().add(LoginPassword);
        LoginPassword.setBounds(40, 510, 68, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 550, 470, 17);

        PhoneText.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        PhoneText.setText("+02");
        PhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneText);
        PhoneText.setBounds(140, 210, 340, 19);

        ApplyButton.setText("Apply!");
        ApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ApplyButton);
        ApplyButton.setBounds(20, 370, 460, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 420, 480, 17);

        jButton2.setText("Check Application Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 570, 210, 20);

        LoginUserName1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        LoginUserName1.setText("Application #");
        getContentPane().add(LoginUserName1);
        LoginUserName1.setBounds(40, 570, 120, 20);
        getContentPane().add(ApplicationNumberText);
        ApplicationNumberText.setBounds(140, 570, 120, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UploadTextActionPerformed

    private void AddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTextActionPerformed

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextActionPerformed

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextActionPerformed

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
      JFileChooser chooser = new JFileChooser();
      chooser.showOpenDialog(null);
      File f = chooser.getSelectedFile();
      String filename = f.getAbsolutePath();
      UploadText.setText(filename);
    }//GEN-LAST:event_UploadButtonActionPerformed

    private void ApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyButtonActionPerformed
 
        
        
        
        
        int ApplicationNumber = r.nextInt(9999); 
        String Name = UserNameText.getText().trim();
        String Password = PasswordText.getText();
        String Email = EmailText.getText();
        String phoneNumber = PhoneText.getText();
        String PlaceAddress = AddressText.getText();
        
        
        
        
        
        if (UploadText.getText().isEmpty() ||AddressText.getText().isEmpty() ||UserNameText.getText().isEmpty()||PhoneText.getText().isEmpty()||
                
                EmailText.getText().isEmpty() ||PasswordText.getText().isEmpty()){
            
             JOptionPane.showMessageDialog(null, "One of the Required fields is empty please fill it");
            
        }else{
        
            
        
       
        ShopAccount shop = new ShopAccount(ApplicationNumber,Name, Password,Email,phoneNumber,PlaceAddress);
        
        shops.add(shop);
        saveShopsToFile();
        JOptionPane.showMessageDialog(null, "Apllication# " + ApplicationNumber);
        
        }         
       
    
        try
        {
        
            FileInputStream file = new FileInputStream("src\\DataBase\\Shops.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
        
        FileWriter fw=new FileWriter("src\\DataBase\\shopsData.txt");  
        FileWriter fw2 = new FileWriter("src\\DataBase\\ManageShopRequests.txt");
        
       for (int i=0;i<shops.size();i++){
           
            try 
            {
              
                   fw.write( "\n" + shops.get(i).getName() + "\n" + shops.get(i).getEmail()+ "\n" + shops.get(i).getPhoneNumber()+ "\n" + shops.get(i).getPlaceAddress()+"\n" + shops.get(i).getPassword() + "\n");
                   fw2.write( "\n" + shops.get(i).getApplicationNumber() + "\n" + shops.get(i).getName() + "\n" + shops.get(i).getEmail()+ "\n" + shops.get(i).getPhoneNumber()+ "\n" + shops.get(i).getPlaceAddress()+"\n" + shops.get(i).getPassword() + "\n");
                  
            }
            catch (Exception f)
            {
             JOptionPane.showMessageDialog(null, f.getMessage());
            }
          
        }
        fw.close();  
        fw2.close();
        inputFile.close();
        }
        catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
    
        

        
        
          
        
        
        
    }//GEN-LAST:event_ApplyButtonActionPerformed

    private void ForgotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotButtonActionPerformed

     
   
     
    }//GEN-LAST:event_ForgotButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       
        try
        {
        
        FileInputStream file = new FileInputStream("src\\DataBase\\Shops.dat");
        ObjectInputStream inputFile = new ObjectInputStream(file);
        boolean endOfFile = false;
        
        while (!endOfFile){
            
            try 
            {
              shops.add((ShopAccount) inputFile.readObject());
                
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
            catch (Exception f)
            {
             JOptionPane.showMessageDialog(null, f.getMessage());
            }
        }
        
        inputFile.close();
        }
        
        catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        
        
         try{
        
       
       FileInputStream file = new FileInputStream("src\\DataBase\\Applications.dat");
        ObjectInputStream inputFile = new ObjectInputStream(file);
        boolean endOfFile = false;
        
        while (!endOfFile){
            
            try 
            {
           Applications.add ((Applications) inputFile.readObject());
                
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
            catch (Exception f)
            {
             JOptionPane.showMessageDialog(null, f.getMessage());
            }
        }
        
        inputFile.close();
        }
        catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
             
             
        
        
        
        
  if(LoginUserNameText.getText().isEmpty() ||LoginPasswordText.getText().isEmpty() ){
            
                         JOptionPane.showMessageDialog(null, "One of the Required fields is empty please fill it");

 }else{
            
           
      
   boolean abort = false;     
   for (int i=0;i<shops.size() && !abort ;i++) {
           
          
     
      if (LoginUserNameText.getText().trim().equals(shops.get(i).getName().trim())  && LoginPasswordText.getText().equals(shops.get(i).getPassword()) ){
              
          String x = Integer.toString(shops.get(i).ApplicationNumber);
          
          for (int j=0; j<Applications.size(); j++){
             
         
                if(x.equals(Applications.get(j).ApplicationNumber) && Applications.get(j).Applicationstatus.equals("Approved")) {
                    
                     new ShopInterface().setVisible(true);
                     abort = true;
                     break;
                     
                      
                }else if(x.equals(Applications.get(j).ApplicationNumber) && Applications.get(j).Applicationstatus.equals("DisApproved")){
                    
                    JOptionPane.showMessageDialog(null, "Unfortunaely your application has been denied");
                    abort = true;
                    break;
                    
                } 
          }
      
      }else {
                       JOptionPane.showMessageDialog(null, "Failed login attempt, make sure you are inserting the proper credintials");
                       break;
                     }
                         
                         
                
      }
   
     }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void LoginPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginPasswordTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       
        
      
        try{
        
       
       FileInputStream file = new FileInputStream("src\\DataBase\\Applications.dat");
        ObjectInputStream inputFile = new ObjectInputStream(file);
        boolean endOfFile = false;
        
        while (!endOfFile){
            
            try 
            {
           Applications.add ((Applications) inputFile.readObject());
                
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
            catch (Exception f)
            {
             JOptionPane.showMessageDialog(null, f.getMessage());
            }
        }
        
        inputFile.close();
        }
        catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        
        boolean d = false;
        
      for (int i=0;i<Applications.size();i++) {
           
          
              
          
         if (ApplicationNumberText.getText().trim().equals(Applications.get(i).ApplicationNumber)){
                
                 JOptionPane.showMessageDialog(null, "your Application has been " + Applications.get(i).Applicationstatus);
                 JOptionPane.showMessageDialog(null, "When/if your Application has been approved use your login credinitials and login in from the same interface used while applying ");
                 d = true;
                 break;
         }
          
          
       
      }if (d == false){
          
           JOptionPane.showMessageDialog(null, "Your Application is still pending");
      }
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ShopApplicationInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopApplicationInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopApplicationInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopApplicationInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopApplicationInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressOfShop;
    private javax.swing.JTextField AddressText;
    private javax.swing.JLabel Already;
    private javax.swing.JTextField ApplicationNumberText;
    private javax.swing.JButton ApplyButton;
    private javax.swing.JLabel ApplyLabel;
    private javax.swing.JLabel Approved;
    private javax.swing.JLabel ConfirmPassword;
    private javax.swing.JPasswordField ConfirmPasswordText;
    private javax.swing.JLabel EmailAddress;
    private javax.swing.JTextField EmailText;
    private javax.swing.JButton ForgotButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginPassword;
    private javax.swing.JPasswordField LoginPasswordText;
    private javax.swing.JLabel LoginUserName;
    private javax.swing.JLabel LoginUserName1;
    private javax.swing.JTextField LoginUserNameText;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JLabel Please;
    private javax.swing.JLabel ShopsUserName;
    private javax.swing.JButton UploadButton;
    private javax.swing.JTextField UploadText;
    private javax.swing.JTextField UserNameText;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
