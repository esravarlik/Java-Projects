package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(6);
        System.out.println("Your password is: " + this.getPassword());

        email = (firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".company.com");
        System.out.println("Your email: " + email);
    }

    private String setDepartment(){
        System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        System.out.println("\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){
            return "sales";
        }else if (depChoice == 2){
            return "dev";
        }else if(depChoice == 3){
            return "acct";
        }
        return null;
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUVYZ0123456789";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return ("Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailBoxCapacity);
    }
}
