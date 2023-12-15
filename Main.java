import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static String calc(String input) {
        String[] result;
        int output=0;

        if (Character.isDigit(input.charAt(0))==false) {
            System.out.println("Неверный формат выражения. Начните с цифры.");System.exit (1);}
        for (int i=1;i<input.length();i++){
            if (Character.isDigit(input.charAt(i))==true || input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='/' || input.charAt(i)=='*') {

            }else{System.out.println("Неверный формат выражения.");System.exit (1);}}

        if (input.contains("+")) {
            result=input.split("\\+");
            if (Integer.parseInt(result[0])>10 || Integer.parseInt(result[1])>10) {System.out.println("Введите число не более 10. ");System.exit (1);}
            if (Integer.parseInt(result[0])<1 || Integer.parseInt(result[1])<1) {System.out.println("Введите число не менее 1. ");System.exit (1);}
            output = Integer.parseInt(result[0]) + Integer.parseInt(result[1]);
            return Integer.toString(output);
        }
        if (input.contains("-")) {
            result=input.split("\\-");
            if (Integer.parseInt(result[0])>10 || Integer.parseInt(result[1])>10) {System.out.println("Введите число не более 10. ");System.exit (1);}
            if (Integer.parseInt(result[0])<1 || Integer.parseInt(result[1])<1) {System.out.println("Введите число не менее 1.");System.exit (1);}
            output = Integer.parseInt(result[0]) - Integer.parseInt(result[1]);
            return Integer.toString(output);
        }

        if (input.contains("*")) {
            result=input.split("\\*");
            if (Integer.parseInt(result[0])>10 || Integer.parseInt(result[1])>10) {System.out.println("Введите число не более 10. ");System.exit (1);}
            if (Integer.parseInt(result[0])<1 || Integer.parseInt(result[1])<1) {System.out.println("Введите число не менее 1.");System.exit (1);}
            output = Integer.parseInt(result[0]) * Integer.parseInt(result[1]);
            return Integer.toString(output);
        }

        if (input.contains("/")) {
            result=input.split("\\/");
            if (Integer.parseInt(result[0])>10 || Integer.parseInt(result[1])>10) {System.out.println("Введите число не более 10. ");System.exit (1);}
            if (Integer.parseInt(result[0])<1 || Integer.parseInt(result[1])<1) {System.out.println("Введите число не менее 1. ");System.exit (1);}
            output = Integer.parseInt(result[0]) / Integer.parseInt(result[1]);
            return Integer.toString(output);
        }

        return "Неверный формат выражения";

    }
    public static void main(String[] args) {


        System.out.println("Ответ: " + calc(s.nextLine()));


    }
}
