package JavaPractice;
import java.util.HashSet;
import java.util.Iterator;

class Num{
    private int num;

    public Num(int num){
        this.num=num;
    }
    public String toString(){
        return String.valueOf(num);
    }
    public int hashCode(){
        return num%3;
    }
    public boolean equals(Object obj){
        Num comp = (Num)obj;
        if(comp.num==num){
            return true;
        }
        return false;
    }
}

public class HashSetEquality {
    public static void main(String[] args){
        HashSet<Num> set = new HashSet<Num>();
        set.add(new Num(10));
        set.add(new Num(20));
        set.add(new Num(20));

        System.out.println("set 의 요소 개수 " + set.size());

        Iterator<Num> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
