package space.nebulark.jnebulark;

import java.util.ArrayList;
import java.util.List;

import space.nebulark.jnebulark.models.ClusterResource;

public class Node {
    public static List<ClusterResource> resources = new ArrayList<ClusterResource>();

    public static void close() {
        System.out.println("closed node");
    }

    public static void createResource(String message) {
        System.out.println("created ressource");
    }

    public static void deleteResources(String message) {
        System.out.println("deleted ressource");
    }

    public static void seedFile(String message) {
        System.out.println("seeded File");
    }
}
