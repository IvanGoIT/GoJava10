package lessons.lesson5;

public class Wheel {
    private String madeIn = "China";
    private int price = 100;

    private Hole hole = null;

    public Wheel(String madeIn) {
        this.madeIn = madeIn;
        if ("China".equals(madeIn)) {
            hole = new Hole();
        }
    }

    public String getMadeIn() {
        return madeIn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private static class Hole {
        public float size;
    }
}
