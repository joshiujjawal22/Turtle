import packageofturtle.*;
public class sqaure
{
    public static void main(String[] args) 
    {
    
    Turtle star = new Turtle();
        for(int i=0;i<360;i++)
        {       
            star.forward(60);
            star.right(120);
            star.forward(60);
            star.left(60);
            star.bgcolor("darkorchid");
        }
    }
}