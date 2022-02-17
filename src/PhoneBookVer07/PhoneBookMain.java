package PhoneBookVer07;

public class PhoneBookMain {
    public static void main(String[] args){
        Manager manager = new Manager();

        while(true){
            try {
                System.out.println("1.데이터 입력 2.데이터 검색 3.데이서 삭제 4.프로그램 종료 5.데이터 출력.... 선택하시오");
                int n;
                n = manager.in.nextInt();
                manager.in.nextLine();
                switch(n){
                    case 1: {manager.insert();
                        break;}
                    case 2: {
                        manager.search();
                        break;}
                    case 3:{
                        manager.delete();
                        break;
                    }
                    case 4: {
                        manager.exit();
                        return;
                    }
                    case 5:{
                        manager.show();
                        break;
                    }
                    default:{
                        throw new MenuChoiceException();

                    }
                }

            }
            catch(MenuChoiceException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
