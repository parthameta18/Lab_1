public class Car {
    private String color, type;
    private double engineCC;

    public Car (String color, String type, double engineCC)
    {
        setColor(color);
        setType(type);
        setEngineCC(engineCC);
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        if(color.isBlank())
            throw  new IllegalArgumentException("Color cant be Empty");
        else
            this.color = color;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        if(type.isBlank())
            throw  new IllegalArgumentException("Type cant be Empty");
        else
            this.type = type;
    }

    public double getEngineCC()
    {
        return engineCC;
    }

    public void setEngineCC(double engineCC)
    {
        this.engineCC = engineCC;
    }

    public String toString()
    {
        return String.format("%s %s has %.1f CC Engine", color, type, engineCC);
    }

}
