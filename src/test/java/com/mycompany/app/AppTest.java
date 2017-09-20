package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public void test1()
    {
	App p = new App();
	String[] arr1 = {"Bekir","Berk","Omer","Fatih","Furkan","Can","Mehmet"};
 	assertTrue(((p.iceriyorMu(arr1,27,"Bekir")).equals("Array Bekir iceriyor.")));      
    }

    /**
     * @return the suite of tests being tested
     */
    public static void test2()
    {
	App pp = new App();
	String[] arr1 = {"Bekir","Berk","Omer","Fatih","Furkan","Can","Mehmet"};
 	assertFalse(((pp.iceriyorMu(arr1,27,"Burak")).equals("Array Burak iceriyor."))); 
        
    }

    /**
     * Rigourous Test :-)
     */
    public static void test3()
    {
	App ppp = new App();
	String[] arr1 = {"Bekir","Bekir","Omer","Fatih","Furkan","Can","Mehmet"};
 	assertTrue(((ppp.iceriyorMu(arr1,27,"Bekir")).equals("Array Bekir iceriyor."))); 
        
    }
    public static void test4()
    {
	App pppp = new App();
	String[] arr1 = {"Bekir","Berk","Omer","Fatih","Furkan","Can","Mehmet"};
 	assertTrue(((pppp.iceriyorMu(arr1,27,"Berk")).equals("Array Berk iceriyor."))); 
        
    }
    public static void test5()
    {
	App ppppp = new App();
	String[] arr1 = {""};
 	assertFalse(((ppppp.iceriyorMu(arr1,27,"Berk")).equals("Array eleman icermiyor."))); 
        
    }
    


}
