package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {   //Kanca


    // Cucumbera ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after(Scenario senaryo) // Cucumberın ototmatik senaryo ile ilgili bilgiler değişkeni
    {
        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/CucumberTestSonuçlari.xlsx",
                senaryo.getName(),
                senaryo.isFailed() ? "Fail": "Passed"
        );

        // aşağıdaki bölüm sadece extend report plugini devrede ise açılır
//        if (senaryo.isFailed()){
//            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
//           byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
//            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
//        }

        GWD.quitDriver();
    }
}
