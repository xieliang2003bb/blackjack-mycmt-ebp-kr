package com.jitterted.ebp.blackjack;

public class Player {
  private int playerBalance = 0;
  private int playerBet = 0;
  private static int totalAmountBet = 0;

  public Player(int playerBalance) {
    this.playerBalance = playerBalance;
  }

  public void playerBets(int betAmount) {
    playerBet = betAmount;
    playerBalance -= betAmount;
    totalAmountBet += playerBet;
    if (betAmount >= 100) {
      playerBalance += 10;
    }
  }

  public int playerBalance() {
    return playerBalance;
  }

  public int playerBetAmount() {
    return playerBet;
  }

  public int getTotalAmountBet() {
    return totalAmountBet;
  }

  public void playerWins() {
    playerBalance += playerBet * 2;
  }

  public void playerLoses() {
    playerBalance += playerBet * 0;
  }

  public void playerTies() {
    playerBalance += playerBet * 1;
  }

  public void playerDeposits(int amount) {
    playerBalance += amount;
  }

}
