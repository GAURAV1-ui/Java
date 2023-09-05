import java.util.*;

public class toMyCircle {
public static void main(String[] args) {
int n;  
Scanner sc=new Scanner(System.in);  
n=sc.nextInt();  
int[][] array = new int [n][3];    
for(int i=0; i<n; i++) {
    for(int j = 0; j<3; j++) {
        array[i][j]=sc.nextInt(); 
    }   
}  
for(int[] num : array) {
    Arrays.sort(num);
}

for(int i =0; i<n; i++) {
int sum = array[i][1] + array[i][2];
if(sum >= 10) {
    System.out.println("yes");
} else {
    System.out.println("No");
}
    }
}


}
