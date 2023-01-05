Feature: Register

  Scenario: Check and fill the register fields
    Given I open the website
    Then  The cookies box is displayed
    And   The displayed text in the box is "We use cookies to make our website more enjoyable and relevant to you."
    And   The "Tell me more" hyperlink is displayed
    And   The hyperlink is the following "https://transfermate.io/en/cookies_info.asp"
    And   The button Cookies Accept Button displays the following text "I accept"
    When  I click on the I accept cookies button
    Then  The cookies box is not displayed
    And   The hyperlink for the Transfer Mate logo is the following "https://transfermate.io/?lng=&usr_ctry=113"
    And   The Home button shows text "Home"
    And   The Solutions DropDown shows text "Solutions"
    When  I click on the Solutions Dropdown
    Then  The fields "Business" and "Education" are displayed
    And   I check the Individual Radio Box
    When  I click on the Country Dropdown
    And   I click on the Romania option
    And   I fill the First Name input with "Dumitrel"
    And   I fill the Last Name input with "Anghel"
    And   I fill the Email input with "anghel_dumitrel@yahoo.com"
    And   I select Romania Option from the Mobile Phone Dropdown
    And   I fill the Phone Number Input with "751348691"
    And   I check the Terms of Use and Privacy checkbox
    And   I check the News Letter and Privacy checkbox
    Then  I click on the Open my free account button

  Scenario: Open Mail and Confirm Registration
    Given I navigate to Yahoo Mail Website
    And   I input email "anghel_dumitrel@yahoo.com"
    Then  I click on the Navigate Forward Button
    When  I click on Send Phone Notification button
    Then  I click on the Activation Mail from Transfer Mate
    And   I click on Activate My Account button





