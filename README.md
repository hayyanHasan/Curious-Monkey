# Curious-Monkey
Curious-Monkey: is an extended version of Monkey UI events generator, that provoides the ability to generate system events and handle the must used anti-emulation techniques by Android Malware dynamically.

Foldes overview:

1- Curious-Monkey: this Folder contains the original code of Monkey (that is responsible for generating UI events), and the code of system events. In order to use the code we added two options (for system events )that can be added to the Monkey comand line option: like the follwoing
   a- --SetUp-Events: to provide set up system events.
   b- --RunTime-Events: to provide run time system events. 

In this version the only change that we made in the Monkey code, is in the Monkey.java class where we delete the main method and made the run method public instead of private. 

2- Anti-vm: includes some fake files that need to be pushed to the /data/local/tmp path in the emulator. Some malware can read system files to detect the emulator existence. So we made fake files and directed the methods that can be used to access the system files to the /data/local/tmp directory to read the fake files that include information about real device instead of emulator.

3- apk: this folder contains json file that need to be pushed to the /data/local/tmp ath in the emulator. and SetValues.apk app. This app is a Xposed Module that hooks some predefined sensitive APIs used as evasion techniques by malware and sets their returned values to values similar to the real device values. 

  
