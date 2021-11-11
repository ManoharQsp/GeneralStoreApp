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

//List<String[]> myList = new ArrayList<String[]>();
//while ((strLine = bufferedReader.readLine()) != null) {
//  myList.add(strLine.split(","));
//}


//
//def list = [1,2,3,4]
//for(item in list){
//	println item
//}



//def people = [
//	1: [name:'Bob', age: 32, gender: 'M'],
//	2: [name:'Johnny', age: 36, gender: 'M'],
//	3: [name:'Claire', age: 21, gender: 'F'],
//	4: [name:'Amy', age: 54, gender:'F']
//]
//
//def bob = people.find { it.value.name == 'Bob' } // find a single entry
//def females = people.findAll { it.value.gender == 'F' }
//
//// both return entries, but you can use collect to retrieve the ages for example
//def ageOfBob = bob.value.age
//def agesOfFemales = females.collect {
//	it.value.age
//}
//
//assert ageOfBob == 32
//assert agesOfFemales == [21,54]
//
//// but you could also use a key/pair value as the parameters of the closures
//def agesOfMales = people.findAll { id, person ->
//	person.gender == 'M'
//}.collect { id, person ->
//	person.age
//}
//assert agesOfMales == [32, 36]
//
//// `every` returns true if all entries match the predicate
//assert people.every { id, person ->
//	person.age > 18
//}
//
//// `any` returns true if any entry matches the predicate
//
//assert people.any { id, person ->
//	person.age == 54
//}

