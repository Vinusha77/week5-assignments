import java.util.Arrays;

class Player {
    private String name;
    private int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    Player(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void display() {
        System.out.println(name + " - " + score);
    }
}

public class Main {

    static void rankPlayers(Player[] players) {
        Arrays.sort(players,
            (p1, p2) ->
                Integer.compare(p2.getScore(), p1.getScore()));
    }

    static void rankPlayers(Player[] players, int count) {
        rankPlayers(players);

        int limit = Math.min(count, players.length);

        for (int i = 0; i < limit; i++) {
            System.out.print((i + 1) + ". ");
            players[i].display();
        }
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Kohli", 95),
            new Player("Rohit", 85),
            new Player("Bumrah", 98),
            new Player("Jadeja", 90),
            new Player("Gill", 80)
        };

        System.out.println("Fantasy League Rankings:");
        rankPlayers(players, 3);
    }
}
