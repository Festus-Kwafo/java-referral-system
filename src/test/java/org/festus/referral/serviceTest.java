package org.festus.referral;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class serviceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/referral")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}