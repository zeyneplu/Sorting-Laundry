package homework5;
//ZEYNEP USLU

public class Dresser {
    private Clothing[][] clothes; // 2D array representing 5 drawers, each can hold 10 clothes

    // Constructor
    public Dresser() {
        clothes = new Clothing[5][10]; // 5 drawers, 10 slots per drawer
    }

    // Add clothing item to the correct drawer
    public void add(Clothing clothing) {
        int drawerIndex = getDrawerIndex(clothing.getType());
        boolean added = false;

        // Find an empty slot in the appropriate drawer
        for (int i = 0; i < clothes[drawerIndex].length; i++) {
            if (clothes[drawerIndex][i] == null) {
                clothes[drawerIndex][i] = clothing;
                System.out.println("Added " + clothing + " to drawer " + drawerIndex);
                added = true;
                break;
            }
        }

        if (!added) {
            System.out.println("Drawer " + drawerIndex + " is full! Could not add " + clothing);
        }
    }

    // Remove clothing item from the dresser
    public void remove(Clothing clothing) {
        for (int drawerIndex = 0; drawerIndex < clothes.length; drawerIndex++) {
            for (int i = 0; i < clothes[drawerIndex].length; i++) {
                if (clothes[drawerIndex][i] != null && clothes[drawerIndex][i].equals(clothing)) {
                    clothes[drawerIndex][i] = null; // Remove the clothing by setting it to null
                    System.out.println("Removed " + clothing + " from drawer " + drawerIndex);
                    return;
                }
            }
        }
        System.out.println("Clothing item not found!");
    }

    // Print the contents of the dresser
    public void print() {
        for (int drawerIndex = 0; drawerIndex < clothes.length; drawerIndex++) {
            System.out.println("Drawer " + drawerIndex + ":");
            boolean isEmpty = true;
            for (int i = 0; i < clothes[drawerIndex].length; i++) {
                if (clothes[drawerIndex][i] != null) {
                    System.out.println(clothes[drawerIndex][i]);
                    isEmpty = false;
                }
            }
            if (isEmpty) {
                System.out.println("Empty");
            }
        }
    }

    // Get the drawer index based on clothing type
    private int getDrawerIndex(String type) {
        switch (type.toLowerCase()) {
            case "undergarment":
                return 0; // Top Drawer
            case "socks":
            case "stockings":
                return 1; // Next Drawer
            case "top":
                return 2; // Tops Drawer
            case "bottom":
                return 3; // Bottoms Drawer
            case "cape":
                return 4; // Cape Drawer
            default:
                return 1; // Default to Socks drawer for invalid types
        }
    }
}
