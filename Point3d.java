public class Point3d {
    private double xCoord; // координата x
    private double yCoord; // координата y
    private double zCoord; // координата z
    // конструктор инициализации
    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    // конструктор по умолчанию
    public Point3d () {
        this(0.0, 0.0, 0.0);
    }
    // возвращение координаты x
    public double getX () {

        return xCoord;
    }
    // возвращение координаты y
    public double getY () {

        return yCoord;
    }
    // возвращение координаты z
    public double getZ () {

        return zCoord;
    }
    // установка значения координаты x
    public void setX ( double val) {

        xCoord = val;
    }
    // установка значения координаты y
    public void setY ( double val) {

        yCoord = val;
    }
    // установка значения координаты z
    public void setZ ( double val) {

        zCoord = val;

    }
    // метод для подсчета расстояния между точками
    public double distanceTo(Point3d p) {
        double xx = this.xCoord - p.xCoord;
        double yy = this.yCoord - p.yCoord;
        double zz = this.zCoord - p.zCoord;
        return(Math.sqrt(xx*xx + yy*yy + zz*zz));
    }
}