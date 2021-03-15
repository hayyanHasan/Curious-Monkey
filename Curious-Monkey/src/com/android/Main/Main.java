package com.android.Main;


import java.io.IOException;

import com.android.CheckConnectivity.CheckConnectivity;
import com.android.SystemEvents.RunTimeSystemEvents;
import com.android.SystemEvents.SetUpSystemEvent;
import com.android.commands.monkey.Monkey;
import com.android.log.SaveLogs;

public class Main {
    /**
     * Command-line entry point.
     *
     * @param args The command-line arguments
     */
	private static SetUpSystemEvent setupevents = new SetUpSystemEvent();
	private static RunTimeSystemEvents runtimeevents = new RunTimeSystemEvents();
	private static CheckConnectivity ch = new CheckConnectivity();
	private static SaveLogs sl = new SaveLogs();
	
    public static void main(String[] args) throws IOException, InterruptedException {
        
    	 boolean setupevent=false,runtimeevet=false;
    	
  	
  
    	String [] MonkeyArgs = new String[20]; ;
    	int j =0;
    	for (int i=0; i<args.length;i++){
    		
    		
    		
    		if (args[i].equals("--SetUp-Events")){
    			
    			setupevent = true;
    			
    		
    		} 
    		else if (args[i].equals("--RunTime-Events")){
    			
    			runtimeevet = true;
    		}else {
    			
    			MonkeyArgs[j]=args[i];
    			j++;
    		}
    	}
    	
    	
    	
  	if (setupevent)
  		setupevents.RunSetUpEvents();
  	if (MonkeyArgs.length !=0){
  		ch.checkInternetconectivity();
    	(new Monkey()).run(MonkeyArgs);
    	ch.checkInternetconectivity();
    	
        
  	}
  	if (runtimeevet)
  		runtimeevents.RunTimeEvents();
    			
  	if (MonkeyArgs.length !=0){
  		ch.checkInternetconectivity();
     (new Monkey()).run(MonkeyArgs);
    	ch.checkInternetconectivity();
    	
       
  	}	
   	
    	sl.getLog();
    	
    }
}
