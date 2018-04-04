package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.ExternalItems;

import NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.EduWaveSafeAndSecurityForms.SectionsForm.SectionsForms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class ExternalItems {

    private By ExternalItemsLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");

    //مدير عام الامن والسلامة/ أضافة البنود الخارجية
    @Test
    public void addExternalItems() throws InterruptedException {


        SectionsForms AddSection = new SectionsForms();
        AddSection.addSectionsToTheForm();


        WebElement ExternalItemsLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalItemsLinkLocator));
        ExternalItemsLinkLocatorWait.click();

        List ExternalItemsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));

        int TableSize = ExternalItemsTableList.size();

        System.out.println("TableSize::" + TableSize);

        if (TableSize <= 1) {
            int TableSizeAdd = ExternalItemsTableList.size() + 2;
            String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
            System.out.println("TableSizeAdd::" + TableSizeAdd);
            System.out.println("TableSizeAddFormat::" + TableSizeAddFormat);


            By AddDescLink1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
            Random Rand = new Random();
            int RandomNumber = Rand.nextInt(1000000);

            WebElement AddDescLinkWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink1));
            AddDescLinkWait.sendKeys("Rami" + RandomNumber);

            By AddLinkLocator1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");

            WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator1));
            AddLinkLocatorWait.click();

            By MeesageResultLocator=By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

            WebElement MeesageResultLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator));

            String ActualResult=browserQA.findElement(MeesageResultLocator).getText();
            String ExcpectedResult="تم إضافة البند الخارجي بنجاح.";

            Assert.assertEquals(ActualResult,ExcpectedResult,"لم تتم إضافة البند  الخارجي بنجاح.");


        }

        if (TableSize >= 2 && TableSize < 22) {

            int TableSizeAdd = ExternalItemsTableList.size() + 1;
            String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
            System.out.println("TableSizeAdd::" + TableSizeAdd);
            System.out.println("TableSizeAddFormat::" + TableSizeAddFormat);

            By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
            Random Rand = new Random();
            int RandomNumber = Rand.nextInt(1000000);

            WebElement AddDescLinkWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2));
            AddDescLinkWait.sendKeys("Rami" + RandomNumber);

            By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");

            WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2));
            AddLinkLocatorWait.click();


            By MeesageResultLocator2=By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

            WebElement MeesageResultLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator2));

            String ActualResult=browserQA.findElement(MeesageResultLocator2).getText();
            String ExcpectedResult="تم إضافة البند الخارجي بنجاح.";

            Assert.assertEquals(ActualResult,ExcpectedResult,"لم تتم إضافة البند  الخارجي بنجاح.");


        }
        if (TableSize >= 22) {
            int TableSizeAdd = ExternalItemsTableList.size();
            String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
            System.out.println("TableSizeAdd::" + TableSizeAdd);
            System.out.println("TableSizeAddFormat::" + TableSizeAddFormat);

            By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
            Random Rand = new Random();
            int RandomNumber = Rand.nextInt(1000000);

            WebElement AddDescLinkWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2));
            AddDescLinkWait.sendKeys("Rami" + RandomNumber);

            By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");

            WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2));
            AddLinkLocatorWait.click();


            By MeesageResultLocator3=By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

            WebElement MeesageResultLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator3));

            String ActualResult=browserQA.findElement(MeesageResultLocator3).getText();
            String ExcpectedResult="تم إضافة البند الخارجي بنجاح.";

            Assert.assertEquals(ActualResult,ExcpectedResult,"لم تتم إضافة البند  الخارجي بنجاح.");
        }


    }
}
