Feature: Datatable Örnek

  Scenario: User List
    When Write username "İsmet"
    When Write username and password "ismet" and "1234"

    And Write username as Datatable
      | ismet     |
      | Ummuhan   |
      | İbrahim   |
      | Neşe      |
      | Engin     |

    And Write username and password as Datatable
      | ismet       | 12344     |
      | Ummuhan     | 12345     |
      | İbrahim     | 12346     |
      | Neşe        | 12347     |
      | Engin       | 12348     |

