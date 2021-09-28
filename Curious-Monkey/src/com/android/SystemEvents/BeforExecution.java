package com.android.SystemEvents;


import java.util.ArrayList;
import java.util.List;




public class BeforExecution {
	
	
private	String [] russianNumber = {"+79585801840", "+79585801991", "+79585801870", "+79585801970", "+79587714008", "+79585801960", 
										"+79585801890", "+79585801944", "+79585801830", "+79585801811"};  
private	String [] ChinesNumber = {"+8613910998888","+8613910998865","+8613910998843","+8613910978888","+8613910789488","+8613910858888",
										"+8613910994723","+8613910923697","+8613910901236","+861391099800558"};
private	String [] IranNumber = {"+989107495678","+989107495674","+989107495618","+989107495796","+989107495369",
										"+989107495670","+989107495588","+989107499647","+989107495600","+989107495444"};
private  String[] ruusiannames = {"Aleksandr","Aleksey","Andrey","Boris","Vladimir","Dmitry","Nikolay","Pavel","Pyotr","Sergey"};
private	 String[] chinesName = {"Zhang Wei","Wang Wei","Wang Fang","Li Wei ","Wang Xiu Ying","Li Xiu Ying","Li Na","Zhang Xiu Ying","Liu Wei","Zhang Min"};
private  String [] IranianName = {"Ashkan","Amin","Ardashir","Ervin","Giv","Ormazd","Milad","Parsa","Payam","Pedram"};
private  String[] SearchWords = {"Security","MDSE","MDELS","Malwares","Analysis","Model Driven","code generation","MetaModel","Android","Android Malware"};
	
public  List<String> AddContacts (){
	List<String> list = new ArrayList<>(); 	
	for (int i = 0; i < 9; i++) {
			list.add("adb shell \"am start -a android.intent.action.INSERT -t vnd.android.cursor.dir/contact -e name '"+ruusiannames [i]+"' -e phone "+russianNumber[i]+" -e email '"+ruusiannames[i]+"123@gmail.com'\"");
			list.add("adb shell input keyevent 66");
			list.add("adb shell input keyevent 66");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
			list.add("adb shell \"am start -a android.intent.action.INSERT -t vnd.android.cursor.dir/contact -e name '"+chinesName [i]+"' -e phone "+ChinesNumber[i]+" -e email '"+chinesName[i]+"123@gmail.com'\"");
			list.add("adb shell input keyevent 66");
			list.add("adb shell input keyevent 66");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
			list.add("adb shell \"am start -a android.intent.action.INSERT -t vnd.android.cursor.dir/contact -e name '"+IranianName [i]+"' -e phone "+IranNumber[i]+" -e email '"+IranianName[i]+"123@gmail.com'\"");
			list.add("adb shell input keyevent 66");
			list.add("adb shell input keyevent 66");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
			list.add("adb shell input keyevent 4");
		}
	list.add("adb shell input keyevent 3");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 3");
	return list;
	}
	
public  List<String> SendSMS (){
	List<String> list = new ArrayList<>(); 
	for (int i=0; i<9;i++){
		list.add("adb shell am start -a android.intent.action.SENDTO -d sms:"+russianNumber[i] +" --es sms_body \"Hello\" --ez exit_on_sent true");
		list.add("adb shell input keyevent 66");
		list.add("adb shell am start -a android.intent.action.SENDTO -d sms:"+ChinesNumber[i] +" --es sms_body \"Hello\" --ez exit_on_sent true");
		list.add("adb shell input keyevent 66");
		list.add("adb shell am start -a android.intent.action.SENDTO -d sms:"+IranNumber[i] +" --es sms_body \"Hello\" --ez exit_on_sent true");
		list.add("adb shell input keyevent 66");
	}
	list.add("adb shell input keyevent 3");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 3");
	return list;
}

public   List<String> Broweser (){
	List<String> list = new ArrayList<>(); 
	for (int i = 0; i < 9; i++) {
		list.add("adb shell input keyevent 4");
		list.add("adb shell input keyevent 4");
		list.add("adb shell input keyevent 84");
		list.add("adb shell input text "+SearchWords[i]);
		list.add("adb shell input keyevent 66");
		list.add("adb shell input keyevent 84");
		list.add("adb shell input keyevent 3");
		list.add("adb shell input keyevent 4");
		list.add("adb shell input keyevent 4");
		list.add("adb shell input keyevent 4");
		list.add("adb shell input keyevent 4");
		list.add("adb shell input keyevent 3");
	}
	return list;
}

public  List<String> Bookmarks (){
	List<String> list = new ArrayList<>(); 
	list.add("adb shell input keyevent 84");
	list.add("adb shell input text "+SearchWords[0]);
	list.add("adb shell input keyevent 66");
	list.add("adb shell input keyevent 82");
	list.add("adb shell input keyevent 20");
	list.add("adb shell input keyevent 20");
	list.add("adb shell input keyevent 20");
	list.add("adb shell input keyevent 66");
	list.add("adb shell input keyevent 66");
	list.add("adb shell input keyevent 3");
	list.add("adb shell input keyevent 3");
	for (int i = 0; i < 3; i++) {
		
		list.add("adb shell input keyevent 84");
		list.add("adb shell input text "+SearchWords[i]);
		list.add("adb shell input keyevent 66");
		list.add("adb shell input keyevent 82");
		
		list.add("adb shell input keyevent 66");
		list.add("adb shell input keyevent 66");
		list.add("adb shell input keyevent 3");
		list.add("adb shell input keyevent 3");
	}
	list.add("adb shell input keyevent 3");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 4");
	list.add("adb shell input keyevent 3"); 
	return list;
}

public  List<String> MakeCalls (){
	List<String> list = new ArrayList<>(); 
	for (int i = 0; i <9; i++) {	
	list.add("adb  shell am start -a android.intent.action.CALL -d tel:"+russianNumber[i]);
	list.add("adb shell input keyevent 6");
	list.add("adb  shell am start -a android.intent.action.CALL -d tel:"+IranNumber[i]);
	list.add("adb shell input keyevent 6");
	list.add("adb  shell am start -a android.intent.action.CALL -d tel:"+ChinesNumber[i]);
	list.add("adb shell input keyevent 6");
	}
return list;
}


}
