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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/test/a_Transfers'))

WebUI.click(findTestObject('Object Repository/test/div_Add BeneficiaryAdd beneficiary desc'))

WebUI.click(findTestObject('Object Repository/test/div_Internal BeneficiaryAdd an Indo Zambia _a6663b'))

WebUI.setText(findTestObject('Object Repository/test/input_Nick Name_nickName'), nickmane)

WebUI.setText(findTestObject('Object Repository/test/input_Account No_accountNumber'), accno)

WebUI.setText(findTestObject('Object Repository/test/input_Confirm Account No_confirmAccountNumber'), accno)

WebUI.setText(findTestObject('Object Repository/test/input_Transfer Limit_transferAmount'), '10.00')

WebUI.click(findTestObject('Object Repository/test/button_Submit'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Object Repository/test/h6_testing'), nickmane)

WebUI.verifyElementText(findTestObject('Object Repository/test/h6_0011031001091'), accno)

WebUI.verifyElementText(findTestObject('Object Repository/test/span_10.00'), '10.00')

WebUI.click(findTestObject('Object Repository/test/button_Submit_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'abkeNdhXnEA=')

WebUI.click(findTestObject('Object Repository/test/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/test/button_Done'))

WebUI.click(findTestObject('Object Repository/test/div_Manage BeneficiariesView your Beneficia_84f650'))

WebUI.setText(findTestObject('Object Repository/test/input_International_search'), nickmane)

WebUI.click(findTestObject('Object Repository/test/div_testing'))

WebUI.verifyElementText(findTestObject('Object Repository/test/div_testing'), nickmane)

WebUI.verifyElementText(findTestObject('Object Repository/test/div_0011031001091'), accno)

WebUI.verifyElementText(findTestObject('Object Repository/test/div_10 USD'), '10 ZMW')

WebUI.click(findTestObject('Object Repository/test/button_Edit Beneficiary'))

WebUI.click(findTestObject('Object Repository/test/button_Delete Beneficiary'))

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'abkeNdhXnEA=')

WebUI.click(findTestObject('Object Repository/test/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/test/button_Done'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/test/img'))

WebUI.click(findTestObject('Object Repository/test/div_Logout'))

WebUI.click(findTestObject('Object Repository/test/button_Yes'))

WebUI.closeBrowser()

