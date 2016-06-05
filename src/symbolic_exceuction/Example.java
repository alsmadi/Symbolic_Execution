package symbolic_exceuction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IAlsmadi
 */
public class Example {
    public static void main(String[] args){
        int g1= randomRange(-1000,1000);
         int g2= randomRange(-1000,1000);
          int g3= randomRange(-1000,1000);
          
          System.out.println("Test output for the three values...");
           System.out.println(g1+"..."+g2+"..."+g3);
           System.out.println(test(g1,g2,g3));
        
        
    }
    public static int randomRange(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random()* range)+min;
                
        
    }
    public static int test(int a, int b, int c){
        int result;
        int x=0;       int y=0;         int z=0;
        if(a>5 || b > 0 || c > 0){
            x=-2;
            y=5;
        }
        if(b<5){
            x=4;
            y=7;
            z=-2;
            if(a + c>12){y=1;}
            z=2;
        }
        else{      
        result=400;
        }
         result=x+y+z;
        return result;
    }
}
