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

/**
 *
 * @author IAlsmadi
 */
public class BinarySearchTest {
    BinarySearch bs;
    public BinarySearchTest() {
        bs= new BinarySearch();
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
/*     @Test
     public void test1() {
         int[] abc = new int[0];
         assertEquals(bs.binarySearch(abc, 4),-1); // Path 1
     } */
     
     @Test
     public void test2() {
         int[] abc = {1,3,4,5,7};
         assertEquals(bs.binarySearch(abc, 3),1); // Path 1
     }
}
