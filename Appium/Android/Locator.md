1. Run appium.exe <br>
2. Run the app on device/genymotion <br>
3. Click Search icon on Appium server to open Inspector <br>
OR <br>
open C:/Users/[Username]/android-sdks/tools/uiautomatorviewer.bat <br>
4. Click Refresh to catch screenshot, it will show all elements on the app <br>
<h2>HOW TO GET LOCATOR?</h2><br>
**1. By Xpath**<br>
<code> By.xpath("//android.widget.FrameLayout[@index='1']/android.widget.RelativeLayout/android.widget.TextView");</code><br>
**2. By Name**<br>
Name is "text" field of element on Inspector/UIViewer. <br>
<code> By.name.("Show Text");</code><br>
**3. By Class Name**<br>
className is "class" field of element on Inspector/UIViewer. <br>
<code> By.className("android.widget.ImageButton")</code><br>
