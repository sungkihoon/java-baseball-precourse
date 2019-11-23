import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumber = new int[3];

        for (int i = 0; i < randomNumber.length; i++) {
            int tempNumber = random.nextInt(9) + 1;
            boolean check = true;

            for (int j = 0; j < i; j++) {
                if (randomNumber[j] == tempNumber) {
                    i--;
                    check = false;
                }
            }
            if (check) {
                randomNumber[i] = tempNumber;
            }
        }
    }
}
