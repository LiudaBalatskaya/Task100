package screenshot;

import Utilities.Driver;
import com.codeborne.selenide.testng.ScreenShooter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;


public class Screenshot extends ScreenShooter implements ITestListener {

    @Attachment(value = "Screenshot", type = "image/png")
    private static byte[] captureScreenshot() {
        try {
            File file1 = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(".\\target\\Screenshot\\screenshot.png"));
            return ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            return "Attachment Content Empty, can't create screenshot".getBytes();
        }
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        captureScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        captureScreenshot();
    }

}
