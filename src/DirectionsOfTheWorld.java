import java.util.Scanner;

public class DirectionsOfTheWorld {

    private Directions direction;

    public DirectionsOfTheWorld(Directions direction) {
        this.direction = direction;
    }

    public static void main(String[] args) {

        // print all directions of the world
        System.out.println("Show all directions of the world:");
        for (Directions d: Directions.values()) {
            System.out.println(d);
        }


        Scanner sc = new Scanner(System.in);

        // ask user where is he want to go
        System.out.println("Podaj kierunek geograficzny: \n");

        Directions direction = Directions.valueOf(sc.nextLine());

        whereToGo(direction);

        sc.close();

    }

    private static void whereToGo(Directions direction) {
        switch (direction) {
            case NORTH:
                System.out.printf("Ok. Wiec idziemy na %s", direction.getPolishDirection());
                break;
            case EAST:
                System.out.printf("Ok. Wiec idziemy na %s", direction.getPolishDirection());
                break;
            case SOUTH:
                System.out.printf("Ok. Wiec idziemy na %s", direction.getPolishDirection());
                break;
            case WEST:
                System.out.printf("Ok. Wiec idziemy na %s", direction.getPolishDirection());
                break;
        }
    }

}
