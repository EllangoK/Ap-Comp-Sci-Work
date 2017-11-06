import java.awt.Image;
import java.awt.Graphics;

public class Coin
{
private Image heads;
private Image tails;
private int side = 1;

public Coin(Image h, Image t)
{
    heads = h;
    tails = t;
}

//flips the coin
public void flip()
{
    if (side == 1)
        side = 0;
    else
        side = 1;
}

//draws the appropriate side of the coin - centered  in the JFrame
public void draw(Graphics g, int x, int y)
{
  if (side == 1) {
    g.drawImage(heads, heads.getWidth(null)/3, heads.getHeight(null)/3, null);
} else {
    g.drawImage(tails, tails.getWidth(null)/3, tails.getHeight(null)/3, null);
}
}
}
