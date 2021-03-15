# Curious-Monkey
<b>Curious-Monkey</b>: is an extended version of Monkey UI events generator that provoides the ability to generate system events and handle the must used evasion techniques by Android malware dynamically.

Foldes overview:

1-<b> Curious-Monkey </b>: This folder contains the original code of Monkey (that is responsible for generating UI events), and the code of system events.
        
  In order to use the code we added two options (for system events )that can be added to the Monkey comand line options, like the follwoing:
                    
   a- <b>--SetUp-Events</b>: to provide set up system events.
   
   b- <b>--RunTime-Events</b>: to provide run time system events. 

In this version the only change that we made in  Monkey code, is in  <b>Monkey.java</b> class where we deleted the <b>main</b> method and made the <b>run</b> method public instead of private. 

2- <b>Anti-vm</b>: This folder includes some fake files that need to be pushed to the /data/local/tmp path in the emulator. Some malware can read system files to detect the emulator existence. So we made fake files and directed the methods that can be used to access the system files to the /data/local/tmp directory to read the fake files that include information about real device instead of emulator.

3- <b>apk</b>: This folder contains json file that need to be pushed to the /data/local/tmp path in the emulator. and <b>SetValues.apk </b>app. This app is a Xposed Module that hooks some predefined sensitive APIs, used as evasion techniques by malware, and sets their returned values to values similar to the real device values. 

  
