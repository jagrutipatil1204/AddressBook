package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactImplem implements ContactOperation{

    ArrayList<Contact>contact=new ArrayList<>();

    @Override
    public void add() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Contact details of person :: ");
        System.out.println("Enter Firstname :: ");
        String firstname=sc.nextLine();
        System.out.println("Enter Lastname :: ");
        String lastname=sc.nextLine();
        System.out.println("Enter Address:: ");
        String address=sc.nextLine();
        System.out.println("Enter City :: ");
        String city=sc.nextLine();
        System.out.println("Enter State :: ");
        String state=sc.nextLine();
        System.out.println("Enter Zip :: ");
        long z=sc.nextLong();
        System.out.println("Enter Mobile Number ::");
        long no=sc.nextLong();
        sc.nextLine();
        Contact details=new Contact(firstname,lastname,address,city,state,z,no);
        contact.add(details);
    }
}

