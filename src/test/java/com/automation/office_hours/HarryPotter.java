package com.automation.office_hours;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HarryPotter {
    String key="$2a$10$0C88vabfUSwPpSJek5zfSu32ez324iJUacSpQMlr8r02bwhXfXet2";

    @BeforeAll
    public static void setup(){
        baseURI="https://www.potterapi.com/v1/";
    }
    @Test
    public void sortingHatTest(){
        given().
                log().
                all().
          when().
                get("sortingHat").
                prettyPeek().
           then().
                statusCode(200).
                contentType(ContentType.JSON).
                body( Matchers.anyOf(
                        containsString("Gryﬃndor"),
                        containsString("Ravenclaw"),
                        containsString("Slytherin"),
                        containsString("Huﬄepuﬀ")));
    }
}
