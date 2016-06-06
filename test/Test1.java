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
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;
import symbolic_exceuction.Example;
import symbolic_exceuction.Student;
import java.util.*;

/**
 *
 * @author IAlsmadi
 */
public class Test1 {
    
    public Test1() {
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
     java.util.ArrayList a = new java.util.ArrayList();
     Object o = new Object();
       a.add(o);
       assertTrue(a.get(0)==o);
        assertTrue(a.size()>0);
         assertTrue(a!=null);
         assertFalse(a.size()>1);
     }
     
      @Test
     public void test2(){
    Student st = new Student("alsmadi","B+","G"); 
      Student st1 = new Student("alsmadi","B+","G"); 
    
     assertTrue(st==st);
     //assertTrue(st==st1);
     }
     
     @Test
    
     public void test3(){
     java.util.ArrayList a = new java.util.ArrayList();
     Object o = new Object();
       a.add(o);
        Object o1 = new Object();
       a.add(o1);
       assertTrue(a.get(0)==o);
        assertTrue(a.get(1)==o1);
        assertTrue(a.size()>0);
         assertTrue(a!=null);
         assertFalse(a.size()>3);
     }
     
     @Test
     public void test4(){
         Student st = new Student();
          int g1= Example.randomRange(-1000,1000);
          System.out.println("The value of g1 is..."+ g1);
         int result = st.Compute(g1);
 assertTrue(result >= 0); 
     }
     
     @Test
     
     public void test5(){
         
    double d = 1.3;
    assertThat(d, is(1.3));
    assertThat(d, is(not(1.4)));

     }
     
     @Test
public void test6(){
    String str="test";
    assertThat(str, equalTo("test"));
    assertThat(str, not(equalTo("anotherTest")));
}

@SuppressWarnings("unchecked")
@Test
public void test7(){
    String str="test";
    assertThat(str, anyOf(is("test"), is("this"), is("that")));
    assertThat(str, not(anyOf(is("tasty"), is("this"), is("that"))));
}
@SuppressWarnings("serial")
@Test
public void test8(){
    List<String> list = new ArrayList<String>(){{add("one");add("two");add("three");}};
    assertThat(list, hasItem("two"));
    assertThat(list, not(hasItem("ttwo")));
}
 

}

