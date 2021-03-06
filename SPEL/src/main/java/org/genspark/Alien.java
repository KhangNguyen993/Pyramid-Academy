package org.genspark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("#{2}")
    private int x;

    @Value("#{30}")
    private int y;

    @Value("#{alien.x *  alien.y}")
    private int z;

    @Value("#{T(org.genspark.Alien).hello(5.77)}")
    private double d;
    @Value("#{new java.lang.String('Genspark')}")
    private String name;
    @Value("#{8>6}")
    private boolean b;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public static double hello(double a){
        return a;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", d=" + d +
                ", name='" + name + '\'' +
                ", b=" + b +
                '}';
    }
}
