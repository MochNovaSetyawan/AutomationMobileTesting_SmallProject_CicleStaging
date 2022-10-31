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

Mobile.tap(findTestObject('Object Repository/Blash/Blash icon'), 0)

Mobile.tap(findTestObject('Object Repository/Blash/Plus sign'), 0)

Mobile.tap(findTestObject('Object Repository/Blash/Title text coloumn'), 0)

Mobile.setText(findTestObject('Blash/Title text coloumn'), 'Project QA', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Blash/Description text coloumn'), 0)

Mobile.setText(findTestObject('Blash/Description text coloumn'), 'Project 0.1', 0)

Mobile.hideKeyboard()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(758, 1877, 732, 1323)

Mobile.delay(2)

Mobile.tap(findTestObject('Blash/Publish button'), 0)

Mobile.delay(2)

Mobile.pressBack()
