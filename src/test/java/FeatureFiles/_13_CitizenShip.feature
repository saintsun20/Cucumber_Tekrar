# CitizenShip menusunun kayıt ve silme özelliğini
# (DataTable ile) 5 farklı değer seti ile çalıştırınız.

Feature: CitizenShip Functionality DataTable ve Senaryo Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should  be login successfully

  Scenario Outline:  CitizenShip Create and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name>  |
      | shortName | <short> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | <name> |

    Then Success message should be displayed

    Examples:
      | name   | short   |
      | az1CS31 | az1Sk31 |
      | az1CS32 | azC1Sk32 |
      | az1CS33 | azC1Sk33 |
      | az1CS34 | azC1Sk34 |
      | az1CS35 | azC1Sk35 |