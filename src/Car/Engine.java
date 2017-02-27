package Car;
import Visitor.*;
public class Engine implements CarElement
{
    public void accept(CarElementVisitor visitor)
    {
        visitor.visit(this);
    }
}

