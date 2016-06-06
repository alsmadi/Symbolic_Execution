/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import symbolic_exceuction.*;


/**
 *
 * @author IAlsmadi
 */
public class Example_Test {
    Example ex;
    public Example_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ex= new Example();
    }
    
    @After
    public void tearDown() {
    }
/*    
    @Test
     public void test1(){
     java.util.ArrayList a = new java.util.ArrayList();
     Object o = new Object();
       a.add(o);
       assertTrue(a.get(0)==o);
     }
     @Test
     public void test2(){
     int g1= Example.randomRange(-1000,1000);
         int g2= Example.randomRange(-1000,1000);
          int g3= Example.randomRange(-1000,1000);
     assertThat (Example.test(g3, g3, g3), 
             anyOf(equalTo(13), equalTo(3), equalTo(15), equalTo(400)));
     }
    @Test
   public void test3(){
       
       for (int i = 0; i < 10000; i++) {
        test1();
    }
       
   }
    @Test
   public void test4(){
        int g1=0,g2=0,g3=0;
       for (int i = 0; i < 100; i++) { 
           g1= Example.randomRange(-1000,1000);
         g2= Example.randomRange(-1000,1000);
          g3= Example.randomRange(-1000,1000);
                int k=Example.test(g3, g3, g3);  
                if (k <0 ) {  
                     fail("error");  
                }  
           
      }  
       
   } */
    @Test
      public void test5(){
          

          int g1=0,g2=0,g3=0;
          int counter=0;
          while(counter<1000){
     g1= Example.randomRange(-1000,1000);
         g2= Example.randomRange(-1000,1000);
          g3= Example.randomRange(-1000,1000);
     assertThat (Example.test(g3, g3, g3), 
             anyOf(equalTo(13), equalTo(3), equalTo(15), equalTo(400)));
     counter++;
          }
     }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
