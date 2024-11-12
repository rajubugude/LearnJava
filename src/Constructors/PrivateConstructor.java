package Constructors;

public class PrivateConstructor {
    private PrivateConstructor(){
        System.out.println("Private Constructor object");
    }
    public static PrivateConstructor getConstructor(){
        return new PrivateConstructor();
    }

}
