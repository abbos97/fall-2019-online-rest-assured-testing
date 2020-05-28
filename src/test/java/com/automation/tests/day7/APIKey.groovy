package com.automation.tests.day7

import io.restassured.response.Response
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;

class APIKey {
    private final String API_KEY = "29055371";

    @BeforeAll
    public static void setup() {
        baseURI = "http://omdbapi.com/";
    }

    @Test
    public void getMovieTest() {
        String itemToSearch = "Frozen";
        Response response = given().
                queryParam("t", itemToSearch).
                queryParam("apikey", API_KEY).
                when().
                get().prettyPeek();
        response.then().
                assertThat().
                statusCode(200).
                body("Title", containsString(itemToSearch));

        List<Map<String, String>> ratings = response.jsonPath().get("Ratings");
        System.out.println("Ratings values:: " + ratings);
    }

    @Test

    public void authenticationTest() {
        String itemToSearch = "Frozen";
        Response response = given().
                queryParam("t", itemToSearch).
                when().
                get().prettyPeek();
        response.then().
                assertThat().
                statusCode(401).
                body("Error", is("No API key provided."));
    }

}