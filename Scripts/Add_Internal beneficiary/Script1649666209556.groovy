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

WebUI.delay(4)

WebUI.click(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/Transfers_Button'))

WebUI.click(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/Add Beneficiary_Button'))

WebUI.click(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/Internal Beneficiary_Button'))

WebUI.setText(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/Nick Name_Field'), 'Deno')

WebUI.setEncryptedText(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/Account No_Field'), '7Q1zCXe07ubEKj8NWGTWhg==')

WebUI.setText(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/Confirm Account No_Field'), '0041030004580')

WebUI.setText(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/Transfer Limit_Field'), '200.00')

WebUI.click(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/InternalBeneficiarySubmit_Button'))

WebUI.click(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/InternalBeneficiary_ConfirmSubmit_Button'))

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/OTP_Field'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/OTP_Field'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/OTP_Field'), 'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/OTP_Field'), 'abkeNdhXnEA=')

WebUI.delay(4)

WebUI.click(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/InternalBeneficiarySubmit_Button'))

WebUI.verifyElementPresent(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/VerifyAddBenificiary_Text'), 
    0)

WebUI.click(findTestObject('Indo Zambia Bank_Repository/AddBeneficiaryPageObjects/InternalBeneficiaryDone_Button'))

