package com.android.Main;


import java.io.IOException;
import java.util.Scanner;

import com.android.CheckConnectivity.CheckConnectivity;
import com.android.SystemEvents.RunTimeSystemEvents;
import com.android.SystemEvents.SetUpSystemEvent;

import com.android.log.SaveLogs;

import com.android.Monkey.RunMonkey;

public class Main {
    
	private static SetUpSystemEvent setupevents = new SetUpSystemEvent();
	private static RunTimeSystemEvents runtimeevents = new RunTimeSystemEvents();
	private static CheckConnectivity ch = new CheckConnectivity();
	private static SaveLogs sl = new SaveLogs();
	private static RunMonkey runmonkey = new RunMonkey();
	
    public static void main(String[] args) throws IOException, InterruptedException {
        
    	System.out.println("Insert the package name !!");
    	Scanner in = new Scanner(System.in);
    	String packagename = in.nextLine();
    	in.close();
    	System.out.println("Setup the test environment !!");
  		setupevents.RunSetUpEvents();
  		System.out.println("Check the test environment connectivity !!");
  		ch.checkInternetconectivity();
  		System.out.println("Running Monkey !!");
    	runmonkey.RunMonkey(packagename);
    	System.out.println("Check the test environment connectivity !!");
    	ch.checkInternetconectivity();
    	System.out.println("Running runtime events !!");
  		runtimeevents.RunTimeEvents();
  		System.out.println("Check the test environment connectivity !!");
  		ch.checkInternetconectivity();
  		System.out.println("Running Monkey !!");
  		runmonkey.RunMonkey(packagename);
  		System.out.println("Check the test environment connectivity !!");
    	ch.checkInternetconectivity();
    	sl.getLog();
    	
    }
}
