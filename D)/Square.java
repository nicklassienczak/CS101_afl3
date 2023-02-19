public class Square implements Comparable<Square> {
    private double width;
    private double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return (height+width) * 2;
    }

    @Override
    public int compareTo(Square o) {
        double perimeterA = this.getPerimeter();
        double perimeterB = o.getPerimeter();
        if (perimeterA > perimeterB) {
            return -1;
        } else if (perimeterA < perimeterB) {
            return 1;
        } else {
            return 0;
        }
    }
}
