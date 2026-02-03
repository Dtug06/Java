package SS6.bai2;

import java.util.Scanner;
 class Account {
     String username;
     String password;
     String email;

     Account(String username,String password,String email){
         this.username=username;
         this.password=password;
         this.email=email;
     }

     void changePassword (String newPass){
         this.password=newPass;
         System.out.print("Da doi mat khau \n");
     }
     void displayInfor(){
         System.out.printf("%s,%s",username,email);
     }
 }
public class bai2 {
    public static void main(String []args){
 Account ac1=new Account("Tuan","123","tuan123@gmail.com");
 ac1.changePassword("doanhtuan70@");
 ac1.displayInfor();
    }
}
