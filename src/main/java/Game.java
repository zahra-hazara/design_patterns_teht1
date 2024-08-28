import java.util.Scanner;

class Game {

    // Method to create a map based on player choice
    public Map createMap(String mapType, int width, int height) {
        if (mapType.equals("city")) {
            return new CityMap( width, height);
        } else if (mapType.equals("wilderness")) {
            return new WildernessMap(width, height);
        } else {
            // Handle invalid input and default to CityMap
            System.out.println("Invalid choice! Defaulting to CityMap.");
            return new CityMap(width, height);
        }
    }


    public void main() {
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter map type (city/wilderness): ");
        String mapType = scanner.nextLine();

        System.out.print("Enter map width: ");
        int width = scanner.nextInt();

        System.out.print("Enter map height: ");
        int height = scanner.nextInt();

        // Create and display the map
        Map gameMap = createMap(mapType, width, height);
        gameMap.display();


        // Close the scanner to avoid resource leak
        scanner.close();
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.main();
    }
}

