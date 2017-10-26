public class RectangularPrism
{
  private double length;
  private double width;
  private double depth;
  
  public RectangularPrism (double len, double wid, double dep)
  {
  length = len;
  width = wid;
  depth = dep;
  }
  public double getLength()
  {
    return length;
  }
  public double getWidth()
  {
    return width;
  }
  public double getDepth()
  {
    return depth;
  }
  public double getVolume()
  {
   return getDepth() * getWidth() * getLength();
  }
}