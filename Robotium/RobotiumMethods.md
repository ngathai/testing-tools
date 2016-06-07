**Source: http://www.softwaretestinghelp.com/robotium-tutorial-android-application-ui-testing-tool/**
#1. assertCurrentActivity (text,Activity)
This method verifies whether the current activity is the activity which is passed as the send parameter.
Syntax

1
solo.assertCurrentActivity("Current Activity", Home.class);
#2. clickOnButton(text)
This method will click on the button with the specified Text.
Syntax:

1
solo.clickOnButton("ADMIN");
#3. clickOnButton(int)
This method will click on the button with the specified index.
Syntax:

1
solo.clickOnButton(2);
#4. waitForText(text)
This method will wait until the text appearing on the activity.
Syntax:

1
solo.waitForText("Creating New Password");
#5. enterText(int, text)
This method will type the text passed as the second parameter to the specified index editbox.
Syntax:

1
solo.enterText(0,"test");
#6. clickOnCheckbox(int)
This Method will click on the checkbox with given index.
Syntax:

1
solo.clickOnCheckBox(0);
#7. clickOnRadioButton(int)
This Method will click on the Radio button with the given index.
Syntax:

1
solo.clickOnRadioButton(1);
#8. clickOnImage(int)
This Method will click on the image with the given index.
Syntax:

1
solo.clickOnImage(1);
#9. clearEditText(int)
This Method will clear the text in the edit box with the given index.
Syntax:1
solo.clearEditText(0);
#10. waitForText(text)
This Method will wait until the given text is appearing on the activity.
Syntax:

1
solo.waitForText(“Robotium”);
Example Program

Locating Elements in Android Application

Step – 1
Open Eclipse containing Android Application to be Tested.

Step – 2
Expand the project , Go to res ? Layout folder and double click on the activity XML file, you want to automate. It will open the designed activity on the eclipse editor.

Step – 3
Locating Button Element

Locating Element By ID
Click on the Element , you want to locate. On the right side properties panel, you can find the ID of that element. (ignore @+id/)

(Click on image to enlarge)

robotium tutorial-5

In the Above figure ID of the element is, btnadmin.

Corresponding Robotium code to locate this button is,

1
solo.clickOnButton(R.id.btnadmin);
Locating Element By Position

robotium tutorial-6

In case, if ID is not available then you can locate the element using the order. If the button is in the second position, Then you can locate the button by,

1
solo.clickOnButton(1);
Locating Element By Text

robotium tutorial-7

Even you can click on the button using the text displayed on the button.

1
Solo.clickOnButton(“ADMIN”);
Locating Text box Element 
Using Similar way click on the text box you want to enter data and find the position of the text box from the right side.

robotium tutorial-8

1
Solo.enterText(0,”Anitha”);
2
//Username textbox is in 1st position
1
Solo.enterText(1,”test”);  
2
//Password textbox is in 2nd position
Locating a Radio Button Element
Click on the Radio Button Element , you want to click and find out the position of the radio button.

robotium tutorial-9

1
Solo.clickOnRadioButton(1);
2
//It will location radio button in the second position.
Sample Code

1
package com.sasi.attendanceproject.test;
2
import android.test.ActivityInstrumentationTestCase2;
3
import android.widget.EditText;
4
 
5
import com.robotium.solo.By;
6
import com.robotium.solo.Solo;
7
import com.robotium.solo.WebElement;
8
import com.sasi.attendanceproject.Home;
9
 
10
public class AttendanceTest extends ActivityInstrumentationTestCase2<Home>{
11
    private Solo solo;
12
    public AttendanceTest() {
13
        super("com.sasi.attendanceproject.Home",Home.class);
14
        // TODO Auto-generated constructor stub
15
    }
16
 
17
    public void setUp()throws Exception{
18
        solo=new Solo(getInstrumentation(),getActivity());
19
    }
20
    public void testAttendance()throws Exception{
21
        //solo.assertCurrentActivity("Current Activity", Home.class);
22
        solo.waitForWebElement(By.id("btnadmin"));
23
        solo.clickOnButton("ADMIN");
24
        solo.clickOnButton(0);
25
        solo.waitForText("Creating New Password");
26
        solo.enterText(0, "test");
27
        solo.enterText(1, "test");
28
        solo.clickOnButton("Okay");
29
        solo.waitForText("Attendance Login");
30
        solo.enterText(0, "Anitha");
31
        solo.enterText(1, "test");
32
        solo.clickOnButton("Login");
33
        solo.waitForWebElement(By.id("btnaddnew"));
34
        solo.clickOnButton("Add New Details");
35
        solo.waitForText("Enter the Employee Details");
36
        solo.enterText(0, "Anitha");
37
        solo.enterText(1, "6");
38
        solo.enterText(2, "Testing Engineer");
39
        solo.clickOnRadioButton(1);
40
        solo.clickOnButton("Okay");
41
        solo.waitForWebElement(By.id("tvempID"));
42
        System.out.println(solo.getText(0));
43
 
44
    }
45
    public void tearDown()throws Exception{
46
        solo.finishOpenedActivities();}}
Executing Robotium Project

From Eclipse:

Right click on the project and select Run As -> Android Junit Test

From Command Prompt:

Step 1:
Cd to your Android Test Project Directory

Step 2:
Run the following command,

1
adb shell am instrument -w <<package name of your test
2
class>>/android.test.InstrumentationTestRunner
robotium tutorial-10

Conclusion

Robotium is the most commonly used Android Test automation tool.
Robotium Testcases can be executed on Android Emulator as well as the Real device, we don’t need to write any specific configuration code to run Robotium test cases on Real device.
Robotium Can be easily written in maven project also, and it can be run through continuous integration tools.
Thus, Robotium is very useful in writing easy/simple Android Test automation scripts.
Recommended reading => 5 Mobile Testing Challenges and Solutions

About the author: This is a guest post by Anitha Eswari. She is currently working as a senior testing engineer with more than three years of extensive experience in web and mobile automation testing. She is having sound knowledge in various automation testing tools including mobile testing tools like Robotium and Appium.

Feel free to share your queries/experience in comments about the Robotium – the most popular Android UI testing tool.
