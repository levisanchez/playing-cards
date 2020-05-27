package edu.cnm.deepdive;

public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPADES;

  public char symbol(){
    switch (this) {
      case CLUBS:
        return '\u2663';
      case HEARTS:
        return 'u\2661';
      case SPADES:
        return 'u\2660';
      case DIAMONDS:
        return '\u2662';
      default:
        return '0'
    }
  }
}
