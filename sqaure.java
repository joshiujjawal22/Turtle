import packageofturtle.*;
public class sqaure
{
    public static void main(String[] args) 
    {
    
    Turtle sqaure = new Turtle();
        for(int i=0;i<360;i++)
        {       
            sqaure.forward(120);
            sqaure.right(90);
            sqaure.bgcolor("darkorchid");
        }
    }
}