package data;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class ApiHelper {
    private static RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("http://localhost")
            .setPort(8080)
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();

    public static void sendRequest(String body, int statusCode, String endpoint) {
        given()
                .spec(requestSpec)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .statusCode(statusCode);
    }
}
