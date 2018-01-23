package questions.question5_3.exception;

import java.util.IllegalFormatException;

public class TryCatchExample {

    static void calculateSmth(int x) throws NotOneHundredException {
        if (x != 100) // данные не корректны (число должно равнятся сотне)
        {
            throw new NotOneHundredException("x != 100, fix it please!");
        }

        System.out.println("Great! X == 100");
    }

    public static void main(String[] args) {
        try {
            calculateSmth(100);
            calculateSmth(99);
            calculateSmth(100);
        } catch (NotOneHundredException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("HI :D");
        }

        // Пример ловли разных эксепшенов по отдельности
        try {
            calculateSmth(100);
        } catch (NotOneHundredException e) {
            // catching NotOneHundredException
        } catch (NullPointerException e) {
            // catching NullPointerException
        }

        // Пример ловли всех эксепшенов в одном месте
        try {
            calculateSmth(100);
        } catch (Exception e) {
            // catching all
        }
    }
}
