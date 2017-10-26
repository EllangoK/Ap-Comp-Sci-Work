public class RightRectPrism
{
  private int length;
  private int width;
  private int depth;
  
  public void setLength(int len)
  {
    length = len;
  }
  public void setWidth(int wid)
  {
    width = wid;
  }
  public void setDepth(int dep)
  {
    depth = dep;
  }
  public int getLength()
  {
    return length;
  }
  public int getWidth()
  {
    return width;
  }
  public int getDepth()
  {
    return depth;
  }
  public int getVolume()
  {
   return getDepth() * getWidth() * getLength();
  }
  public int getSA()
  {
   return 2*(getDepth()*getWidth() + getLength()*getWidth() + getDepth()*getLength());
  }
}