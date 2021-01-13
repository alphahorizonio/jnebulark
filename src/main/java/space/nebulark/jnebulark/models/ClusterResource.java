package space.nebulark.jnebulark.models;

public class ClusterResource {
    private String nodeId;
    private String definition;

    public ClusterResource(String nodeId, String definition) {
        this.nodeId = nodeId;
        this.definition = definition;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public String getDefinition() {
        return this.definition;
    }
}
