import java.util.ArrayList;

public class mazeDir {

    public static ArrayList<String> retmazedir (String p,int row,int col){
    if(row ==1 && col == 1){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }   
    ArrayList<String> list = new ArrayList<>();
    if(col>1){
        list.addAll(retmazedir(p+'D',row,col-1));
    }
    if(row>1){
        list.addAll(retmazedir(p+'R',row-1,col));
    }
    return list;
    }
    public static void main(String[] args) {
       System.out.println(retmazedir("",3,3));
    }
}
