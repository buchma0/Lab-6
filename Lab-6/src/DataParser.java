public class DataParser {

    public static int parseID(String input) {
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        System.out.println("Data Parser");
        String[] rawIDs = {"123", "456", "abc", "789"};

        for (String id : rawIDs) {
            try {

                int parsedID = parseID(id);
                System.out.println("Successfully parsed ID: " + parsedID);

            } catch (NumberFormatException e) {
                System.out.println("Format error for value '" + id + "': cannot convert to integer. Continuing...");
            }
        }
        System.out.println("List processing completed.");
    }
}