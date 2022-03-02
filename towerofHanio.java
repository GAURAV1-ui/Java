public class towerofHanio {
    public static void towerOfHanio(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfered disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanio(n-1, src, dest, helper);
        System.out.println("transfered disk "+n+" from "+src+" to "+dest);
        towerOfHanio(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        int n = 4;
        towerOfHanio(n, "s", "H", "D");
    }

}
