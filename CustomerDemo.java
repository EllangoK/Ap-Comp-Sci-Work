import java.util.Scanner;

public class CustomerDemo
{
 public static void main(String[] args)
 {
  String name;
  String address;
  String phonenumber;
  String customernumber;
  boolean onlist = false;
  String letter;
  
  Scanner kb = new Scanner(System.in);
  
  System.out.println("Name: ");
  name = kb.nextLine();
  
  System.out.println("Address: ");
  address = kb.nextLine();
  
  System.out.println("Phonenumber: ");
  phonenumber = kb.nextLine();
  
  System.out.println("IdNumber: ");
  customernumber = kb.nextLine();
  
  System.out.println("Would you like to be on the mailing list? y/n: ");
  letter = kb.nextLine();
  
  if(letter.equalsIgnoreCase("Y"))
  {
   onlist = true;
  }
  else
  {
   onlist = false;
  }  
  
  Customer cm = new Customer(customernumber, onlist, name, phonenumber, address);
  
  System.out.println("Here is some information about the customer.");
  
  System.out.println("Name: " + cm.getName());
  System.out.println("Address: " + cm.getAddress());
  System.out.println("Phone Number: " + cm.getNumber());
  System.out.println("IdNumber: " + cm.getIdNumber());
  System.out.println("Would you like to be on the mailing list: " + cm.getToBeOnList());
 }
}