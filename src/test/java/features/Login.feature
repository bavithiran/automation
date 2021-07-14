Feature: Testing Newstuck
    Verifing Scenarios for Newstuck Website


    @Testing
    Scenario Outline: To get all the links in home page
        Given Access WebDriverManager
        Given Find all the links in the HomePage

        Examples:
            | Website   |
            | Framework |

    @SmokeTest
    Scenario Outline: Selecr date and time Formate
        Given Read Excel

        Examples:
            | Website   |
            | Framework |

    @FindText
    Scenario Outline: To find given text
        Given Access WebDriverManager
        Given Search for a text in Homewebpage
        Given Access WebDriverManager
        Given Search word in AboutUsPage
        Given Access WebDriverManager
        Given Search word in OurPortfolios
        Given Access WebDriverManager
        Given Search word in LifeAtPro
        Given Access WebDriverManager
        Given Search word in Careers


        Examples:
            | Website   |
            | Framework |

    @SurveyForm001
    Scenario Outline: Survey form - Creating a survey form Test
        Given Access WebDriverManager For Survey Form
        Then Launch chrome browser for survey form
        Then Enter Phone number for survey form
        Then Then click countinue button
        Then Then click countinue button
        Then Wait action for "20" seconds
        Then Click Main Option
        Then Verify User Details
        Then Click Add Form Button
        Then Verify Add form Page
        Then Enter form title name
        Then Enter form Subtitle name
        Then Click add button in survey builder form
        Then Add text field
        Then Enter Question in text field
        Then Wait action for "5" seconds
        Then Save survey
        Then Wait action for "5" seconds
        Then Quit driver


        Examples:
            | Website   |
            | Framework |


    @TotalField
    Scenario Outline: Survey form - Creating a survey form Test
        Given Access WebDriverManager For Survey Form
        Then Launch chrome browser for survey form
        Then Enter Phone number for survey form
        Then Then click countinue button
        Then Then click countinue button
        Then Wait action for "20" seconds
        Then Click Main Option
        Then Verify User Details
        Then Click Add Form Button
        Then Verify Add form Page
        Then Enter form title name
        Then Enter form Subtitle name
        Then Add Field and Questions
        Then Wait action for "7" seconds
        Then Save survey
        Then Verify Save
        Then Quit driver


        Examples:
            | Website   |
            | Framework |