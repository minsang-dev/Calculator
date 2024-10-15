package Calculator2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    private static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputCalculate(); // 1. 첫 입력 계산을 수행하는 것

        while (true) {

            System.out.println(calculator.getResultList());

            //System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? \n - yes 입력 시 추가 계산 \n - exit 입력 시 종료"); /* exit을 입력 받으면 반복 종료 */
            System.out.println(" - remove 입력 시 첫번째 데이터 삭제");
            String input = sc.next().toLowerCase();
            if (input.equals("exit")) {
                break; // while의 break
            } else if (input.equals("yes")) {
                inputCalculate(); // 2. yes로 입력했을 때 추가 계산
                // continue;
            } else if (input.equals("remove")) {
//              calculator.removeResult(); // 내부에 있는 삭제하는 메소드 호출
                ArrayList<Integer> list = calculator.getResultList();
                try {
                    list.removeFirst();
                } catch (NoSuchElementException e) {
                    System.out.println("저장된 데이터가 없습니다 !");
                }
                calculator.setResultList(list); // 외부에서 직접 수정하기위해 set 메소드를 사용함
            } else{
                    System.out.println("다시 입력해주세요 !");
            }
        }
    }

    /*
    숫자와 사칙연산 기호를 입력받고, 계산해서 calculator에 있는 getResultList에 저장
     */
    private static void inputCalculate() {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();   // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt(); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.println("사칙연산 기호를 입력하세요: ");
            String str = sc.next();

            calculator.calculate(num1, num2, str.charAt(0));
        } catch (InputMismatchException e) {
            System.out.print("잘못된 입력 값입니다.");
        }

    }
}