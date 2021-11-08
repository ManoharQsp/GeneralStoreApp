import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\User\\Desktop\\Katalon\\General-Store (1).apk', true)

Mobile.scrollToText('Iraq')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Iraq'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter name here (11)'), 'Manohar', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton - Male (10)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lets  Shop (11)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - ADD TO CART (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout'), 0)

Mobile.closeApplication()

