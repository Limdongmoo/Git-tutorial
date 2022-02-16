class Point1 implements Cloneable{
    private int xpos;
    private int ypos;

    public Point1(int x,int y){
        xpos =x;
        ypos =y;
    }

    public void showPosition(){
        System.out.println(xpos + ","+ypos);
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
public class InstanceCloning {
    public static void main(String[] args){
        Point1 org = new Point1(3,5);
        Point1 cpy;
        try{
            cpy=(Point1)org.clone();
            org.showPosition();
            cpy.showPosition();

        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
