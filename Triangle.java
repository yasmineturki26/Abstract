
public class Triangle extends Shape{
    
    private double base;
    private double height; 
    
    public Triangle (String color, double base, double height){
        super(color);
        this.base=base;
        this.height=height;
    }
    
    @Override
    public double getArea(){
        return (0.5*base*height);
    }
    
    @Override
    public String toString(){
        String str = super.toString();
        return str + "Base: " + base + "Height : "+ height;
    }
    
}
