/******
 * 
 * 
 * L'exemple suivant montre comment afficher un arbre de nœuds (les composants d'une voiture). 
 * Au lieu de créer des méthodes d'affichage pour chaque sous-classe (Wheel, Engine, Body, et Car), 
 * une seule classe est créée (CarElementPrintVisitor) pour afficher les éléments.
 * Parce que les différentes sous-classes requièrent différentes actions pour s'afficher proprement,
 * la classe CarElementPrintVisitor répartit l'action en fonction de la classe de l'argument qu'on lui passe.
 * 
 * 
 * 
 * 
 * 
 * 
 */


package Demo;
import Car.*;
import Visitor.*;
// class demo pour tester le visieur 
public class VisitorDemo
{
    static public void main(String[] args)
    {
        Car car = new Car();

        CarElementVisitor printVisitor = new CarElementPrintVisitor();
        CarElementVisitor doVisitor = new CarElementDoVisitor();

        printVisitor.visitCar(car);
        doVisitor.visitCar(car);
    }
}