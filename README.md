Herzlich Willkommen bei der Pizza Session zum Thema Test Driven Development!

Wir wollen hierbei zusammen mit euch Code-Katas lösen und dabei die Regeln von TDD zusammen versuchen anzuwenden. Hierbei haben wir zwei Aufgaben für euch vorbereitet, welche ihr
unabhängig voneinander in einer beliebigen Programmiersprache lösen könnt. Bei der ersten Aufgabe handelt es sich zum "FizzBuzz", welches eine Art Trinkspiel darstellt und zum Beispiel
unter https://en.wikipedia.org/wiki/Fizz_buzz genauer erläutert wird. Die zweite Aufgabe ist ein kleiner Taschenrechner, welcher eine Summe aus einer vorher definierten Zeichenfolge berechnen soll.

Bitte beachtet, dass die Aufgaben nur als Anregung dienen sollen, damit die Regeln von TDD praktisch ausprobiert werden können. Versucht somit zuerst einen fehlschlagenden Testfall zu entwickeln,
mit welchem ihr dann gezwungen werdet genau soviel Quellcode zu schreiben, damit dieser Testfall im folgenden erfolgreich durchläuft. Im Anschluss solltet ihr die Tests sowie eure Lösung versuchen
zu refactoren. Wenn dies erledigt ist, solltet ihr euch einen weiteren Testfall überlegen, welcher erneut am Anfang fehlschlagen sollte. Dadurch sollte ein Zyklus aus den Schritten
"Test Ausdenken" => "Test Grün bekommen" => "Test- und Produktiven Quellcode refactoren" entstehen, mit welchem ihr am Ende hoffentlich die Aufgabe lösen könnt.

# Aufgabe 1: FizzBuzz

1. FizzBuzz ist ein altes Trinkspiel, welches nach folgenden Regeln gespielt wird:
   - wenn die Zahl durch 3 teilbar ist: sage "Fizz"
   - wenn die Zahl durch 5 teilbar ist: sage "Buzz"
   - wenn die Zahl durch 3 und durch 5 teilbar ist: sage "FizzBuzz"
   - andernfalls: sage die Zahl selbst

Also z.B. wenn man in einer Runde die Zahlen 1 bis 5 hochzählen würde: 1, 2, Fizz, 4, Buzz.

2. Es soll eine Funktion `String fizz(int number)` implementiert werden, welche die Regeln des FizzBuzz-Spiels umsetzt. Als Eingabe-Parameter wird die Zahl, welche aufgesagt werden soll,
   erwartet. Der Rückgabewert der Funktion ist dann entweder die Zahl selbst, Fizz, Buzz oder FizzBuzz. Es sind hierbei die oben bereits beschriebenen Spielregeln anzuwenden.

3. Bitte achte darauf, dass Du die Funktion testgetrieben entwickelst. Immer iterativ einen Test erstellen, diesen Test grün bekommen und dann refactoren!

4. (optional) erweitere die Spielregeln:
  - Fizz soll auch zurückgegeben werden, wenn die Zahl eine 3 als Ziffer enthält, z.B. 13.
  - Buzz soll auch zurückgegeben werden, wenn die Zahl eine 5 als Ziffer enthält, z.B. 52.

# Aufgabe 2: FizzBuzz
1. Erstelle eine simplem String Kalkulator mit der Methode `int add(String numbers)`
  - Der Methode können 0, 1, oder 2 Nummern übergeben werden, die Rückgabe soll die Summe der Nummern sein.
  - Die einzelnen Nummern werden mittels "," getrennt in einem String der Methode übergeben.
  - Für einen leeren String soll = 0 zurückgegeben werden.
  - Somit liefert beispielsweise add("") = 0, add("1") = 1 und add("1,2") = 3
  - Schreibe einen einfachen Testfall für einen leeren String und wechsle zu einem bzw. zwei Strings.

2. Wandle die add – Methode so um, dass ihr eine beliebige Anzahl von Nummern im numbers-Argument übergeben werden können. Somit sollte z.B. auch add("1,2,3,4") = 10 berechnet werden können.

3. Wandle die add – Methode so um, dass sie mit  Zeilenumbrüchen so umgeht, als wären es Kommata. Also z.B. add("1,2\n3,4") = add(1,2,3,4) = 10

4. Wenn die add – Methode mit einer negativen Nummer aufgerufen wird, soll der Fehler “negatives not allowed” mit den ungültigen Nummern zurückgegeben werden.

5. Nummen, welche größer als 1000 sind, sollen von der add-Methode ignoriert werden. Das heißt add("1,1001,2") = 3. Es soll hierbei kein Fehler erzeugt werden!


Viel Spaß beim Lösen der beiden Code-Katas! Die Lösungen zu den Code-Katas könnt ihr euch für die Sprache Java in dem Unterordner "Java" ansehen! Wir sind auf eure Lösungen gespannt :-)!

