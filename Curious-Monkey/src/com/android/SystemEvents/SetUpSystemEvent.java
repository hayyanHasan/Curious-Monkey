package com.android.SystemEvents;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.android.CheckConnectivity.CheckConnectivity;
import com.android.process.Execute;

public class SetUpSystemEvent {

	private List<String> SetUp_List = new ArrayList<>(); 
	private BeforExecution beforexecution = new BeforExecution();
	private Execute exe = new Execute();
	private CheckConnectivity ch = new CheckConnectivity();
	
private void FillList (){
	
	
	
	//contacts
		for (String s: beforexecution.AddContacts()){
			SetUp_List.add(s);
		}
		
	// send sms
	for (String s:beforexecution.SendSMS() ){
		SetUp_List.add(s);
	}
	
///browser 
	for (String s:beforexecution.Broweser()){
		SetUp_List.add(s);
	}


//BookMarks 
	for (String s:beforexecution.Bookmarks()){
		SetUp_List.add(s);
	}

	// add files 
	SetUp_List.add("adb push files\\sample1.txt /sdcard/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push files\\sample2.txt /sdcard/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push files\\sample3.jpg /sdcard/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push files\\sample4.jpg /sdcard/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push files\\sample5.docx /sdcard/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push files\\sample6.pdf /sdcard/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push files\\sample7.docx /sdcard/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push files\\sample8.pdf /sdcard/");
	
	SetUp_List.add("adb shell am broadcast -a android.intent.action.CAMERA_BUTTON");
	SetUp_List.add("adb shell input keyevent 66");
	SetUp_List.add("adb shell input keyevent 66");
	SetUp_List.add("adb shell input keyevent 66");
	SetUp_List.add("adb shell input keyevent 66");
	
	SetUp_List.add("adb shell input text \"model.pdf\"");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb shell input keyevent 66");
	SetUp_List.add("adb shell input keyevent 20");
	SetUp_List.add("adb shell input keyevent 20");
	SetUp_List.add("adb shell input keyevent 20");
	SetUp_List.add("adb shell input keyevent 66");
	SetUp_List.add("adb shell input keyevent 20");
	SetUp_List.add("adb shell input keyevent 66");
	SetUp_List.add("adb shell input keyevent 20");
	SetUp_List.add("adb shell input keyevent 66");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 3");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 3");
// accounts 
	SetUp_List.add("adb shell /system/bin/setprop ro.config.hosted_account mdse1@gmail.com");
	SetUp_List.add("adb shell /system/bin/setprop ro.config.google_account mdse2@gmail.com");
	SetUp_List.add("adb shell /system/bin/setprop ro.config.google_account mdse3@gmail.com");
	SetUp_List.add("adb shell input keyevent 3");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 4");
	SetUp_List.add("adb shell input keyevent 3");
//Downloads
	SetUp_List.add("adb push C:\\Users\\hayyan\\Desktop\\Project\\samples\\sample1.txt /sdcard/Download/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push C:\\Users\\hayyan\\Desktop\\Project\\samples\\sample2.txt /sdcard/Download/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push C:\\Users\\hayyan\\Desktop\\Project\\samples\\sample3.jpg /sdcard/Download/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push C:\\Users\\hayyan\\Desktop\\Project\\samples\\sample4.jpg /sdcard/Download/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push C:\\Users\\hayyan\\Desktop\\Project\\samples\\sample5.docx /sdcard/Download/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push C:\\Users\\hayyan\\Desktop\\Project\\samples\\sample6.pdf /sdcard/Download/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push E:\\final_tests\\samples\\sample7.docx /sdcard/Download/");
	SetUp_List.add("adb shell input keyevent 84");
	SetUp_List.add("adb push C:\\Users\\hayyan\\Desktop\\Project\\samples\\sample8.pdf /sdcard/Download/");
	
	
	// Make Calls 

	for (String s:beforexecution.MakeCalls()){
		SetUp_List.add(s);
	}
	
}
	
public void  RunSetUpEvents() throws IOException, InterruptedException {

FillList();
TimeUnit.SECONDS.sleep(2);



	for (String comand : SetUp_List) {
		System.out.println(comand);
		exe.runprocess(comand);	
		TimeUnit.MILLISECONDS.sleep(500);
		
	}

		
	}
}
