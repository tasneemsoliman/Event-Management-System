
package ems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public final class ServiceProvider extends User{
       protected static ArrayList<String> bill = new ArrayList<String>();
    protected static String readyDate;
    protected static String Bill;
    protected static boolean flag=false;
    
    public void viewRequests(){ // will display all the booking file 
        try {
        File test = new File("Bookings.txt");
      Scanner myReader = new Scanner(test);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        //TextBoxName.setText(data);   The gui code 
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }   
    }
    public static void setPriceandReadyDate(String b,String r, int id){
        
       

        //loginUser.get(loginUser.size()-5)
        bill.add(b+" "+r);

        for (int i = 0; i < bill.size(); i++) {
            try {
                FileWriter writer = new FileWriter("Bill_readyDate.txt", true);
                PrintWriter pw = new PrintWriter(writer);
                pw.println(bill.get(i));
                pw.close();
                writer.close();
                //System.out.println("agmd new booking added 5las");

            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
        for (int i = 0; (i + 2) < bill.size(); i += 3) {
            ServiceProvider.Bill = bill.get(i+1);
            ServiceProvider.readyDate=bill.get(i+2);
        
            
//    JOptionPane.showMessageDialog(null, "User registered successfully");
        }
    }
    public String readyDate(){
// readyDate=JOptionPane.showInputDialog(null, "set the ready date of this request"); gui
        return readyDate;
    }
    
    public static void sendData(boolean flag){
        ServiceProvider.flag=flag;
    }
    
    
    
    
}

    /*+
+viewRequests()
+priceValue(PM.Request) (return bill to PM)
+readyDate(PM.Request)(return to PM)
*/
