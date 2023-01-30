//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s="&(|(f))";
            System.out.println("res---> "+parseBoolExpr(s));
    }
    public static boolean parseBoolExpr(String s) {
        Stack<Character> exp=new Stack<>();
        StringBuilder sb=new StringBuilder();
        boolean res;
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp==')')
            {
                while(exp.size()>0 && exp.peek()!='(')
                {
                    char tt=exp.peek();
                    if(exp.peek()=='f')
                    {
                        sb.append('f');
                    }
                    if(exp.peek()=='t')
                    {
                        sb.append('t');
                    }
                    exp.pop();
                }
                exp.pop();
                char todo=exp.pop();
                boolean c1;
                if(sb.charAt(0)=='f')
                {
                    c1=false;
                }
                else
                {
                    c1=true;
                }
                res=c1;
                if(todo=='!')
                {
                    if(c1==true)
                    {
                        res=false;
                    }
                    else
                    {
                        res=true;
                    }
                    System.out.println(c1+"   "+todo+" /// "+res);
                }
                else
                {
                    for(int j=1;j<sb.length();j++)
                    {
                        boolean c2;
                        if(sb.charAt(j)=='f')
                        {
                            c2=false;
                        }
                        else
                        {
                            c2=true;
                        }
                        if(todo=='|')
                        {
                            res=c1||c2;
                        }
                        if(todo=='&')
                        {
                            res=c1&&c2;
                        }
                        System.out.println(sb.charAt(j)+" ....... "+c1+" -- "+todo+" ---- "+c2+" ---- "+res);
                        c1=res;
                    }
                }
                System.out.println("post--> "+res);
                sb=new StringBuilder();
                if(res==true)
                {
                    exp.push('t');
                }
                else
                {
                    exp.push('f');
                }
            }
            else
            {
                exp.push(temp);
            }
        }
        if(exp.peek()=='f')
        {
            return false;
        }
        return true;
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
