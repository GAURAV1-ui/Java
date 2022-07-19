public class maze {
    public static int retmaze(int row,int col){
        if(row ==1 || col == 1){
            return 1;
        }
        int left = retmaze(row,col-1);
        int right = retmaze(row-1,col);

        return left+right;
    }

    public static void main(String[] args) {
        System.out.println(retmaze(3, 3));
    }
}
