package edu.cnm.deepdive;

public class Card implements Comparable<Card> {

  private final Suit suit;
  private final Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;

    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public Rank getRank() {
    return rank;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  @Override
  public int compareTo(Card other) {
    int comparison = suit.compareTo(other.suit);
    if (comparison == 0) {
      comparison = rank.compareTo(other.rank);
    }
    return comparison;
  }
}


