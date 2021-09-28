Feature: the version can be retrieved
  Background: The Birmingham F3 Region
    Given We have the following region details
    | id | name | website |
    | 1  | F3 Birmingham | www.f3birmingham.com |
    And We have the following pax details
    | region | f3name | realName | email | slackHandle | linkedIn | phone | birthday | vq |
    | 1      | Miyagi | J Burns | jbburns@github.com | @Miyagi | jbburns | 111-123-4567 | 1970-01-01 | 2021-01-01 |

  Scenario: client makes call to GET /version
    Then the api should return world

  Scenario: creating a new pax
  Given The following pax information
  When We create the pax
  And We ask for the pax's profile
  Then We should get
