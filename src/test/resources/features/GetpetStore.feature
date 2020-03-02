Feature:
  Verify PetStore API

  Scenario: Verify the pets by status
    Given The Pet store is up and running for PetStore
    When a user perform a get request to find pets "pet/findByStatus"
    Then the response code should be 200
    And find the count of pets by
      |status|name |TotalPets|
      |available|doggie|12    |
