class IntWrapper{
    private int num;

    public IntWrapper(int num){
        this.num = num;
    }

    public String toString(){
        return ""+num;
    }
}

public class WrappingInteger {
    public static void showData(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        IntWrapper intInst = new IntWrapper(10);
        showData(intInst);
        showData(new IntWrapper(20));
    }
}
