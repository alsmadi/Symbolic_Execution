/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import symbolic_exceuction.Example1;

/**
 *
 * @author IAlsmadi
 */
public class Example1_Test {
    
    public Example1_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void test1(){
         
         for(int k=0; k<20000; k++){
             System.out.println("counter "+k);
     int g1= Example1.randomRange(-1000,1000);
         int g2= Example1.randomRange(-1000,1000);
          int g3= Example1.randomRange(-1000,1000);
     assertThat (Example1.test(g3, g3, g3), 
             anyOf(equalTo(29), equalTo(-9), equalTo(16), equalTo(400)));
         }
     }
     /*
     @Test
     public void test2(){
     int g1= Example1.randomRange(-1000,1000);
         int g2= Example1.randomRange(-1000,1000);
          int g3= Example1.randomRange(-1000,1000);
     assertThat (Example1.test(g3, g3, g3), 
             anyOf(equalTo(13), equalTo(3), equalTo(15), equalTo(400)));
     } */
}
