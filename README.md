# VisitorVoiture
#https://fr.wikibooks.org/wiki/Patrons_de_conception/Visiteur
#L'exemple suivant montre comment afficher un arbre de nœuds (les composants d'une voiture). 
#Au lieu de créer des méthodes d'affichage pour chaque sous-classe (Wheel, Engine, Body, et Car), une seule classe est créée (CarElementPrintVisitor) pour afficher les éléments.
#Parce que les différentes sous-classes requièrent différentes actions pour s'afficher proprement, la classe CarElementPrintVisitor répartit l'action en fonction de la classe de l'argument qu'on lui passe.
#
#NB.
#1.  Le Visiteur permet d'externaliser et de centraliser des actions à effectuer sur des objets qui n'ont pas forcément de liens entre eux.
#2. Ces actions ne seront pas implémentées directement dans la classe de ces objets, mais dans des classes externes.
#3. Un visiteur possède une méthode par type d'objet traité.
