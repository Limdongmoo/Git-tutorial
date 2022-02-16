public class UseWrapperClass {
    public static void showData(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args){
        Integer intInst = new Integer(3);
        intInst=intInst.intValue();
        System.out.println(intInst);
    }
}

