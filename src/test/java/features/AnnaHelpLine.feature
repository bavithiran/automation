Feature: Testing AnnaHelpline
    Verifing Scenarios for AnnaHelpline

    @AnnaHelpLine
    Scenario Outline:  AnnaHelp Line
        Given Access BrowserStack For AnnaHelpLine
        Then Launch chrome browser for AnnaHelpLine
        Then Click Login for AnnaHelpLine
        Then Enter Phone number for AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Then click countinue button AnnaHelpLine
        Then Enter otp
        Then Then click countinue button AnnaHelpLine
        Then Wait action for "10" seconds AnnaHelpLine
        Then Click new Complaint
        Then choose issue location
        Then choose issue street
        Then enter Address
        Then choose issue category
        Then choose issue
        Then choose specific issue
        Then enter issue details
        Then click submit
        Then Verify complaint creation

        Examples:
            | Website   |
            | Framework |





    @AnnaHelpLine002
    Scenario Outline:  AnnaHelp Line 002
        Then Click new Complaint
        Then select issue location
        Then select issue Street
        Then select issue issueCategory
        Then select issue issue
        Then select specific issue
        Then click submit

        Examples:
            | Website   |
            | Framework |