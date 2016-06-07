**Set up environment** <br>
1. Install JDK <br>
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html <br>
2. Download and install ADT Bundle <br>
http://robotium.com/pages/installation <br>
OR <br> 
Plugin for Eclipse: https://marketplace.eclipse.org/content/robotium-recorder
3. Download Genimotion emulator <br>
https://www.genymotion.com/download/ <br>
4. Install Genymotion plugin for ADT or Eclipse <br>
http://plugins.genymotion.com/eclipse <br>
5. Set ANDROID_HOME: <br>
- Right-click Computer > Properties > Advance System Settings > Environment variables > User variable > New <br>
- Enter ANDROID_HOME and  C:\Users\Nadie\Desktop\adt-bundle-windows\sdk;C:\Users\Nadie\Desktop\adt-bundle-windows\sdk\tools\;C:\Users\Nadie\Desktop\adt-bundle-windows\sdk\platform-tools\<br>
5. Run Virtual box > Create New > Start <br>
6. Start Genymotion <br>
7. Connect Eclipse and Genymotion: <br>
- Genymotion > Setting > ADB > Use custom Android SDK tools > Select SDK folder (C:/Users/Nadie/Desktop/adt-bundle-windows/sdk) <br>
- Eclipse > Run > Run Config > Android Application > Target > Always prompt to pick device > Run.<br>


