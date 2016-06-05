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
public class Example1 {
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
        if(a>35 || b > 10 || c > 0){
            x=-20;
            y=5;
        }
        if(b<35){
            x=4;
            y=17;
            z=-2;
            if(a + c>32){y=4;}
            z=2;
        }
        else{      
        result=300;
        }
         result=x+y+z+6;
        return result;
    }
}
