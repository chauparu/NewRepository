/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iparu
 */
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private GroupOfCards deck;

    public Game() {
        this.players = new ArrayList<>();
        this.deck = new GroupOfCards();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startGame() {
        deck.shuffle();
        dealInitialCards();
       
    }

    private void dealInitialCards() {
        for (Player player : players) {
            Card card1 = deck.drawCard();
            Card card2 = deck.drawCard();
            
        }
    }
}
