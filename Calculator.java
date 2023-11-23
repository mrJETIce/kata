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
            System.out.println("�������� ������ ��������������� ���������. ������� � �����)");return;}

        for (int i=1;i<exp.length();i++){
            if (Character.isDigit(exp.charAt(i))==true || exp.charAt(i)=='+' || exp.charAt(i)=='-' || exp.charAt(i)=='/' || exp.charAt(i)=='*') {

            }else{System.out.println("�������� ������ ��������������� ���������."); return;}
        }

        if (exp.contains("+")){
            data=exp.split("\\+");
            if((Integer.parseInt(data[0])>10) || (Integer.parseInt(data[1])>10)) {
                System.out.println("������� ����� �� ����� 10 ");return;}
            if((Integer.parseInt(data[0])<1) || (Integer.parseInt(data[1])<1)) {
                System.out.println("������� ����� �� ����� 1 ");return;}
                output = Integer.parseInt(data[0])+Integer.parseInt(data[1]);
                System.out.println("�����: " + output);
        }else
        if (exp.contains("-")){
            data=exp.split("\\-");
            if((Integer.parseInt(data[0])>10) || (Integer.parseInt(data[1])>10)) {
                System.out.println("������� ����� �� ����� 10 ");return;}
            if((Integer.parseInt(data[0])<1) || (Integer.parseInt(data[1])<1)) {
                System.out.println("������� ����� �� ����� 1 ");return;}
            output = Integer.parseInt(data[0])-Integer.parseInt(data[1]);
            System.out.println("�����: " + output);
        }else
        if (exp.contains("/")){
            data=exp.split("\\/");
            if((Integer.parseInt(data[0])>10) || (Integer.parseInt(data[1])>10)) {
                System.out.println("������� ����� �� ����� 10 ");return;}
            if((Integer.parseInt(data[0])<1) || (Integer.parseInt(data[1])<1)) {
                System.out.println("������� ����� �� ����� 1 ");return;}
            output = Integer.parseInt(data[0])/Integer.parseInt(data[1]);
            System.out.println("�����: " + output);
        }else
        if (exp.contains("*")){
            data=exp.split("\\*");
            if((Integer.parseInt(data[0])>10) || (Integer.parseInt(data[1])>10)) {
                System.out.println("������� ����� �� ����� 10 ");return;}
            if((Integer.parseInt(data[0])<1) || (Integer.parseInt(data[1])<1)) {
                System.out.println("������� ����� �� ����� 1 ");return;}
            output = Integer.parseInt(data[0])*Integer.parseInt(data[1]);
            System.out.println("�����: " + output);
        }else {System.out.println("��� �� ����� �� ��� 0_�"); return;}
    }
    }
