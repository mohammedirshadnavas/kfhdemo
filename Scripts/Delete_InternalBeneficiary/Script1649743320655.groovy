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

WebUI.click(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/Transfers_Button'))

WebUI.click(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/Manage Beneficiaries_Button'))

WebUI.click(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/Beneficiary_Name'))

WebUI.click(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/EditBeneficiary_Button'))

WebUI.click(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/DeleteBeneficiary_Button'))

WebUI.setEncryptedText(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/OTP_Field'), 
    'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/OTP_Field'), 
    'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/OTP_Field'), 
    'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/OTP_Field'), 
    'abkeNdhXnEA=')

WebUI.click(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/OTPSubmit_Button'))

WebUI.click(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/VerifyBeneficiaryRemovedSuccessfully_Text'))

WebUI.click(findTestObject('Object Repository/Indo Zambia Bank_Repository/DeleteInternalBeneficiaryPageObjects/Done_Button'))

WebUI.closeBrowser()

