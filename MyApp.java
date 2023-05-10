import java.util.Scanner;
/**
 * 클래스를 이용해 계산하는 프로그램
 * 
 * @author (이진규_2022320005) 
 * @version (2023/05/03)
 */
public class MyApp
{
    public static void main(String[] args){
        int operand1;
        String operator;
        int operand2;
        System.out.print("계산식을 입력하시오(예: >> 5 + 7) >>");
        Scanner scan = new Scanner(System.in);
        operand1 = scan.nextInt();
        operator = scan.next();
        operand2 = scan.nextInt();
        double result = run(operand1,operator,operand2);
        System.out.println(result);
    }

    public static double run(int operand1, String operator, int operand2){
        double result = 0.0;
        switch(operator){ 
            case "+":
                Add add = new Add(operand1, operand2);
                result = add.calculate();
                break;
            case "-": 
                Sub sub = new Sub(operand1, operand2);
                result = sub.calculate();
                break;
            case "*":
                Mul mul = new Mul(operand1, operand2);
                result = mul.calculate();
                break;
            case "/":
                switch(operand2){ // 2번째 피연산자가 0일 경우 실행되는 조건문
                    case 0:
                        System.out.println("0으로 나눌 수 없습니다!");
                        return 0; 
                }
                Div div = new Div(operand1, operand2);
                result = div.calculate();
                break;
        }
        return result;
    }
}
