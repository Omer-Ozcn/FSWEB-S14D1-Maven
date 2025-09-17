
import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;
import com.workintech.pool.Cuboid;
import com.workintech.developers.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("-------------------------------------------------");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("-------------------------------------------------");

        HRManager hr = new HRManager(1L, "Alice HR", 60000);
        JuniorDeveloper j1 = new JuniorDeveloper(101L, "Jack", 25000);
        MidDeveloper m1 = new MidDeveloper(201L, "Mary", 40000);
        SeniorDeveloper s1 = new SeniorDeveloper(301L, "Sam", 70000);

        hr.addEmployee(j1, 0);
        hr.addEmployee(m1, 0);
        hr.addEmployee(s1, 0);

        j1.work();
        m1.work();
        s1.work();
        hr.work();

        System.out.println("Jack maaş: " + j1.getSalary());
        System.out.println("Mary maaş: " + m1.getSalary());
        System.out.println("Sam maaş: " + s1.getSalary());
        System.out.println("Alice maaş: " + hr.getSalary());
    }
}
