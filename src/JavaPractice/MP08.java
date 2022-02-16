import java.math.*;

class Shape{
    protected double width;
    protected double perimeter;

    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
    public String toString(){
        return "shape";
    }
}

class Point3{
    int x;
    int y;

    public Point3(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public String toString(){
        return "["+getX()+ " , "+getY()+" ]";
    }
}

class Rectangle_width extends Shape{
    Point3 p1;
    Point3 p2;
    public Rectangle_width(int x1,int y1,int x2,int y2){
        p1=new Point3(x1,y1);
        p2=new Point3(x2,y2);
        width = Math.abs(x2-x1)*Math.abs(y2-y1);
        perimeter = 2*(Math.abs(x2-x1)+Math.abs(y2-y1));
    }

    public Rectangle_width(Point3 p1,Point3 p2){
        this.p1=p1;
        this.p2=p2;
        width = Math.abs(p1.x-p2.x)*Math.abs(p1.y-p2.y);
        perimeter = 2*(Math.abs(p1.x-p2.x)+Math.abs(p1.y-p2.y));
    }
    public double getArea(){
        return width;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public String toString(){
        return "Rectangle... "+'\n'+ "p1 : " + p1 + '\n'+ "p2 : " + p2;
    }

}

class Circle_width extends Shape{
    static double PI = 3.141592;
    Point3 center;
    int radius;

    public Circle_width(int x,int y, int r){
        center = new Point3(x,y);

        width = PI * radius * radius;
        perimeter = 2 * PI * radius;
    }

    public Circle_width(Point3 p1, int r){
        center = p1;

        width = PI * radius * radius;
        perimeter = 2 * PI * radius;
    }


    public double getArea(){
        return width;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public String toString(){
        return "Circle ..." + '\n' + "center : " + center + '\n' + "radius : " + radius;
    }


}

public class MP08 {
    public static void main(String[] args){
        Shape[] shapes = new Shape[4];
        shapes[0]=new Rectangle_width(20,30,50,50);
        shapes[1]=new Circle_width(30,30,20);
        shapes[2]=new Rectangle_width(new Point3(20,30),new Point3(50,50));
        shapes[3]=new Circle_width(new Point3(30,30),20);

        for(int i=0;i<4;i++){
            System.out.println(shapes[i]);
            System.out.printf("넓이 : %.2f\n" ,shapes[i].getArea());
            System.out.printf("둘레 : %.2f\n" ,shapes[i].getPerimeter());
            System.out.println("");
        }
    }
}
