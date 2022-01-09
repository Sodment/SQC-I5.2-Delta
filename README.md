# SQC-I5.2-Delta
### #1 Sprint Soft Eng 2021/2022
![example workflow](https://github.com/Sodment/SQC-I5.2-Delta/actions/workflows/ci.yml/badge.svg)

30.11-21.12

### #2 Sprint Soft Eng 2021/2022
![example workflow](https://github.com/Sodment/SQC-I5.2-Delta/actions/workflows/ci.yml/badge.svg)
21.12-25.01

## Zespół projektowy:
* [Paweł Koch 145330](https://github.com/Sodment) - Scrum Master, Developer
* [Jędrzej Kościelniak 145260](https://github.com/Jedrek00) - Proxy Product Owner, Developer
* [Bartłomiej Kowalewski 145204](https://github.com/KowalewskiBartlomiej) - Developer
* [Mateusz Kozłowicz 145293](https://github.com/Koziok) - Developer

## Linki:
* [Punktowanie sprintów](https://docs.google.com/spreadsheets/d/e/2PACX-1vTn6j3M8pmGEzrsQk8mXse7lVHUdhYWkfxbkQiYI23rBtwM4N3bWw0qtupW-gesfCkcYasnZ-eEXl-F/pubhtml)
* [Product Backlog](https://docs.google.com/spreadsheets/d/1KQWYdGdpLTtyjIRvr114zbILsQtIjT1orzXBFIRJocE/edit?usp=sharing)
* [Dokumentacja](https://sodment.github.io/SQC-I5.2-Delta/index.html)

# Opis projektu
### Scenario Quality Checker (SQC)
Dla analityków dokumentujących wymagania funkcjonalne za pomocą scenariuszy nasza aplikacja SQC dostarczy informacji ilościowych oraz umożliwi wykrywanie problemów w wymaganiach funkcjonalnych zapisanych w postaci scenariuszy. Aplikacja będzie dostępna poprzez GUI a także jako zdalne API dzięki czemu można ją zintegrować z istniejącymi narzędziami.

# Notacja scenariuszy
* Scenariusz zawiera nagłówek okreslający jego tytuł i aktorów (zewnętrznych oraz system)
* Scenariusz składa się z kroków (każdy krok zawiera tekst)
* Kroki mogą zawierać pod-scenariusze (dowolny poziom zagłębień)
* Kroki mogą się zaczynać od słów kluczowych: IF, ELSE, FOR EACH

## Przykład:
Tytuł: Dodanie książki</br>
Aktorzy: Bibliotekarz</br>
Aktor systemowy: System</br>

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
