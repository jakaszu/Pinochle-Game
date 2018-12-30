package fun.entity;

public enum CardType {
    ACE(5), TEN(4), KING(3), QUEEN(2), JACK(1), NINE(0);
    private int rank;

    private CardType(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
