public class AccessModifiers {
    
}
Public
Description: Members declared as public are accessible from any other class in any package.
java
public class PublicExample {
    public int publicVar = 10;

    public void display() {
        System.out.println("Public Variable: " + publicVar);
    }
}

2. Private
Description: Members declared as private are accessible only within the class they are declared in. They cannot be accessed from outside the class.
java
public class PrivateExample {
    private int privateVar = 20;

    private void show() {
        System.out.println("Private Variable: " + privateVar);
    }

    public void accessPrivate() {
        show(); // Accessing private method within the same class
    }
}

3. Protected
Description: Members declared as protected are accessible within the same package and by subclasses (even if they are in different packages).
java
public class ProtectedExample {
    protected int protectedVar = 30;

    protected void displayProtected() {
        System.out.println("Protected Variable: " + protectedVar);
    }
}

4. Default (Package-Private)
Description: If no access modifier is specified, it is considered default. Members with default access are accessible only within classes in the same package.
java
class DefaultExample { // No 'public' modifier
    int defaultVar = 40; // Default access

    void displayDefault() {
        System.out.println("Default Variable: " + defaultVar);
    }
}

Summary of Differences
Modifier	Class Level	Package Level	Subclass Level	Global Level
public	    Yes	        Yes	            Yes	            Yes
protected	Yes	        Yes	            Yes	            No
private	    Yes	        No	            No	            No
Default	    Yes	        Yes	            No	            No