# Curious-Monkey
<b>Curious-Monkey</b>: is an extended version of Monkey UI events generator that provoides the ability to generate system events and handle the must used evasion techniques by Android malware dynamically.

Foldes overview:

1-<b> Curious-Monkey </b>: This folder contains the original code of Monkey (that is responsible for generating UI events), and the code of system events. In this version we sit Monkey to generate 10000 events for two times.

2- <b>Anti-vm</b>: This folder includes some fake files that need to be pushed to the /data/local/tmp path in the emulator. Some malware can read system files to detect the emulator existence. So we made fake files and directed the methods that can be used to access the system files to the /data/local/tmp directory to read the fake files that include information about real device instead of emulator.

3- <b>apk</b>: This folder contains json file that need to be pushed to the /data/local/tmp path in the emulator. and <b>SetValues.apk </b>app. This app is a Xposed Module that hooks some predefined sensitive APIs, used as evasion techniques by malware, and sets their returned values to values similar to the real device values. 

  
