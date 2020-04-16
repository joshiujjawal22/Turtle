import packageofturtle.*;
public class triangle
{
    public static void main(String[] args) 
    {
    
	Turtle triangle = new Turtle();
        for(int i=0;i<360;i++)
        {		
            triangle.forward(60);
            triangle.right(120);
            triangle.bgcolor("darkorchid");
        }
    }
}