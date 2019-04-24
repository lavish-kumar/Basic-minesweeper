package conways;

import java.util.Arrays;
import java.util.Random;

public class Conways {

    public static int findingNeighbors(char[][] myArray,int i,int j) {
        int rowLimit = myArray.length-1;;
        int columnLimit = myArray[0].length-1;
        //System.out.print("\n# Neighbours of ("+i+","+j+") are :");
        int count=0;
        for(int x = Math.max(0, i-1); x <= Math.min(i+1, rowLimit); x++) {
        for(int y = Math.max(0, j-1); y <= Math.min(j+1, columnLimit); y++) {
                if(x != i || y != j){
                    if(myArray[x][y]=='*')
                    count++;
                } 
                else{}
        
    }
  }
  return count;
}
    public static void printar(char ar[][]){
    System.out.println("\n\n\n------------------------------------");
        for(char a[]:ar){
            System.out.print("\n[");
            for(char b:a){
            System.out.print(" "+b);
            }
            System.out.print(" ]");
        } 
    } 
    public static void populate(int m,int n){
    char ar[][]=new char[m][n];
       Random gen = new Random();
        
       for(int i=0;i<m;i++){
       for(int j=0;j<n;j++){
            ar[i][j] = (gen.nextInt())%2==0?'*':'-';
        }
        }
       
        printar(ar);
       
        
       int living=0;
       int livcompare=0;
       for(int i=0;i<m;i++){
       for(int j=0;j<n;j++){
            if(ar[i][j]=='*')
                living++;
        }  
        }
       
        boolean flag=false;
       
       while(living!=0 && flag==false ){
         char ar2[][]=ar; 
         livcompare=living;
         for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
                if(ar2[i][j]=='*'){
                    int qq = findingNeighbors(ar2,i,j);
                    //System.out.println(" "+qq);
                    if(qq<2){
                    ar[i][j] ='-';}
                    else if(qq>=2&&qq<=3){
                    ar[i][j] ='*';}
                    else{
                    ar[i][j] ='-';}
                  }
                else{
                 int qq = findingNeighbors(ar2,i,j);
                    if(qq==3)
                      ar[i][j] ='*';   
                }
         }
         }
         
        printar(ar);
        
        living=0;
        
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(ar[i][j]=='*')
                living++;
        }  
        }
        
        
        
        System.out.println("LIVING : "+living);
        if(livcompare==living){
        break;
        }
    }
    
    }
    public static void main(String[] args) {
      
       populate(3,3);
}
}
