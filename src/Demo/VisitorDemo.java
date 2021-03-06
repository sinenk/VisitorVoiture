/******
 * 
 * 
 * L'exemple suivant montre comment afficher un arbre de n�uds (les composants d'une voiture). 
 * Au lieu de cr�er des m�thodes d'affichage pour chaque sous-classe (Wheel, Engine, Body, et Car), 
 * une seule classe est cr��e (CarElementPrintVisitor) pour afficher les �l�ments.
 * Parce que les diff�rentes sous-classes requi�rent diff�rentes actions pour s'afficher proprement,
 * la classe CarElementPrintVisitor r�partit l'action en fonction de la classe de l'argument qu'on lui passe.
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