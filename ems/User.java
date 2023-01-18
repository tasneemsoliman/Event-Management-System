package ems;

import java.io.*;
import static java.lang.Integer.parseInt;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.activation.*;
import javax.swing.JOptionPane;

public abstract class User implements Serializable{
    protected static String firstName;
    protected static String lastName;
    protected static String contactNum;
    protected static String password;
    protected static String email;
    protected static int ID;
    protected static String userType;      // whether customer, PM, SP, or admin
   
    
    //+signUp()
    //+signIn()
    //+signOut()
        
    public static void signUP(String firstName, String lastName, String contactNum, String password, String email, String userType) throws IOException{
        User.ID = countLinesOld("User.txt") + 1;
        User.firstName = firstName;
        User.lastName = lastName;
        User.contactNum = contactNum;
        User.password = password;
        User.email = email;
        User.userType = userType;
        ArrayList<String> regUser = new ArrayList<String>();

        //String regName = JOptionPane.showInputDialog(null, "Enter User Name:");
        //String regPass = JOptionPane.showInputDialog(null, "Enter User Password:");

        regUser.add(User.email+" "+User.password+" "+User.firstName+" "+User.lastName+" "+User.contactNum+" "+User.userType+ " " + User.ID);

        
        for (int i = 0; i < regUser.size(); i++) {
        try {
            FileWriter writer = new FileWriter("User.txt", true);
            PrintWriter pw = new PrintWriter(writer);
            pw.println(regUser.get(i));
            pw.close();
            writer.close();
            System.out.println("you added the data a'5eran");
            sendEmail(User.email, User.ID, User.password, User.firstName); // to send the confirmation mail once he signed up.

        } catch (IOException e) {
            System.out.println("File not found");
            }
        }
//    JOptionPane.showMessageDialog(null, "User registered successfully");
    }
    
    public static int countLinesOld(String filename) throws IOException {   //function to generate the ID
        InputStream is = new BufferedInputStream(new FileInputStream(filename));
        try {
            byte[] c = new byte[1024];
            int count = 0;
            int readChars = 0;
            boolean empty = true;
            while ((readChars = is.read(c)) != -1) {
                empty = false;
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        ++count;
                    }
                }
            }
            return (count == 0 && !empty) ? 1 : count;
        } finally {
            is.close();
        }
        
    }
    public static void signIN(String email, String password){
         boolean flag=false;
        //this.password = password;
        //this.email = email;
        
        ArrayList<String> loginUser=new ArrayList<>();
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
              

        for (int i = 0; (i + 6) < loginUser.size(); i += 7) {
            String e_mail = loginUser.get(i);
            String pass = loginUser.get(i + 1);
            User.firstName=loginUser.get(i+2);
            User.userType=loginUser.get(i+5);
            User.ID=parseInt(loginUser.get(i+6));
            if (e_mail.equals(email) && pass.equals(password)) {
                flag=true;
                break;
                //JOptionPane.showMessageDialog(null, "Welcome to Rent A Car ");
                //return;
            }
            
        }
        if (flag){
                //System.out.println("3aash");
                if ("Customer".equalsIgnoreCase(User.userType)){
                    CustomerHome s = new CustomerHome();
                    s.show();
                }
                else if ("ProjectManager".equalsIgnoreCase(User.userType)){
                         ProjectManagerRecieved p = new ProjectManagerRecieved();
                         p.show();
                        }
                else if ("ServiceProvider".equalsIgnoreCase(User.userType)){
                        ServiceProviderHome s = new ServiceProviderHome();
                        s.show();
                        }
                else if ("Admin".equalsIgnoreCase(User.userType)){
                        AdminHome a = new AdminHome();
                        a.show();
                        }
        }
            else
                //System.out.println("Invalid email or password!");
        JOptionPane.showMessageDialog(null, "Wrong login info please try again");
    } 
    public static void sendEmail(String email, int id, String pass, String FirstName) throws IOException{
	final String username = "eventmanagmentsystem8@gmail.com";
        final String password = "123456@event";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tebbeni96@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject("Welcome to our Event Management System! :)");
            message.setText("Welcome, "+FirstName
                    + "\n\nYour ID is: "+id+"\n\nYou can login through these credentials,\n\n"+"Email: "+email+"\nPassword: "+pass);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    }
