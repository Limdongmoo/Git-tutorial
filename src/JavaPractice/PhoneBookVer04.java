import java.util.Scanner;
class MenuChoiceException extends Exception{
    MenuChoiceException(int n){
        super(n+"에 해당하는 메뉴는 존재하지 않습니다.");
    }

}

class PerInfo {
    String name;
    String pNum;
    String birth;

    public PerInfo(String name, String pNum,String birth){
        this.name = name;
        this.pNum = pNum;
        this.birth = birth;
    }

    public void showBasicInfo(){
        System.out.println("이름 :"+ name);
        System.out.println("전화번호 :"+ pNum);
        System.out.println("생일 :"+ birth);
    }

    public void showInfo(){
        System.out.println("입력정보 없음");
    }
}

class Company extends PerInfo{
    String company;
    public Company(String name, String pNum,String birth,String company){
        super(name,pNum,birth);
        this.company=company;
    }
    @Override
    public void showBasicInfo(){
        super.showBasicInfo();
    }
    @Override
    public void showInfo(){
        System.out.println("직장 : "+company);
    }
}

class HighSchool extends PerInfo{
    String major;
    public HighSchool(String name, String pNum,String birth,String major){
        super(name,pNum,birth);
        this.major= major;
    }
    @Override
    public void showBasicInfo(){
        super.showBasicInfo();
    }
    @Override
    public void showInfo(){
        System.out.println("전공 :"+ major);
    }
}

class PhoneBookManager{
    PerInfo[] arr;
    int count=0;
    Scanner in = new Scanner(System.in);

    PhoneBookManager(int n){
        arr=new PerInfo[n];
    }

    public void insert() throws MenuChoiceException{
        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("1.일반 2.회사 3.고교.....");
        int n= in.nextInt();
        in.nextLine();
        if(n>3||n<0){
            throw new MenuChoiceException(n);
        }
        switch(n){
            case 1:
                System.out.println("이름 : ");
                String name = in.nextLine();
                System.out.println("전화번호 : ");
                String pNum = in.nextLine();
                System.out.println("생일 : ");
                String birth = in.nextLine();
                arr[count++]=new PerInfo(name,pNum,birth);
                System.out.println("데이터 입력이 완료되었습니다.");
                break;

            case 2:
                System.out.println("이름 : ");
                String name1 = in.nextLine();
                System.out.println("전화번호 : ");
                String pNum1 = in.nextLine();
                System.out.println("생일 : ");
                String birth1 = in.nextLine();
                System.out.println("직장 : ");
                String company = in.nextLine();
                arr[count++]=new Company(name1,pNum1,birth1,company);
                System.out.println("데이터 입력이 완료되었습니다.");
                break;
            case 3:
                System.out.println("이름 : ");
                String name2 = in.nextLine();
                System.out.println("전화번호 : ");
                String pNum2 = in.nextLine();
                System.out.println("생일 : ");
                String birth2 = in.nextLine();
                System.out.println("전공 : ");
                String major = in.nextLine();
                arr[count++]=new HighSchool(name2,pNum2,birth2,major);
                System.out.println("데이터 입력이 완료되었습니다.");
                break;
        }
    }
    public void search(){
        System.out.println("이름을 기준으로 검색합니다. 이름을 입력하시오.");
        String name = in.nextLine();
        for(PerInfo e : arr){
            if(e.name.equals(name)){
                e.showBasicInfo();
                return;
            }

        }
        System.out.println("검색결과 없음");
    }

    public void delete(){
        System.out.println("검색할 이름을 입력하시오.");
        String name = in.nextLine();
        for(int i=0;i<count;i++){
            if(arr[i].name.equals(name)){
                arr[i].showBasicInfo();
                System.out.println("검색결과를 삭제합니다.");
                for(int j=i;j<count;j++){
                    arr[j]=arr[j+1];
                }
                return;
            }
        }
        System.out.println("검색결과 없음");

    }

    public void quit(){
        System.out.println("시스템을 종료합니다.");
        return;
    }
}

public class PhoneBookVer04{
    public static void main(String[] args){
        PhoneBookManager manager = new PhoneBookManager(100);
        outerLoop:
            while (true) {
                try {
                    System.out.println("1.데이터입력 \n2.데이터검색 \n 3.데이터삭제\n4.프로그램 종료... 입력하시오");
                    int n = manager.in.nextInt();
                    manager.in.nextLine();
                    if (n < 0 || n > 4) {
                        throw new MenuChoiceException(n);
                    }
                    switch (n) {
                        case 1:
                            manager.insert();
                            break;
                        case 2:
                            manager.search();
                            break;
                        case 3:
                            manager.delete();
                            break;
                        case 4:
                            manager.quit();
                            break outerLoop;
                    }
                }
                catch(MenuChoiceException e){
                    System.out.println(e.getMessage());
                    System.out.println("메뉴를 처음부터 다시 진행합니다.");
                }
            }
    }
}

