public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}

// As avid zookeepers, we’re more than happy to wash and feed our beloved bears. 
// But we’re all too aware of the dangers of petting them. Unfortunately, our interface
// is rather large, and we have no choice but to implement the code to pet the bear.

// Let’s fix this by splitting our large interface into three separate ones:

public interface BearCleaner {
    void washTheBear();
}

public interface BearFeeder {
    void feedTheBear();
}

public interface BearPetter {
    void petTheBear();
}

// Now, thanks to interface segregation, we’re free to implement only the methods that matter to us:

public class BearCarer implements BearCleaner, BearFeeder {

    public void washTheBear() {
        //I think we missed a spot...
    }

    public void feedTheBear() {
        //Tuna Tuesdays...
    }
}

// And finally, we can leave the dangerous stuff to the reckless people:

public class CrazyPerson implements BearPetter {

    public void petTheBear() {
        //Good luck with that!
    }
}

// Going further, we could even split our BookPrinter class from our example earlier to use interface segregation in the same way.
// By implementing a Printer interface with a single print method, 
// we could instantiate separate ConsoleBookPrinter and OtherMediaBookPrinter classes.