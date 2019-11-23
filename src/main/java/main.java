import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] randomNumber = new int[3];
        int[] inputNumber = new int[3];
        int[] result = new int[3];
        int strikeCount = 0;
        int ballCount = 0;
        int nothing = 0;

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

        System.out.println(Arrays.toString(randomNumber)); //미션과 상관없지만 난수를 확인하기 위해 집어넣은 문장
        System.out.print("숫자를 입력해주세요 : ");
        String number = scan.nextLine();

        for (int i = 0; i < 3; i++) {
            inputNumber[i] = Integer.valueOf(number.split("")[i]);
        }

        System.out.println(Arrays.toString(inputNumber));

        for (int i = 0; i < 3; i++) {



            System.out.println(strikeCount);

            for (int j = 0; j < 3; j++) {
                if (randomNumber[i] == inputNumber[j] && i == j) {
                    result[0] = strikeCount++;
                    return;
                }

                System.out.println("aaa");
            }
        }
    }
}
GEBLJEABGJKBAEJKGFBAWLJGBAELJGBJK