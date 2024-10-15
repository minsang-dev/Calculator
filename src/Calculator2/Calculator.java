package Calculator2;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> resultList = new ArrayList<>();

    public ArrayList<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<Integer> resultList) {
        this.resultList = resultList;
    }

    public void calculate(int num1, int num2, char operation) {
        int result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0)
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                else
                    result = num1 / num2;
                break;
            default:
                System.out.println("사칙연산 기호가 아니에요 !"); //else 역할
        }
        resultList.add(result);
    }

}