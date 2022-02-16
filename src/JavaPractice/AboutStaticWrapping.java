package JavaPractice;

public class AboutStaticWrapping {
    static int num1;
    public static int numMethod(int num){
        num1=num;
        return num;
    }
    public static void main(String[] args){
        Integer iValue1 = numMethod(5);
        Integer iValue2 = numMethod(6);

        System.out.println(iValue1);
        System.out.println(iValue2);
    }
}
