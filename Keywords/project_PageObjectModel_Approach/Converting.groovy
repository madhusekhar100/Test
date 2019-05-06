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

public class Converting {
	
	@Keyword
	
	def converting(){
		println ("Lead Converting to Account And Opportunity")
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/LeadConversion_WebElements/ConvertIcon'), 20)
		WebUI.click(findTestObject('Object Repository/LeadConversion_WebElements/ConvertIcon'))
		WebUI.delay(2)
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/LeadConversion_WebElements/ClickConvert'), 10)
		WebUI.click(findTestObject('Object Repository/LeadConversion_WebElements/ClickConvert'))
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/LeadConversion_WebElements/Convert_Button'), 20)
		
		for(int i = 0; i<=3 ; i++){
			if(WebUI.check(findTestObject('Object Repository/LeadConversion_WebElements/Convert_Button'))){
				WebUI.click(findTestObject('Object Repository/LeadConversion_WebElements/Convert_Button'))
				break;
			} else {
			println ("Loop Initiated again");
		}
			break;
		}
		
		WebUI.click(findTestObject('Object Repository/LeadConversion_WebElements/Convert_Button'))
		println ("Lead is successfully converted into Account and Opportunity");
		
	}
}
