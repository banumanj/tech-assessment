package utilities.Api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class BaseTest {

    private static RequestSpecification Request;

    ApiConfig apiConfig= new ApiConfig();
    private String BASE_URI = apiConfig.getPropertyValue("petstore.base.url");
    private String BASE_PATH = apiConfig.getPropertyValue("petstore.base.path");

    public BaseTest(){
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri(BASE_URI);
        builder.setBasePath(BASE_PATH);
        builder.setContentType(ContentType.JSON);
        builder.setAccept(ContentType.JSON);
        builder.addFilter(new RequestLoggingFilter(LogDetail.ALL));
        builder.addFilter(new ResponseLoggingFilter(LogDetail.ALL));
        RequestSpecification requestSpec = builder.build();
        Request = RestAssured.given().spec(requestSpec);
    }

    public static ResponseOptions<Response> GetRespwithqueryParams(String url, Map<String, Object> pathParams) {
        Request.queryParams(pathParams);
        try {
            return Request.get(new URI(url));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }


}
