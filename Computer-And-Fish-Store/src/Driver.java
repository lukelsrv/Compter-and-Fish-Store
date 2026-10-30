import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Barebones driver to figure out where the methods should go
 * We can figure it out
 */
public class Driver {
    private static List<StoreItem> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    /**
     * buildComputer method
     * lets you pick computer parts from the store's inventory to build a custom computer
     */
    public void buildComputer(List<StoreItem> inventory) {
        System.out.println("computer");
    }

    /**
     * buildAquarium method
     * lets you pick fish from the store's inventory to build a custom aquarium
     */
    public void buildAquarium(List<StoreItem> inventory) {
        System.out.println("aquarium");
    }
}
