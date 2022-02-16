package JavaPractice;
import java.util.Iterator;
import java.util.TreeSet;

class MyString implements Comparable<MyString>{
    private String str;

    public MyString(String str){
        this.str = str;
    }

    public int getStringLength(){
        return str.length();
    }

    public String toString(){
        return str;
    }

    public int compareTo(MyString str){
        if(getStringLength()>str.getStringLength()){
            return 1;
        }
        else if(getStringLength()<str.getStringLength()){
            return -1;
        }
        return 0;
    }

}

public class ComparableMyString {
    public static void main(String[] args){
        TreeSet<MyString> tSet = new TreeSet<MyString>();

        tSet.add(new MyString("dog"));
        tSet.add(new MyString("Individual"));
        tSet.add(new MyString("Apple"));
        tSet.add(new MyString("Orange"));

        System.out.println("저장요소 개수 : "+tSet.size());

        Iterator<MyString> itr = tSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }

}
