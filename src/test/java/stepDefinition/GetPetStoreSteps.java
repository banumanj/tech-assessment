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
import utilities.Api.BaseTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetPetStoreSteps {
    private static ResponseOptions<Response> response;
    private BaseTest baseTest = new BaseTest();
    private Map<String, Object> queryParameter = new HashMap<String, Object>();

    @Given("^The Pet store is up and running for PetStore$")
    public void the_Pet_store_is_up_and_running_for_PetStore() throws Throwable {
        System.out.println("Load the base Url ");
    }

    @When("^a user perform a get request to find pets \"([^\"]*)\"$")
    public void a_user_perform_a_get_request_to_find_pets(String url) throws Throwable {
        queryParameter.put("status", "available");
        response = BaseTest.GetRespwithqueryParams(url, queryParameter);
    }

    @Then("^the response code should be (\\d+)$")
    public void the_response_code_should_be(int statusCode) throws Throwable {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("^find the count of pets by$")
    public void find_the_count_of_pets_by(DataTable dataTable) throws Throwable {
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
                    if(pet.getStatus().equals(status)) {
                        assertions.assertEquals(pet.getName(), name);
                        assertions.assertEquals(pet.getStatus(), status);
                        count++;
                    }
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
