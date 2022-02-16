import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int test_case = in.nextInt();
        in.nextLine();

        int[] count = new int[test_case];
        for(int k=0;k<test_case;k++) {
            int width = in.nextInt();
            int height = in.nextInt();
            if(width==1 && height ==1){

            }
            int num = in.nextInt();
            in.nextLine();
            int a, b;    // 가로 = a , 세로 = b
            int[][] arr = new int[height][width];

            for (int i = 0; i < num; i++) {
                a = in.nextInt();
                b = in.nextInt();
                arr[b][a] = 1;
            }

            count[k] = 0;
            for (int i = 0; i < height-1; i++) {
                for (int j = 0; j < width-1; j++) {
                    if (arr[i][j] == 1) {
                        count[k]++;
                        if(arr[i+1][j]==1){
                            arr[i+1][j]=2;
                        }
                        if(arr[i][j+1]==1){
                            arr[i][j+1]=2;
                        }
                    }
                    else if(arr[i][j]==2){
                        if(arr[i+1][j]==1){
                            arr[i+1][j]=2;
                        }
                        if(arr[i][j+1]==1){
                            arr[i][j+1]=2;
                        }
                    }
                }
            }

            for(int l=0;l<height-1;l++){
                if(arr[l][width-1]==1){
                    if(arr[l+1][width-1]!=2){
                        count[k]++;
                        if(arr[l+1][width-1]==1){
                            arr[l+1][width-1]=2;
                        }

                    }
                }
                else if(arr[l][width-1]==2){
                    if(arr[l+1][width-1]==1){
                        arr[l+1][width-1]=2;
                    }
                }
            }
            for(int m=0;m<width-1;m++){
                if(arr[height-1][m]==1){
                    if(arr[height-1][m+1]!=2){
                        count[k]++;
                        if(arr[height-1][m+1]==1){
                            arr[height-1][m+1]=2;
                        }

                    }
                }
                else if(arr[height-1][m]==2){
                    if(arr[height-1][m+1]==1){
                        arr[height-1][m+1]=2;
                    }
                }
            }
        }
        for(int i=0;i<test_case;i++){
            System.out.println(count[i]);
        }
    }
}