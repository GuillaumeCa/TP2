# TP2 - Réponse aux questions

## 3.2 Puissances

On doit faire n multiplications lors du calcul de a^n.
Il est possible d'en faire moins lorsque n est paire en effectuant l'opération a*a puis en multipliant le résultat par lui-même n/2 fois. On effectue ainsi n/2 opérations au lieu de n opérations.

## 3.3 Nombre premier

La fonction pourrait renvoyer une valeur booléenne, True ou False selon que le nombre testé est premier ou non.

## 3.5 Table de multiplication

    int [] tab1 = {1,2,3,4,5}
Valeur à tester: 55

La fonction renvoie -1: le programme effectue 5 opérations, il teste chaque valeur du tableau sans succès.

    int [] tab2 = {1,2,3,4,5}
Valeur à tester: 5

La fonction renvoie 5: le programme effectue 5 opérations, il teste chaque valeur du tableau.

    int [] tab3 = {9, 8, 7, 6,5,4,3,2,1,0}
Valeur à tester: 9

La fonction renvoie 9: le programme effectue 1 opérations, il teste uniquement la 1ère valeur du tableau.

    int [] tab4 = {9, 8, 7, 6,5,4,3,2,1,0}
Valeur à tester: 5

La fonction renvoie 5: le programme effectue 5 opérations, il teste chaque valeur jusqu'a la 5ème valeur du tableau.

Le nombre d'opérations à réaliser par la fonction dépend de la position du nombre dans le tableau.
