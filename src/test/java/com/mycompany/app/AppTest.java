package com.mycompany.app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName){
        super(testName);
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite(AppTest.class);
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        assertTrue( true );
    }
    public void testArrayIsNotFound(){
      assertFalse(new App().search(null,1,"bekir"));
    }
    public void testArrayIsEmpty(){
      ArrayList<String> array = new ArrayList<>();
      assertFalse(new App().search(array,1,"Berk"));
    }
    public void testBadInt(){
	ArrayList<String> array = new ArrayList<>(Arrays.asList("Bekir","Bekir","Berk"));
        assertFalse(new App().search(array,-2,"Bekir"));
    }
    public void testIsNotTrue(){
      ArrayList<String> array = new ArrayList<>(Arrays.asList("Bekir","Bekir","Berk"));
      assertFalse(new App().search(array,7,"Bekir"));
    }
     public void testIsTrue(){
      ArrayList<String> array = new ArrayList<>(Arrays.asList("Bekir","Bekir","Berk"));
      assertTrue(new App().search(array,2,"Bekir"));
    }
}
