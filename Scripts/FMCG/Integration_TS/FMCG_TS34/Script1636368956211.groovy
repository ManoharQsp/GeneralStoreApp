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

Mobile.startApplication('C:\\Users\\User\\Desktop\\Katalon\\FMCG.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN (6)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (16)'), 'manumanohar239@icloud.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (17)'), 'Manu80859', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Login (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Image - frozen20new201-500x500 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - cart 0 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - CHECKOUT arrow forward'), 0)

String expAddress = 'Katruguppe, Bangalore'

String actAddress = Mobile.getText(findTestObject('Object Repository/android.view.View (14)'), 0)

if (expAddress == actAddress) {
    print('Address is Correct')
}

Mobile.closeApplication()

