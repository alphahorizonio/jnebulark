package space.nebulark.jnebulark;

public class Node {
    public static void close() {
        System.out.println("closed node");
    }

    public static void createResource(String message) {
        System.out.println("created ressource");
    }

    public static void deleteResources(String message) {
        System.out.println("deleted ressource");
    }

    public static void open(String message) {
        System.out.println(message);
    }

    public static void seedFile(String message) {
        System.out.println("seeded File");
    }
}
