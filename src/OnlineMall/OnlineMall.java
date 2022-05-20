/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineMall;

import javax.swing.JScrollPane;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class OnlineMall {

   
   
}

class Applications implements Serializable{
    
    String ApplicationNumber;
    String Applicationstatus;
    
    
    Applications(String A, String B){
        
        this.ApplicationNumber = A;
        this.Applicationstatus = B;
    }
      
    
}
class UserAccount implements Serializable {


    String Name;
    String Password;
    String Email;
    String phoneNumber;
    String City;
    String Town;
    String District;
    String StreetAddress;
    String PlaceAddress;
    String CreditCard;
    
     static int Accountscounter = 0;
    
    String arrayofUsersAccounts[][] = new String[1][10];
    
    UserAccount(){
        
        
    }
   
    
    
   
   

}

class CustomerAccount extends UserAccount {
    
   //  ArrayList <Products> ArrayOfPurchasedProducts;
    
     CustomerAccount(String A, String B, String C, String D,String E,String F,String G,String H,String I,String J){
        
        this.Name = A;
        this.Password = B;
        this.Email = C;
        this.phoneNumber =D;
        this.City = E;
        this.Town = F;
        this.District = G;
        this.StreetAddress = H;
        this.PlaceAddress = I;
        this.CreditCard = J;
        
      
        
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return City;
    }

    public String getTown() {
        return Town;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public String getPlaceAddress() {
        return PlaceAddress;
    }

    public String getCreditCard() {
        return CreditCard;
    }

    public String getDistrict() {
        return District;
    }
     
     
     void ViewProducts(){
         
     }
     
     void sortProducts(){
         
         
     }
}



class ShopAccount extends UserAccount {
    
  
    int ApplicationNumber;
           
            
     ShopAccount(int A, String B, String C, String D, String E,String F){
        
        this.ApplicationNumber = A;
        this.Name = B;
        this.Password = C;
        this.Email = D;
        this.phoneNumber =E;
        this.PlaceAddress = F;
      
        
        Accountscounter++;
        
    } 

    public int getApplicationNumber() {
        return ApplicationNumber;
    }
     
     

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

   

    public String getPlaceAddress() {
        return PlaceAddress;
    }

 
    public static int getAccountscounter() {
        return Accountscounter;
    }

    public String[][] getArrayofUsersAccounts() {
        return arrayofUsersAccounts;
    }

    
     
     
     
    
    void EnlistProducts(){
        
        
    }
    
    void FetchPendingCustomerPurchases(){
        
        
    }
}


class ProductOrdered {
    
    private Products productinfotmation;
  
    
    
    void CalculateTotalPrice(){
        
        
        
        
    }
    
    
    
    void FetchProductInfo(){
        
    }
    
}

class Products  implements Serializable  {
    
    String name;
    String stock;
    String price;
    String Discription;
    
    
    Products(String A,String B, String C,String D){
        
        this.name = A;
        this.stock = B;
        this.price = C;
        this.Discription = D;
    }
    
   
   public String getName() {
        return name;
    }

    public String getStock() {
        return stock;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }
    
    
    
   
    
}

