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

Mobile.scrollToText('Pakistan')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pakistan'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter name here (10)'), 'Manohar', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton - Male (9)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lets  Shop (10)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - ADD TO CART (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - ADD TO CART (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (3)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Air Jordan 4 Retro (2)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Air Jordan 1 Mid SE'), 0)

Mobile.closeApplication()
