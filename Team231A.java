import java.util.Scanner;

public class Team231A {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); 
    
    int[][] team = new int[a][3];
        for(int i=0;i<a;i++){
            for(int j=0; j<3;j++){
                team[i][j] = sc.nextInt();
            }
            
        }
        int ans =0;
        for(int i=0 ;i<a;i++){
            int count = 0;
            for(int j=0;j<3;j++){
                if(team[i][j] == 1){
                    count++;
                }else{
                    continue;
                }
            }
            if(count>=2){
                ans++;
            }
        } 
        System.out.println(ans);
    }
}
