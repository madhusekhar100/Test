import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Application_URL)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('LoginPage_WebElements/username'), 10)

WebUI.click(findTestObject('LoginPage_WebElements/username'))

WebUI.sendKeys(findTestObject('LoginPage_WebElements/username'), GlobalVariable.Username)

WebUI.sendKeys(findTestObject('Object Repository/LoginPage_WebElements/password'), GlobalVariable.Password)

WebUI.waitForElementClickable(findTestObject('Object Repository/LoginPage_WebElements/Login'), 10)

WebUI.click(findTestObject('Object Repository/LoginPage_WebElements/Login'))

println('User logged in salesforce application successfully')

println('Creating the Lead ')

Thread.sleep(5000)

WebUI.waitForElementClickable(findTestObject('Object Repository/LeadPage_WebElements/Leads_HomeButton'), 50)

WebUI.click(findTestObject('Object Repository/LeadPage_WebElements/Leads_HomeButton'))

WebUI.waitForElementPresent(findTestObject('Object Repository/LeadPage_WebElements/Lead_New Button'), 20)

WebUI.click(findTestObject('Object Repository/LeadPage_WebElements/Lead_New Button'))

WebUI.waitForElementClickable(findTestObject('Object Repository/LeadPage_WebElements/Salutation'), 20)

WebUI.click(findTestObject('Object Repository/LeadPage_WebElements/Salutation'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/LeadPage_WebElements/Salutation_Selection'), 20)

WebUI.click(findTestObject('Object Repository/LeadPage_WebElements/Salutation_Selection'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/LeadPage_WebElements/FirstName'), 5)

WebUI.sendKeys(findTestObject('LeadPage_WebElements/FirstName'), findTestData('Project_TestDataSheet/TestData').getValue(
        2, 1))

WebUI.sendKeys(findTestObject('Object Repository/LeadPage_WebElements/LastName'), findTestData('Project_TestDataSheet/TestData').getValue(
        3, 1))

WebUI.scrollToElement(findTestObject('Object Repository/LeadPage_WebElements/Company'), 10)

WebUI.sendKeys(findTestObject('Object Repository/LeadPage_WebElements/Company'), findTestData('Project_TestDataSheet/TestData').getValue(
        4, 1))

WebUI.sendKeys(findTestObject('Object Repository/LeadPage_WebElements/Email'), findTestData('Project_TestDataSheet/TestData').getValue(
        5, 1))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LeadPage_WebElements/Save'))

println('Lead Converting to Account And Opportunity')

WebUI.waitForElementClickable(findTestObject('Object Repository/LeadConversion_WebElements/ConvertIcon'), 20)

WebUI.click(findTestObject('Object Repository/LeadConversion_WebElements/ConvertIcon'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/LeadConversion_WebElements/ClickConvert'), 10)

WebUI.click(findTestObject('Object Repository/LeadConversion_WebElements/ClickConvert'))

WebUI.waitForElementClickable(findTestObject('Object Repository/LeadConversion_WebElements/Convert_Button'), 20)

for (int i = 0; i <= 3; i++) {
    if (WebUI.check(findTestObject('Object Repository/LeadConversion_WebElements/Convert_Button'))) {
        WebUI.click(findTestObject('Object Repository/LeadConversion_WebElements/Convert_Button'))

        break
    } else {
        println('Loop Initiated again')
    }
    
    break
}

WebUI.click(findTestObject('Object Repository/LeadConversion_WebElements/Convert_Button'))

println('Lead is successfully converted into Account and Opportunity')