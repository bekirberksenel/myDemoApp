package com.mycompany.app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;
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
    	
    public void testArrayIsEmpty(){
      ArrayList<String> array = new ArrayList<>();
      assertFalse((new App().firstLetterSearch(array,"Berk",1))==1);
    }
    public void testBadList(){
      ArrayList<String> array = new ArrayList<>("ö","","i","ü"," ","ğ");	    
      assertFalse((new App().firstLetterSearch(array,"bekir",1))==1);
    }	
    public void testBadString(){
      ArrayList<String> array = new ArrayList<>("ö","","i","ü"," ","ğ");	    
      assertFalse((new App().firstLetterSearch(array,"1",1))==1);
    }
    public void testIsNotTrue(){
      ArrayList<String> array = new ArrayList<>(Arrays.asList("Kazım","Kerem","Bekir"));
      assertFalse((new App().firstLetterSearch(array,"Bekir",2))==3);
    }
     public void testIsTrue(){
      ArrayList<String> array = new ArrayList<>(Arrays.asList("Kazım","Kerem","Bekir"));
      assertTrue((new App().firstLetterSearch(array,"Bekir",0))==1);
    }
}
