#Senaryo :
#  Inventory Bölümündeki
#  Item Categories Çalışmasını test ediniz
#  girişi yapıp , sonrasında silmesini yapınız
#  5 farklı değer için senaryoyu test ediniz

  Feature: Inventory Item Test

    Background:
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should be login successfully

    Scenario Outline: Inventory Item Catgories

      And Click on the Element in LeftNav
        | inventory       |
        | setup1          |
        | itemCategories  |

      And Click on the Element in Dialog
        | addCategory   |

      And User sending the keys in Dialog
        | nameInput     | <name> |

      And Click on the Element in Dialog
        | userType    |
        | student     |
        | toggleBar1   |
        | saveButton1  |

      Then Success message should be displayed
      Examples:
        | name        |
        | Aziz        |
        | Rukiye      |
        | Selçuk      |
        | Yasemin     |
        | Selçuk      |