public class Customer extends Person {
 private String customernumber;
 private boolean onlist = true;
 
 public Customer(){}
 
 public Customer(String customernumber, boolean onlist, String name, String phonenumber, String address) {
  super(name, address, phonenumber);
  this.customernumber = customernumber;
  this.onlist = onlist;
 }
 
 public void setIdNumber(String customernumber) {
  this.customernumber = customernumber;
 }
 public void setToBeOnList(boolean onlist) {
  if(onlist) {
   System.out.println("The customer wants to be on the mailing list.");
  }
 }
 public String getIdNumber() {
  return customernumber;
 }
 public boolean getToBeOnList() {
  return onlist;
 }
}