import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_subjcetInterest/page_test/Page_/div_subjectInterestitem'))

WebUI.click(findTestObject('Page_subjcetInterest/page_test/Page_/button_startTest1'))

WebUI.click(findTestObject('Page_subjcetInterest/page_test/Page_/button_starttest2'))

for (int i = 0; i <= 66; i++) {
    CustomKeywords.'com.JavascriptClick.clickUsingJS'(findTestObject('Page_subjcetInterest/page_test/Page_/span_answer'))

    WebUI.delay(1)
}

WebUI.click(findTestObject('Object Repository/Page_subjcetInterest/page_testinterest/Page_/li_66'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_subjcetInterest/page_test/Page_/button_submit (2)'))
WebUI.delay(5)

