package geo;
public class Geometrics {
    private static double x = 10.0;
    private static double y = 5.0;
    private static double z = 3.0;
    private static int x1 = 8;
    private static int y1 = 7;
    private static int z1 = 10;
    private static int x2 = 100;
    private static int y2 = 57;
    private static int z2 = 129;
    private static int x3 = 45;
    private static int y3 = 89;
    private static int z3 = 69;

    public static void main(String[] args) {
        // area
        System.out.println("Square area");
        squarearea(x,"x");
        squarearea(x1,"x1");
        squarearea(x2,"x2");
        squarearea(y,"y");
        
        
        // perimeter
        System.out.println("Square perimeter");
        squareperimeter(x,"x");
        squareperimeter(x1,"x1");
        squareperimeter(x2,"x2");
        squareperimeter(y,"y");
 

        System.out.println("Rectangle area");
        rectanglearea(x,y,"x","y");
        rectanglearea(x1,y1,"x1","y1");
        rectanglearea(x2,y2,"x2","y2");
        rectanglearea(x3,y3,"x3","y3");
        
        System.out.println("Rectangle perimeter");
        rectangleperimeter(x,y,"x","y");
        rectangleperimeter(x1,y1,"x1","y1");
        rectangleperimeter(x2,y2,"x2","y2");
        rectangleperimeter(x3,y3,"x3","y3");

        System.out.println("We can also calculate some volumes");
        volume(x*x,z,"x*x*z");
        /*
            z is our height
            y is our radius
         */
        System.out.println("Zone of a sphere");
        double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        System.out.println(v);

        System.out.println("Sphere with cylinder");
        System.out.println(Math.PI * Math.pow(z, 3) / 6);

        System.out.println("Ungula");
        System.out.println((double) (2 * x3 * z3) / 3);
    }
    public static void squarearea (int x, String name){
        System.out.println(name +" * "+name+" = " + x * x);
    }
    public static void squarearea (Double x, String name){
        System.out.println(name +" * "+name+" = " + x * x);
    }
    public static void squareperimeter (int x, String name){
        System.out.println("4 * " +name+ " = " + 4 * x);
    }
    public static void squareperimeter (Double x, String name){
        System.out.println("4 * " +name+ " = " + 4 * x);
    }
    public static void rectanglearea (int x, int y, String namex, String namey){
        System.out.println(namex + " * " + namey +" = " + x * y);
    }
    public static void rectanglearea (Double x, Double y, String namex, String namey){
        System.out.println(namex + " * " + namey +" = " + x * y);
    }
    public static void rectangleperimeter (int x, int y, String namex, String namey){
        System.out.println(namex + " + " + namey + " = " + ((x + y)*2));
    }
    public static void rectangleperimeter (Double x, Double y, String namex, String namey){
        System.out.println(namex + " + " + namey + " = " + ((x + y)*2));
    }
    public static void volume (int area, int x, String name){
        System.out.println("The volume of " + name +"is: " + (area*x));
    }
    public static void volume (Double area, Double x, String name){
        System.out.println("The volume of " + name +"is: " + (area*x));
    }

}
