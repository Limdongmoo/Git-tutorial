class Point{
    private int xpos;
    private int ypos;

    public Point(int x,int y){
        xpos =x;
        ypos =y;
    }

    public void showPosition(){
        System.out.println(xpos + "," + ypos);
    }
}

public class Rectangle {
    Point leftupper;
    Point rightlower;

    public Rectangle(int x1, int y1, int x2, int y2){
        leftupper = new Point(x1,y1);
        rightlower = new Point(x2,y2);
    }

    public void showRectangleInfo(){
        System.out.println("좌상단 :");
        leftupper.showPosition();
        System.out.println("우하단 : ");
        rightlower.showPosition();
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle(1,2,3,4);
        Rectangle r2 = new Rectangle(1,2,3,4);

        System.out.println(r1.leftupper);
        System.out.println(r2.leftupper);

    }
}

