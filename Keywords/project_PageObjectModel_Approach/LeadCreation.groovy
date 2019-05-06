package project_PageObjectModel_Approach

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class LeadCreation {

	@Keyword

	def Lead(){

		WebUI.waitForElementClickable(findTestObject('Object Repository/LeadPage_WebElements/Leads_HomeButton'), 20)

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

		WebUI.sendKeys(findTestObject('Object Repository/LeadPage_WebElements/LastName'),  findTestData('Project_TestDataSheet/TestData').getValue(
				3, 1))

		WebUI.scrollToElement(findTestObject('Object Repository/LeadPage_WebElements/Company'), 10)
		WebUI.sendKeys(findTestObject('Object Repository/LeadPage_WebElements/Company'),  findTestData('Project_TestDataSheet/TestData').getValue(
				4, 1))

		WebUI.sendKeys(findTestObject('Object Repository/LeadPage_WebElements/Email'), findTestData('Project_TestDataSheet/TestData').getValue(
				5, 1))

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LeadPage_WebElements/Save'))
	}
}
