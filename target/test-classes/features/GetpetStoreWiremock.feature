Feature:
  Verify PetStore API with Wiremock

  Scenario: Verify the pets by status using wiremock
    Given The Pet store API
    When a user perform a request get all the pets by "pet/findByStatus"
    Then the response code returned should be 200
    And verify the count of pets
      |status|name |TotalPets|
      |available|doggie|9  |