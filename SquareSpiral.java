import packageofturtle.*;
public class SquareSpiral
{
    public static void main(String[] args) 
    {
    
	Turtle ss = new Turtle();
        for(int i=0;i<4000;i++)
        {		
            ss.forward(i*1.25);
            ss.left(90.25);
            ss.bgcolor("darkorchid");
        }
    }
}