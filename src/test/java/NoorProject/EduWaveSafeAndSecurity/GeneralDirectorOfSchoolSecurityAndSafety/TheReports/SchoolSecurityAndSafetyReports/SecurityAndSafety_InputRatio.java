/*
 * Created By Rami Alshawabkeh  3/14/18 2:07 PM
 */


package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.TheReports.SchoolSecurityAndSafetyReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;


public class SecurityAndSafety_InputRatio {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By ReportsMainMenuLocator = By.id("divMenuItem_325");
    private By SearchLinkLocator = By.id("lisearch_list");

    private By TheReportNameLocator = By.linkText("الأمن والسلامة - نسبة الإدخال");

    private By GenderLocator = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLoactor = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlFormNameLoactor = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");
    private By ddlFormNameSearchLoactor = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By btnBackLocator = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //    //التقارير_تقارير الامن والسلامة المدرسية
    //الأمن والسلامة-نسب الإدخال على مستوى الوزارة
    @Test
    public void SecurityAndSafety_InputRatioReport() throws InterruptedException {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();

        browserQA.findElement(SearchLinkLocator).click();

        WebElement TheReportNameLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocator));
        TheReportNameLocatorWait.click();

        try {
            WebElement GenderLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocator));
            GenderLocatorWait.click();
        } catch (Exception e) {
            WebElement GenderLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocator));
            GenderLocatorWait.click();
        }

        WebElement GenderSearchLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLoactor));
        GenderSearchLoactorWait.sendKeys("بنين" , Keys.ENTER);

        try {

            WebElement ddlFormNameLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlFormNameLoactor));
            ddlFormNameLoactorWait.click();
        } catch (Exception e) {

            WebElement ddlFormNameLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlFormNameLoactor));
            ddlFormNameLoactorWait.click();

        }

        WebElement ddlFormNameSearchLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlFormNameSearchLoactor));
        ddlFormNameSearchLoactorWait.sendKeys("Rami0550814558" , Keys.ENTER);

        try {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocator));
            btnSearchLocatorWait.click();
        } catch (Exception f) {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocator));
            btnSearchLocatorWait.click();
        }

        By ReportInsideLabelLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[3]/table/tbody/tr/td/div/div");
        WebElement ReportInsideLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportInsideLabelLocator));
        String ddd = browserQA.findElement(ReportInsideLabelLocator).getText();
        String ggg = "الأمن والسلامة-نسب الإدخال على مستوى الوزارة";

        Assert.assertEquals(ddd , ggg , "التقرير غير موجود");

        Thread.sleep(1000);
        WebElement btnBackLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnBackLocator));
        btnBackLocatorWait.click();


    }
}
