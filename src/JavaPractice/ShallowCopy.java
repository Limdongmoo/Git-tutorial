class Point2 implements Cloneable{
    private int xpos;
    private int ypos;

    public Point2 (int x,int y){
        xpos =x;
        ypos =y;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void changePoint(int x,int y){
        xpos =x;
        ypos =y;
    }

    public void showPosition(){
        System.out.println(xpos + ","+ ypos);
    }
}

class Rectangle1 implements Cloneable{
    private Point2 rightlower;
    private Point2 leftupper;

    public Rectangle1(int x1, int y1, int x2, int y2){
        rightlower = new Point2(x1,y1);
        leftupper = new Point2(x2,y2);
    }

    public void showPosition(){
        System.out.println("우하단 ");
        rightlower.showPosition();
        System.out.println("좌상단 ");
        leftupper.showPosition();
    }

    public void changePosition(int x1,int y1, int x2,int y2){
        rightlower.changePoint(x1,y1);
        leftupper.changePoint(x2,y2);
    }

    public Object clone() throws CloneNotSupportedException{
        super.clone();
        Rectangle1 copy= (Rectangle1)super.clone();
        copy.rightlower = (Point2)rightlower.clone();
        copy.leftupper = (Point2)leftupper.clone();
        return copy;

    }
}
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Rectangle1 org = new Rectangle1(1,1,9,9);
        Rectangle1 cpy;

        cpy=(Rectangle1)org.clone();
        org.changePosition(2,2,7,7);
        org.showPosition();
        cpy.showPosition();
    }
}
