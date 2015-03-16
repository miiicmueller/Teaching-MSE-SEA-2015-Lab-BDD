Feature: Orchestra

  Scenario: listen to any music
    Given there is an orchestra available
    When I ask them to play
    Then I hear some music

  Scenario: listen to a solo flute player
    Given there is an orchestra
    And there is 1 flute player in the the orchestra
    When I ask the orchestra to play
    Then I hear the sound of flute
    And I don't hear the sound of trumpet
