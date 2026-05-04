public class stringLab {

    public static void main(String[] args) {
        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();
        System.out.println("Length of the book title: " + titleLength);

        int maxLength = 20;


        // Shortened the book title
        String shortBookTitle = bookTitle.substring(0, maxLength);
        System.out.println("Original title: " + bookTitle);
        System.out.println("Shortened title: " + shortBookTitle);

        // Declare and initialize the searchWord
        String searchWord = "Captain";

        // Check if the searchWord is present in book title
        boolean containsWord = searchWord.contains("Captain");
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);
    }
}
