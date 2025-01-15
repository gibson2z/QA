import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTests {

    @Test
    void selenideSearchTest() {
        // Открыть google
        open("https://google.com");

        element(byId("L2AGLb")).click();

        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(Condition.text("selenide.org"));
    }
}
