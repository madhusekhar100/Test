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

public class SalesforceLogin {
	
	@Keyword
	
	def Login_SalesforceApplication(){
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl(GlobalVariable.Application_URL)
		
		WebUI.maximizeWindow()
		
		WebUI.waitForElementPresent(findTestObject('LoginPage_WebElements/username'), 10)
		
		WebUI.click(findTestObject('LoginPage_WebElements/username'))
		
		WebUI.sendKeys(findTestObject('LoginPage_WebElements/username'), GlobalVariable.Username)
		
		WebUI.sendKeys(findTestObject('Object Repository/LoginPage_WebElements/password'), GlobalVariable.Password)
		
		WebUI.click(findTestObject('Object Repository/LoginPage_WebElements/Login'))
		
		println ("User logged in salesforce application successfully")
	} 
	
	
}
