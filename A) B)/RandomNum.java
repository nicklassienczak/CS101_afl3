import java.util.Random;

public class RandomNum {

    int[] randomNumber = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int getRandomNumber() {
        int ranNum = randomNumber[new Random().nextInt(randomNumber.length)];
        return ranNum;
    }
}
