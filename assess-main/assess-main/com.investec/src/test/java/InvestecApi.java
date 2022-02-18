import common.DriverHandler;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class InvestecApi extends DriverHandler {
    String url = getProp().getProperty("api.url");

    @BeforeMethod

    @Test
    public void getPeopleList() {
        given().
                contentType(ContentType.JSON).
                log().all().
                when().
                get(url).
                then().log().all().assertThat().statusCode(200).
                body("results.find {it.name == 'R2-D2'}.skin_color", Matchers.is("white, blue"));
    }
}
