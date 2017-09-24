package com.mycompany.app;
import static spark.Spark.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static String iceriyorMu(String[] arr,int number,String str )
    { 
	number = -1;
	if(arr.length == 0){
		return "Array eleman icermiyor.";
	}
        for(int i=0; i<arr.length; i++){
		if(arr[i].equalsIgnoreCase(str)){
			number = i;
		}
	}
	if(number == -1){
		return "Array " + str + " icermiyor.";
	}
	return "Array " + str + " iceriyor.";
   	
    }
}
