package stepDefinition;

import Pet.Pet;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetPetStoreWiremockSteps {
    private String BASE_URI;
    private Map<String, Object> queryParameter = new HashMap<String, Object>();
    private ResponseOptions<Response> response;


    @Given("^The Pet store API$")
    public void the_Pet_store_API() throws Throwable {
        BASE_URI = "http://localhost:8090/";
    }


    @When("^a user perform a request get all the pets by \"([^\"]*)\"$")
    public void a_user_perform_a_request_get_all_the_pets_by(String url) throws Throwable {
        response =  given().when().get(BASE_URI+url);
    }

    @Then("^the response code returned should be (\\d+)$")
    public void the_response_code_returned_should_be(int statusCode) throws Throwable {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }


    @Then("^verify the count of pets$")
    public void verify_the_count_of_pets(DataTable dataTable) throws Throwable {
        List<List<String>> list = dataTable.asLists(String.class);
        String status = list.get(1).get(0);
        String name=list.get(1).get(1);
        int countOfPets= Integer.parseInt(list.get(1).get(2));
        List<Pet> pets = response.body().jsonPath().getList(".", Pet.class);
        SoftAssert assertions = new SoftAssert();
        assertions.assertEquals(response.getStatusCode(), 200);
        assertions.assertFalse(pets.isEmpty());
        int count = 0;
        for (Pet pet : pets) {
            try {
                if (!(pet.getName().equals(null)) && (pet.getName().equals(name))) {
                    assertions.assertEquals(pet.getName(), name);
                    assertions.assertEquals(pet.getStatus(), status);
                    count++;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        assertions.assertEquals(count,countOfPets);
        assertions.assertAll();
        System.out.println(count);
    }
}
