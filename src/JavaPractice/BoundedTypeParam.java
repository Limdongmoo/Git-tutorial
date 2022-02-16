package JavaPractice;
interface SimpleInterface{
    void showYourName();
}

class UpperClass {
    public static void showYourAncestor(){
        System.out.println("UpperClass");
    }
}

class AAAA extends UpperClass implements SimpleInterface{
    public void showYourName(){
        System.out.println("AAAA CLass");
    }
}
class BBBB extends UpperClass implements SimpleInterface{
    public void showYourName(){
        System.out.println("BBBB Class");
    }
}

public class BoundedTypeParam{
    public static <T> void showImplementsInst(T param){
        ((SimpleInterface)param).showYourName();
    }

    public static<T> void showUpper(T param){
        ((UpperClass)param).showYourAncestor();
    }

    public static void main(String[] args){
        AAAA aaaa = new AAAA();
        BBBB bbbb = new BBBB();

        showImplementsInst(aaaa);
        showImplementsInst(bbbb);
        showUpper(aaaa);
        showUpper(bbbb);
    }
}
