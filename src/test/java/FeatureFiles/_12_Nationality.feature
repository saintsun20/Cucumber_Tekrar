Feature: DataTable ve Senaryo Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login successfully

  Scenario Outline: Create Nationality and Delete

And Click on the Element in LeftNav
| setup         |
| parameters    |
| nationalities |

And Click on the Element in Dialog
| addButton |

And User sending the keys in Dialog
| nameInput | <name> |

And Click on the Element in Dialog
| saveButton |

Then Success message should be displayed

And User delete the element from dialog
| <name> |

Then Success message should be displayed
    Examples:
      | name |
      | azN1K111 |
      | azN1K212 |
      | azN1K313 |
      | azN1K324 |