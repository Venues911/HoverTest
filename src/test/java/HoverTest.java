import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HoverTest {
    @Test
    void menuHoverTest() {

        open("https://github.com/");
     //   $(".header-menu-wrapper").$(byTagAndText("button","Solutions" )).should(appear);
        $(byTagAndText("button", "Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".application-main").shouldHave(text("To build, scale, and deliver secure software."));
        sleep(2000);
    }
}