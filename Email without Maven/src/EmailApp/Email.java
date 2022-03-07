package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 10000;
    private int defaultPasswordLength;
    private String alternateEmail;
    private String companySuffix = ".CConsulting.com";
    private String email;

    //constructor to receive first and last name
    public Email (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

        // call method asking for department that returns the department
        this.department = setDepartment(); //setting the department to the input from method below


        //call a method that returns a random password
        this.password = randomPassword(8);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
    }
    //ask for department
    private String setDepartment(){
        System.out.print("WElCOME! "  + firstName + " " + lastName +  "\n" +"Please Enter a Department Code" + "\n" + "1 - Sales" + "\n" + "2 - Development" + "\n" + "3 - Accounting" + "\n" + "0 - None" + "\n" + "Please Enter a Department Code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){
            return "sales";
        }
        else if (deptChoice ==2) {
            return "development";
        }
        else if(deptChoice == 3){
            return "accounting";

        }
        else return "";
    }
    //generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&"; //look at this as an array and pull randomly
        char[] password = new char[length];
        for (int i=0;i< length;i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }
    //set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;

}
    //set alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
}
    //change password
    public void changePassword(String password){
        this.password=password;
    }
    public int getMailboxCapacity() { //public methods that access the variables
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName + "\n" + "Company Email: " + email + "\n" + "Mailbox Capacity: " +
                mailboxCapacity + "\n" + "Alternate Email: " + alternateEmail;
    }

}
