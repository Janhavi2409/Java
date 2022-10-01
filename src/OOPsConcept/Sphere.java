package OOPsConcept;

class Sph{
    int radius;
    float pi = 3.14f;

    public Sph(int radius) {
        this.radius = radius;
    }
    public void surfaceArea(){
        float surfaceArea = 4*pi*radius*radius;
        System.out.println("Surface Area of Sphere = "+surfaceArea+" sq.units");
    }
    public void volume(){
        float volume = (4*pi*radius*radius*radius)/3;
        System.out.println("Volume = "+volume+" cubic units");
    }

    public int getRadius() {
        return radius;
    }
}
public class Sphere {
    public static void main(String[] args) {
        System.out.println("SPHERE");
        Sph s1 = new Sph(4);
        System.out.println("Radius = "+s1.getRadius()+" units");
        s1.surfaceArea();
        s1.volume();
    }
}
