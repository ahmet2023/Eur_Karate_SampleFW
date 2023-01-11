Feature: Zipcode API

      # When I send get request to http://api.zippopotam.us/{country}/{postal-code}
  Background: zipcode base url
    * url zipcode_url

    Scenario: Get zipcodes info US/78729
      And path 'US'
      And path '78729'
      When method get
      * print response
      Then status 200
      And match header Content-Type == "application/json"
      And match response.country == 'United States'
      And match response.places[0].state == 'Texas'
      And match response.places[0].['place name'] == 'Austin'
