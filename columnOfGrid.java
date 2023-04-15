public class columnOfGrid {
    public static int[] findColumnWidth(int[][] grid) {
        int n = grid.length;
        
        if(n == 0){
            return null;
        }
        
        int [] arr = new int[n];
        int j = 0;
        int count = 0;
        
        while(j < grid[0].length){
           
            int max = 0;
            for(int i =0; i<n; i++) {
                if(grid[i][j]< 0){
                    count = countLength(grid[i][j])+1;
                    max = Math.max (max,count);
                } else{
                    count = countLength(grid[i][j]);
                    max = Math.max (max,count);
                }
                
            }
            arr[j] = max;
            j++;
        }
        return arr;
    }
    
    public static int countLength (int n) {
        
        int count = 0; 

        if(n==0) {
            return 1;
        }

        while(n != 0) {     
            n = n / 10;  
            count = count + 1;  
        }  
      return count;
    }

    public static void main (String[] args) {
        int [][] grid = {{-15,1,3},{15,7,12},{5,6,-2}};

        int [] ans = findColumnWidth(grid);

        for(int num : ans) {
            System.out.println(num);
        }
    }
}
