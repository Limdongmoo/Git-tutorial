import java.util.Scanner;

class AgeInputException extends Exception{
    public AgeInputException(){
        super("유효하지 않은 나이입니다.");
    }
}

public class ProgrammerDefineException {
    public static void main(String[] args) throws AgeInputException{
        int age = readAge();
        System.out.println(age);
    }

    public static int readAge() throws AgeInputException {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age<0){
            AgeInputException except = new AgeInputException();
            throw except;
        }
        return age;
    }


}