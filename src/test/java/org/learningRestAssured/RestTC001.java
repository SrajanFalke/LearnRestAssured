package org.learningRestAssured;

import io.restassured.RestAssured;

public class RestTC001 {
    public static void main(String[] args) {
        RestAssured.
                given().
                  baseUri("https://restful-booker.herokuapp.com").
                    basePath("/booking/1").log().all().
                when().
                   get().
                then().
                   statusCode(200);
    }
}
