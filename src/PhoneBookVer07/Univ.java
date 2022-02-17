package PhoneBookVer07;

public class Univ extends PhoneInfo{
    private String major;
    public Univ(String name, String pNum, String major){
        super(name,pNum);
        this.major = major;
    }
    public void show(){
        super.show();
        System.out.println("전공 : " +major);
    }
}

