import java.util.Scanner;

class AgeInputException1 extends Exception{
    AgeInputException1(){
        super("적절하지 않은 나이입니다.");
    }
}

class NameInputException extends Exception{
    private String wrongName;
    NameInputException(String name){
        super("적절하지 않은 이름입니다.");
        this.wrongName=name;
    }
    public void showWrongName(){
        System.out.println("잘못 입력된 이름 : "+wrongName);
    }
}

class PersonalInfo{
    private int age;
    private String name;

    PersonalInfo(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void showInfo(){
        System.out.println("나이는 "+ age +"살입니다.");
        System.out.println("이름은 " + name + "입니다.");
    }
}
public class PrintStackTrace {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        try{
            PersonalInfo info = readPersonalInfo();
            info.showInfo();
        }
        catch(NameInputException e){
            System.out.println(e.getMessage());
        }
        catch(AgeInputException1 e){
            System.out.println(e.getMessage());
        }
    }

    public static PersonalInfo readPersonalInfo() throws NameInputException,AgeInputException1{
        String name;
        int age;
        name=readName();
        age=readAge();
        PersonalInfo info = new PersonalInfo(age,name);
        return info;
    }
    public static String readName() throws NameInputException{
        System.out.println("이름을 입력하시오");
        String name = in.nextLine();
        if(name.length()<2){
            throw new NameInputException(name);
        }
        return name;
    }
    public static int readAge() throws AgeInputException1{
        System.out.println("나이를 입력하시오");
        int age=in.nextInt();
        if(age<0){
            throw new AgeInputException1();
        }
        return age;
    }
}
