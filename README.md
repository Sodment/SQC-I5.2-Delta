# SQC-I5.2-Delta
#1 Sprint Soft Eng 2021/2022
## Zespół projektowy:
* [Paweł Koch 145330](https://github.com/Sodment) - Scrum Master, Developer
* [Jędrzej Kościelniak 145260](https://github.com/Jedrek00) - Proxy Product Owner, Developer
* [Bartłomiej Kowalewski 145204](https://github.com/KowalewskiBartlomiej) - Developer
* [Mateusz Kozłowicz 145293](https://github.com/Koziok) - Developer

# Notacja scenariuszy
* Scenariusz zawiera nagłówek okreslający jego tytuł i aktorów (zewnętrznych oraz system)
* Scenariusz składa się z kroków (każdy krok zawiera tekst)
* Kroki mogą zawierać pod-scenariusze (dowolny poziom zagłębień)
* Kroki mogą się zaczynać od słów kluczowych: IF, ELSE, FOR EACH

## Przykład:
### Tytuł: Dodanie książki
### Aktorzy:  Bibliotekarz
### Aktor systemowy: System

* Bibliotekarz wybiera opcje dodania nowej pozycji książkowej
* Wyświetla się formularz.
* Bibliotekarz podaje dane książki.
* IF: Bibliotekarz pragnie dodać egzemplarze książki
    * Bibliotekarz wybiera opcję definiowania egzemplarzy
    * System prezentuje zdefiniowane egzemplarze
    * FOR EACH egzemplarz:
        * Bibliotekarz wybiera opcję dodania egzemplarza
        * System prosi o podanie danych egzemplarza
        * Bibliotekarz podaje dane egzemplarza i zatwierdza.
        * System informuje o poprawnym dodaniu egzemplarza i prezentuje zaktualizowaną listę egzemplarzy.
* Bibliotekarz zatwierdza dodanie książki.
* System informuje o poprawnym dodaniu książki.