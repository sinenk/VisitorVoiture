package Car;
import Visitor.*;
public interface CarElement
{
    void accept(CarElementVisitor visitor);
    // M�thode � d�finir par les classes impl�mentant CarElements
}