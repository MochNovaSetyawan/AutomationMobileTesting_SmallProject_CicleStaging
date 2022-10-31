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

Mobile.tap(findTestObject('Group and chat/Team-Project01'), 0)

Mobile.tap(findTestObject('Board/Board icon'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(600, 495)

Mobile.tap(findTestObject('Object Repository/Board/Plus label'), 0)

Mobile.tap(findTestObject('Board/Creates new label'), 0)

Mobile.tap(findTestObject('Object Repository/Board/Name your label'), 0)

Mobile.setText(findTestObject('Object Repository/Board/Name your label 2'), 'key', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Board/Pink'), 0)

Mobile.tap(findTestObject('Board/Submit button (4)'), 0)

Mobile.tap(findTestObject('Board/Tap pink'), 0)

Mobile.pressBack()

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.pressBack()
