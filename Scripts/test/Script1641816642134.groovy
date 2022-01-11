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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://41.215.180.245:8085/Retail/#/login')

WebUI.setText(findTestObject('Object Repository/test/input_Username_username'), 'narayana')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input_visibility_off_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/test/button_Login'))

WebUI.click(findTestObject('Object Repository/test/a_Transfers'))

WebUI.click(findTestObject('Object Repository/test/div_Add BeneficiaryAdd beneficiary desc'))

WebUI.click(findTestObject('Object Repository/test/div_Internal BeneficiaryAdd an Indo Zambia _a6663b'))

WebUI.setText(findTestObject('Object Repository/test/input_Nick Name_nickName'), 'testing')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input_Account No_accountNumber'), 'FL/XYsZQntge5GTQdJCcIg==')

WebUI.setText(findTestObject('Object Repository/test/input_Confirm Account No_confirmAccountNumber'), '0011031001091')

WebUI.setText(findTestObject('Object Repository/test/input_Transfer Limit_transferAmount'), '10.00')

WebUI.click(findTestObject('Object Repository/test/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/test/h6_testing'), 'testing')

WebUI.verifyElementText(findTestObject('Object Repository/test/h6_0011031001091'), '0011031001091')

WebUI.verifyElementText(findTestObject('Object Repository/test/span_10.00'), '10.00')

WebUI.click(findTestObject('Object Repository/test/button_Submit_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'abkeNdhXnEA=')

WebUI.click(findTestObject('Object Repository/test/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/test/button_Done'))

WebUI.click(findTestObject('Object Repository/test/div_Manage BeneficiariesView your Beneficia_84f650'))

WebUI.setText(findTestObject('Object Repository/test/input_International_search'), 'testing')

WebUI.click(findTestObject('Object Repository/test/div_testing'))

WebUI.verifyElementText(findTestObject('Object Repository/test/div_testing'), 'testing')

WebUI.verifyElementText(findTestObject('Object Repository/test/div_0011031001091'), '0011031001091')

WebUI.verifyElementText(findTestObject('Object Repository/test/div_10 USD'), '10 USD')

WebUI.click(findTestObject('Object Repository/test/button_Edit Beneficiary'))

WebUI.click(findTestObject('Object Repository/test/button_Delete Beneficiary'))

WebUI.setEncryptedText(findTestObject('Object Repository/test/input'), 'abkeNdhXnEA=')

WebUI.click(findTestObject('Object Repository/test/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/test/button_Done'))

WebUI.click(findTestObject('Object Repository/test/img'))

WebUI.click(findTestObject('Object Repository/test/div_Logout'))

WebUI.click(findTestObject('Object Repository/test/button_Yes'))

WebUI.closeBrowser()

