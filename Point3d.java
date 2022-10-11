class Point3d extends Point2d {
    private double z;
    // конструктор инициализации
    public Point3d (double x, double y, double z) {
        super(x,y); // наследуем все параметры для координат x и y из Point2d
        this.z = z;
    }
    // конструктор по умолчанию
    public Point3d () {
        this(0.0, 0.0, 0.0);
    }
    // возвращение координаты z
    public double getZ () {

        return z;
    }

    // установка значения координаты z
    public void setZ ( double val) {

        z = val;

    }
    // метод для подсчета расстояния между точками
    public double distanceTo(Point3d newPoint) {
        double xx = Math.pow(super.getX() - newPoint.getX(), 2);
        double yy = Math.pow(super.getY() - newPoint.getY(), 2);
        double zz = Math.pow(this.z - newPoint.getZ(), 2);
        return Math.sqrt(xx + yy + zz);
    }
    // метод для проверки совпадения двух точек
    public boolean equalsPoints(Point3d newPoint) {
        return super.getX() == newPoint.getX() && super.getY() == newPoint.getY() && this.z == newPoint.getZ();
    }
}