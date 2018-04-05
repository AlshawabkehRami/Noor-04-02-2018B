/*
 * Created By Rami AlShawabkeh  4/5/18 12:03 PM
 */

package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class VisitsTypes {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By SettingsMenuLoactor = By.id("divMenuItem_5894");
    private By VisitsTypesLocator = By.linkText("أنواع الزيارات");

    @Test

    public void addVisitsTypes() {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        WebElement SettingsMenuLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SettingsMenuLoactor));
        SettingsMenuLoactorWait.click();



            WebElement VisitsTypesLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(VisitsTypesLocator));
            VisitsTypesLocatorWait.click();

            List VisitsTypesTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));

            int TableSzie = VisitsTypesTableList.size();

            System.out.println(TableSzie);

            if (TableSzie <= 1) {

                int TableSizeAdd = VisitsTypesTableList.size() + 2;
                String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);

                By VisitsTypesDescLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + TableSizeAddFormat + "_tbVisitTypeDesc");

                Random Rand = new Random();
                int RandomNumber = Rand.nextInt(1000000);

                WebElement VisitsTypesDescLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(VisitsTypesDescLocator));
                VisitsTypesDescLocatorWait.sendKeys("VisitsTypes" + RandomNumber);

                By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + TableSizeAddFormat + "_lbtnAdd");

                WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator));
                AddLinkLocatorWait.click();
            }

            if (TableSzie >= 2 && TableSzie < 22) {

                int TableSizeAdd = VisitsTypesTableList.size() + 1;
                String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);

                By VisitsTypesDescLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + TableSizeAddFormat + "_tbVisitTypeDesc");

                Random Rand = new Random();
                int RandomNumber = Rand.nextInt(1000000);

                WebElement VisitsTypesDescLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(VisitsTypesDescLocator));
                VisitsTypesDescLocatorWait.sendKeys("VisitsTypes" + RandomNumber);

                By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + TableSizeAddFormat + "_lbtnAdd");

                WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator));
                AddLinkLocatorWait.click();

            }

        if (TableSzie >= 22){


            int TableSizeAdd = VisitsTypesTableList.size();
            String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);

            By VisitsTypesDescLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + TableSizeAddFormat + "_tbVisitTypeDesc");

            Random Rand = new Random();
            int RandomNumber = Rand.nextInt(1000000);

            WebElement VisitsTypesDescLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(VisitsTypesDescLocator));
            VisitsTypesDescLocatorWait.sendKeys("VisitsTypes" + RandomNumber);

            By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + TableSizeAddFormat + "_lbtnAdd");

            WebElement AddLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator));
            AddLinkLocatorWait.click();


        }

    }
}
