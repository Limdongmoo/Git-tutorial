package PhoneBookVer07;

public class MenuChoiceException extends Exception{
    MenuChoiceException(){
       super("적절하지 않은 메뉴 선택, 다시 선택해주세요");
    }
}
