/*
 * Created By Rami AlShawabkeh  4/5/18 10:18 AM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.TheReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class AllReports {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By ReportsMainMenuLocator = By.id("divMenuItem_325");
    private By SearchLinkLocator = By.id("lisearch_list");
    private By DistributeStudentsToClassesReportLocator = By.linkText("توزيع الطلاب على الفصول");
    private By ddlLearningGenderLocatorDSTC = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By ddlLearningGenderSearchLocatorDSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlDistrictLocatorDSTC = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/span[1]/span[1]/span/span[2]");
    private By ddlDistrictSearchLocatorDSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlStudylevelLocatorDSTC = By.id("select2-ctl00_PlaceHolderMain_ddlStudylevel-container");
    private By ddlStudylevelSearchLocatorDSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlSchoolCategorizationLocatorDSTC = By.id("select2-ctl00_PlaceHolderMain_ddlSchoolCategorization-container");
    private By ddlSchoolCategorizationSearchLoactorDSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocatorDSTC = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By BTNBackLoactorDSTC = By.id("ctl00_PlaceHolderMain_ibtnBack");


    //التقارير_تقارير المدارس
    //توزيع الطلاب على الفصول
    @Test
    public void ViewDistributeStudentsToClassesReport()  {

        System.out.println("توزيع الطلاب على الفصول");

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();


        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();


        browserQA.findElement(SearchLinkLocator).click();

        WebElement DistributeStudentsToClassesReportLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DistributeStudentsToClassesReportLocator));
        DistributeStudentsToClassesReportLocatorWait.click();

        WebElement ddlLearningGenderWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGenderLocatorDSTC));
        ddlLearningGenderWait.click();
        browserQA.findElement(ddlLearningGenderSearchLocatorDSTC).sendKeys("بنين" , Keys.ENTER);


        try {
            WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocatorDSTC));
            ddlDistrictLocatorWait.click();
        } catch (Exception e) {
            WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocatorDSTC));
            ddlDistrictLocatorWait.click();
        }

        WebElement ddlDistrictSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictSearchLocatorDSTC));
        ddlDistrictSearchLocatorWait.sendKeys("الحد الغربي" , Keys.ENTER);


        try {
            WebElement ddlStudylevelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelLocatorDSTC));
            ddlStudylevelLocatorWait.click();
        } catch (Exception e) {

            WebElement ddlStudylevelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelLocatorDSTC));
            ddlStudylevelLocatorWait.click();
        }

        browserQA.findElement(ddlStudylevelSearchLocatorDSTC).sendKeys("الثانوية" , Keys.ENTER);


        try {
            WebElement ddlSchoolCategorizationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationLocatorDSTC));
            ddlSchoolCategorizationLocatorWait.click();
        } catch (Exception e) {
            WebElement ddlSchoolCategorizationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationLocatorDSTC));
            ddlSchoolCategorizationLocatorWait.click();
        }
        browserQA.findElement(ddlSchoolCategorizationSearchLoactorDSTC).sendKeys("حكومي" , Keys.ENTER);

        try {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorDSTC));
            btnSearchLocatorWait.click();
        } catch (Exception e) {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorDSTC));
            btnSearchLocatorWait.click();
        }



    }

    private By BuildingInformationReportLocator = By.linkText("بيانات المباني");
    private By GenderLocatorBI = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLocatorBI = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLDistrictLocatorBI = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By DDLDistrictSearchLocatorBI = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocatorBI = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By BTNBackLoactorBI = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //التقارير_تقارير المباني والصيانة
    //بيانات المباني
    @Test
    public void BuildingInformationReport() throws InterruptedException {


        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();

        WebElement SearchLinkLocatorrWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator));
        SearchLinkLocatorrWait.click();

        WebElement BuildingInformationReportLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BuildingInformationReportLocator));
        BuildingInformationReportLocatorWait.click();

        WebElement GebderWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorBI));
        GebderWait.click();

        WebElement GenderSearchLocatorBIWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLocatorBI));
        GenderSearchLocatorBIWait.sendKeys("بنين" , Keys.ENTER);

        Thread.sleep(1000);
        WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocatorBI));
        ddlDistrictLocatorWait.click();

        WebElement ddlDistrictSearchLocatorBIWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictSearchLocatorBI));
        ddlDistrictSearchLocatorBIWait.sendKeys("الحد الغربي" , Keys.ENTER);


        try {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorBI));
            btnSearchLocatorWait.click();
        } catch (Exception e) {
            WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorBI));
            btnSearchLocatorWait.click();
        }

        By ReportTitleLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/table/tbody/tr/td/div");

        WebElement ReportTitleWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactor));
        String TitleForTheReport = browserQA.findElement(ReportTitleLoactor).getText();
        String Title = "بيانات المباني";
        Assert.assertEquals(TitleForTheReport , Title , "التقرير المطلوب غير موجود");

        Thread.sleep(1000);
        browserQA.findElement(BTNBackLoactorBI).click();


    }


}
