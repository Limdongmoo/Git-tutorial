package PhoneBookVer07;

public class Company extends PhoneInfo{
    private String job;
    public Company(String name,String pNum,String job){
        super(name,pNum);
        this.job = job;
    }

    public void show(){
        super.show();
        System.out.println("회사 : " +job);
    }
}

