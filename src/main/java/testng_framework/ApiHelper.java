package testng_framework;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;

public class ApiHelper extends Constant {

  private org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(ApiHelper.class);

  public Response getReq(String uri) {
    return RestAssured.given().get(uri);
  }

  public JsonPath getJsonPath(Response res) {
    return res.jsonPath();
  }

  public JsonPath getReqJsonPath(String uri) {
    return getReq(uri).jsonPath();
  }

  public String getReqAsString(String uri) {
    return getReq(uri).getBody().asString();
  }

  public String getReqAsStringWithBasicAuth(String uri, String username, String password) {
    return RestAssured.given().auth().preemptive().basic(username, password).when().get(uri).getBody().asString();
  }

  public String putReq(String uri) {
    return RestAssured.given().put(uri).body().toString();
  }

  public String postReq(String uri, String body) {
    return RestAssured.given().body(body).contentType(ContentType.JSON).post(uri).then().statusCode(200).extract()
      .response().getBody().asString();

  }

  public Response postReq(String uri, String ContentType, File file) {
    return RestAssured.given().multiPart(ContentType, file).when().post(uri).then().statusCode(200).extract()
      .response();
  }

  public String postReq(String uri, String body, Integer statusCode) {
    return RestAssured.given().body(body).contentType(ContentType.JSON).post(uri).then().statusCode(statusCode)
      .extract().response().getBody().asString();
  }

  public String patchReq(String uri, String body) {
    return RestAssured.given().body(body).contentType(ContentType.JSON).patch(uri).then().statusCode(200).extract()
      .response().getBody().asString();
  }

  public Response patchReq(String uri, HashMap<String, Object> headers, String body, int statusCode) {
    if (headers == null) {
      return RestAssured.given().contentType(ContentType.JSON).body(body).patch(uri).then().statusCode(statusCode)
        .extract().response();
    } else {
      return RestAssured.given().contentType(ContentType.JSON).headers(headers).body(body).patch(uri).then()
        .statusCode(statusCode).extract().response();
    }
  }

  public String putReq(String uri, String body) {
    return RestAssured.given().body(body).contentType(ContentType.JSON).put(uri).then().statusCode(200).extract()
      .response().getBody().asString();
  }

  public Response putReq(String uri, HashMap<String, String> headers, String body, int statusCode) {
    return (Response) RestAssured.given().body(body).contentType(ContentType.JSON).headers(headers).put(uri).then()
      .statusCode(statusCode).extract().response().getBody();
  }

  public Response deleteReq(String uri) {
    return RestAssured.given().delete(uri).andReturn();
  }

  public Response deleteReq(String uri, String body) {
    return RestAssured.given().body(body).delete(uri).then().extract().response();
  }

  public Response postReq(String uri, String body, ContentType contentType, HashMap<String, Object> headers,
    int expectedStatus) {
    if (headers == null)
      return RestAssured.given().contentType(contentType).body(body).post(uri).then().statusCode(expectedStatus)
        .extract().response();
    else
      return RestAssured.given().contentType(contentType).headers(headers).body(body).post(uri).then()
        .statusCode(expectedStatus).extract().response();
  }

  public Response getReq(String uri, HashMap<String, Object> headers, int expectedStatus, String... body) {
    if (body.length != 0) {
      if (headers == null)
        return RestAssured.given().body(body).get(uri).then().statusCode(expectedStatus).extract().response();
      else
        return RestAssured.given().body(body).headers(headers).get(uri).then().statusCode(expectedStatus).extract()
          .response();
    } else {
      if (headers == null)
        return RestAssured.given().get(uri).then().statusCode(expectedStatus).extract().response();
      else
        return RestAssured.given().headers(headers).get(uri).then().statusCode(expectedStatus).extract().response();
    }
  }

  public String convertObjectToJson(Object object) {
    try {
      return new GsonBuilder().disableHtmlEscaping().create().toJson(object);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public <T> T convertJsonToObject(String json, Type type) {
    try {
     return new Gson().fromJson(json, type);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

}

