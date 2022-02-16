package JavaPractice;
import java.util.TreeSet;
import java.util.Iterator;

class Person1 implements Comparable<Person1>{
    private String name;
    private int age;

    public Person1(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void showData(){
        System.out.printf("이름 : %s   나이 : %d\n",name,age);
    }

    public int compareTo(Person1 p){
        if(age>p.age){
            return 1;
        }
        else if(age<p.age){
            return -1;
        }
        else{
            return 0;
        }
    }
}

public class ComparablePerson {
    public static void main(String[] args){
        TreeSet<Person1> tSet = new TreeSet<Person1>();

        tSet.add(new Person1("Lee", 24));
        tSet.add(new Person1("Hong",29));
        tSet.add(new Person1("choi",21));

        Iterator<Person1> itr = tSet.iterator();

        while(itr.hasNext()){
            itr.next().showData();
        }
    }
}
