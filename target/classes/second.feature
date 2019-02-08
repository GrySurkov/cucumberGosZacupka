@goszacupka
Feature: second
    Scenario: S2
        When i am on "http://www.zakupki.gov.ru" page
        Then i see "Закупки" and click them
        Then i see "Расширенный поиск" and click them
        Then i found element by id "searchString" and enter "Поставка"
        Then i found element by id "priceFromGeneral" and enter "1000000"
        Then i found element by id "priceToGeneral" and enter "3000000"
        Then i found element by id "currencyChangecurrencyIdGeneral" and click them
        Then i get list of elements by class name"tuningQuickSearchList" and choose element "Российский рубль"
