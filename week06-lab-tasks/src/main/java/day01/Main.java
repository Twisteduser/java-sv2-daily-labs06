package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer pnc = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);

        double inputNum = scanner.nextDouble();

        while (inputNum>0){
            pnc.add(inputNum);
            inputNum = scanner.nextDouble();
        }
        System.out.println(pnc.getNumbers());

    }
}
