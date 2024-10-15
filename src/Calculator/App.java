package Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int result = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt(); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt(); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.println("사칙연산 기호를 입력하세요: ");
            String str = sc.next();

            switch (str) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0)
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    else
                        result = num1 / num2;
                    break;
                default :
                    System.out.println("사칙연산 기호가 아니에요 !"); //else 역할
            }

            System.out.println("결과: " + result);  // 1. 더 계산하는 경우
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)"); /* exit을 입력 받으면 반복 종료 */
            String input = sc.next();
            if (input.equals("exit")) {
                break; // while문의 break
            }
        }  // 2. exit 입력 시 종료되는 경우 (while문 전체범위)
    }
}