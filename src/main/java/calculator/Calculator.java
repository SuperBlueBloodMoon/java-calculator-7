package calculator;

public class Calculator {

    public int getOutput(String input) {
        int output = 0;
        String value = "";
        for (int i = 0; i<input.length(); i++) {
            if ((int) input.charAt(i) == 44) {
                if (!(value.isEmpty())) {
                    output += Integer.parseInt(value);
                    value = "";
                }
            } else if ((int) input.charAt(i) == 58) {
                if (!(value.isEmpty())) {
                    output += Integer.parseInt(value);
                    value = "";
                }
            } else if ((int) input.charAt(i) == 47 && (int) input.charAt(i - 1) == 47) {
                if (!(value.isEmpty())) {
                    output += Integer.parseInt(value);
                    value = "";
                }
            } else if ((int) input.charAt(i) == 110 && (int) input.charAt(i - 1) == 92) {
                if (!(value.isEmpty())) {
                    output += Integer.parseInt(value);
                    value = "";
                }
            } else if ((int) input.charAt(i) >= 48 && (int) input.charAt(i) <= 57) {
                value += input.charAt(i);
            }
            else {
                if (input.charAt(i) != 92) {
                    throw new IllegalArgumentException("애플리케이션 종료.");
                }
            }
        }
        if(!(value.isEmpty())) {
            output += Integer.parseInt(value);
        }
        return output;
    }
}
