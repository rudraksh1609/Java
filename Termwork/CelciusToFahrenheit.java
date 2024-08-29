package Java1609;
abstract class Temperature 
{
    protected double temp;
    public void setTempData(double temp) 
    {
        this.temp = temp;
    }
    abstract void changeTemp();
}
class Fahrenheit extends Temperature 
{
    private double ctemp;
    @Override
    void changeTemp() 
    {
        ctemp = 5.0 / 9.0 * (temp - 32);
        System.out.println(temp + " Fahrenheit is " + ctemp + " Celsius");
    }
}
class Celsius extends Temperature 
{
    private double ftemp;
    @Override
    void changeTemp() 
    {
        ftemp = 9.0 / 5.0 * temp + 32;
        System.out.println(temp + " Celsius is " + ftemp + " Fahrenheit");
    }
}

public class CelciusToFahrenheit 
{
	public static void main(String[] args) 
	{
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setTempData(-40);
        fahrenheit.changeTemp();
        Celsius celsius = new Celsius();
        celsius.setTempData(22.97);
        celsius.changeTemp();
    }
}