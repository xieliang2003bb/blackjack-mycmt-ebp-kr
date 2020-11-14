package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

  @Test
  public void testPlayBets() throws Exception {
    Player player = new Player(100);
    player.playerBets(20);
    assertThat(player.playerBalance())
        .isEqualTo(80);
    assertThat(player.playerBetAmount())
            .isEqualTo(20);
  }

  @Test
  public void testPlayerWins() throws Exception {
    Player player = new Player(100);
    player.playerBets(20);
    player.playerWins();
    assertThat(player.playerBalance())
            .isEqualTo(120);  // 100-20+20*2 = 120
    assertThat(player.playerBetAmount())
            .isEqualTo(20);
  }

  @Test
  public void testPlayerLoses() throws Exception {
    Player player = new Player(100);
    player.playerBets(20);
    player.playerLoses();
    assertThat(player.playerBalance())
            .isEqualTo(80);  // 100-20 = 80
    assertThat(player.playerBetAmount())
            .isEqualTo(20);
  }

  @Test
  public void testPlayerTies() throws Exception {
    Player player = new Player(100);
    player.playerBets(20);
    player.playerTies();
    assertThat(player.playerBalance())
            .isEqualTo(100);  // 100-20+20 = 100
    assertThat(player.playerBetAmount())
            .isEqualTo(20);
  }

  @Test
  public void testPlayerDeposits() throws Exception {
    Player player = new Player(100);
    player.playerBets(20);
    player.playerDeposits(100);
    assertThat(player.playerBalance())
            .isEqualTo(180);  // 100-20+100 = 180
    assertThat(player.playerBetAmount())
            .isEqualTo(20);
  }

}