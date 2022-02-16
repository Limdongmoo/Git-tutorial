package JavaPractice;
class Fruit{
    public void showYou(){
        System.out.println("나는 과일입니다.");
    }
}

class Apple extends Fruit{
    public void showYou(){
        super.showYou();
        System.out.println("나는 사과입니다.");
    }
}

class FruitBox<T>{
    T item;
    public void setFruit(T item){
        this.item = item;
    }
    public T pullOut(){
        return this.item;
    }
}

public class IntroWildcard {
    public static void openAndShowFruitBox(FruitBox<? extends Fruit> box){
        Fruit fruit = box.pullOut();
        fruit.showYou();
    }
    public static void main(String[] args){
        FruitBox<Fruit> box1 = new FruitBox<Fruit>();
        box1.setFruit(new Fruit());

        FruitBox<Fruit> box2 = new FruitBox<Fruit>();
        box2.setFruit(new Apple());

        openAndShowFruitBox(box1);
        openAndShowFruitBox(box2);
    }
}
