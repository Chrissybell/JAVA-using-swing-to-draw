import java.awt.*;

// eyeclass for exercise02
public class Eyeclass {
    private Point Origin;
    private Point init_point;

    public Eyeclass(Point Origin) {
        this.Origin = Origin;
        this.init_point = Origin;
    }

    public Point getInit_point() {
        return init_point;
    }

    public void setInit_Point(Point init_point) {
        this.init_point = init_point;
    }

    public Point getOrigin(){
        return Origin;
    }

}
