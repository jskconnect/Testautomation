@NewsValidation @smoke @newsregression
Feature: Confirm the news is valid by Searching in Google


@confirmnews
Scenario: Confirm the news is valid and not fake
Given Launch the application 
Then navigate to "News" home page
And Search for the news and confirm the news is valid


@Checknews @searchConfirmNews
Scenario Outline: To Confirm the news is valid
Given Launch the application 
Then navigate to "News" home page
And I confirm the news "<splitword>" by searching in google 
|<newsToSearch>|
Examples: 
|newsToSearch                                     |splitword    |
|Laura Muir keeps faith and is rewarded with Olympic |   silver     |