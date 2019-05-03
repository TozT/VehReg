Feature: Check registration of vehicle

Scenario: Registration searched is displayed in results
Given user is on search page 
And the user has the registration “OV12UYY”
When user submits registration
Then web page displays Results for “OV12UYY”


#Scenario: Registration searched shows start of insurance cover
#Given the user is on the search page 
#And the user has the registration “OV12UYY”
#When the user submits the registration
#Then web page displays Cover start: “dd/mm/yyyy:00:00”

#Scenario: Registration searched shows end of insurance cover
#Given the user is on the search page 
#And the user has the registration “OV12UYY”
#When the user submits the registration
#Then web page displays  Cover end:  “dd/mm/yyyy:00:00”

#Scenario: Invalid registration searched displays error message
#Given the user is on the search page  
#And the user has a registration that doesn’t exist
#When the user submits the registration
#Then the web page will display  “Sorry record not found”