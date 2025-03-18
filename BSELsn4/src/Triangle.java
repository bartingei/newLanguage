public class Triangle extends Rectangle{
    Triangle(){
        setDimensions();
    }

    @Override
    public void getArea(){
        double area = (0.5 * length * width);
        System.out.println("Area of Triangle is "+ area);
    }
}
