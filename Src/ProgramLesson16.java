import java.util.Random;

public class ProgramLesson16 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNUmber = random.nextInt(200) +10;
        System.out.println(randomNUmber);
        System.out.println(getSimpleNumber(randomNUmber));
    }

    public static int getSimpleNumber(int number) {
        for (; ; ) {
            int counter = 0;
            for (int i = number; i > 0; i--) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                return number;
            }
            number--;
        }
    }
}
