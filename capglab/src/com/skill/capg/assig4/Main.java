package com.skill.capg.assig4;
import java.util.Scanner;
class Shape {
    protected String shapeName;
    Shape(String shapeName)
    {
        this.shapeName=shapeName;
    }
     double  calculateArea()
    {

        return 0;
    }

}
class Square extends Shape 
{
    int side;
    Square(int side)
    {
        super("Square");
        this.side=side;
    }
    double  calculateArea()
    {

        return side*side;
    }


}
class Rectangle extends Shape
{
    int length,breadth;
    double  calculateArea()
    {

        return length*breadth;
    }
    Rectangle(int length,int breadth) {
        super("Rectangle");
        this.length=length;
        this.breadth=breadth;
    }
}
class Circle extends Shape
{
    int radius;
    double  calculateArea()
    {

        return 3.14*radius*radius;
    }
    Circle(int radius)
    {
        super("Circle");
        this.radius=radius;
    }
}
class Main
{
    public static void main(String[] args) {
        int i;
        System.out.println("1 Rectangle\n2 Square\n3 Circle");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        if(i==1)
        {
            Shape s1=new Rectangle(10, 20);
            System.out.println(s1.calculateArea());
        }
        else if(i==2)
        {
            Shape s1=new Square(10);
            System.out.println(s1.calculateArea());

        }
        else
        {
            Shape s1=new Circle(10);
            System.out.println(s1.calculateArea());

        }
    }
}