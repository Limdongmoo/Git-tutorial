package PhoneBookVer07;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Manager {
    PhoneInfo pInfo;
    HashSet<PhoneInfo> hSet;
    Iterator<PhoneInfo> itr;
    Scanner in = new Scanner(System.in);

    public Manager(){
        hSet = new HashSet<PhoneInfo>();
        itr = hSet.iterator();
    }

    private PhoneInfo readFriendInfo(){
        System.out.println("이름 :");
        String name = in.nextLine();
        System.out.println("번호 :");
        String pNum = in.nextLine();
        return new PhoneInfo(name,pNum);
    }

    private PhoneInfo readUniFriendInfo(){
        System.out.println("이름 :");
        String name = in.nextLine();
        System.out.println("번호 :");
        String pNum = in.nextLine();
        System.out.println("전공 :");
        String major = in.nextLine();
        return new Univ(name,pNum,major);
    }

    private PhoneInfo readCompanyFriendInfo(){
        System.out.println("이름 :");
        String name = in.nextLine();
        System.out.println("번호 :");
        String pNum = in.nextLine();
        System.out.println("직업 :");
        String job = in.nextLine();
        return new Company(name,pNum,job);
    }

    public void insert() throws MenuChoiceException{
        int n;
        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("1.일반 2.대학 3.회사.....선택하세요");
        n=in.nextInt();
        in.nextLine();

        if(n==INPUT_SELECT.NORMAL){
            pInfo=readFriendInfo();
        }
        else if(n==INPUT_SELECT.UNIV){
            pInfo=readUniFriendInfo();
        }
        else if(n==INPUT_SELECT.COMPANY){
            pInfo=readCompanyFriendInfo();
        }
        else{
            throw new MenuChoiceException();
        }

        boolean added =hSet.add(pInfo);
        if(added){
            System.out.println("데이터 저장이 완료되었습니다.");
        }
        else{
            System.out.println("이미 저장된 데이터 입니다.");
        }
    }

    public void search(){
        System.out.println("이름을 입력하시요 : ");
        String name = in.nextLine();
        itr=hSet.iterator();

        while(itr.hasNext()){
            PhoneInfo curInfo=itr.next();
            if(name.equals(curInfo.name)){
                System.out.println("검색완료");
                curInfo.show();
                return;
            }
        }
        System.out.println("검색결과 없음.");
    }

    public void delete(){
        System.out.println("이름을 입력하시요 : ");
        String name = in.nextLine();
        itr = hSet.iterator();
        while(itr.hasNext()){
            if(itr.next().name.equals(name)){
                System.out.println(name + " 데이터를 삭제합니다.");
                itr.remove();
                return;
            }

        }
        System.out.println("해당 데이터 없음");

    }

    public void exit(){
        System.out.println("시스템을 종료합니다. " );
        return;
    }

    public void show(){
        itr=hSet.iterator();
        while(itr.hasNext()){
            itr.next().show();
        }
    }
}

