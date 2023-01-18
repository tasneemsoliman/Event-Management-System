package ems;
import java.io.*;
import java.util.*;

public class Customer_Module {
    public static void main(String[] args) throws IOException {
         
       Booking b1=new Booking();
//        Booking b2=new Booking();
         Date d=new Date();
//        b1.NewBooking("Wedding", 100, "Maadi",d, 5);
       //User.signUP("yomna", "Mohamed", "01158691073", "1234m", "mennashams02@gmail.com", "Customer");

        //b1.NewBooking("Work", 100, "Maadi",d, 6);

       
      // User.signUP("mariam", "mohamed", "01001234567", "5678m", "mariam123@gmail.com", "ServiceProvider");
       

              User.signIN("ahmedeid123@gmail.com", "5678a");

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
      // User.signUP("Tasneem", "Soliman", "01006080448", "1278t", "tasneemsoliman70@gmail.com", "ProjectManager");
       //Customer c1= new Customer();

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //when button register is clicked:
//        Customer c1 = new Customer();
//        Customer c2 = new Customer();
//        Customer c3 = new Customer();
        
//        Scanner input= new Scanner(System.in);
//       String email= input.nextLine();
//       String pass= input.nextLine();
//        User u1 = new User(email,pass);
//        u1.signUP()
//        User u2= new User(email,pass);
//        //System.out.println(u1.email);
//        //System.out.println(u1.password);
//       // u1.
//       
//       
//       // File creation:
//       try {
//      File test = new File("test.txt");
//      if (test.createNewFile()) {
//        System.out.println("File created: " + test.getName());
//      } else {
//        System.out.println("File already exists.");
//      }
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//
//
//// write into a file:
//try {
//      FileWriter test = new FileWriter("test.txt");
//      test.write(email+" " +pass);
//      System.out.println("Successfully wrote to the file.");
//      test.close();
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//
//    // read from a file:
//    try {
//        File test = new File("test.txt");
//      Scanner myReader = new Scanner(test);
//      while (myReader.hasNextLine()) {
//        String data = myReader.nextLine();
//        System.out.println(data);
//      }
//      myReader.close();
//    } catch (FileNotFoundException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//     ArrayList<User> users= new ArrayList<>();
//     
//     users.add(u1);  
//     
//     //wirte an arrayList<object> in a file:
//
//    try{
//    FileOutputStream writeData = new FileOutputStream("test.txt");
//    ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
//
//    writeStream.writeObject(users);
//    writeStream.flush();
//    writeStream.close();
//    System.out.println("the text added successfully!");
//}catch (IOException e) {
//    e.printStackTrace();
//}
//    //read an arrayList<object> from a file
//    try{
//    FileInputStream readData = new FileInputStream("test.txt");
//    ObjectInputStream readStream = new ObjectInputStream(readData);
//
//    ArrayList users1 = (ArrayList<User>) readStream.readObject();
//    readStream.close();
//    System.out.println(users1.toString());
//}catch (Exception e) {
//    e.printStackTrace();
//}
    
    }
    
}
