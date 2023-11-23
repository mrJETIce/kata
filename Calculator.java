import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scm = new Scanner(System.in);
        String exp=scm.nextLine();
        String[] data;
        char action;
        int output;

        if (Character.isDigit(exp.charAt(0))==false) {
            System.out.println("Неверный формат арифметического выражения. Начните с цифры)");return;}

        for (int i=1;i<exp.length();i++){
            if (Character.isDigit(exp.charAt(i))==true || exp.charAt(i)=='+' || exp.charAt(i)=='-' || exp.charAt(i)=='/' || exp.charAt(i)=='*') {

            }else{System.out.println("Неверный формат арифметического выражения."); return;}
        }

        if (exp.contains("+")){
            data=exp.split("\\+");
            if((Integer.parseInt(data[0])>10) || (Integer.parseInt(data[1])>10)) {
                System.out.println("Введите числа не более 10 ");return;}
            if((Integer.parseInt(data[0])<1) || (Integer.parseInt(data[1])<1)) {
                System.out.println("Введите числа не менее 1 ");return;}
                output = Integer.parseInt(data[0])+Integer.parseInt(data[1]);
                System.out.println("Ответ: " + output);
        }else
        if (exp.contains("-")){
            data=exp.split("\\-");
            if((Integer.parseInt(data[0])>10) || (Integer.parseInt(data[1])>10)) {
                System.out.println("Введите числа не более 10 ");return;}
            if((Integer.parseInt(data[0])<1) || (Integer.parseInt(data[1])<1)) {
                System.out.println("Введите числа не менее 1 ");return;}
            output = Integer.parseInt(data[0])-Integer.parseInt(data[1]);
            System.out.println("Ответ: " + output);
        }else
        if (exp.contains("/")){
            data=exp.split("\\/");
            if((Integer.parseInt(data[0])>10) || (Integer.parseInt(data[1])>10)) {
                System.out.println("Введите числа не более 10 ");return;}
            if((Integer.parseInt(data[0])<1) || (Integer.parseInt(data[1])<1)) {
                System.out.println("Введите числа не менее 1 ");return;}
            output = Integer.parseInt(data[0])/Integer.parseInt(data[1]);
            System.out.println("Ответ: " + output);
        }else
        if (exp.contains("*")){
            data=exp.split("\\*");
            if((Integer.parseInt(data[0])>10) || (Integer.parseInt(data[1])>10)) {
                System.out.println("Введите числа не более 10 ");return;}
            if((Integer.parseInt(data[0])<1) || (Integer.parseInt(data[1])<1)) {
                System.out.println("Введите числа не менее 1 ");return;}
            output = Integer.parseInt(data[0])*Integer.parseInt(data[1]);
            System.out.println("Ответ: " + output);
        }else {System.out.println("Что то пошло не так 0_о"); return;}
    }
    }
