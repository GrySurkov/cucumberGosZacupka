@goszacupka
Feature: second
    Scenario: Enter data on form
        When i am on "http://www.zakupki.gov.ru" page
        Then i see "Закупки" and click them
        Then i see "Расширенный поиск" and click them
        Then i found element by id "searchString" and enter "Поставка"
        Then i found element by id "priceFromGeneral" and enter "1000000"
        Then i found element by id "priceToGeneral" and enter "3000000"
        Then i found element by id "currencyChangecurrencyIdGeneral" and click them
        Then i get list of elements by class name"tuningQuickSearchList" and choose element "Российский рубль"
        Then i found element by cssSelector "#placingWaysTag > div > div.collapsed.height30" and click them
        Then i get list of elements by cssSelector "#placingWaysTag > div > div.selectChose > div.expanded" and choose elements "Аукцион"
        Then i found element by id "placingWaysSelectBtn" and click them
        Then i found element by cssSelector "#orderStages > div > div.collapsed.height30" and click them
        Then i get list of elements by cssSelector "#orderStages > div > div.selectChose > div.expanded > ul" and choose elements "подача заявок"
        Then i found element by cssSelector "#orderStagesSelectBtn > span" and click them
        Then i found element by cssSelector "#quickSearchForm_header > div.parametrs.margBtm10 > div > div.darkGreyBox.saveExtendedSearch > div.floatRight" and click them

