public class Rectangle{
  
    private int length;
    private int width;
    private int cost;
    
  // The setLength method stores a value in the length field
  // This setLength is called a Mutator Method
    
    public void setLength(int Len)
    {
      length = Len;
        
    }
    
    // The setWidth method stores a value in the width field
    // The set Width feld is called a Mutator Method
    public void setWidth(int wid)
    {
      width = wid;
    }
    
    // The getWidth method returns the value of width which is private
    // The getWidth method is called a Accessor Method
    public double getWidth(){
      return width;
    }
    
    // The getLength method returns the value of width which is private
    // The getLength method is called a Accessor Method
    public int getLength(){
      return length;
    }
    
    // The purpose of the getArea method is to return the area of the rectangle
    
    public int getArea()
    {
      return length*width;
    }
    
    public void setCost(int cos)
    {
      cost = cos;
    }
    
    public int getCost()
    {
     return cost; 
    }
    
    public int getTotalCost()
    {
      return getArea() * getCost();
    }
  }