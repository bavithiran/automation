Feature: Testing AnnaHelpline
    Verifing Scenarios for AnnaHelpline

    @BanyanLocalTesting
    Scenario Outline:  AnnaHelp Line
        Given Access WebDriverManager For AnnaHelpLine
        Then Launch chrome browser for BanyanTask
        Then Click Login button for BanyanTask
        Then Click chat tab for BanayanTask
        Then Click user in BanayanTask
        Then Send message multiple times

        Examples:
            | Website   |
            | Framework |