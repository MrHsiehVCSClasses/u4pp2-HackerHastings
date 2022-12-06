package u4pp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonsterFighter newMonsterFighter = new MonsterFighter();
        newMonsterFighter.Play(scanner);

    }
}