public class Person {
 private String name;
 private String address;
 private String phonenumber;
 
 public Person() {}
 public Person(String name, String address, String phonenumber) {
  this.name = name;
  this.address = address;
  this.phonenumber = phonenumber;
 }
 public void setName(String name) {
  this.name = name;
 }
 public void setAddress(String address) {
  this.address = address;
 }
 public void setNumber(String phonenumber) {
  this.phonenumber = phonenumber;
 }
 public String getName() {
  return name;
 }
 public String getAddress() {
  return address;
 }
 public String getNumber() {
  return phonenumber;
 }
}