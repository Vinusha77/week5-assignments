public class Main {

    static String findDuplicatePick(String[] players) {
        for (int i = 0; i < players.length; i++) {
            for (int j = i + 1; j < players.length; j++) {
                if (players[i].equals(players[j])) {
                    return "Duplicate Found: " + players[i];
                }
            }
        }

        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        String[] players = {
            "Kohli", "Bumrah", "Kohli", "Rohit"
        };

        System.out.println(findDuplicatePick(players));
    }
}
