package JavaPractice;

class Box<T>{
    public Box<T> nextBox;
    T item;
    public void store(T item){
        this.item = item;
    }
    public T pullOut(){
        return item;
    }
}

public class SoSimpleLinked {
    public static void main(String[] args){
        Box<String> boxHead = new Box<String>();
        boxHead.store("FirstString");

        boxHead.nextBox = new Box<String>();
        boxHead.nextBox.store("SecondString");

        boxHead.nextBox.nextBox = new Box<String>();
        boxHead.nextBox.nextBox.store("ThirdString");

        Box<String> tempRef;

        tempRef = boxHead.nextBox;
        System.out.println(tempRef.pullOut());

        tempRef=boxHead.nextBox;
        tempRef=tempRef.nextBox;
        System.out.println(tempRef.pullOut());

    }
}
