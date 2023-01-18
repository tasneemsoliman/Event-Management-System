/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public final class ProjectManager extends Booking{
    protected static boolean flag=false;
    public static void sendData (boolean flag){
            ProjectManager.flag= flag;
        }
  
        
        
        
        
        
        
        // TODO code application logic heretry {
////        String customerName = new String ("");
////        int customeContact;
////        int ID;
////        double bill;
////        boolean sendToServiceProvider;
////        boolean status;
////        boolean approveForCustomer;
////
////        //view request
////       try {
////        File test = new File("testfile.txt");
////      Scanner myReader = new Scanner(test);
////      while (myReader.hasNextLine()) {
////        String data = myReader.nextLine();
////        System.out.println(data);
////      }
////      myReader.close();
////    } catch (FileNotFoundException e) {
////      System.out.println("An error occurred.");
////      e.printStackTrace();
////    }
////    }
    
//    +sendToServiceProvider(); (send to file and appears to SP)

//    try {
//      File myObj = new File("sendtoSP.txt");
//      if (myObj.createNewFile()) {
//        System.out.println("File created: " + myObj.getName());
//      } else {
//        System.out.println("File already exists.");
//      }
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//        boolean button = false;
//    //when click send to SP button
//    while(button){
//    try {
//      FileWriter myWriter = new FileWriter("sendtoSP.txt");
//      myWriter.write("sent to the service provider");
//      myWriter.close();
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
    
//+status(); (sent,, approved)
//+approveForCustomer(); (change label for customer)



}