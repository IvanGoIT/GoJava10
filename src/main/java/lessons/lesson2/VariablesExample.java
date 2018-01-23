package lessons.lesson2;

public class VariablesExample {

    public static void main(String[] args) {

        byte b = 20;            // 8bit     -128 : 127
        short s = 25000;        // 16bit    -32 768 : 32 767
        int i = 2000000;        // 32bit    -2 147 483 648 :  2 147 483 647
        long l = 25000000000l;  // 64bit    -9,223,372,036,854,775,808 : 9,223,372,036,854,775,807

        float f = 2.5f;                 // 32bit
        double d = 20000000.1232322;    // 64bit

        boolean bool = true;    // false / true
        char c = '0';           // 16bit    0 : 65535
    }
}