package executionEngine;

import ExcelUtility.ReadExcelSheet;
import keywordDriven.ActionKeywords;

public class executionTest {
    public static void main(String[] args) {
        try {
            ReadExcelSheet rs = new ReadExcelSheet();
            rs.readExcelData(4);
            ActionKeywords ak = new ActionKeywords();
            ak.openBrowser();
            ak.navigate();
            ak.enterEmail();
            ak.enterPassword();
            ak.clickSignIn();
            ak.profileImage();
            ak.logout();
            ak.closeBrowser();
            System.out.println("Test executed successfully");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
