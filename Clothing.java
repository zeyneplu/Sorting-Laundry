package homework5;

//ZEYNEP USLU

public class Clothing {
    private String type; // Type of clothing (Undergarment, Socks, Stockings, Top, Bottom, Cape)
    private String color; // Color of clothing (e.g., Red, Black, Green)

    // Valid clothing types and colors
    private static final String[] VALID_TYPES = {"Undergarment", "Socks", "Stockings", "Top", "Bottom", "Cape"};
    private static final String[] VALID_COLORS = {"Brown", "Red", "Pink", "Black", "White", "Orange", "Green", "Blue", "Purple", "Grey"};

    // Default values
    public static final String DEFAULT_TYPE = "Socks";
    public static final String DEFAULT_COLOR = "Black";

    // Constructor with default values
    public Clothing() {
        this.type = DEFAULT_TYPE;
        this.color = DEFAULT_COLOR;
    }

    // Parameterized constructor
    public Clothing(String type, String color) {
        this.setType(type);
        this.setColor(color);
    }

    // Accessor methods
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    // Mutator methods with validation
    public void setType(String type) {
        if (isValidType(type)) {
            this.type = type;
        } else {
            this.type = DEFAULT_TYPE;
        }
    }

    public void setColor(String color) {
        if (isValidColor(color)) {
            this.color = color;
        } else {
            this.color = DEFAULT_COLOR;
        }
    }

    // Helper methods for validation
    private boolean isValidType(String type) {
        for (String validType : VALID_TYPES) {
            if (validType.equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidColor(String color) {
        for (String validColor : VALID_COLORS) {
            if (validColor.equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }

    // toString method
    
    public String toString() {
        return "[Clothing] Type: " + type + " Color: " + color;
    }

    // equals method
    public boolean equals(Clothing other) {
        return this.type.equalsIgnoreCase(other.type) && this.color.equalsIgnoreCase(other.color);
    }
}
