package kadai3;

public class Member {
    private boolean isPremium;
    private int point;

    public Member(boolean isPremium) {
        this.isPremium = isPremium;
        this.point = 0;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public int getPoint() {
        return point;
    }

    public int addPoints(int price) {
        double rate = isPremium ? 0.2 : 0.1;
        int earned = (int)(price * rate);
        this.point += earned;
        return earned;
    }
}
