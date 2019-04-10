/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweaper;

import java.util.Random;

/**
 *
 * @author 161022
 */
public class Minesweaper {

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
          
      } else {
          
        }
        
    }
  }
  return count;
}
    public static void main(String[] args) {
       int mines[][] = new int[10][2];
       
       char ar[][]=new char[9][9];
        Random gen = new Random();
        for(int i =0 ;i<9;i++)
            for(int j=0;j<9;j++){
            ar[i][j] = (gen.nextInt())%2==0?'*':'#';
            }
        
        for(char a[]:ar){
            System.out.print("\n[");
            for(char b:a){
            System.out.print(" "+b);
            }
            System.out.print(" ]");
        }
        
         for(int i =0 ;i<9;i++)
            for(int j=0;j<9;j++){
                if(ar[i][j]!='*'){
                    int qq = findingNeighbors(ar,i,j);
                    //System.out.println(" "+qq);
                ar[i][j] =(char)(qq+'0');
                        
                        }
            }
        System.out.println("\n\n\n------------------------------------");
        for(char a[]:ar){
            System.out.print("\n[");
            for(char b:a){
            System.out.print(" "+b);
            }
            System.out.print(" ]");
        }
        
    }
    
    
}
