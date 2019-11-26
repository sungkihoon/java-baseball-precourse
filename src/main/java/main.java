import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            Random random = new Random();
            int[] randomNumber = new int[3];
            int[] inputNumber = new int[3];
            int[] result = new int[3];
            int strikeCount = 0;
            int ballCount = 0;
            int regameNumber;

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
            while (true) {

                System.out.print("숫자를 입력해주세요 : ");
                String number = scan.nextLine();

                for (int i = 0; i < 3; i++) {
                    inputNumber[i] = Integer.valueOf(number.split("")[i]);
                }

                System.out.println(Arrays.toString(inputNumber));

                for (int i = 0; i < 3; i++) {

                    for (int j = 0; j < 3; j++) {
                        if (randomNumber[i] == inputNumber[j] && i == j) {
                            result[0] = strikeCount++;
                        } else if (randomNumber[i] == inputNumber[j] && i != j) {
                            result[0] = ballCount++;
                        }
                    }
                }
                if (0 < ballCount || 0 < strikeCount) {
                    System.out.println(strikeCount + "스트라이크 " + ballCount + "볼 ");
                } else {
                    System.out.println("nothing");
                }

                if (strikeCount == 3) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료!");
                    break;
                }
                strikeCount = 0;
                ballCount = 0;
            }
            System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 : ");
            regameNumber = scan.nextInt();
            if(regameNumber == 2){
                System.out.println("프로그램을 종료합니다!");
                break;
            }
        }
    }
}

