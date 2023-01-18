package ems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public final class Admin extends Booking{
     protected static boolean flag;
    public void User(DefaultTableModel model){
        ArrayList<String> user =new ArrayList<>();
        //String name = JOptionPane.showInputDialog(null, "Enter User Name:");
        //String password = JOptionPane.showInputDialog(null, "Enter User Password:");
        try {
            FileReader fr=new FileReader("User.txt");
            BufferedReader br=new BufferedReader(fr);
            String st;
            while ((st = br.readLine()) != null)
            {
                String[] credentials = st.split(" ");
                for (String credential : credentials) {
                    user.add(credential);
                }
            }
            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        } 

        for (int i = 0; (i + 6) < user.size(); i += 7) {
            String email= user.get(i);
            String pass= user.get(i+1);
            String Fname= user.get(i+2);
            String Lname= user.get(i+3);
            String Phone= user.get(i+4);
            String usertype= user.get(i+5);
            String ID = user.get(i+6);
           model.addRow(new Object[] {email,Fname,Lname,Phone,usertype,ID});
        }
        
    }
    
    
    public void fromAdmintoPM(){ 
       
            

    }
    public void addUser(){
        //User.signUP(JOptionPane.showInputDialog(null, "User's First Name"), JOptionPane.showInputDialog(null, "User's Last Name"), JOptionPane.showInputDialog(null, "User's Contact Number"), JOptionPane.showInputDialog(null, "User's Password"), JOptionPane.showInputDialog(null, "User's email"), JOptionPane.showInputDialog(null, "User's Role"));
    }
    public void updateUser(){
            
    }
//    public void deleteUser(){
//        
//    }
//
//    try {
//
//      File inFile = new File("User.txt");
//
//      if (!inFile.isFile()) {
//        System.out.println("Parameter is not an existing file");
//        return;
//      }
//
//      //Construct the new file that will later be renamed to the original filename.
//      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
//
//      BufferedReader br = new BufferedReader(new FileReader("User.txt"));
//      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
//
//      String line = null;
//
//      //Read from the original file and write to the new
//      //unless content matches data to be removed.
//      while ((line = br.readLine()) != null) {
//
//        if (!line.trim().equals(lineToRemove)) {
//
//          pw.println(line);
//          pw.flush();
//        }
//      }
//      pw.close();
//      br.close();
//
//      //Delete the original file
//      if (!inFile.delete()) {
//        System.out.println("Could not delete file");
//        return;
//      }
//
//      //Rename the new file to the filename the original file had.
//      if (!tempFile.renameTo(inFile))
//        System.out.println("Could not rename file");
//
//    }
//    catch (FileNotFoundException ex) {
//      ex.printStackTrace();
//    }
//    catch (IOException ex) {
//      ex.printStackTrace();
//    }
// 
 public void sendData (boolean flag){
            this.flag= flag;
        }
        
    public void removeLineFromFile(String ID_to_be_removed) {
        
        ArrayList<String> Find_id_to_remove = new ArrayList<>();
    try {
            FileReader fr=new FileReader("User.txt");
            BufferedReader br=new BufferedReader(fr);
            String st;
            while ((st = br.readLine()) != null)
            {
                String[] segments = st.split(" ");
                for (String segment : segments) {
                    Find_id_to_remove.add(segment);
                }
            }
            br.close();
            fr.close();
        }
    catch(IOException e)
        {
            System.out.println("File not found");
        }    
    for (int i = 0; (i + 6) < Find_id_to_remove.size(); i += 7) {
            String ID = Find_id_to_remove.get(i+6);
            
          if (ID.equals(ID_to_be_removed)) {
              String lineToRemove = Find_id_to_remove.get(i)+" "+Find_id_to_remove.get(i+1)+" "+Find_id_to_remove.get(i+2)+" "+Find_id_to_remove.get(i+3)+" "+Find_id_to_remove.get(i+4)
                      +" "+Find_id_to_remove.get(i+5)+" "+Find_id_to_remove.get(i+6);
              System.out.println(lineToRemove);
              try {
              File inFile = new File("User.txt");

              if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
              }

              //Construct the new file that will later be renamed to the original filename.
              File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

              BufferedReader br = new BufferedReader(new FileReader("User.txt"));
              PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

              String line = null;

              //Read from the original file and write to the new
              //unless content matches data to be removed.
              while ((line = br.readLine()) != null) {

                if (!line.trim().equals(lineToRemove)) {

                  pw.println(line);
                  pw.flush();
                }
              }
              pw.close();
              br.close();

              //Delete the original file
              if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
              }

              //Rename the new file to the filename the original file had.
              if (!tempFile.renameTo(inFile))
                System.out.println("Could not rename file");

            }
            catch (FileNotFoundException ex) {
              ex.printStackTrace();
            }
            catch (IOException ex) {
              ex.printStackTrace();
            }
          }
            } 
        }    
}  

