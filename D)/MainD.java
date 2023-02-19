import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainD {
    public static void main(String[] args) {

        List<Square> squareList = new ArrayList<>();
        Square square1 = new Square(4, 6);
        Square square2 = new Square(7, 10);
        Square square3 = new Square(5, 6);

        squareList.add(square1);
        squareList.add(square2);
        squareList.add(square3);

        System.out.println(square1.compareTo(square2));

        Collections.sort(squareList);

        for (Square square :
                squareList) {
            System.out.println("Square perimeter = " + square.getPerimeter());
        }
    }
}
