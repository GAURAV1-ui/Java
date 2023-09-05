import java.util.*;

public class tenWordsofWisdom {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);  
int m = sc.nextInt();
int n=sc.nextInt();  
int[][][] array = new int [m][n][2];   

for(int k =0; k <m; k++) {
for(int i=0; i<n; i++) {
    for(int j = 0; j<2; j++) {
        array[k][i][j]=sc.nextInt(); 
        }   
    }   
}

for(int k =0; k <m; k++) {
    int max = 0;
for(int i =0; i<n; i++) {
    if(array[k][i][0]<=10) {
        if(array[k][i][1]>max) {
            max = array[k][i][1];
        }
    }
}
System.out.print(max);
}
}
}
