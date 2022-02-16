package JavaPractice;

public class AAA {
    public String toString(){
        return "Class AAA";
    }
}

class BBB{
    public String toString(){
        return "Class BBB";
    }
}

class InstanceTypeShower {
    int showCnt = 0;

    public <T, U> void showInstType(T inst1, U inst2) {
        System.out.println(inst1);
        System.out.println(inst2);
        showCnt++;
    }

    void showPrintCnt() {
        System.out.println("Cnt : " + showCnt);
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        InstanceTypeShower ins = new InstanceTypeShower();

        ins.showInstType(aaa, bbb);
        ins.<AAA,BBB>showInstType(aaa,bbb);
    }
}

