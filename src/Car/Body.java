package Car;
import Visitor.*;
public class Body implements CarElement
{
    public void accept(CarElementVisitor visitor)
    {
        visitor.visit(this);
    }
}