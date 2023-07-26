package com.jdknew;

public sealed abstract class Shape permits Circle, Rectangle {
    public abstract double calculateArea();
}
