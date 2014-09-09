import java.awt.Color;

public class TurtleLab
{
    public static void main(String args[])
    {
        World turtleworld = new World();
        Turtle turtle = new Turtle(turtleworld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        turtle.backward(25);
        turtle.turnRight();
        turtle.forward(25);
        turtle.turnRight();
        turtle.setBodyColor(Color.BLUE);
        turtle.forward(25);
        turtle.turn(180);
        turtle.forward(50);
        turtle.penUp();
        turtle.turnRight();
        turtle.forward(10);
        turtle.turnRight();
        turtle.penDown();
        turtle.forward(5);
        turtle.penUp();
        turtle.forward(10);
        turtle.penDown();
        turtle.forward(35);
        turtle.setShellColor(Color.GRAY);
        Turtle turtle2 = new Turtle(turtleworld);
        turtle.hide();
        turtle2.hide();
        
    }
}