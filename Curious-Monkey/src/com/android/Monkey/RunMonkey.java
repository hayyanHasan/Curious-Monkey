package com.android.Monkey;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.android.process.Execute;

public class RunMonkey {
	private Execute exe = new Execute();
	public  void RunMonkey (String packageName) throws IOException, InterruptedException {
		
		
		
		
		
		String result = "adb shell monkey -p "+ packageName+" -v 10000 --kill-process-after-error  -s 700 --monitor-native-crashes --ignore-crashes --ignore-timeouts --ignore-security-exceptions ";
		
		System.out.println(result);
		exe.runprocess(result);
		TimeUnit.SECONDS.sleep(60);
	}

}
