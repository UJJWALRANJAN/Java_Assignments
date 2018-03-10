import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import static java.lang.Math.sqrt;
import static java.lang.Math.acos;
import static java.lang.Math.toDegrees;

@Named(value = "triangle")
@RequestScoped
public class Triangle
{
    private double sideab,sidebc,sideac,anglea,angleb,anglec,area,perimeter;
    private double stanglea,stangleb,stanglec,starea,stperimeter;
    private boolean check;
    private String ck;

    public Triangle() {
    }
    
    public double getSideab() {return sideab;}
    public void setSideab (double sideab) {this.sideab = sideab;}
    public double getSidebc() {return sidebc;}
    public void setSidebc (double sidebc) {this.sidebc = sidebc;}
    public double getSideac() {return sideac;}
    public void setSideac (double sideac) {this.sideac = sideac;}    
    public double getAnglea() {return anglea;}
    public void setAnglea (double anglea) {this.anglea = anglea;}
    public double getAngleb() {return angleb;}
    public void setAngleb (double angleb) {this.angleb = angleb;}
    public double getAnglec() {return anglec;}
    public void setAnglec (double anglec) {this.anglec = anglec;}
    public double getArea() {return area;}
    public void setArea (double area) {this.area = area;}
    public double getPerimeter() {return perimeter;}
    public void setPerimeter (double perimeter) {this.perimeter = perimeter;}
    
    public boolean getCheck(){return check;}
    public void setCheck(boolean check){this.check =check;}
    
    public String getCk(){return ck;}
    public void setCk(String ck){this.ck =ck;}
    
    public String getcheck(){
    
            if(isTriangle(sideab,sidebc,sideac))
                ck="Triangle Possible";
            else
                ck="false";
            return ck;
    }
    
    public boolean isTriangle (double side1, double side2, double side3)
    {
            check = (side1 + side2 > side3 &&
		    side2 + side3 > side1 &&
		    side3 + side1 > side2);
            return check;

    }
    public double getPerimeterVal (double x, double y, double z)
     {
	     return x + y + z;
     }
    public double getAreaVal (double x, double y, double z)        
    {
	 double s = getPerimeterVal(x, y, z) / 2;
	 return sqrt (s * (s - x) * (s - y) * (s - z));
    }
    public double getAngleVal(double x, double y, double z)
    {
         return toDegrees (acos ((y * y + z * z - x * x) / (2 * y * z)));
    }
    
    public void getanglea()
    {
        if(isTriangle(sideab,sidebc,sideac))
        {
            anglea = getAngleVal(sidebc,sideac,sideab);
        }
        else
            anglea = -999.0;
        
    }
    public void getangleb()
    {
        if(isTriangle(sideab,sidebc,sideac))
        {
            angleb = getAngleVal(sideac,sideab,sidebc);
        }
        else
            angleb = -999.0;
    }
    public void getanglec()
    {
        if(isTriangle(sideab,sidebc,sideac))
        {
            anglec = getAngleVal(sideab,sidebc,sideac);
        }
        else
            anglec = -999.0;
    }
    public void getarea()
    {
        area = getAreaVal(sideab,sidebc,sideac);
    }
    public void getperimeter()
    {
        perimeter = getPerimeterVal(sideab,sidebc,sideac);
    }
}
