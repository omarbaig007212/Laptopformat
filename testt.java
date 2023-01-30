import java.util.*;
public class testt {
    static ArrayList<StringBuilder> list;
    public static void main(String args[]){
        list=new ArrayList<>();
        String s="abc";
        solve(s,new StringBuilder(),0);
       // System.out.println(list);
    }
    public static void solve(String s,StringBuilder res,int index){
        System.out.println(res);
        if(index==s.length()){
            // System.out.println(res);
            list.add(res);
            return;
        }
        
        
        for(int i=index;i<s.length();i++){
            res=res.append(s.charAt(i));
           // System.out.println("k"+res);
            solve(s,res,i+1);
            res=res.deleteCharAt(res.length()-1);
           // solve(s,res,index+1);
        }
    }
}
