package lessons.lesson3.ifelse;

import lessons.lesson2.BinaryOperatorsExample;
import lessons.lesson2.LogicalOperators;
import lessons.lesson2.ModuleDivideExample;
import lessons.lesson2.VariablesExample;

import java.util.Scanner;

public class IfExamples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер задачи");
        System.out.println("0 - BinaryOperatorsExample");
        System.out.println("1 - VariablesExample");
        System.out.println("2 - ModuleDivideExample");
        System.out.println("3 - LogicalOperators");
        int taskNumber = scanner.nextInt();

        if (taskNumber == 0) {
            BinaryOperatorsExample.main(args);
        }
        if (taskNumber == 1) {
            VariablesExample.main(args);
        }
        if (taskNumber == 2) {
            ModuleDivideExample.main(args);
        }
        if (taskNumber == 3) {
            LogicalOperators.main(args);
        }
    }
}
