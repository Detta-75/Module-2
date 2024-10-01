package Bai_Tap.ss6_ke_thua.Point_vs_MoveablePoin;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    public MoveablePoint() {
        super();
    }


    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ") speed =" + " (" + xSpeed + ", " + ySpeed + ")";
    }

    public MoveablePoint move() {
        setXY(getX() + xSpeed, getY() + ySpeed);
        return this;
    }
}