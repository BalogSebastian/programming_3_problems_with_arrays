Minden feladatot oldjon meg Racketben és Javában is.
1. Feladat: Lista páros elemeiből kimenő lista készítése.
   a. Ne használjon filtert
   b. Használjon filtert
2. Feladat: Egy listában fizetések vannak, akinek a fizetése kisebb mint 100, annak növeljük a fizetését 20%,
   de az új fizetés nem lehet nagyobb mint 100. Azaz 90*0.2 helyett 100 lesz az új fizetés.
   a. Ne használjon mapet.
   b. Használjon mapet.
+ feladat: Powerset függvény-t irja meg a reduce segítségével.
Powerset magyarul hatványhalmaz definicoja.
powerSet(A)= { X | X részhalmaza A nak }. Példák, ( powerlist(list 1 2)) = (() (1) (2)(1 2)
  (powerset(list 1 2 3)) = (() (1) (2) (3) (1 2) (1 3) (2 3) ( 1 2 3))


🇬🇧 English
Task: Create a new list from the even elements of a given list.
a. Do not use filter
b. Use filter

Task: A list contains salaries. If a salary is less than 100, increase it by 20%,
but the new salary must not exceed 100. That is, instead of 90 * 1.2, the new salary becomes 100.
a. Do not use map
b. Use map

🇬🇧 English
Task: Implement a powerset function using reduce.
Definition:
The powerset of a set A is the set of all possible subsets of A, including the empty set and A itself.
In mathematical terms:
powerset(A) = { X | X ⊆ A }
Examples:
powerset([1, 2]) → [[], [1], [2], [1, 2]]
powerset([1, 2, 3]) → [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]


🇩🇪 Deutsch
Aufgabe: Erstelle eine neue Liste mit den geraden Zahlen aus einer gegebenen Liste.
a. Verwenden Sie kein filter
b. Verwenden Sie filter

Aufgabe: In einer Liste befinden sich Gehälter. Wenn ein Gehalt kleiner als 100 ist, erhöhen wir es um 20 %,
aber das neue Gehalt darf 100 nicht überschreiten. Also wird z. B. aus 90 * 1.2 stattdessen 100.
a. Verwenden Sie kein map
b. Verwenden Sie map

🇩🇪 Deutsch
Aufgabe: Schreibe eine powerset-Funktion unter Verwendung von reduce.

Definition:
Die Potenzmenge einer Menge A ist die Menge aller möglichen Teilmengen von A, einschließlich der leeren Menge und der Menge A selbst.
Formal:
powerset(A) = { X | X ⊆ A }
Beispiele:
powerset([1, 2]) → [[], [1], [2], [1, 2]]
powerset([1, 2, 3]) → [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]




🇷🇴 Română
Sarcină: Creează o listă nouă cu elementele pare dintr-o listă dată.
a. Fără să folosești filter
b. Folosind filter

Sarcină: Avem o listă cu salarii. Dacă un salariu este mai mic decât 100, se mărește cu 20%,
dar salariul nou nu poate depăși 100. Adică, în loc de 90 * 1.2, va deveni 100.
a. Fără să folosești map
b. Folosind map

🇷🇴 Română
Sarcină: Scrie o funcție powerset folosind reduce.

Definiție:
Mulțimea putere a unei mulțimi A este mulțimea tuturor submulțimilor posibile ale lui A, inclusiv mulțimea vidă și A însăși.
Formal:
powerset(A) = { X | X ⊆ A }
Exemple:
powerset([1, 2]) → [[], [1], [2], [1, 2]]
powerset([1, 2, 3]) → [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]



