/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static symbolic_exceuction.Example.randomRange;
import symbolic_exceuction.Student;

/**
 *
 * @author IAlsmadi
 */
public class displayLastMsg_Test {
     Student st;
    public displayLastMsg_Test() {
     st = new Student();
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
     public void testAL_Path() {
     int g1= randomRange(-1000000,0);
     int g2= randomRange(-1000000,0);
     int lastMsg=randomRange(-1000000,1000000);
     ArrayList messageBuffer= new ArrayList();
     int SIZE=randomRange(-1000000,1000000);;
     assertEquals(st.displayLastMsg(g1, g2, lastMsg, messageBuffer, SIZE),0);
    
     }
}
