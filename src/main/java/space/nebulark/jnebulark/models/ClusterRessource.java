package space.nebulark.jnebulark.models;

public class ClusterRessource {
    private String nodeId;
    private String definition;

    public ClusterRessource(String nodeId, String definition) {
        this.nodeId = nodeId;
        this.definition = definition;
    }

    public String getNodeID() {
        return this.nodeId;
    }

    public String getDefinition() {
        return this.definition;
    }
}
