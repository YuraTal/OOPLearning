package ru.synergy;

public class Rect {
    double wigth;
    double height;
    String nameOfRect;

    double getArea() {
        return wigth * height;
    }

    void maignify(double koeff) {
        wigth *= koeff;
        height *= koeff;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "wigth=" + wigth +
                ", height=" + height +
                ", nameOfRect='" + nameOfRect + '\'' +
                '}';
    }
}
