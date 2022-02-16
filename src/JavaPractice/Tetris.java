import java.awt.Point;

class ShapeRectangle{
    private Point upLeft;
    private Point downRight;
    static final int height = 50;
    static final int width =50;


    ShapeRectangle(Point UL){
        upLeft = UL;
        downRight = new Point((UL.x)+height,(UL.y)+width);
    }

    ShapeRectangle(Point UL,Point DR){
        upLeft = UL;
        downRight = DR;
    }

    public void translate(int a, int b){
        upLeft.x+=a;
        upLeft.y+=b;
        downRight.x+=a;
        downRight.y+=b;
    }

    public String toString(){
        return "UL = "+ upLeft + "RL = "+ downRight;
    }
}

class Block1{
    ShapeRectangle rec1;
    ShapeRectangle rec2;
    ShapeRectangle rec3;
    ShapeRectangle rec4;
    int x;
    int y;

    public Block1(int x1, int y1){
        this.x = x1;
        this.y = y1;
        rec1 = new ShapeRectangle(new Point(x,y),new Point(x+rec1.width,y+rec1.height));
        rec2 =new ShapeRectangle(new Point(x+ShapeRectangle.width,y), new Point(x+2*ShapeRectangle.width,y+ShapeRectangle.height));
        rec3 =new ShapeRectangle(new Point(x,y+ShapeRectangle.height),new Point(x+ShapeRectangle.width,y+2*ShapeRectangle.height));
        rec4 =new ShapeRectangle(new Point(x+ShapeRectangle.width,y+ShapeRectangle.height),new Point(x+2*ShapeRectangle.width,y+2*ShapeRectangle.height));
    }

    public void translate(int a, int b){
        rec1.translate(a,b);
        rec2.translate(a,b);
        rec3.translate(a,b);
        rec4.translate(a,b);

    }

    public String toString(){
        return rec1.toString()+"\n"+rec2.toString()+"\n"+rec3.toString()+"\n"+rec4.toString();
    }
}

public class Tetris {
    public static void main(String[] args){
        Block1 b = new Block1(10,10);
        ShapeRectangle r1 = new ShapeRectangle(new Point(10,10));
        ShapeRectangle r2 = new ShapeRectangle(new Point(20,20),new Point(70,70));

        System.out.println("r1");
        System.out.println(r1);
        System.out.println("r2");
        System.out.println(r2);
        System.out.println("b");
        System.out.println(b);

        b.translate(10,-10);
        System.out.println("b");
        System.out.println(b);

    }
}
