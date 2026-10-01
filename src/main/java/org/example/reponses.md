Réponses Question 2 :
JUnit : outil framework de référence pour les tests unitaires en Java. Il permet de créer et d'exécuter des tests automatisés pour vérifier le bon fonctionnement du code. JUnit fournit des annotations pour définir les méthodes de test, ainsi que des assertions pour valider les résultats attendus.
Hamcrest : Bibliothèque de matchers pour les assertions lisibles, en utilisant des assertions qui décrivent une propriété attendue d'un objet, plutôt que de simplement vérifier l'égalité. Cela rend les tests plus expressifs et compréhensibles.
Mockito : Framework de moquage pour Java qui permet de créer des objets simulés (mocks) pour tester des composants isolés. Mockito facilite la création de tests unitaires en permettant de simuler le comportement des dépendances et de vérifier les interactions avec elles.
Jacoco : Outil de couverture de code pour Java qui mesure le pourcentage de code exécuté lors des tests. Il permet d'identifier les parties du code qui ne sont pas couvertes par les tests, aidant ainsi à améliorer la qualité et la fiabilité du code.
Lequel n'est pas une bibliothèque de test à proprement parler ? --> Réponse : Jacoco.

Réponse Question 5 :
Test	                                Code de production
assertEquals("org.acme", gav.group())	new Gav("org.acme", "", "")

La chaîne **"org.acme"** est écrite à la fois dans le test et dans le code.

Pourquoi c'est le signe qu'il reste du travail

C'est de la duplication entre test et code. Le code n'a rien « compris » : il a mémorisé la réponse. Une seule donnée d'entrée ne peut pas distinguer une vraie implémentation d'une constante. Le test est insuffisamment spécifié, et ce n'est pas la faute du code.

Règle de Kent Beck : quand tu vois de la duplication de données entre le test et le code, tu dois généraliser. Comme le test actuel ne l'y oblige pas, il faut le renforcer. C'est l'objet de la Q6.

