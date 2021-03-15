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
	 execute.runprocess(SendedEvents);
	
	SendedEvents = "adb shell settings put global airplane_mode_on 0";
	 execute.runprocess(SendedEvents);
	SendedEvents ="adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state false";
    execute.runprocess(SendedEvents);
			
}

private void checkdata () throws IOException, InterruptedException{
	
	 String SendedEvents ="adb shell \"dumpsys connectivity | grep Mobile\"";
	  execute.runprocess(SendedEvents);
	 
				SendedEvents ="adb shell svc data enable";
				  execute.runprocess(SendedEvents);
			
}

private void checkWIFI() throws IOException, InterruptedException{
	
	 String SendedEvents ="adb shell \"dumpsys wifi | grep Wi-Fi\"";
	 execute.runprocess(SendedEvents);
	 
				SendedEvents ="adb shell svc wifi enable";
				  execute.runprocess(SendedEvents);
			
}
public  void checkInternetconectivity () throws IOException, InterruptedException{
	
checkAirplaneMode();
checkdata();
checkWIFI();
	

}

public void ReloadADB() throws IOException, InterruptedException{
	execute.runprocess("adb kill-server");
	TimeUnit.SECONDS.sleep(1);
	execute.runprocess("adb start-server");
	
}

}
