Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login successfully

  Scenario: Create a Country

    And Click on the Element in LeftNav
    | setup       |
    | parameters  |
    | countries   |

    And Click on the Element in Dialog
      | addButton   |

    And User sending the keys in Dialog
      | nameInput | ismetUlkesi18982 |
      | codeInput | ismetKod1        |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | ismetUlkesi18982 |

    Then Success message should be displayed


  Scenario:  CitizenShip Create and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | is12SCUlk1982 |
      | shortName | is11SC11      |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | is12SCUlk1982 |

    Then Success message should be displayed

  Scenario: Create Nationality and Delete

    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | isNTUlk21 |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | isNTUlk21 |

    Then Success message should be displayed

  Scenario: Fee Functionality and Delete

    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | fees |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | isFee112   |
      | codeInput | 1223131  |
      | integrationCode | 121212 |
      | priorityCode | 429 |

    And Click on the Element in Dialog
      | toggleBar |
      | saveButton |

    Then Success message should be displayed

    And User delete the element from dialog
      | isFee112  |

    Then Success message should be displayed






