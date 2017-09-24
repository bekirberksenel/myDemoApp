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
      port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
          //System.out.println(req.queryParams("input1"));
          //System.out.println(req.queryParams("input2"));

       	  String input1 = "Turkey";
          String[] inputList = new String[7];
  
  	  for(int i = 0 ; i<inputList.length;i++){
	 	System.out.println(inputList[i]);
	  }


          int input2 = 7;

          String result = App.iceriyorMu(inputList, input2,input1);

         Map map = new HashMap();
          map.put("result", result);
          return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());


        get("/compute",
        (rq, rs) -> {
              Map map = new HashMap();
              map.put("result", "not computed yet!");
              return new ModelAndView(map, "compute.mustache");
            },
            new MustacheTemplateEngine());

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
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

}
