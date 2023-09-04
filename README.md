# BST
Eighth assignment for algorithms and data structures lab.

Zdefiniuj klasę BST<T> implementującą strukturę binarnego drzewa
poszukiwań (ang. binary search tree, BST) bez referencji na rodzica.
Klasa ma definiować następujące operacje:

• implementacja rekurencyjna:  
o wyszukania elementu,  
o znalezienie minimum,  
o znalezienie maksimum,  
o przejścia po drzewie w porządku post-order,  

• implementacja iteracyjna:  
o znalezienie następnika,  
o wstawienia elementu,  
o usunięcia elementu.  

Implementacja operacji przejścia po drzewie ma stosować wzorzec
projektowy wizytator (na wykładzie nazwany „egzekutorem”).
Należy pamiętać, by operacje adekwatnie rozdzielić między klasą drzewa,
a klasą węzła. Użytkownik klasy BST<T> nie może uzyskiwać
bezpośredniego dostępu do szczegółów implementacyjnych tj. obiektów
klasy węzła.
