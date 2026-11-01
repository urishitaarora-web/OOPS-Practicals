// Practical 7: Object Lifecycle, Garbage Collection, and Destructor Reference Exercise

import java.lang.ref.WeakReference;

class Resource {
    String name;

    Resource(String name) {
        this.name = name;
        System.out.println("Constructor: Resource '" + name + "' created.");
    }

    void use() {
        System.out.println("Using resource '" + name + "'.");
    }
}

public class Garbage_P7 {
    public static void main(String[] args) throws InterruptedException {
        Resource r = new Resource("R1");
        r.use();

        WeakReference<Resource> watcher = new WeakReference<>(r);

        r = null;
        System.out.println("\nReference set to null. Object is now eligible for garbage collection.");

        System.gc();
        Thread.sleep(500); 

        if (watcher.get() == null) {
            System.out.println("Result: The object WAS garbage collected.");
        } else {
            System.out.println("Result: The object has NOT been collected yet.");
        }

        System.out.println("\nProgram ends. Correctness does not depend on when GC runs.");
    }
}