Feature: Testing Banayan App
    Verifing Scenarios for Banyan

    @BanyanLocalTesting
    Scenario Outline:  Banyan testing
        Given Access WebDriverManager For BanyanTask
        Then Launch chrome browser for BanyanTask
        Then Click Login button for BanyanTask
        Then Click chat tab for BanayanTask
        Then Click user in BanayanTask
        Then Send message multiple times

        Examples:
            | Website   |
            | Framework |