package Model;

public class Point3D extends Point2D{
     private float z;


    public Point3D(float x, float y) {
        super(x, y);
    }



    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                "z=" + z +
                '}';
    }


    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setXYZ() {
        this.setX(getX());
        this.setY(getY());
        this.z = z;
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
