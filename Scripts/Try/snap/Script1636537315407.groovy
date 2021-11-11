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

Mobile.startApplication('C:\\Users\\User\\Downloads\\Snapdeal_base.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (22)'), '560085', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - UPDATE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add to Cart (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 40'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add to Cart (9)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Silver  40'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Welcome'), 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\User\\Downloads\\Snapdeal_base.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (4)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (22)'), '560085', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - UPDATE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add to Cart (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 40'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add to Cart (9)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Silver  40'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Welcome'), 0)

Mobile.closeApplication()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.snapdeal.com/')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site India - Shop Elec_edf924/div_T-Shirts  Polos'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site India - Shop Elec_edf924/div_Veirdo 100 Percent Cotton Green Color B_fb9e25'))

WebUI.switchToWindowTitle('Veirdo 100 Percent Cotton Green Color Block T-Shirt - Buy Veirdo 100 Percent Cotton Green Color Block T-Shirt Online at Low Price - Snapdeal.com')

WebUI.click(findTestObject('Object Repository/Page_Veirdo 100 Percent Cotton Green Color _d522e3/span_add to cart'))

WebUI.click(findTestObject('Object Repository/Page_/i_1'))

