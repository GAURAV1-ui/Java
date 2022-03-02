public class sortrecursion {
      
            public static boolean sort2(int arr[], int idx) {
    
                if(idx == arr.length-1){
                    return true;
                }
                if(arr[idx]<arr[idx+1]){
                    sort2(arr , idx+1);
                    return true;
                }
                else{
                    return false;
                }
                
             
            }
            public static void main(String args[]){
            
        }
        
        
    }
