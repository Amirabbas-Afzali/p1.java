import java.util.*;

public class pro2 {
    public static void main(String[] args){

        Scanner cin =new Scanner(System.in);
         int temp[][]=new int[2][2];
         int q=0,fin=0;
        int n=cin.nextInt();
        int m=cin.nextInt();
        String x[][]=new String [n][m];
        for(int i=0;i<n;i++){
            for(int i1=0;i1<m;i1++){
                x[i][i1]=cin.next() ;
              if(x[i][i1].equals("*")){ temp[q][0]=i; temp[q][1]=i1;q++;}
             // if(x[i][i1].equals("*")&&q==1){ temp[q][0]=i; temp[q][1]=i1;}
                ///////////*****************
            }
        }

if(temp[0][0]==temp[1][0]){
    for(int i=temp[0][1]+1;i<temp[1][1];i++){
   fin+= Integer.parseInt(x[temp[0][0]][i]);
    }}
else if(temp[0][1]==temp[1][1]){
    for(int i=temp[0][0]+1;i<temp[1][0];i++){
        fin+= Integer.parseInt(x[i][temp[0][1]]);
    }}

        System.out.println( fin);

    }
}
