package PhoneBookVer07;

public class PhoneInfo {
    String name;
    private String pNum;

    public PhoneInfo(String name,String pNum){
        this.name = name;
        this.pNum = pNum;
    }

    public void show(){
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " +pNum);
    }

    public int hashCode(){
        return name.hashCode();
    }

    public boolean equals(Object obj){
        PhoneInfo p =(PhoneInfo) obj;
        if(p.name.equals(name)){
            return true;
        }
        return false;
    }
}

