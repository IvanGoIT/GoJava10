package questions.question6;

public class InnerClassExample {

    public static void main(String[] args) {
        Data data = new Data();
        data.str = "" + System.currentTimeMillis();
        data.time = System.currentTimeMillis();

        System.out.println(data);
    }

    public static class Data {
        public String str;
        public long time;

        @Override
        public String toString() {
            return "Data{" +
                    "str='" + str + '\'' +
                    ", time=" + time +
                    '}';
        }
    }
}
