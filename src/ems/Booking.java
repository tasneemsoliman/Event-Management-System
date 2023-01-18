package ems;

import java.util.*;
import java.io.*;
import static java.lang.Integer.parseInt;
import javax.swing.table.DefaultTableModel;

public class Booking extends User{

    protected int no_of_guests;
    protected String location;
    protected String startDate;
    protected double duration;
    protected int ID;
    protected String status;
    protected String eventType;              //        = {"Entertainment", "Wedding" , "Work"};
    private int temp;
    private int currentUser;
    private String customerType;

    //we need to send the customer ID with the booking details to the file.

    public Booking() {
        customerType=User.userType;
        ArrayList<String> loginUser=new ArrayList<>();
        try {
            FileReader fr=new FileReader("User.txt");
            BufferedReader br=new BufferedReader(fr);
            String st;
            while ((st = br.readLine()) != null)
            {
                String[] credentials = st.split(" ");
                for (String credential : credentials) {
                    loginUser.add(credential);
                }
            }
            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
                currentUser= (User.ID);
    }
    
    

    public void NewBooking(String eventType, int no_of_guests, String location /*venue Name*/, String SDate, double duration) throws IOException {
        ID = super.countLinesOld("Bookings.txt") + 1;
        this.eventType = eventType;
        this.no_of_guests = no_of_guests;
        this.location = location;
        this.duration = duration;
        this.startDate = SDate;
        
        
        ArrayList<String> loginUser=new ArrayList<>();
        try {
            FileReader fr=new FileReader("User.txt");
            BufferedReader br=new BufferedReader(fr);
            String st;
            while ((st = br.readLine()) != null)
            {
                String[] credentials = st.split(" ");
                for (String credential : credentials) {
                    loginUser.add(credential);
                }
            }
            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
       
        ArrayList<String> newBooking = new ArrayList<String>();

        //String regName = JOptionPane.showInputDialog(null, "Enter User Name:");
        //String regPass = JOptionPane.showInputDialog(null, "Enter User Password:");
        currentUser= User.ID;
        //loginUser.get(loginUser.size()-5)
        newBooking.add( User.firstName+ " " +User.ID+" " +this.eventType + " " + this.location  + this.startDate + " " + this.duration + " " + this.no_of_guests + " " + ID);

        for (int i = 0; i < newBooking.size(); i++) {
            try {
                FileWriter writer = new FileWriter("Bookings.txt", true);
                PrintWriter pw = new PrintWriter(writer);
                pw.println(newBooking.get(i));
                pw.close();
                writer.close();
                System.out.println("agmd new booking added 5las");

            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
//    JOptionPane.showMessageDialog(null, "User registered successfully");
    }

    public void BookingHistory(DefaultTableModel model){
        ArrayList<String> booking=new ArrayList<>();
        //String name = JOptionPane.showInputDialog(null, "Enter User Name:");
        //String password = JOptionPane.showInputDialog(null, "Enter User Password:");
        try { 
            FileReader fr=new FileReader("Bookings.txt");
            BufferedReader br=new BufferedReader(fr);
            String st;
            while ((st = br.readLine()) != null)
            {
                String[] credentials = st.split(" ");
                for (String credential : credentials) {
                    booking.add(credential);
                }
            }
            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
              
        
        for (int i = 0,j=0;((i + 7) < booking.size()); i += 8,j+=2) {
            int id =parseInt( booking.get(i+1));
            String name=booking.get(i);
            String date=booking.get(i+4);
            String venue = booking.get(i+3);
            String duration=booking.get(i+5);
            String guests=booking.get(i+6);
            String EType = booking.get(i + 2);
            if("Customer".equals(customerType)){
                if (id==currentUser ) {
                  model.addRow(new Object[] {venue,EType});
               } 
            }
            else if ("Admin".equals(customerType) ){
                model.addRow(new Object[] {name,venue,EType,date});

            }
            else if ("ProjectManager".equals(customerType) ){
                if(Admin.flag){
                  model.addRow(new Object[] {name,venue,EType,date});
                }
                else if(ServiceProvider.flag){
                    
                    model.addRow(new Object[] {name,venue,EType,duration,ServiceProvider.bill.get(j),ServiceProvider.bill.get(j+1)});
                    if ((j+1) < ServiceProvider.bill.size())
                        break;
     
                   
                    System.out.println(ServiceProvider.bill.get(j));

                }

            }
            else if ("ServiceProvider".equals(customerType) ){
                if(ProjectManager.flag){
                  model.addRow(new Object[] {venue,EType,date,duration});
                }

            }
        }
    }

    public int getNo_of_guests() {
        return no_of_guests;
    }

    public String getLocation() {
        return location;
    }

    public String getStartDate() {
        return startDate;
    }

    public double getDuration() {
        return duration;
    }

//    public static int getID() {
//        return ID;
//    }
    public String getStatus() {
        return status;
    }

    public String getEventType() {
        return eventType;
    }
    public void showBill(double bill){ // we need to use this function in the PM maodule as he will send the bill as a parameter
        System.out.println("Your Reservation Bill is: "+ bill);
        //TextBoxName.setText("Your Reservation Bill is: " + bill);   The gui code 
    }
    public void contactPM(User PM){
        System.out.println("You can contact the Project Manager: "+PM.firstName + " "+PM.lastName + PM.contactNum);
        //TextBoxName.setText("You can contact the Project Manager: " + PM.firstName + " "+PM.lastName + PM.contactNum);   The gui code 
    }
    public void bookingHistory(){
        
    }
}
