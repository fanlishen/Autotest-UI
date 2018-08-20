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
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

InternalData data = findTestData('account')

for (def index : (0..data.getRowNumbers() - 1)) {
    if (condition) {
        line_selection

        WebUI.verifyElementText(findTestObject(null), '')
    }
    
    WebUI.openBrowser('')

    WebUI.navigateToUrl(data.internallyGetValue('url', index))

    WebUI.click(findTestObject('webpage/Page_login/input_choiceschool'))

    WebUI.click(findTestObject('webpage/Page_login/Page_/li_test--ff'))

    WebUI.setText(findTestObject('webpage/Page_login/input_account'), data.internallyGetValue('account', index))

    WebUI.setText(findTestObject('webpage/Page_login/input_pwd'), data.internallyGetValue('pwd', index))

    WebUI.click(findTestObject('webpage/Page_login/button_login'))
}

