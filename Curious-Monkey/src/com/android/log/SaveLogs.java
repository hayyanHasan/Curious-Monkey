package com.android.log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class SaveLogs {

	
	
	public  void getLog () throws IOException, InterruptedException{
		 String line = getserial();
		 String [] com = {"adb", "-s", line, "logcat", "-v", "threadtime"};
		
		final Process exec = Runtime.getRuntime().exec(com);
	   InputStream inputStream = exec.getInputStream();
	   InputStreamReader buInputStreamReader = new InputStreamReader(inputStream);
	   final BufferedReader bufferedReader = new BufferedReader(buInputStreamReader);
	   PrintWriter out = new PrintWriter("results\\logcat.txt");
	   final StringBuilder buf = new StringBuilder();

	   new Thread(){
	       @Override
	       public void run() {
	           try {
	               String str = null;
	               while ((str = bufferedReader.readLine()) != null) {
	                
	                	
	                	buf.append(str);
	                     buf.append("\n");
	                     out.println(str); 
	                 
	            	   
	                 
	               }
	           }catch (Exception ignore){}
	       }
	   }.start();

	   TimeUnit.SECONDS.sleep(50);
	           exec.destroy();
	           out.flush();
	           out.close();
	           inputStream.close();
	       }

	public  String getserial() throws IOException, InterruptedException{
		String line;
		BufferedReader in;
		String SendedEvents ="adb get-serialno";
		Process p = Runtime.getRuntime().exec(SendedEvents);
		p.waitFor();
		
		 in = new BufferedReader(new InputStreamReader(p.getInputStream()));
		 line = in.readLine();
		
		 if (!line.trim().equals("")){
			 if (line.trim().endsWith("nown")){
				 SendedEvents ="adb kill-server";
					p = Runtime.getRuntime().exec(SendedEvents);
					p.waitFor();
				
				 SendedEvents ="adb start-server";
					p = Runtime.getRuntime().exec(SendedEvents);
					p.waitFor();
			 }
			 SendedEvents = "adb logcat -c";
			
			 p = Runtime.getRuntime().exec(SendedEvents);
			 p.waitFor();
			 
			}	
		 in.close();
		 p.destroy();
		 return line;
		
	}
	
}
