import packageofturtle.*;
public class circle
{
    public static void main(String[] args) 
    {
    
	Turtle circ = new Turtle();
        for(int i=0;i<1000;i++)
        {		
            circ.forward(10);
            circ.left(10);
            circ.bgcolor("blue");
            circ.speed(5);
            circ.fillColor("red");

        }
        // Either you can make direct circle using below syntax;


        // circ.shape("circle");
        // circ.shapeSize(100,100);
    }
}