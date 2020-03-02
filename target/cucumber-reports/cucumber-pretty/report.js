$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GetpetStore.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "Verify PetStore API",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the pets by status",
  "description": "",
  "id": ";verify-the-pets-by-status",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The Pet store is up and running for PetStore",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "a user perform a get request to find pets \"pet/findByStatus\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the response code should be 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "find the count of pets by",
  "rows": [
    {
      "cells": [
        "status",
        "name",
        "TotalPets"
      ],
      "line": 9
    },
    {
      "cells": [
        "available",
        "doggie",
        "2"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "GetPetStoreSteps.the_Pet_store_is_up_and_running_for_PetStore()"
});
formatter.result({
  "duration": 1780371700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pet/findByStatus",
      "offset": 43
    }
  ],
  "location": "GetPetStoreSteps.a_user_perform_a_get_request_to_find_pets(String)"
});
formatter.result({
  "duration": 2275657000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 28
    }
  ],
  "location": "GetPetStoreSteps.the_response_code_should_be(int)"
});
formatter.result({
  "duration": 5439900,
  "status": "passed"
});
formatter.match({
  "location": "GetPetStoreSteps.find_the_count_of_pets_by(DataTable)"
});
formatter.result({
  "duration": 2122068300,
  "status": "passed"
});
formatter.uri("GetpetStoreWiremock.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "Verify PetStore API with Wiremock",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the pets by status using wiremock",
  "description": "",
  "id": ";verify-the-pets-by-status-using-wiremock",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The Pet store API",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "a user perform a request get all the pets by \"pet/findByStatus\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the response code returned should be 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify the count of pets",
  "rows": [
    {
      "cells": [
        "status",
        "name",
        "TotalPets"
      ],
      "line": 9
    },
    {
      "cells": [
        "available",
        "doggie",
        "10"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "GetPetStoreWiremockSteps.the_Pet_store_API()"
});
formatter.result({
  "duration": 85500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pet/findByStatus",
      "offset": 46
    }
  ],
  "location": "GetPetStoreWiremockSteps.a_user_perform_a_request_get_all_the_pets_by(String)"
});
formatter.result({
  "duration": 573471800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 37
    }
  ],
  "location": "GetPetStoreWiremockSteps.the_response_code_returned_should_be(int)"
});
formatter.result({
  "duration": 117900,
  "status": "passed"
});
formatter.match({
  "location": "GetPetStoreWiremockSteps.verify_the_count_of_pets(DataTable)"
});
formatter.result({
  "duration": 41597300,
  "status": "passed"
});
});