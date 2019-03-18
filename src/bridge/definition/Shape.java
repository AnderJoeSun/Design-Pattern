package bridge.definition;

import bridge.implementation.DrawAPI;

public abstract class Shape {
    private DrawAPI drawShape;
    public Shape(DrawAPI ds){
        this.drawShape = ds;
    }
}
