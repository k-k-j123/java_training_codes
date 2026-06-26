
/*
    Day 1.
    Track length 1000m
    player a beats player b by 100m or 10sec
    speed of a and b can be calculated here

    Day 2.
    Track length 1000m
    player b is injured at some point and speed is reduced by 50%
    meter can be calulated here acc to input
    find out time by which player A beats player b
    once we get meter we already have speed from above  just calculate time 

    Speed of players same on both days
*/
import java.util.Scanner;

public class RaceDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1 name");
        String player1 = sc.next();
        System.out.println("Enter player 2 name");
        String player2 = sc.next();
        System.out.println("Enter Track length");
        int TrackLength = sc.nextInt();

        // Day 1;
        System.out.println("Day 1 ----");
        System.out.println("Enter Time Player " + player1 + " beats " + player2);
        int timeABeatB = sc.nextInt();
        System.out.println("Enter distance " + player2 + " is behind " + player1 + " by");
        int distBisBehind = sc.nextInt();

        int speedB = (distBisBehind / timeABeatB);
        System.out.println(speedB);

        double timeA = (((TrackLength - distBisBehind) * timeABeatB) / distBisBehind);
        double speedA = (TrackLength / timeA);
        System.out.println(speedA);

        // Day 2
        System.out.println("Enter the distance player " + player2 + " is injured at");
        int distInjuredAt = sc.nextInt();
        System.out.println("Enter the reduction in speed of player "+ player2);
        int speedReduct = sc.nextInt();

        int reducedSpeed = speedB * (100 - speedReduct) / 100;
        System.out.println(reducedSpeed);

        int distance = TrackLength - distInjuredAt;

        double time1 = distInjuredAt / reducedSpeed;
        double time2 = distance / speedB;

        double totalTime = time1 + time2;
        double timeBeat = totalTime - timeA;
        System.out.println(timeBeat);
    }
}
