package com.android.process;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Execute {

private  Process p ;	
public  void runprocess (String SendedEvents) throws IOException, InterruptedException{
	
	    new Thread(){
	        @Override
	        public void run() {
	            try {
	            	p = Runtime.getRuntime().exec(SendedEvents);
	            	p.waitFor();
	            	System.out.println("INFO : "+ SendedEvents);
	            	
	            		            	
	        		TimeUnit.SECONDS.sleep(1);
	            }catch (Exception ignore){}
	        }
	    }.start();

	  
	
	
			
	}	


	
}
