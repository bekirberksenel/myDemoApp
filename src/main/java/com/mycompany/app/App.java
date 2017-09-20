package com.mycompany.app;

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
