package calculator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    
    public static void main(String[] args) {
        Parse parse = new Parse();
        Calculator calculator = new Calculator(parse);
        while(true) {
            System.out.println("덧셈할 문자열을 입력해 주세요. 종료를 원하시면 0을 입력해 주세요.");
            String input = readLine();
            if (input.isEmpty()) {
                continue;
            }
            if (input.charAt(0) == '0') {
                System.out.println("종료합니다.");
                break;
            }
            int output = calculator.getOutput(input);
            System.out.println("결과 : " + output);
        }
    }
}