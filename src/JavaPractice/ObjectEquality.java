class IntNum{
    private int num;
    public IntNum(int n){
        num=n;
    }
    public boolean isEquals(IntNum numobj){
        if(this.num==numobj.num){
            return true;
        }
        else{
            return false;
        }
    }
}
public class ObjectEquality {
    public static void main(String[] args){
        IntNum num1 = new IntNum(10);
        IntNum num2 = new IntNum(20);
        IntNum num3 = new IntNum(10);

        if(num1.isEquals(num2)){
            System.out.println("num1 과 num2 는 동일한 정수");
        }
        else{
            System.out.println("다른 정수");
        }

        if (num1.isEquals(num3)) {
            System.out.println("num1 와 num3 는 동일한 정수");
        }
        else{
            System.out.println("다른정수");
        }
    }
}
