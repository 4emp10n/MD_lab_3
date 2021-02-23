public class MyVec {
    private double x, y, z;

    public MyVec(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double vecLength()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "Student{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}






