Feature: adactin hotal boooking

Scenario: user login adactin  
      Given user adactin url lunch in web application
      When user enter the username
      And user enter the passward
      Then user click the login 
      
 Scenario: search hotel search hotel page
       When  user Select Location from drop down list in location field
       And   user Select hotel from drop down list in location field
       And   user Select room type from drop down list in location field
       And   user Select number of Rooms from drop down list in location field
       And   user Enter check in date in location field
       And   user Enter check out date in location field
       And   user Select number of adults from drop down list in location field
       And   user Select number of children from drop down list in location field
       Then  User Click The Search Button and navigate to select hotel page
       
Scenario:   user confirm the search hotel room page
       When user click the select butten
       Then user click the continue Button it Navigates to book a hotel app
       
Scenario: user Book The Room And Payment Details In Search Hotel Page
       When  user Enter The valid First Name 
       And user Enter the Valid Last name
       And user Enter the Valid Billing Address
       And user Enter the Valid Credit Card No
       And user Enter the Credit Card Type
       And user Select The Month In The Expiry Date Bax
       And user Select The Year In The Expiry Date Bax
       And user Enter the CVV Number
       Then User Click The Book Now Button It Navigates to The Booking Configuration Page
       
Scenario: User Logout The My Itinerary Page
       Then User Click The Logout Button
             
