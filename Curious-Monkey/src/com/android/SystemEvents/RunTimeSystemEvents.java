package com.android.SystemEvents;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.android.CheckConnectivity.CheckConnectivity;
import com.android.process.Execute;

public class RunTimeSystemEvents {

	private List<String> RunTime_List = new ArrayList<>(); 
	private List<String> LongRunTime_List = new ArrayList<>(); 
	
	private Execute exe = new Execute();
	private CheckConnectivity ch = new CheckConnectivity();	
	
private  void Fill_Lists(){
		

//intents 	
LongRunTime_List.add("adb shell am broadcast -a android.intent.action.BOOT_COMPLETED");
LongRunTime_List.add("adb shell am broadcast -a android.net.conn.CONNECTIVITY_CHANGE");	
LongRunTime_List.add("adb shell am broadcast -a android.intent.action.PHONE_STATE");
LongRunTime_List.add("adb shell am broadcast -a android.intent.action.TIMEZONE_CHANGED");

RunTime_List.add("adb shell am broadcast -a android.appwidget.action.APPWIDGET_UPDATE");
RunTime_List.add("adb shell am broadcast -a android.media.AUDIO_BECOMING_NOISY");
RunTime_List.add("adb shell am broadcast -a android.intent.action.BATTERY_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.BATTERY_LOW");
RunTime_List.add("adb shell am broadcast -a android.intent.action.BATTERY_OKAY");


RunTime_List.add("adb shell am broadcast -a android.intent.action.INPUT_METHOD_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_EJECT");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_MOUNTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_SCANNER_FINISHED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_UNMOUNTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.NEW_OUTGOING_CALL");
RunTime_List.add("adb shell am broadcast -a android.intent.action.PACKAGE_ADDED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.PACKAGE_REMOVED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.PACKAGE_REPLACED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.ACTION_POWER_CONNECTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.ACTION_POWER_DISCONNECTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.ACTION_SHUTDOWN");
RunTime_List.add("adb shell am broadcast -a android.provider.Telephony.SMS_RECEIVED");	

RunTime_List.add("adb shell am broadcast -a android.intent.action.TIME_SET ");

RunTime_List.add("adb shell am broadcast -a android.intent.action.UMS_CONNECTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.UMS_DISCONNECTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.USER_PRESENT");
RunTime_List.add("adb shell am broadcast -a android.provider.Telephony.WAP_PUSH_RECEIVED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.WALLPAPER_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.PACKAGE_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.TIME_TICK");

RunTime_List.add("adb shell am broadcast -a android.intent.action.SCREEN_ON");
RunTime_List.add("adb shell am broadcast -a android.intent.action.SCREEN_OFF");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_REMOVED");
RunTime_List.add("adb shell am broadcast -a android.net.wifi.WIFI_STATE_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE");

RunTime_List.add("adb shell am broadcast -a android.intent.action.PACKAGE_INSTALL");
RunTime_List.add("adb shell am broadcast -a android.media.RINGER_MODE_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.GTALK_CONNECTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.PACKAGE_RESTARTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_SCANNER_SCAN_FILE");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_SCANNER_STARTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.REBOOT");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_SHARED");

RunTime_List.add("adb shell am broadcast -a android.intent.action.ACTION_SHUTDOWN");
RunTime_List.add("adb shell am broadcast -a android.intent.action.DEVICE_STORAGE_LOW");
RunTime_List.add("adb shell am broadcast -a android.intent.action.DEVICE_STORAGE_OK");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_BAD_REMOVAL");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_CHECKING");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.adapter.action.DISCOVERY_FINISHED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.adapter.action.DISCOVERY_STARTED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.adapter.action.LOCAL_NAME_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.device.action.ACL_DISCONNECTED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.device.action.NAME_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.device.action.FOUND");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.device.action.BOND_STATE_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.adapter.action.REQUEST_DISCOVERABLE");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.adapter.action.REQUEST_ENABLE");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.device.action.CLASS_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.device.action.ACL_CONNECTED");
RunTime_List.add("adb shell am broadcast -a android.bluetooth.device.action.PAIRING_REQUEST");
RunTime_List.add("adb shell am broadcast -a android.provider.Telephony.SIM_FULL");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_NOFS");
RunTime_List.add("adb shell am broadcast -a android.intent.action.DOCK_EVENT");
RunTime_List.add("adb shell am broadcast -a android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED");
RunTime_List.add("adb shell am broadcast -a android.speech.tts.engine.TTS_DATA_INSTALLED");
RunTime_List.add("adb shell am broadcast -a android.media.VIBRATE_SETTING_CHANGED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.MEDIA_BUTTON");
RunTime_List.add("adb shell am broadcast -a android.intent.action.DREAMING_STARTED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.DREAMING_STOPPED");
RunTime_List.add("adb shell am broadcast -a android.intent.action.HEADSET_PLUG");
RunTime_List.add("adb shell am broadcast -a android.os.action.POWER_SAVE_MODE_CHANGED");
RunTime_List.add("adb shell input keyevent 3");
RunTime_List.add("adb shell input keyevent 4");
RunTime_List.add("adb shell input keyevent 4");
RunTime_List.add("adb shell input keyevent 4");
RunTime_List.add("adb shell input keyevent 4");
RunTime_List.add("adb shell input keyevent 3");
//Phone_State

RunTime_List.add("adb shell sqlite3 /data/data/com.android.providers.settings/databases/settings.db \"update global SET value = 1 WHERE name = 'preferred_network_mode'\"");
RunTime_List.add("adb shell sqlite3 /data/data/com.android.providers.settings/databases/settings.db \"select value FROM secure WHERE name = 'preferred_network_mode'\"");
RunTime_List.add("adb shell settings put global airplane_mode_on 1");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true");
RunTime_List.add("adb shell settings put global airplane_mode_on 0");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state false");

RunTime_List.add("adb shell input keyevent 84");
RunTime_List.add("adb shell input text \"hayyan\"");
RunTime_List.add("adb shell input keyevent 66");
RunTime_List.add("adb shell input keyevent 84");
RunTime_List.add("adb shell input text \"MDSE\"");
RunTime_List.add("adb shell input keyevent 66");
RunTime_List.add("adb shell am broadcast -a android.intent.action.REBOOT");
RunTime_List.add("adb shell settings put system screen_brightness 200");
RunTime_List.add("adb shell settings put system screen_brightness 100");
RunTime_List.add("adb shell settings put system screen_brightness 50");
RunTime_List.add("adb shell settings put global wifi_on 0");
RunTime_List.add("adb shell am start -a android.intent.action.MAIN -n com.android.settings/.wifi.WifiSettings");
RunTime_List.add("adb shell input keyevent  66");
RunTime_List.add("adb shell settings put global bluetooth_on 0");
RunTime_List.add("adb shell settings put global auto_time_zone 1");
RunTime_List.add("adb shell settings put global auto_time 1");
RunTime_List.add("adb shell settings put global assisted_gps_enabled 1");
RunTime_List.add("adb shell settings put global call_auto_retry 0");
RunTime_List.add("adb shell settings put global dock_sounds_enabled 0");
RunTime_List.add("adb shell settings put global emergency_tone 0");
RunTime_List.add("adb shell settings put global heads_up_notifications_enabled 0");
RunTime_List.add("adb shell settings put global low_battery_sound_timeout 0");
RunTime_List.add("adb shell settings put global mobile_data 0");
RunTime_List.add("adb shell settings put global power_sounds_enabled 0");
RunTime_List.add("adb shell input keyevent 3");
RunTime_List.add("adb shell input keyevent 4");
RunTime_List.add("adb shell input keyevent 4");
RunTime_List.add("adb shell input keyevent 4");
RunTime_List.add("adb shell input keyevent 4");
RunTime_List.add("adb shell input keyevent 3");

//data
RunTime_List.add("adb shell svc data disable");
RunTime_List.add("adb shell svc data enable");
//Network
RunTime_List.add("adb shell sqlite3 /data/data/com.android.providers.settings/databases/settings.db \"update global SET value = 1 WHERE name = 'preferred_network_mode'\"");
RunTime_List.add("adb shell sqlite3 /data/data/com.android.providers.settings/databases/settings.db \"select value FROM secure WHERE name = 'preferred_network_mode'\"");
RunTime_List.add("adb shell settings put global airplane_mode_on 1");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true");
RunTime_List.add("adb shell settings put global airplane_mode_on 0");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state false");
RunTime_List.add("adb shell sqlite3 /data/data/com.android.providers.settings/databases/settings.db \"update global SET value = 11 WHERE name = 'preferred_network_mode'\"");
RunTime_List.add("adb shell sqlite3 /data/data/com.android.providers.settings/databases/settings.db \"select value FROM secure WHERE name = 'preferred_network_mode'\"");
RunTime_List.add("adb shell settings put global airplane_mode_on 1");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true");
RunTime_List.add("adb shell settings put global airplane_mode_on 0");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state false");
RunTime_List.add("adb shell sqlite3 /data/data/com.android.providers.settings/databases/settings.db \"update global SET value = 2 WHERE name = 'preferred_network_mode'\"");
RunTime_List.add("adb shell sqlite3 /data/data/com.android.providers.settings/databases/settings.db \"select value FROM secure WHERE name = 'preferred_network_mode'\"");
RunTime_List.add("adb shell settings put global airplane_mode_on 1");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state true");
RunTime_List.add("adb shell settings put global airplane_mode_on 0");
RunTime_List.add("adb shell am broadcast -a android.intent.action.AIRPLANE_MODE --ez state false");


//battery
RunTime_List.add("adb shell dumpsys battery set level 2");
RunTime_List.add("adb shell dumpsys battery set level 10");
RunTime_List.add("adb shell dumpsys battery set level 15");
RunTime_List.add("adb shell dumpsys battery set level 25");
RunTime_List.add("adb shell dumpsys battery set level 50");
RunTime_List.add("adb shell dumpsys battery set level 75");
RunTime_List.add("adb shell dumpsys battery set level 100");
RunTime_List.add("adb shell dumpsys battery set ac 1");
RunTime_List.add("adb shell dumpsys battery set ac 10");
RunTime_List.add("adb shell dumpsys battery set ac 20");
RunTime_List.add("adb shell dumpsys battery set ac 30");
RunTime_List.add("adb shell dumpsys battery set ac 40");
RunTime_List.add("adb shell dumpsys battery set ac 50");
RunTime_List.add("adb shell dumpsys battery set invalid 1");

																
}	
	
public void  RunTimeEvents() throws IOException, InterruptedException {

		 
		Fill_Lists();	

			TimeUnit.SECONDS.sleep(2);
		
				for (String comand : LongRunTime_List) {
				
					System.out.println(comand);
					exe.runprocess(comand);	
					TimeUnit.SECONDS.sleep(15);
					
				}
		
				for (String comand : RunTime_List) {
					
					System.out.println(comand);
					exe.runprocess(comand);	
					TimeUnit.MILLISECONDS.sleep(500);
					
			}
				
			

				
				
					
			
			
		}	
	
	
	
}
