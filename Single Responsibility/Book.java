public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters
}
// In this code, we store the name, author and text associated with an instance of a Book.

// Let’s now add a couple of methods to query the text:

public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    // methods that directly relate to the book properties
    public String replaceWordInText(String word, String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}

// Now our Book class works well, and we can store as many books as we like in our application.
// But what good is storing the information if we can’t output the text to our console and read it?
// Let’s throw caution to the wind and add a print method:

public class BadBook {
    //...

    void printTextToConsole(){
        // our code for formatting and printing the text
    }
}

// However, this code violates the single responsibility principle we outlined earlier.

// To fix our mess, we should implement a separate class that deals only with printing our texts:

public class BookPrinter {

    // methods for outputting text
    void printTextToConsole(String text){
        //our code for formatting and printing the text
    }

    void printTextToAnotherMedium(String text){
        // code for writing to any other location..
    }
}

// Awesome. Not only have we developed a class that relieves the Book of its printing duties, 
// but we can also leverage our BookPrinter class to send our text to other media.
// Whether it’s email, logging, or anything else, we have a separate class dedicated to this one concern.

