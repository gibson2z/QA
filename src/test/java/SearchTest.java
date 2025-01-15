import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import element.web;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchTest {

    @Test
    void selenideSearchTest() {
        //Открыть https://google.com
        open("https://www.google.com/");

        element(byId("L2AGLb")).click();

        //Найти пользоваеля
        $(byName("q")).setValue("Dshkaa").pressEnter();

        //Проверить, что пользователь появился в результатах поиска
        $("html").shouldHave(Condition.text("@dshkaa"));

        //Открыть профиль
        element(byXpath("//div[@class='byrV5b']")).click();

        sleep(10000);
    }
}
