
package OnlineMall;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.lang.Object;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

/**
 *
 * @author hp
 */
public class MainInterface extends javax.swing.JFrame  {

     

 ArrayList <CustomerAccount> Customers;
    public MainInterface() {
        initComponents();
         Customers = new ArrayList<CustomerAccount>();
    }

    
 

          
      
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(57, 0), new java.awt.Dimension(57, 0), new java.awt.Dimension(57, 32767));
        Separator = new javax.swing.JSeparator();
        Apply = new javax.swing.JButton();
        login = new javax.swing.JButton();
        CreateCustomer = new javax.swing.JButton();
        MainUserName = new javax.swing.JTextField();
        Looking = new javax.swing.JLabel();
        MainPassword = new javax.swing.JPasswordField();
        un = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        New = new javax.swing.JLabel();
        Admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(650, 430));
        getContentPane().setLayout(null);
        getContentPane().add(filler1);
        filler1.setBounds(190, 260, 57, 0);
        getContentPane().add(Separator);
        Separator.setBounds(10, 270, 620, 10);

        Apply.setText("Apply Right away!");
        Apply.setToolTipText("");
        Apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyActionPerformed(evt);
            }
        });
        getContentPane().add(Apply);
        Apply.setBounds(10, 330, 310, 40);

        login.setText("Log in");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(450, 180, 170, 20);

        CreateCustomer.setText("Create your free account now");
        CreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(CreateCustomer);
        CreateCustomer.setBounds(370, 330, 250, 40);
        getContentPane().add(MainUserName);
        MainUserName.setBounds(80, 180, 330, 20);

        Looking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Looking.setText("Looking forward to Enlist your shop with us?");
        getContentPane().add(Looking);
        Looking.setBounds(10, 300, 320, 17);

        MainPassword.setText("jPasswordField1");
        getContentPane().add(MainPassword);
        MainPassword.setBounds(80, 210, 330, 20);

        un.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        un.setText("Username:");
        getContentPane().add(un);
        un.setBounds(20, 180, 58, 20);

        pw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pw.setText("Password:");
        getContentPane().add(pw);
        pw.setBounds(20, 210, 60, 20);

        New.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        New.setText("New to this site? Shop with us now");
        getContentPane().add(New);
        New.setBounds(370, 300, 243, 17);

        Admin.setText("Administrator");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin);
        Admin.setBounds(450, 210, 170, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineMall/logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 0, 150, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyActionPerformed

        new ShopApplicationInterface().setVisible(true);

    }//GEN-LAST:event_ApplyActionPerformed

    private void CreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCustomerActionPerformed
      
        
        new CreateNewCustomerAccount().setVisible(true);
        
    }//GEN-LAST:event_CreateCustomerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
    if(MainUserName.getText().isEmpty() ||MainPassword.getText().isEmpty() ){
            
                         JOptionPane.showMessageDialog(null, "One of the Required fields is empty please fill it");

        }else{
            
           
            
            try
        {
        
            FileInputStream file = new FileInputStream("src\\DataBase\\Customers.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
        boolean endOfFile = false;
        
        while (!endOfFile){
            
            try 
            {
              Customers.add((CustomerAccount) inputFile.readObject());
                
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
        
            
            boolean c= false;
         for (int i=0;i<Customers.size();i++) {
           
          
              
          
         if (MainUserName.getText().trim().equals(Customers.get(i).getName().trim())  && MainPassword.getText().equals(Customers.get(i).getPassword()) ){
                
             
                new CustomerInterface().setVisible(true);
                
                try 
            {
              
                FileWriter wr = new FileWriter("src\\DataBase\\CustomerNumber.txt");
                wr.write(i + "");
                wr.close();
              
              
              }
              
              
         catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
              
                 c=true;
                 break;
         }
          
         
          
       
      } if (c == false){
          
           JOptionPane.showMessageDialog(null, "Failed login attempt, make sure you are inserting the proper credintials");
      }
            
            
                
                
        }
        
  
        
       
    }//GEN-LAST:event_loginActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed

         if (MainUserName.getText().trim().equals("Admin")  && MainPassword.getText().equals("Admin") ){
            
             
         new EmployeeInterface().setVisible(true);   
         
         }else {
               JOptionPane.showMessageDialog(null, "Failed login attempt, make sure you are inserting the proper credintials");
         }
    }//GEN-LAST:event_AdminActionPerformed

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
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
 
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Apply;
    private javax.swing.JButton CreateCustomer;
    private javax.swing.JLabel Looking;
    private javax.swing.JPasswordField MainPassword;
    private javax.swing.JTextField MainUserName;
    private javax.swing.JLabel New;
    private javax.swing.JSeparator Separator;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel pw;
    private javax.swing.JLabel un;
    // End of variables declaration//GEN-END:variables
}
