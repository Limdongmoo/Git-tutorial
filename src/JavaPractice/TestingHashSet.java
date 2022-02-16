package JavaPractice;
import java.util.HashSet;
import java.util.Iterator;

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+"(" + age + "세 )";
    }


    public boolean equals(Object obj){
        Person comp = (Person) obj;
        if(comp.age==age){
            if(comp.name.equals(name)){
                return true;
            }
            return false;
        }
        return false;
    }
    public int hashCode(){
        return age%3;
    }


}
public class TestingHashSet {
    public static void main(String[] args){
        HashSet<Person> set = new HashSet<Person>();
        set.add(new Person("이진호",10));
        set.add(new Person("이진호",20));
        set.add(new Person("김명호",20));
        set.add(new Person("김명호",15));
        set.add(new Person("이진호",20));
        set.add(new Person("김명호",20));

        System.out.println("저장된 데이터 수 : "+ set.size());

        Iterator<Person> itr = set.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());
        }
    }
}
