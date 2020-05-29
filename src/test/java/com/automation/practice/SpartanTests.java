package com.automation.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class SpartanTests {

    String base_Url="http://54.152.21.73:8000";

    @Test
    public void viewSpartanTest1(){
        Response response = RestAssured.get(base_Url + "/api/spartans");

        //print the status code
        System.out.println(response.statusCode());//except 200 -status code

        //print body
        //asString is same with prettyPeek()
        //one line
        System.out.println(response.body().asString());
       // System.out.println(response.body().prettyPeek());

        //If you want see body like postman use to prettyPrint
        System.out.println(response.body().prettyPrint());
    }

    /*When user send GET request to /api/spartans end point
    Then status code must be 200
    And body should contains Allen
     */
    @Test
    public <Response> void viewSpartanTest2(){
    Response response = (Response) get(base_Url + "/api/spartans");

   //Assert.assertEquals(respo);
}



}
