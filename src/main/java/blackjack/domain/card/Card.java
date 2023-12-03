package blackjack.domain.card;

public class Card {
    private final Shape shape;
    private final Value value;

    public Card(final Shape shape, final Value value) {
        this.shape = shape;
        this.value = value;
    }

    public static Card of(final Shape shape, final Value value) {
        return new Card(shape, value);
    }


}