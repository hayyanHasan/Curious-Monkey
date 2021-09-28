package com.android.CheckConnectivity;


import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

import com.android.process.Execute;

public class CheckConnectivity {
	Socket pingSocket = null;
	Execute execute = new Execute();
	
	



private void checkAirplaneMode () throws IOException, InterruptedException{
	
	 String SendedEvents ="adb shell settings get global airplane_mode_on";
	 System.out.println(SendedEvents);
	 execute.runprocess(SendedEvents);
	 TimeUnit.MILLISECONDS.sleep(500);
	SendedEvents = "adb shell settings put global airplane_mode_on 0";
	System.out.println(SendedEvents);
	 execute.runprocess(SendedEvents);
	 TimeUnit.MILLISECONDS.sleep(500);
	SendedEvents ="adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state false";
	System.out.println(SendedEvents);
    execute.runprocess(SendedEvents);
    TimeUnit.MILLISECONDS.sleep(500);		
}

private void checkdata () throws IOException, InterruptedException{
	
	 String SendedEvents ="adb shell \"dumpsys connectivity | grep Mobile\"";
	  execute.runprocess(SendedEvents);
	 
				SendedEvents ="adb shell svc data enable";
				System.out.println(SendedEvents);
				  execute.runprocess(SendedEvents);
				  TimeUnit.MILLISECONDS.sleep(500);
			
}

private void checkWIFI() throws IOException, InterruptedException{
	
	 String SendedEvents ="adb shell \"dumpsys wifi | grep Wi-Fi\"";
	 execute.runprocess(SendedEvents);
	 
				SendedEvents ="adb shell svc wifi enable";
				System.out.println(SendedEvents);
				  execute.runprocess(SendedEvents);
				  TimeUnit.MILLISECONDS.sleep(500);
			
}
public  void checkInternetconectivity () throws IOException, InterruptedException{
	
checkAirplaneMode();
checkdata();
checkWIFI();
	

}

public void ReloadADB() throws IOException, InterruptedException{
	execute.runprocess("adb kill-server");
	TimeUnit.MILLISECONDS.sleep(500);
	execute.runprocess("adb start-server");
	
}

}
