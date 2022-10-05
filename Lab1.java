public class Lab1 {
    // точка входа в программу
    public static void main(String[] args) {
        Point3d[] newPoint = new Point3d[3]; // объявление массива, который содержит 3 объекта-точки
        // цикл, который заполнит массив
        for (int i = 0; i <= 2; i++) {
            newPoint[i] = new Point3d();
            newPoint[i].setX(Double.valueOf(args[0 + 3*i]));
            newPoint[i].setY(Double.valueOf(args[1 + 3*i]));
            newPoint[i].setZ(Double.valueOf(args[2 + 3*i]));
        }
        // вывод точек
        for (int i = 0; i <= 2; i++) {
            System.out.println("Point"+ i +": ("+ newPoint[i].getX() +", "+ newPoint[i].getY() +", "+ newPoint[i].getZ() +")");
        }
        // Вывод результата подсчета, если точки не совпадают, и вывод ошибки, если совпадают
        if (equalPoints(newPoint[0], newPoint[1], newPoint[2])) {
            System.out.println("Area of a treangle = " + computeArea(newPoint[0], newPoint[1], newPoint[2]));
        } else {
            System.out.println("Please, check your Point coord");
        }
    }
    // вычисление площади треугольника
    public static double computeArea(Point3d pL1, Point3d pL2, Point3d pL3) {
        double a = pL1.distanceTo(pL2); // сторона а
        double b = pL2.distanceTo(pL3); // сторона b
        double c = pL3.distanceTo(pL1); // сторона c
        double halfMeter = (a + b + c) / 2; // вычисление полупериметра треугольника
        return (Math.sqrt(halfMeter*(halfMeter - a)*(halfMeter - b)*(halfMeter - c))); //возвращение площади

    }
    // проверка точек на равенство (совпадение)
    public static boolean equalPoints(Point3d p1, Point3d p2, Point3d p3) {
        if (((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()) && (p1.getZ() == p2.getZ())) ||
                ((p3.getX() == p2.getX()) && (p3.getY() == p2.getY()) && (p3.getZ() == p2.getZ())) ||
                ((p1.getX() == p3.getX()) && (p1.getY() == p3.getY()) && (p1.getZ() == p3.getZ()))) {
            return false;
        } else {
            return true;
        }
    }
}