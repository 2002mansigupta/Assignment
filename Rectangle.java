package anudip;

public class Rectangle {
    private int length;
    private int breadth;
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public void area(){
        int area=length*breadth;
        System.out.println(" the area of a rectangle is : "+area);
    }
    public void perimeter(){
        int result=2*(length+breadth);
        System.out.println(" the perimeter is : "+result);
    }
    public static void main(String[] args) {
    Rectangle r=new Rectangle(3,4);
    r.area();
    r.perimeter();

    }
}
